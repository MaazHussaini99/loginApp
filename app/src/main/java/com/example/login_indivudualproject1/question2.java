package com.example.login_indivudualproject1;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class Question2 extends AppCompatActivity {

    int points;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question2);

        Intent recInt = getIntent();
        points = recInt.getIntExtra("Score1", points);
        TextView scoreTextView = (TextView) findViewById(R.id.points);
        scoreTextView.setText("Score is " + Integer.toString(points));
    }

    public void firstRadioButtons (View view){

        if(view.getId() == R.id.questionOneB){
            points++;
        }
    }


    public void moveToQuestion3(View view) {

        TextView scoreTextView = (TextView) findViewById(R.id.points);
        scoreTextView.setText("Score is " + Integer.toString(points));
        Intent intent = new Intent(this, Question3.class);
        intent.putExtra("Score2", points);
        this.startActivity(intent);

    }
}