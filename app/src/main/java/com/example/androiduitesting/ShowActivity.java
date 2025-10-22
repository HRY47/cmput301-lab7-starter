package com.example.androiduitesting;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class ShowActivity extends AppCompatActivity {

    private EditText editTextName;
    private Button buttonBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.show_activity);

        editTextName = findViewById(R.id.editText_name);
        buttonBack = findViewById(R.id.Button_back);

        Intent intent = getIntent();
        String cityName = intent.getStringExtra("city_name");

        if (cityName != null) {
            editTextName.setText(cityName);
        }
        buttonBack.setOnClickListener(v -> finish());
    }
}

