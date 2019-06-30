package com.byui.thf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import static android.R.layout.simple_spinner_item;

public class Sales_Activity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sales);

        //spinner1
        Spinner spinner = findViewById(R.id.spinner1);


        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.numbers, simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
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
