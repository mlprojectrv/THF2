package com.byui.thf;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;


import java.util.Date;

public class MainActivity extends AppCompatActivity {

    private EditText id;
    private EditText password;
    private Button login;
    private TextView info;
    private int loginCounter = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("HansomeTieFactory");

        id = (EditText)findViewById(R.id.typeId);
        password = (EditText)findViewById(R.id.typePassword);
        login = (Button)findViewById(R.id.clickLogin);
        info = (TextView)findViewById(R.id.incorrect);

        info.setText("Remained attemps: 5");

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(id.getText().toString(), password.getText().toString());
            }
        });

    }

    private void validate(String userName, String userPassword) {
        // check id and password in this function.
        if ((userName.equals("Admin")) && (userPassword.equals("1234"))) {
            Intent loginIntent = new Intent(MainActivity.this, LoginActivity.class);
            startActivity(loginIntent);
        }
        else {
            loginCounter--;

            info.setText("Remained attemps: " + String.valueOf(loginCounter));

            if (loginCounter == 0) {
                login.setEnabled(false);
            }

        }
    }

    public void successLogin(View theButton) {

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
