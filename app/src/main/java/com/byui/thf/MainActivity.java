package com.byui.thf;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("HansomeTieFactory");
    }

    public void checkLogin(View theButton) {
        // check id and password in this function.
    }

    public void successLogin(View theButton) {
        Intent loginIntent = new Intent(this, LoginActivity.class);
        startActivity(loginIntent);
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
