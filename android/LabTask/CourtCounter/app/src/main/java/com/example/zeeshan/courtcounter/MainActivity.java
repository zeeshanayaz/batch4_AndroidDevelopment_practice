package com.example.zeeshan.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public int teamAScore = 0;
    public int teamBScore = 0;
    public int winnerScore = 10;

    //Team A Score
    public void add3PointstoA(View view)
    {
        if (teamAScore >=winnerScore || teamBScore>=winnerScore)
        {
            Toast ss = Toast.makeText(this, "Reset it to play again", Toast.LENGTH_SHORT);
            ss.show();
        }
        else
        {
            teamAScore = teamAScore + 3;

            TextView textView_score = (TextView)findViewById(R.id.textView_TeamAScore);
            textView_score.setText(""+ teamAScore);
            textView_score.setTextSize(60);
            checkWinner();
        }
    }
    public void add2PointstoA(View view)
    {
        if (teamAScore >=winnerScore || teamBScore>=winnerScore)
        {
            Toast ss = Toast.makeText(this, "Reset it to play again", Toast.LENGTH_SHORT);
            ss.show();
        }
        else
        {
            teamAScore = teamAScore + 2;

            TextView textView_score = (TextView)findViewById(R.id.textView_TeamAScore);
            textView_score.setText(""+ teamAScore);
            textView_score.setTextSize(60);
            checkWinner();
        }
    }
    public void add1PointToAFreeThrow(View view)
    {
        if (teamAScore >=winnerScore || teamBScore>=winnerScore)
        {
            Toast ss = Toast.makeText(this, "Reset it to play again", Toast.LENGTH_SHORT);
            ss.show();
        }
        else
        {
            teamAScore = teamAScore + 1;

            TextView textView_score = (TextView) findViewById(R.id.textView_TeamAScore);
            textView_score.setText("" + teamAScore);
            textView_score.setTextSize(60);
            checkWinner();
        }
    }

    //Team B Score

    public void add3PointstoB(View view)
    {
        if (teamAScore>=winnerScore || teamBScore>=winnerScore)
        {
            Toast ss = Toast.makeText(this, "Reset it to play again", Toast.LENGTH_SHORT);
            ss.show();
        }
        else
        {
            teamBScore = teamBScore + 3;

            TextView textView_score = (TextView) findViewById(R.id.textView_TeamBScore);
            textView_score.setText("" + teamBScore);
            textView_score.setTextSize(60);
            checkWinner();
        }
    }
    public void add2PointstoB(View view)
    {
        if (teamAScore>=winnerScore || teamBScore>=winnerScore)
        {
            Toast ss = Toast.makeText(this, "Reset it to play again", Toast.LENGTH_SHORT);
            ss.show();
        }
        else
        {
            teamBScore = teamBScore + 2;

            TextView textView_score = (TextView)findViewById(R.id.textView_TeamBScore);
            textView_score.setText(""+ teamBScore);
            textView_score.setTextSize(60);
            checkWinner();
        }
    }
    public void add1PointToBFreeThrow(View view)
    {
        if (teamBScore>=winnerScore || teamAScore>=winnerScore)
        {
            Toast ss = Toast.makeText(this, "Reset it to play again", Toast.LENGTH_SHORT);
            ss.show();
        }
        else
        {
            teamBScore = teamBScore + 1;

            TextView textView_score = (TextView)findViewById(R.id.textView_TeamBScore);
            textView_score.setText(""+ teamBScore);
            textView_score.setTextSize(60);
            checkWinner();
        }
    }

    public void resetScore(View view)
    {
        if (teamAScore == 0 && teamBScore == 0)
        {
            Toast ss = Toast.makeText(this, "Score are already set to O", Toast.LENGTH_SHORT);
            ss.show();
        }
        else
        {
            teamBScore = 0;
            teamAScore = 0;
            TextView textView_scoreA = (TextView)findViewById(R.id.textView_TeamAScore);
            textView_scoreA.setText("00");
            textView_scoreA.setTextSize(60);

            TextView textView_scoreB = (TextView)findViewById(R.id.textView_TeamBScore);
            textView_scoreB.setText("00");
            textView_scoreB.setTextSize(60);
        }
    }

    public void checkWinner()
    {
        if (teamAScore>winnerScore || teamAScore == winnerScore)
        {
            Toast ss = Toast.makeText(this, "Team A is Winner", Toast.LENGTH_SHORT);
            ss.show();
        }
        if (teamBScore>winnerScore || teamBScore == winnerScore)
        {
            Toast ss = Toast.makeText(this, "Team B is Winner", Toast.LENGTH_SHORT);
            ss.show();
        }
    }

}
