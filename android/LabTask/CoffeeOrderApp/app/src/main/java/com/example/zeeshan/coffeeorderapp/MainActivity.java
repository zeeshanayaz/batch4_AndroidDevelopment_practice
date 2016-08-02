package com.example.zeeshan.coffeeorderapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
    int prizeOfCoffee = 5;
    int quantity = 0;
    int payment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
//Counter Increment Function
    public void counterIncrement(View view) {
        quantity++;
        TextView textView = (TextView) findViewById(R.id.textView_cofeeCounter);
        String count = textView.getText().toString();

        TextView textView_quantity = (TextView)findViewById(R.id.textView_cofeeCounter);
        textView_quantity.setText(""+ quantity);
        textView_quantity.setTextSize(50);

    }
//Counter Decrement Function
    public void counterDecrement(View view) {
        if (quantity>0)
        {
            quantity--;
            TextView textView = (TextView) findViewById(R.id.textView_cofeeCounter);
            String count = textView.getText().toString();

            TextView textView_quantity = (TextView)findViewById(R.id.textView_cofeeCounter);
            textView_quantity.setText(""+ quantity);
            textView_quantity.setTextSize(50);
        }
    }
//Generate Billing Amount Function
    public void submitOrder(View view)
    {
        if (quantity>0)
        {
            TextView textView = (TextView) findViewById(R.id.textView_cofeeCounter);
            String count = textView.getText().toString();

            payment = quantity * prizeOfCoffee;

            TextView textView_amount = (TextView) findViewById(R.id.textView_bill);
            textView_amount.setText("Your Billed amount is Rs. " + payment);
            textView_amount.setTextSize(30);

            String Greeting = "Thanks for your Order";

            Toast ss = Toast.makeText(this, Greeting, Toast.LENGTH_SHORT);
            ss.show();
        }
        else
        {
            TextView textView_amount = (TextView) findViewById(R.id.textView_bill);
            textView_amount.setText("We cannot Sell Purchase 0 coffee");
            textView_amount.setTextSize(30);

            String Greeting = "Please select some logical quantity of Coffee";
            Toast ss = Toast.makeText(this, Greeting, Toast.LENGTH_SHORT);
            ss.show();
        }
    }

}
