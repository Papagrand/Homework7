package com.example.homework7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.homework7.Flags_Activities.FstActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClickSwitch(View view) {
        switch (view.getId()) {
            case R.id.SecondAButton: {
                Intent intent = new Intent(this, SecondActivity.class);

                startActivity(intent);
                break;
            }
            case R.id.SerializeButton: {
                Intent intent = new Intent(this, SerializeActivity.class);

                startActivity(intent);
                break;
            }
            case R.id.ParceLabelAndSerializeButton: {
                Intent intent = new Intent(this, HardSerializeAndParcelabelActivity.class);

                startActivity(intent);
                break;
            }
            case R.id.ActivityResultButton: {
                Intent intent = new Intent(this, ActivityResultActivity.class);

                startActivity(intent);
                break;
            }
            case R.id.FstActivityButton: {
                Intent intent = new Intent(this, FstActivity.class);

                startActivity(intent);
                break;
            }
        }
    }
}