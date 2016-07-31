package com.example.zeeshan.inputpage_31aug2016;

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

    public void submitInfo(View v)
    {
        TextView textView = (TextView) findViewById(R.id.editText_Name);
        String name1 = textView.getText().toString();

        TextView textView_name = (TextView)findViewById(R.id.textView_default);
        textView_name.setText(name1);
        textView_name.setTextSize(50);

        Toast ss = Toast.makeText(this,name1, Toast.LENGTH_SHORT);
        ss.show();
    }
}

