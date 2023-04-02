package com.example.homework7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class HardSerializeAndParcelabelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hard_serialize_and_parcible);
    }

    public void onClickHard(View v) {
        EditText nameText = findViewById(R.id.nameParce);
        EditText companyText = findViewById(R.id.companyParce);
        EditText ageText = findViewById(R.id.ageParce);
        EditText adultText = findViewById(R.id.adultParce);

        if(!nameText.getText().toString().isEmpty() &&
                !companyText.getText().toString().isEmpty() &&
                !ageText.getText().toString().isEmpty() &&
                !adultText.getText().toString().isEmpty()) {

            String name = nameText.getText().toString();
            String company = companyText.getText().toString();
            int age = Integer.parseInt(ageText.getText().toString());
            byte adult = Byte.parseByte(adultText.getText().toString());


            User user = new User(name, company, age, adult);

            Intent intent = new Intent(this, HardSerializeSecondActivity.class);
            intent.putExtra(User.class.getSimpleName(), user);
            startActivity(intent);
        }
    }
}
