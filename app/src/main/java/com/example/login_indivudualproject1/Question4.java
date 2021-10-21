package com.example.login_indivudualproject1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class Question4 extends AppCompatActivity {

    int points;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question4);

        Intent recInt = getIntent();
        points = recInt.getIntExtra("Score3", points);
        TextView scoreTextView = (TextView) findViewById(R.id.points);
        scoreTextView.setText("Score is " + Integer.toString(points));
    }

    public void firstRadioButtons (View view){

        if(view.getId() == R.id.questionOneC){
            points++;

        }

    }


    public void moveToQuestion5(View view) {



        TextView scoreTextView = (TextView) findViewById(R.id.points);
        scoreTextView.setText(" " + Integer.toString(points));
        Intent intent = new Intent(this, Question5.class);
        intent.putExtra("Score4", points);
        this.startActivity(intent);

    }
}