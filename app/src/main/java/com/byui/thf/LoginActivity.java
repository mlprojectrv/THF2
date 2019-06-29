package com.byui.thf;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import static android.R.layout.simple_spinner_item;

public class LoginActivity  extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

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

        Spinner spinner = findViewById(R.id.spinner1);


        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.numbers, simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);


        saleb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                salesPage();
            }});
    }

    private void salesPage(){
        Intent saleIntent = new Intent(LoginActivity.this, Sales_Activity.class);
        startActivity(saleIntent);
    }



    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String text= parent.getItemAtPosition(position).toString();
        Toast.makeText(parent.getContext(),text, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
