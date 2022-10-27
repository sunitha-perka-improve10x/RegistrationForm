package com.example.registrationform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.signupInfo_btn);
        button.setOnClickListener(view -> {
            Intent intent = new Intent(this, SighnUpInfoActivity.class);
            startActivity(intent);
        });
        Button button1 = findViewById(R.id.personal_next_btn);
        button1.setOnClickListener(view -> {
            Intent intent = new Intent(this,PersonalInfoActivity.class);
            startActivity(intent);
        });
        Button button2 = findViewById(R.id.professional_btn);
        button2.setOnClickListener(view -> {
            Intent intent = new Intent(this,ProfessionalInfoActivity.class);
            startActivity(intent);
        });
    }
}