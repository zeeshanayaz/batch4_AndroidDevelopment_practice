package com.example.user.quizzapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    static public int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startQuiz(View view)
    {
        Intent i = new Intent(this,Quiz1.class);
        startActivity(i);
    }

    public static void addScore(int score)
    {
        MainActivity.score= MainActivity.score + score;
    }

}
