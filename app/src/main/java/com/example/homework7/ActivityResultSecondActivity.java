package com.example.homework7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ActivityResultSecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_second);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            TextView ageView = findViewById(R.id.ageView);
            String age = extras.getString(ActivityResultActivity.AGE_KEY);
            ageView.setText("Возраст: " + age);
        }
    }
    public void onCancelClick(View v) {
        setResult(RESULT_CANCELED);
        finish();
    }
    public void onButton1Click(View v) {
        sendMessage("Доступ разрешен");
    }
    public void onButton2Click(View v) {
        sendMessage("Доступ запрещен");
    }
    public void onButton3Click(View v) {
        sendMessage("Недопустимый возраст");
    }
    private void sendMessage(String message){
        Intent data = new Intent();
        data.putExtra(ActivityResultActivity.ACCESS_MESSAGE, message);
        setResult(RESULT_OK, data);
        finish();
    }
}