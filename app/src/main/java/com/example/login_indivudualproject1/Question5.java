package com.example.login_indivudualproject1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class Question5 extends AppCompatActivity {

    int points;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question5);

        Intent recInt = getIntent();
        points = recInt.getIntExtra("Score4", points);
        TextView scoreTextView = (TextView) findViewById(R.id.points);
        scoreTextView.setText("Score is " + Integer.toString(points));
    }

    public void firstRadioButtons (View view){

        if(view.getId() == R.id.questionOneA){
            points++;

        }

    }


    public void moveToQuestion6(View view) {



        TextView scoreTextView = (TextView) findViewById(R.id.points);
        scoreTextView.setText(" " + Integer.toString(points));
        Intent intent = new Intent(this, Final.class);
        intent.putExtra("Score5", points);
        this.startActivity(intent);

    }
}