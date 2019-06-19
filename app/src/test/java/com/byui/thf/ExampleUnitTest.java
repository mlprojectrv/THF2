package com.byui.thf;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Calendar;
import com.google.gson.Gson;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.*;
import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    @Test
    public void data_Input_valid() {
        Calendar c1 = Calendar.getInstance();
        c1.set(1994, 4, 12);


        Sales s1 = new Sales();
        Price p1 = new Price();
        p1.setStart_date(c1.getTime());

        s1.amount = 10;
        s1.created_by = 1;
        s1.account_id.setPassword("PassworD");
        s1.discount = true;
        try {
            s1.account_id.encrypt() ;
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            s1.account_id.login("PassworD");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void func() {
        ArrayList<Price> prices = new ArrayList<Price>();
        ArrayList<Account> accounts;
    }

    @Test
    public void writingJson() {
        Gson gson = new Gson();
        String json = gson.toJson(myObj);
    }
}
