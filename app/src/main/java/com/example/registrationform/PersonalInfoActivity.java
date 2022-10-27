package com.example.registrationform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class PersonalInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_info);
        Intent intent = getIntent();
        String email = intent.getStringExtra("email");
        String password = intent.getStringExtra("password");
        String confirmPassword = intent.getStringExtra("confirmPassword");
        Toast.makeText(this, email + password + confirmPassword,Toast.LENGTH_SHORT).show();
        Button personalNextBtn = findViewById(R.id.personal_next_btn);
        personalNextBtn.setOnClickListener(view -> {
            EditText userNameTxt = findViewById(R.id.username_txt);
            String userNameTxtInString = userNameTxt.getText().toString();
            EditText firstNameTxt = findViewById(R.id.firstname_txt);
            String firstNameTxtInString = firstNameTxt.getText().toString();
            EditText lastNameTxt = findViewById(R.id.lastname_txt);
            String lastNameTxtInString = lastNameTxt.getText().toString();
            Intent personalIntent  = new Intent(this,BirthDetailsActivity.class);
            personalIntent.putExtra("email",email);
            personalIntent.putExtra("password",password);
            personalIntent.putExtra("confirmPassword",confirmPassword);
            personalIntent.putExtra("userName",userNameTxtInString);
            personalIntent.putExtra("firstName",firstNameTxtInString);
            personalIntent.putExtra("lastName",lastNameTxtInString);
            startActivity(personalIntent);
        });
        Button backButton = findViewById(R.id.back_btn);
        backButton.setOnClickListener(view -> {
            finish();
        });
    }
}