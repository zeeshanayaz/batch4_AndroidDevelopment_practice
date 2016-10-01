package com.example.user.quizzapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class QuizScore extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_score);

        FinalScore();

    }



    public void FinalScore() {
        TextView textView_Score = (TextView) findViewById(R.id.scoreTextView);
        int score = MainActivity.score;
        textView_Score.setText(score + " out of 5");
    }

    public void start(View view)
    {
        Intent i = new Intent(this,MainActivity.class);
        MainActivity.score=0;
        startActivity(i);
    }
}
