package com.example.registrationform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class BirthDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birth_details);
        Intent intent = getIntent();
        String email = intent.getStringExtra("email");
        String password = intent.getStringExtra("password");
        String confirmPassword = intent.getStringExtra("confirmPassword");
        String userName = intent.getStringExtra("userName");
        String firstName = intent.getStringExtra("firstName");
        String lastName = intent.getStringExtra("lastName");

        Button button = findViewById(R.id.birthdetails_next_btn);
        button.setOnClickListener(view -> {
            EditText dateOfBirthTxt = findViewById(R.id.dateofbirth_txt);
            String dateOfBirthTxtInString = dateOfBirthTxt.getText().toString();
            EditText placeOfBirthTxt= findViewById(R.id.placeofbirth_txt);
            String placeOfBirthTxtInString = placeOfBirthTxt.getText().toString();
            Toast.makeText(this, dateOfBirthTxtInString + placeOfBirthTxtInString, Toast.LENGTH_SHORT).show();
            Intent birthDetailsIntent = new Intent(this, ProfessionalInfoActivity.class);
            birthDetailsIntent.putExtra("email",email);
            birthDetailsIntent.putExtra("password",password);
            birthDetailsIntent.putExtra("confirmPassword",confirmPassword);
            birthDetailsIntent.putExtra("userName",userName);
            birthDetailsIntent.putExtra("firstName",firstName);
            birthDetailsIntent.putExtra("lastName",lastName);
            birthDetailsIntent.putExtra("dateOfBirth",dateOfBirthTxtInString);
            birthDetailsIntent.putExtra("placeOfBirth",placeOfBirthTxtInString);
            startActivity(birthDetailsIntent);
        });
        Button birthDetailsBackBtn = findViewById(R.id.birthdetails_back_btn);
        birthDetailsBackBtn.setOnClickListener(view -> {
          finish();
        });
    }
}

