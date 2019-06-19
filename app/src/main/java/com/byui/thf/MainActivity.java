package com.byui.thf;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public class Sales {
        int sale_id;
        int product_id;
        int price_id;
        int account_id;
        Date date;
        int amount;
        boolean discount;
        // shipping fee (float)
        float calShippingCost;
        int created_by;
    }

}
