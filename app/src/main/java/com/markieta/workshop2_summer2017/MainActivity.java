package com.markieta.workshop2_summer2017;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private void a2_button_click_handler(){
        Toast.makeText(this, "a2 button was clicked", Toast.LENGTH_LONG).show();

        Intent a2Intent = new Intent("com.seneca.lab2b.cmarkieta");
        startActivityForResult(a2Intent, 1);
    }

    private void a3_button_click_handler(){
        Toast.makeText(this, "a3 button was clicked", Toast.LENGTH_LONG).show();

        Intent a3Intent = new Intent(this, ThirdActivity.class);
        startActivity(a3Intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button a2_button = (Button) findViewById(R.id.a2_button);

        a2_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a2_button_click_handler();
            }
        });

        Button a3_button = (Button) findViewById(R.id.a3_button);

        a3_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a3_button_click_handler();
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 1){
            if(resultCode == Activity.RESULT_OK){
                String result = data.getStringExtra("message");
                TextView text = (TextView) findViewById(R.id.textView1);
                text.setText(result);
            }
        }else{
            Log.e("lab2", "SOMETHING WENT VERY WRONG");
        }
    }
}
