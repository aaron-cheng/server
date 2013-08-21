/**
 * @(#)BillDb.java, Aug 1, 2013. 
 * 
 */
package com.cloudstone.emenu.storage.db;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.almworks.sqlite4java.SQLiteException;
import com.almworks.sqlite4java.SQLiteStatement;
import com.cloudstone.emenu.EmenuContext;
import com.cloudstone.emenu.data.Bill;
import com.cloudstone.emenu.data.vo.OrderVO;
import com.cloudstone.emenu.storage.db.util.ColumnDefBuilder;
import com.cloudstone.emenu.storage.db.util.IdStatementBinder;
import com.cloudstone.emenu.storage.db.util.InsertSqlBuilder;
import com.cloudstone.emenu.storage.db.util.RowMapper;
import com.cloudstone.emenu.storage.db.util.SelectSqlBuilder;
import com.cloudstone.emenu.storage.db.util.SqlUtils;
import com.cloudstone.emenu.storage.db.util.StatementBinder;
import com.cloudstone.emenu.storage.db.util.TimeStatementBinder;
import com.cloudstone.emenu.util.JsonUtils;
import com.cloudstone.emenu.util.StringUtils;

/**
 * @author xuhongfeng
 *
 */
@Repository
public class BillDb extends SQLiteDb implements IBillDb {
    
    @Override
    public Bill getByOrderId(EmenuContext context, int orderId) {
        return queryOne(context, SQL_SELECT_BY_ORDER_ID, new OrderIdBinder(orderId), rowMapper);
    }

    @Override
    public void add(EmenuContext context, Bill bill) {
        bill.setId(genId(context));
        long now = System.currentTimeMillis();
        bill.setCreatedTime(now);
        bill.setUpdateTime(now);
        executeSQL(context, SQL_INSERT, new BillBinder(bill));
    }

    @Override
    public List<Bill> listBills(EmenuContext context) {
        return query(context, SQL_SELECT, StatementBinder.NULL, rowMapper);
    }
    
    @Override
    public Bill get(EmenuContext context, int id)  {
        IdStatementBinder binder = new IdStatementBinder(id);
        return queryOne(context, SQL_SELECT_BY_ID, binder, rowMapper);
    }

    @Override
    public List<Bill> getBillsByTime(EmenuContext context, long startTime, long endTime)  {
        TimeStatementBinder binder = new TimeStatementBinder(startTime, endTime);
        return query(context, SQL_SELECT_BY_TIME, binder, rowMapper);
    }

    @Override
    public String getTableName() {
        return TABLE_NAME;
    }

    @Override
    protected void onCheckCreateTable(EmenuContext context)  {
        checkCreateTable(context, TABLE_NAME, COL_DEF);
    }

    private static final String TABLE_NAME = "bill";
    
    private static enum Column {
        ID("id"), ORDER_ID("orderId"), USER_ID("userId"), COST("cost"), DISCOUNT("discount"),
        TIP("tip"), INVOICE("invoice"), INVOICE_PRICE("invoicePrice"), DISCOUNT_DISH_IDS("discountDishIds"),
        PAY_TYPE("payType"), REMARKS("remarks"), ORDER("`order`"),
        CREATED_TIME("createdTime"), UPDATE_TIME("update_time"), DELETED("deleted");
        
        private final String str;
        private Column(String str) {
            this.str = str;
        }
        
        @Override
        public String toString() {
            return str;
        }
    }
    private static final String COL_DEF = new ColumnDefBuilder()
        .append(Column.ID, DataType.INTEGER, "NOT NULL PRIMARY KEY")
        .append(Column.ORDER_ID, DataType.INTEGER, "NOT NULL")
        .append(Column.USER_ID, DataType.INTEGER, "NOT NULL")
        .append(Column.COST, DataType.REAL, "NOT NULL")
        .append(Column.DISCOUNT, DataType.REAL, "NOT NULL")
        .append(Column.TIP, DataType.REAL, "NOT NULL")
        .append(Column.INVOICE, DataType.INTEGER, "NOT NULL")
        .append(Column.INVOICE_PRICE, DataType.REAL, "NOT NULL")
        .append(Column.DISCOUNT_DISH_IDS, DataType.TEXT, "NOT NULL")
        .append(Column.PAY_TYPE, DataType.INTEGER, "NOT NULL")
        .append(Column.REMARKS, DataType.TEXT, "NOT NULL")
        .append(Column.ORDER, DataType.TEXT, "NOT NULL")
        .append(Column.CREATED_TIME, DataType.INTEGER, "NOT NULL")
        .append(Column.UPDATE_TIME, DataType.INTEGER, "NOT NULL")
        .append(Column.DELETED, DataType.INTEGER, "NOT NULL")
        .build();
    private static final String SQL_INSERT = new InsertSqlBuilder(TABLE_NAME, 15).build();
    private static final String SQL_SELECT = new SelectSqlBuilder(TABLE_NAME).build();
    
    private static class BillBinder implements StatementBinder {
        private final Bill bill;

        public BillBinder(Bill bill) {
            super();
            this.bill = bill;
        }
        
        @Override
        public void onBind(SQLiteStatement stmt) throws SQLiteException {
            String archive = "";
            if (bill.getOrder() != null) {
                archive = JsonUtils.toJson(bill.getOrder());
            }
            stmt.bind(1, bill.getId());
            stmt.bind(2, bill.getOrderId());
            stmt.bind(3, bill.getUserId());
            stmt.bind(4, bill.getCost());
            stmt.bind(5, bill.getDiscount());
            stmt.bind(6, bill.getTip());
            stmt.bind(7, bill.isInvoice() ? 1 : 0);
            stmt.bind(8, bill.getInvoicePrice());
            stmt.bind(9, SqlUtils.idsToStr(bill.getDiscountDishIds()));
            stmt.bind(10, bill.getPayType());
            stmt.bind(11, bill.getRemarks());
            stmt.bind(12, archive);
            stmt.bind(13, bill.getCreatedTime());
            stmt.bind(14, bill.getUpdateTime());
            stmt.bind(15, bill.isDeleted() ? 1 : 0);
        }
    }
    
    private static final RowMapper<Bill> rowMapper = new RowMapper<Bill>() {
        
        @Override
        public Bill map(SQLiteStatement stmt) throws SQLiteException {
            Bill bill = new Bill();
            bill.setId(stmt.columnInt(0));
            bill.setOrderId(stmt.columnInt(1));
            bill.setUserId(stmt.columnInt(2));
            bill.setCost(stmt.columnDouble(3));
            bill.setDiscount(stmt.columnDouble(4));
            bill.setTip(stmt.columnDouble(5));
            bill.setInvoice(stmt.columnInt(6) == 1);
            bill.setInvoicePrice(stmt.columnDouble(7));
            bill.setDiscountDishIds(SqlUtils.strToIds(stmt.columnString(8)));
            bill.setPayType(stmt.columnInt(9));
            bill.setRemarks(stmt.columnString(10));
            String archive = stmt.columnString(11);
            if (!StringUtils.isBlank(archive)) {
                OrderVO order = JsonUtils.fromJson(archive, OrderVO.class);
                bill.setOrder(order);
            }
            bill.setCreatedTime(stmt.columnLong(12));
            bill.setUpdateTime(stmt.columnLong(13));
            bill.setDeleted(stmt.columnInt(14) == 1);
            
            return bill;
        }
    };
    private static final String SQL_SELECT_BY_ID = new SelectSqlBuilder(TABLE_NAME)
        .appendWhereId().build();
    private static final String SQL_SELECT_BY_ORDER_ID = new SelectSqlBuilder(TABLE_NAME)
        .appendWhere(Column.ORDER_ID).build();
    private static final String SQL_SELECT_BY_TIME = new SelectSqlBuilder(TABLE_NAME)
        .append(" WHERE createdTime>=? ").append(" AND createdTime<?").build();

    private static class OrderIdBinder implements StatementBinder {
        private final int orderId;

        public OrderIdBinder(int orderId) {
            super();
            this.orderId = orderId;
        }

        @Override
        public void onBind(SQLiteStatement stmt) throws SQLiteException {
            stmt.bind(1, orderId);
        }
    }
}
