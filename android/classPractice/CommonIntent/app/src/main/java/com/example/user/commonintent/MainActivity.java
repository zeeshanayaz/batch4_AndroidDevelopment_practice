package com.example.user.commonintent;

import android.content.Intent;
import android.net.Uri;
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

    public void SubmitButton(View view) {
        TextView textView = (TextView) findViewById(R.id.Message_TextView);
        String message = textView.getText().toString();

//        Toast toast = Toast.makeText(this, message, Toast.LENGTH_SHORT);
//        toast.show();

        composeEmail(new String[]{"zeeshanayaz1@gmail.com"}, "Test Mail");
    }

    public void map(View view)
    {
        showMap("geo:0,0?q=1600+Amphitheatre+Parkway%2C+CA");
    }

//    Email Intent
    public void composeEmail(String[] addresses, String subject) {
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:")); // only email apps should handle this
        intent.putExtra(Intent.EXTRA_EMAIL, addresses);
        intent.putExtra(Intent.EXTRA_SUBJECT, subject);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

//    Map Intent
    public void showMap(String geoLocation) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(geoLocation));
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
}

