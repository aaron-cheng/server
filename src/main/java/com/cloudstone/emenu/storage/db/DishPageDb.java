/**
 * @(#)DishPageDb.java, Jul 19, 2013. 
 * 
 */
package com.cloudstone.emenu.storage.db;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.almworks.sqlite4java.SQLiteException;
import com.almworks.sqlite4java.SQLiteStatement;
import com.cloudstone.emenu.storage.db.IDishPageDb.DishPage;
import com.cloudstone.emenu.storage.db.util.DeleteSqlBuilder;
import com.cloudstone.emenu.storage.db.util.StatementBinder;

/**
 * 
 * id1 = menuPageId
 * id2 = dishId 
 * 
 * @author xuhongfeng
 *
 */
@Repository
public class DishPageDb extends RelationDb<DishPage> implements IDishPageDb {
    private static final Logger LOG = LoggerFactory.getLogger(DishPageDb.class);
    private static final String TABLE_NAME = "dishPage";
    
    @Override
    public String getTableName() {
        return TABLE_NAME;
    }
    
    //dish position in the MenuPage
    private static final RelationDbColumn COL_POS = new RelationDbColumn("pos", DataType.INTEGER, true);

    /* ---------- protected ---------- */
    @Override
    protected RelationDbConfig onCreateConfig() {
        RelationDbColumn[] columns = new RelationDbColumn[] {
                COL_POS
        };
        return new RelationDbConfig(TABLE_NAME, columns);
    }

    @Override
    protected RelationRowMapper<DishPage> onCreateRowMapper() {
        return rowMapper;
    }

    /* ---------- public ---------- */
    @Override
    public void add(int menuPageId, int dishId, final int pos) throws SQLiteException {
        add(new InsertBinder(menuPageId, dishId) {
            @Override
            protected void bindOthers(SQLiteStatement stmt)
                    throws SQLiteException {
                stmt.bind(3, pos);
            }
        });
    }

    @Override
    public void deleteByDishId(int dishId) throws SQLiteException {
        deleteById2(dishId);
    }

    @Override
    public void deleteByMenuPageId(int menuPageId) throws SQLiteException {
        deleteById1(menuPageId);
    }

    @Override
    public List<DishPage> getByMenuPageId(int menuPageId)
            throws SQLiteException {
        return listById1(menuPageId);
    }

    @Override
    public int countByDishId(int dishId) throws SQLiteException {
        return countId2(dishId);
    }
    
    @Override
    public void delete(final int menuPageId, final int pos) throws SQLiteException {
        String sql = new DeleteSqlBuilder(getTableName()).appendWhere(ID1).appendWhere(COL_POS.name).build();
        executeSQL(sql, new StatementBinder() {
            @Override
            public void onBind(SQLiteStatement stmt) throws SQLiteException {
                stmt.bind(1, menuPageId);
                stmt.bind(2, pos);
            }
        });
    }
    
    /* ---------- Inner Class ---------- */
    private static RelationRowMapper<DishPage> rowMapper = new RelationRowMapper<IDishPageDb.DishPage>() {
        @Override
        protected DishPage newRelation() {
            return new DishPage();
        }
        
        @Override
        public DishPage map(SQLiteStatement stmt) throws SQLiteException {
            DishPage page = super.map(stmt);
            page.setPos(stmt.columnInt(2));
            return page;
        };
    };
 }