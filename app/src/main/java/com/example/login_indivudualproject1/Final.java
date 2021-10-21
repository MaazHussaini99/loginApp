package com.example.login_indivudualproject1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Final extends AppCompatActivity {
    int points;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);


        Intent recInt = getIntent();
        points = recInt.getIntExtra("Score7", points);

        TextView scoreTextView = (TextView) findViewById(R.id.points);
        scoreTextView.setText("Your Final score is " + Integer.toString(points));
    }
}