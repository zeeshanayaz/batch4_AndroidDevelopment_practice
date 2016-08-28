package com.example.user.coffeeorder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int quantity = 0;
    int eachCoffeePrize = 10;
    int eachMalaiPrize = 2;
    int eachChocolatePrize = 3;
    String name = "Zeeshan Ayaz";
    int malaiPrize = 0;
    int chocolatePrize = 0;
    String message;
    CheckBox isMalaiChecked;
    CheckBox isChocolateChecked;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

//Quantity Decrement
    public void quantityDecrement(View view) {
        if (quantity>0)
        {
            quantity--;
            setCoffeeQuantity(quantity);
            message = calculateCoffeePrize(quantity);
            displayCoffeePrize(message);
        }
        else
        {
            message = "";
            displayCoffeePrize(message);
            displayToast("Sorry\nWe could Not Recognize quantity\n:(");
        }
    }

//Quantity Increment
    public void quantityIncrement(View view) {
        quantity++;
        setCoffeeQuantity(quantity);
        message = calculateCoffeePrize(quantity);
        displayCoffeePrize(message);
    }

//Submit Order Method
    public void submitCoffeeOrder(View view)
    {
        if (quantity>0)
        {
            message = UserData() + calculateCoffeePrize(quantity);
            displayCoffeePrize(message);

            displayToast("Thanks For Your Order\nWe will deliver your coffee ASAP!\n:)");
        }
        else
        {
            displayToast("Sorry\nWe could Not Recognize quantity\n:)");
        }

    }

//Add Toppings
    public void AddTopping(View view)
    {
        setCoffeeQuantity(quantity);
        message = calculateCoffeePrize(quantity);
        displayCoffeePrize(message);
    }

//Coffee Quantity Method
    private void setCoffeeQuantity(int coffeeQuantity) {
        TextView textView_quantity = (TextView) findViewById(R.id.Coffee_Quantity_TextView);
        textView_quantity.setText("" + coffeeQuantity);
        textView_quantity.setTextSize(25);
    }

//Coffee Prize Calculator Method
    private String calculateCoffeePrize(int coffeeQuantity)
    {
        isMalaiChecked = (CheckBox) findViewById(R.id.Add_Malai_Checkbox);
        if (isMalaiChecked.isChecked()) {
            malaiPrize = coffeeQuantity * eachMalaiPrize;
        }
        else
            malaiPrize = 0;

        isChocolateChecked = (CheckBox) findViewById(R.id.Add_Chocolate_Checkbox);
        if (isChocolateChecked.isChecked()) {
            chocolatePrize = coffeeQuantity * eachChocolatePrize;
        }
        else
            chocolatePrize = 0;

        int coffeePrize = coffeeQuantity * eachCoffeePrize;
        int total = malaiPrize + chocolatePrize + coffeePrize;

        String message = "Malai Charges : Rs." + malaiPrize + "\nChocolate Charges : Rs." + chocolatePrize + "\nCoffee Prize : Rs." + coffeePrize + "\n\nTotal Charges : Rs." + total;

        return message;
    }

//Displaying Payment Bill
    private void displayCoffeePrize(String message) {

        TextView textView_Prize = (TextView) findViewById(R.id.Summary_Order_TextView);
        textView_Prize.setText(message);
    }

//Displaying User Name and Detail
    private String UserData()
    {
        String message = "Name : "+name+"\n\n";
        return message;
    }

//Displaying Errors in Toast
    private void displayToast(String toastmsg)
    {
        Toast ss = Toast.makeText(this, toastmsg, Toast.LENGTH_SHORT);
        ss.show();
    }
}
