package com.example.user.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

//        String[] numberEnglish = new String[] {"one","two","three","four","five","six","seven","eight","nine","ten"};

        ArrayList<String> numberEnglish = new ArrayList<String>();
        numberEnglish.add("one");
        numberEnglish.add("two");
        numberEnglish.add("three");
        numberEnglish.add("four");
        numberEnglish.add("five");
        numberEnglish.add("six");
        numberEnglish.add("seven");
        numberEnglish.add("eight");
        numberEnglish.add("nine");
        numberEnglish.add("ten");


//        LinearLayout rootNumberView = (LinearLayout) findViewById(R.id.rootView);
//        TextView numberView = new TextView(this);
//        numberView.setText(numberEnglish.get(0));
//        rootNumberView.addView(numberView);
//
//        TextView numberView2 = new TextView(this);
//        numberView2.setText(numberEnglish.get(1));
//        rootNumberView.addView(numberView2);
//
//        TextView numberView3 = new TextView(this);
//        numberView3.setText(numberEnglish.get(2));
//        rootNumberView.addView(numberView3);

//        for (int i = 0; i<numberEnglish.size();i++)
//        {
//            TextView numberView = new TextView(this);
//            numberView.setText(numberEnglish.get(i));
//            rootNumberView.addView(numberView);
//        }

//        int i = 0;
//        while (i <numberEnglish.size())
//        {
//            TextView numberView = new TextView(this);
//            numberView.setText(numberEnglish.get(i));
//            rootNumberView.addView(numberView);
//            i++;
//        }
        ArrayAdapter<String> itemAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, numberEnglish);

        ListView listView = (ListView) findViewById(R.id.listView);

        listView.setAdapter(itemAdapter);

    }
}
