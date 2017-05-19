package com.example.mareklaskowski.workshop2_summer2017;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //handle the button 2 click
    private void a2_button_click_handler(){
        //display a toast for debugging - show the user...
        Toast.makeText(this, "a2 button was clicked", Toast.LENGTH_LONG).show();
        //use an intent to launch our SecondActivity
        //1. create an Intent (in this case implicit)
        Intent a2Intent = new Intent("com.seneca.lab2b.marek"); //TODO: change to your name!
        //2. use the Intent to start the SecondActivity
        startActivity(a2Intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //add code to the button handler for a2_button
        //get a reference to the button
        Button a2_button = (Button) findViewById(R.id.a2_button);
        //set an onclickhandler for the button
        a2_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a2_button_click_handler();
            }
        });
    }
}
