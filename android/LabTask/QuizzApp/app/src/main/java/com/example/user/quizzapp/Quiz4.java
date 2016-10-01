package com.example.user.quizzapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class Quiz4 extends AppCompatActivity {

    RadioButton option1;
    RadioButton option2;
    RadioButton option3;
    RadioButton option4;

    int flag = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz4);
    }
    public void nextQuiz(View view)
    {
        option1 = (RadioButton) findViewById(R.id.option1RadioButton);
        option2 = (RadioButton) findViewById(R.id.option2RadioButton);
        option3 = (RadioButton) findViewById(R.id.option3RadioButton);
        option4 = (RadioButton) findViewById(R.id.option4RadioButton);

        if(option1.isChecked() || option2.isChecked() || option3.isChecked() || option4.isChecked())
        {
            if (option2.isChecked())
            {
                flag = 1;
            }
            Intent i = new Intent(this, Quiz5.class);
            MainActivity.addScore(flag);
            startActivity(i);
        }
        else
        {
            Toast toast = Toast.makeText(this, "Please Select any option", Toast.LENGTH_SHORT);
            toast.show();
        }

    }

    public void submitQuiz(View view)
    {
        option1 = (RadioButton) findViewById(R.id.option1RadioButton);
        option2 = (RadioButton) findViewById(R.id.option2RadioButton);
        option3 = (RadioButton) findViewById(R.id.option3RadioButton);
        option4 = (RadioButton) findViewById(R.id.option4RadioButton);

        if(option1.isChecked() || option2.isChecked() || option3.isChecked() || option4.isChecked())
        {
            if (option2.isChecked())
            {
                flag = 1;
            }
            Intent i = new Intent(this,QuizScore.class);
            MainActivity.addScore(flag);
            startActivity(i);
        }
        else
        {
            Toast toast = Toast.makeText(this, "Please Select any option", Toast.LENGTH_SHORT);
            toast.show();
        }
    }
}
