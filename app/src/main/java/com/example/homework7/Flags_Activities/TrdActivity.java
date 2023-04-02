package com.example.homework7.Flags_Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.homework7.R;
import com.example.homework7.ThirdActivity;

public class TrdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trd);

        Button btnToFourth = findViewById(R.id.btnToFrth);
        btnToFourth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TrdActivity.this, FrthActivity.class);
                startActivity(intent);
            }
        });

        Button btnToSecond = findViewById(R.id.btnToSnd);
        btnToSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TrdActivity.this, SndActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });
    }
}