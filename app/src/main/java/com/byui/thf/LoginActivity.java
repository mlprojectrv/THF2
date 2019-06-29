package com.byui.thf;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {

    private Button prob;
    private Button prib;
    private Button saleb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        // Title
        setTitle("HansomeTieFactory");
        // data received from main
        Intent intent = getIntent();

        // 3 button and listeners
        prob = (Button)findViewById(R.id.product);
        prib = (Button)findViewById(R.id.price);
        saleb =(Button)findViewById(R.id.sale);


        saleb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent saleIntent = new Intent(LoginActivity.this, Sales_Activity.class);
                startActivity(saleIntent);
            }});
    }
}
