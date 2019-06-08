package com.cityguide.sanikas.driver;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Signin extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    TextView mtextview;
    Button btn;
    EditText medit;
    Spinner spinner;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);

        btn = (Button) findViewById(R.id.btn1);
        medit = (EditText) findViewById(R.id.edit1);
        spinner=(Spinner)findViewById(R.id.spinner);

        ArrayAdapter<CharSequence>adapter=ArrayAdapter.createFromResource(this,R.array.bus_name, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(this);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i= new Intent(Signin.this,Attendance.class);
                startActivity(i);
            }
        });
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String sSelected=parent.getItemAtPosition(position).toString();
        Toast.makeText(this,sSelected,Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}