package com.example.homework7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SerializeSecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_serialize_second);
        TextView textView = new TextView(this);
        textView.setTextSize(26);
        textView.setPadding(16, 16, 16, 16);
        Bundle arguments = getIntent().getExtras();
        if(arguments!=null){
            String name = arguments.get("name").toString();
            String company = arguments.getString("company");
            int age = arguments.getInt("age");
            byte adult = arguments.getByte("adult");
            String adultResult = (adult == 1) ? "true" : "false";
            textView.setText("Name: " + name + "\nCompany: " + company +
                    "\nAge: " + age + "\nAdult: " + adultResult);
        }
        setContentView(textView);
    }
}