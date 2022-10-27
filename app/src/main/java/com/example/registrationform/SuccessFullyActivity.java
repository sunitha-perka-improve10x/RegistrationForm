package com.example.registrationform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class SuccessFullyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success_fully);
        Intent intent = getIntent();
        String email = intent.getStringExtra("email");
        String password = intent.getStringExtra("password");
        String confirmPassword = intent.getStringExtra("confirmPassword");
        String username = intent.getStringExtra("userName");
        String firstname = intent.getStringExtra("firstName");
        String lastname = intent.getStringExtra("lastName");
        String dateOfBirth = intent.getStringExtra("dateOfBirth");
        String placeOfBirth = intent.getStringExtra("placeOfBirth");
        String currentCompany = intent.getStringExtra("currentCompany");
        String totalExperience = intent.getStringExtra("totalExperience");
        String designation = intent.getStringExtra("designation");
        TextView usernameTxt = findViewById(R.id.user_name_txt);
        usernameTxt.setText(username);
        TextView firstnameTxt = findViewById(R.id.firstname_txt1);
        firstnameTxt.setText(firstname);
        TextView lastnameTxt = findViewById(R.id.lastname_txt1);
        lastnameTxt.setText(lastname);
        TextView dateOfBirthTxt = findViewById(R.id.date_of_birth_txt);
        dateOfBirthTxt.setText(dateOfBirth);
        TextView placeOfBirthTxt = findViewById(R.id.place_of_birth_txt);
        placeOfBirthTxt.setText(placeOfBirth);
        TextView currentCompanyTxt = findViewById(R.id.currentcompany_txt);
        currentCompanyTxt.setText(currentCompany);
        TextView totalExperienceTxt = findViewById(R.id.total_experience_txt);
        totalExperienceTxt.setText(totalExperience);
        TextView designationTxt = findViewById(R.id.desig_nation_txt);
        designationTxt.setText(designation);
    }
}