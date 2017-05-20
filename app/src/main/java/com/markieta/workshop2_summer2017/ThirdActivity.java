package com.markieta.workshop2_summer2017;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        Intent data = getIntent();

        TextView greetingTextView = (TextView) findViewById(R.id.greetingTextView);
        TextView nameTextView = (TextView) findViewById(R.id.nameTextView);
        TextView studentIdTextView = (TextView) findViewById(R.id.studentIdTextView);

        Bundle student = data.getBundleExtra("student");
        String name = student.getString("My Name");
        int studentId = student.getInt("student id");

        greetingTextView.setText(data.getStringExtra("greeting"));
        nameTextView.setText("My name is " + name + ".");
        studentIdTextView.setText("My student id is " + studentId + " and PIN number is " +
                String.valueOf(data.getIntExtra("number", 0)) + ".");
    }
}
