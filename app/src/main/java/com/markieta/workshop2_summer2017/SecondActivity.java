package com.markieta.workshop2_summer2017;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {

    private void ok_button_click_handler(){
        Intent resultIntent = new Intent();

        EditText editText = (EditText) findViewById(R.id.editText);
        String message = editText.getText().toString();
        resultIntent.putExtra("message", message);
        setResult(Activity.RESULT_OK, resultIntent);
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Button ok_button = (Button) findViewById(R.id.ok_button);
        ok_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ok_button_click_handler();
            }
        });
    }
}
