package com.example.login_indivudualproject1;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Access extends AppCompatActivity {
    String userName;
    String fName;
    String lName;
    String DOB;
    String email;

    TextView displayTitle;
    TextView displayFname;
    TextView displayLname;
    TextView displayEmail;
    TextView displayDOB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_access);
        Intent recString = getIntent();
        userName = recString.getStringExtra("username");
        fName =recString.getStringExtra("firstName");
        lName = recString.getStringExtra("lastName");
        email = recString.getStringExtra("email");
        DOB = recString.getStringExtra("dob");

        displayTitle = (TextView) findViewById(R.id.access_display_info);
        displayFname = (TextView) findViewById(R.id.access_display_firstName);
        displayLname = (TextView) findViewById(R.id.access_display_lastName);
        displayEmail = (TextView) findViewById(R.id.access_display_email);
        displayDOB = (TextView) findViewById(R.id.access_display_DOB);

        displayTitle.setText(getResources().getString(R.string.welcome) + userName);
        displayFname.setText(getResources().getString(R.string.displayFname) + fName);
        displayLname.setText(getResources().getString(R.string.displayLname) + lName);
        displayEmail.setText(getResources().getString(R.string.displayEmail) + email);
        displayDOB.setText(getResources().getString(R.string.displayDOB) + DOB);
    }


}