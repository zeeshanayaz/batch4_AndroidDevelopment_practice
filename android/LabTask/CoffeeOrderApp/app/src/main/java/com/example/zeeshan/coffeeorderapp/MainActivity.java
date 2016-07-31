package com.example.zeeshan.coffeeorderapp;

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
//Counter Increment Function
    public void counterIncrement(View view) {
        TextView textView = (TextView) findViewById(R.id.cofeeCounter);
        String count = textView.getText().toString();

    }
//Counter Decrement Function
    public void counterDecrement(View view) {
        TextView textView = (TextView) findViewById(R.id.cofeeCounter);
        String count = textView.getText().toString();

    }
//Generate Billing Amount Function
    public void generateBill(View view)
    {
        TextView textView = (TextView) findViewById(R.id.cofeeCounter);
        String count = textView.getText().toString();

        TextView textView_amount = (TextView)findViewById(R.id.textView_bill);
        textView_amount.setText("Your Billed amount is Rs. "+count);
        textView_amount.setTextSize(30);

        String Greeting = "Thanks for your Order";

        Toast ss = Toast.makeText(this,Greeting, Toast.LENGTH_SHORT);
        ss.show();
    }
}
