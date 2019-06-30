package com.byui.thf;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class LoginActivity  extends AppCompatActivity {

    private Button product;
    private Button price;
    private Button sale;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //woos button example
        button = (Button) findViewById(R.id.button);
        product = (Button) findViewById(R.id.product);
        price = (Button) findViewById(R.id.price);
        sale = (Button) findViewById(R.id.sale);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();

            }
        });

        product.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity3();

            }
        });

        price.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity4();

            }
        });

        sale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity5();

            }
        });
    }

        // Title
    //    setTitle("HansomeTieFactory");
        // data received from main
    //    Intent intent = getIntent();

        // 3 button and listeners
        // prob = (Button)findViewById(R.id.product);
        //  prib = (Button)findViewById(R.id.price);
        // saleb =(Button)findViewById(R.id.sale);

    //    Spinner spinner = findViewById(R.id.spinner1);


   //     ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.numbers, simple_spinner_item);
  //      adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
    //    spinner.setAdapter(adapter);
   //     spinner.setOnItemSelectedListener(this);


        //woo example.
        public void openActivity2(){
            Intent intent = new Intent(this, woo_test.class);
            startActivity(intent);
        }

        public void openActivity3(){
            Intent intent1 = new Intent(this, woo_test.class);
            startActivity(intent1);
        }

        public void openActivity4(){
            Intent intent2 = new Intent(this, woo_test.class);
            startActivity(intent2);
        }

        public void openActivity5(){
            Intent intent3 = new Intent(this, woo_test.class);
            startActivity(intent3);
        }

}
