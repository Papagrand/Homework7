package com.example.homework7;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ActivityResultActivity extends AppCompatActivity {
    static final String AGE_KEY = "AGE";
    static final String ACCESS_MESSAGE="ACCESS_MESSAGE";
    ActivityResultLauncher<Intent> mStartForResult =
            registerForActivityResult(new ActivityResultContracts.StartActivityForResult(),
                    new ActivityResultCallback<ActivityResult>() {
                        @Override
                        public void onActivityResult(ActivityResult result) {
                            TextView textView = findViewById(R.id.activityResultTextView);
                            if(result.getResultCode() == Activity.RESULT_OK){
                                Intent intent = result.getData();
                                String accessMessage =
                                        intent.getStringExtra(ACCESS_MESSAGE);
                                textView.setText(accessMessage);
                            }
                            else{
                                textView.setText("Ошибка доступа");
                            }
                        }
                    });
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
    }
    public void onClick(View view) {
        // получаем введенный возраст
        EditText ageBox = findViewById(R.id.activityResultAge);
        String age = ageBox.getText().toString();
        Intent intent = new Intent(this, ActivityResultSecondActivity.class);
        intent.putExtra(AGE_KEY, age);
        mStartForResult.launch(intent);
    }
}
