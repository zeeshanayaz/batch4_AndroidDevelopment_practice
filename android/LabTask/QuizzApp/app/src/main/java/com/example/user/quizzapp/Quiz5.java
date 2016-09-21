package com.example.user.quizzapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Quiz5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz5);
    }

    public void submitQuiz(View view)
    {
        Intent i = new Intent(this,QuizScore.class);
        startActivity(i);
    }
}
