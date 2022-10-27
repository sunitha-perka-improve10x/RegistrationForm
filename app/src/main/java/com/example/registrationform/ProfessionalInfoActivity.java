package com.example.registrationform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ProfessionalInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_professional_info);
        Intent intent = getIntent();
        String email = intent.getStringExtra("email");
        String password = intent.getStringExtra("password");
        String confirmPassword = intent.getStringExtra("confirmPassword");
        String username = intent.getStringExtra("userName");
        String firstname = intent.getStringExtra("firstName");
        String lastname = intent.getStringExtra("lastName");
        String dateOfBirth = intent.getStringExtra("dateOfBirth");
        String placeOfBirth = intent.getStringExtra("placeOfBirth");

        Toast.makeText(this,email +  password + confirmPassword ,Toast.LENGTH_SHORT).show();
        Toast.makeText(this,username + firstname + lastname,Toast.LENGTH_SHORT).show();
        Toast.makeText(this,dateOfBirth + placeOfBirth,Toast.LENGTH_SHORT).show();

        Button professionalBtn = findViewById(R.id.professional_next_btn);
        professionalBtn.setOnClickListener(view -> {
            EditText currentCompanyTxt = findViewById(R.id.current_company_txt);
            String currentCompany = currentCompanyTxt.getText().toString();
            EditText totalExperienceTxt = findViewById(R.id.totalexperience_txt);
            String totalExperience  = totalExperienceTxt.getText().toString();
            EditText designationTxt = findViewById(R.id.designation_txt);
            String designation = designationTxt.getText().toString();
            Toast.makeText(this,currentCompany + totalExperience + designation, Toast.LENGTH_SHORT).show();
            Intent successIntent = new Intent(this,SuccessFullyActivity.class);
            successIntent.putExtra("email",email);
            successIntent.putExtra("password",password);
            successIntent.putExtra("confirmPassword",confirmPassword);
            successIntent.putExtra("userName",username);
            successIntent.putExtra("firstName",firstname);
            successIntent.putExtra("lastName",lastname);
            successIntent.putExtra("dateOfBirth",dateOfBirth);
            successIntent.putExtra("placeOfBirth",placeOfBirth);
            successIntent.putExtra("currentCompany",currentCompany);
            successIntent.putExtra("totalExperience",totalExperience);
            successIntent.putExtra("designation",designation);
            startActivity(successIntent);
        });
        Button button = findViewById(R.id.professional_back_btn);
        button.setOnClickListener(view -> {
            finish();
        });

    }
}







