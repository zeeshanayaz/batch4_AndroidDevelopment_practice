package com.example.user.quizzapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Quiz2 extends AppCompatActivity {

    RadioButton option1;
    RadioButton option2;
    RadioButton option3;
    RadioButton option4;
    RadioGroup answerGroup;
    MainActivity main = new MainActivity();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz2);
    }
    public void nextQuiz(View view)
    {
        answerGroup = (RadioGroup) findViewById(R.id.radioGroupAnswer);

        int index = answerGroup.indexOfChild(findViewById(answerGroup.getCheckedRadioButtonId()));

        switch(index)
        {
            case 3 :
               // totalScore = totalScore + x; // x is the score of the first answer
                //next activity
                submitQuiz(view);
                break;
            default:
                //add 0
                submitQuiz(view);
        }



        /*
        option1 = (RadioButton) findViewById(R.id.option1RadioButton);
        option2 = (RadioButton) findViewById(R.id.option2RadioButton);
        option3 = (RadioButton) findViewById(R.id.option3RadioButton);
        option4 = (RadioButton) findViewById(R.id.option4RadioButton);


        if(option1.isChecked() || option2.isChecked() || option3.isChecked() || option4.isChecked())
        {
            if (option3.isChecked())
            {
                main.addScore();
            }
            Intent i = new Intent(this, Quiz3.class);
            startActivity(i);
        }
        else
        {
            Toast toast = Toast.makeText(this, "Please Select any option", Toast.LENGTH_SHORT);
            toast.show();
        }*/
    }


    public void submitQuiz(View view)
    {
        Intent i = new Intent(this,QuizScore.class);
        startActivity(i);
    }

}
