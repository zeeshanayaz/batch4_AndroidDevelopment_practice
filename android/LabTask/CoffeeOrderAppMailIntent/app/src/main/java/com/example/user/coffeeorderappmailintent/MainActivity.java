package com.example.user.coffeeorderappmailintent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {

    int quantity = 0;
    int eachCoffeePrize = 10;
    int eachMalaiPrize = 2;
    int eachChocolatePrize = 3;
    String name;
    //    String name = "Zeeshan Ayaz";
    int malaiPrize = 0;
    int chocolatePrize = 0;
    String message;
    CheckBox isMalaiChecked;
    CheckBox isChocolateChecked;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    //Quantity Decrement
    public void quantityDecrement(View view) {
        if (quantity > 0) {
            quantity--;
            setCoffeeQuantity(quantity);
            message = calculateCoffeePrize(quantity);
            displayCoffeePrize(message);
        } else {
            message = "";
            displayCoffeePrize(message);
            displayToast(getResources().getString(R.string.errorCoffeeQuantity));
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
    public void submitCoffeeOrder(View view) {
        if (quantity > 0) {
            message = UserData() + calculateCoffeePrize(quantity);
            displayCoffeePrize(message);

            composeEmail(new String[] {"order@coffeewale.com"}, "Coffee Order Summary",message);

//            displayToast(getResources().getString(R.string.thankfulMessage));

            TextView textView = (TextView) findViewById(R.id.userName_TextView);
            textView.setText("");
        } else {
            displayToast(getResources().getString(R.string.errorCoffeeQuantity));
        }

    }

    //Add Toppings
    public void AddTopping(View view) {
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
    private String calculateCoffeePrize(int coffeeQuantity) {
        isMalaiChecked = (CheckBox) findViewById(R.id.Add_Malai_Checkbox);
        if (isMalaiChecked.isChecked()) {
            malaiPrize = coffeeQuantity * eachMalaiPrize;
        } else
            malaiPrize = 0;

        isChocolateChecked = (CheckBox) findViewById(R.id.Add_Chocolate_Checkbox);
        if (isChocolateChecked.isChecked()) {
            chocolatePrize = coffeeQuantity * eachChocolatePrize;
        } else
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
    private String UserData() {
        TextView textView = (TextView) findViewById(R.id.userName_TextView);
        name = textView.getText().toString();


        if (name == null) {
            name = "customer";
        }
        String message = "Name : " + name + "\n\n";
        return message;

    }

    //Displaying Errors in Toast
    private void displayToast(String toastmsg) {
        Toast ss = Toast.makeText(this, toastmsg, Toast.LENGTH_SHORT);
        ss.show();
    }

    public void composeEmail(String[] addresses, String subject, String message) {
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:")); // only email apps should handle this
        intent.putExtra(Intent.EXTRA_EMAIL, addresses);
        intent.putExtra(Intent.EXTRA_SUBJECT, subject);
        intent.putExtra(Intent.EXTRA_TEXT, message);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://com.example.user.coffeeorderappmailintent/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://com.example.user.coffeeorderappmailintent/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }
}
