package com.byui.thf;

import org.junit.Test;
import org.mockito.internal.matchers.Null;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Calendar;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.*;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {


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
        Calendar c1 = Calendar.getInstance();
        c1.set(1994, 8, 12);
        Price p1 = new Price();
        p1.setStart_date(c1.getTime());
        p1.setEnd_date(null);
        p1.setAmount(10);

        Price p2 = new Price();
        c1.set(1994, 8, 13);
        p2.setStart_date(c1.getTime());
        p2.setEnd_date(null);
        p2.setAmount(50);

        Price p3 = new Price();
        c1.set(1994, 8, 13);
        p3.setStart_date(c1.getTime());
        p3.setEnd_date(null);
        p3.setAmount(50);

        //woo's made dis function
        Product pr1 = new Product();

        pr1.setQuanitity(1);
        pr1.setColor1("yellow");
        pr1.setColor2("green");
        pr1.setPattern("stripe");
        pr1.setSeries("idunno");
        pr1.setType("idunno");

        Product pr2 = new Product();
        pr2.setQuanitity(1);
        pr2.setColor1("white");
        pr2.setColor2("brown");
        pr2.setPattern("fill");
        pr2.setSeries("idunno");
        pr2.setType("idunno");

        Product pr3 = new Product();
        pr3.setQuanitity(1);
        pr3.setColor1("purple");
        pr3.setColor2("blue");
        pr3.setPattern("Floral");
        pr3.setSeries("idunno");
        pr3.setType("idunno");
        //woo finishes the function above
        IdGenerator idg = new IdGenerator();


        Type listType = new TypeToken<List<JsonConvertible>>() {}.getType();
        List<JsonConvertible> target = new LinkedList<>();
        target.add(p1);
        target.add(p2);
        target.add(p3);

        //woo edits
        target.add(pr1);
        target.add(pr2);
        target.add(pr3);
        //finished




        for (JsonConvertible i : target) {
            i.setId(idg.generateID());
        }

        Gson gson = new Gson();

        /// Converts String(Linked list) to Json
        String json = gson.toJson(target, listType);

        /// ?????
        List<JsonConvertible> target2 = gson.fromJson(json, listType);

        System.out.print(json);

        /// write Json
        writingJson(target2, "price 1");

        /// Read Json file
        List<JsonConvertible> target1  = readJson("price", listType);
    }





    public void writingJson(List<JsonConvertible> list, String filename) {
        Gson gson = new Gson();
        try (FileWriter writer = new FileWriter(filename)){
            gson.toJson(list, writer);
        } catch(IOException cause){
            System.out.println("Trouble writing file.");
        }
    }

    public List<JsonConvertible> readJson(String filename, Type type) {
        Gson gson = new Gson();
        List<JsonConvertible> file;
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(filename))){
            file = gson.fromJson(bufferedReader, type);
        } catch (FileNotFoundException cause){
            System.out.println("File Not found.");
            return null;
        } catch (IOException cause){
            System.out.println("Io error.");
            return null;
        }
        return file;
    }
}
