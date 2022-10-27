package com.example.registrationform;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SighnUpInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sighn_up_info);
        Button button = findViewById(R.id.next_btn);
        button.setOnClickListener(view -> {
            EditText emailAddressTxt = findViewById(R.id.email_address_txt);
            String emailAddressInString = emailAddressTxt.getText().toString();
            EditText passwordTxt = findViewById(R.id.password_txt);
            String passwordInString = passwordTxt.getText().toString();
            EditText confirmPasswordTxt = findViewById(R.id.confirm_password_txt);
            String confirmPassWordInString = confirmPasswordTxt.getText().toString();
            Intent signupIntent = new Intent(this,PersonalInfoActivity.class);
            signupIntent.putExtra("email",emailAddressInString);
            signupIntent.putExtra("password",passwordInString);
            signupIntent.putExtra("confirmPassword",confirmPassWordInString);
            startActivity(signupIntent);
        });
    }
}