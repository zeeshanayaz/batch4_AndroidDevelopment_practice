package com.example.user.miwok;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void numbers(View view)
    {
        Intent intent = new Intent(this, NumbersActivity.class);
        startActivity(intent);
    }

    public void familyMembers(View view)
    {
        Intent intent = new Intent(this, FamilyMembersActivity.class);
        startActivity(intent);
    }

    public void colors(View view)
    {
        Intent intent = new Intent(this, ColorsActivity.class);
        startActivity(intent);
    }

    public void phrase(View view)
    {
        Intent intent = new Intent(this, PhraseActivity.class);
        startActivity(intent);
    }

}
