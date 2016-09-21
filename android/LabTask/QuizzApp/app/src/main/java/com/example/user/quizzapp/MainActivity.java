package com.example.user.quizzapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addScore()
    {
        score++;
    }

    public void startQuiz(View view)
    {
        Intent i = new Intent(this,Quiz1.class);
        startActivity(i);
    }

}
