package com.cloudstone.emenu.stoge.db;

import com.cloudstone.emenu.EmenuContext;
import com.cloudstone.emenu.data.PayType;
import com.cloudstone.emenu.data.Restaurant;
import com.cloudstone.emenu.storage.db.PayTypeDb;
import com.cloudstone.emenu.storage.db.RestaurantDb;
import com.cloudstone.emenu.storage.db.util.SqliteDataSource;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.File;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by nicholaszhao on 3/30/14.
 */
public class PaymentDbTest {

    @Rule
    public TemporaryFolder tempFolder = new TemporaryFolder();

    private PayTypeDb payTypeDb;

    @Before
    public void createDb() throws Exception {
        SqliteDataSource dataSource = new SqliteDataSource();
        File dbFile = tempFolder.newFile();
        dataSource.setDbFile(dbFile);
        payTypeDb = new PayTypeDb();
        payTypeDb.setDataSource(dataSource);
        payTypeDb.init();
    }

    @Test
    public void basicOperationTest() {
        final EmenuContext context = new EmenuContext();
        context.setLoginUserId(1);
        context.setRestaurantId(2);
        List<PayType> payTypes = payTypeDb.getAllPayType(context);
        assertEquals(2, payTypes.size());
        PayType cash = payTypes.get(0);
        assertEquals(1, cash.getId());
        PayType creditCard = payTypes.get(1);
        assertEquals(2, creditCard.getId());

    }

}