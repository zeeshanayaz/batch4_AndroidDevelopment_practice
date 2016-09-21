package com.example.user.quizzapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Quiz4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz4);
    }
    public void nextQuiz(View view)
    {
        Intent i = new Intent(this, Quiz5.class);
        startActivity(i);
    }

    public void submitQuiz(View view)
    {
        Intent i = new Intent(this,QuizScore.class);
        startActivity(i);
    }
}
