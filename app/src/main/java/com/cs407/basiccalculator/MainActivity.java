package com.cs407.basiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void add(View view) {
        EditText numOne = (EditText) findViewById(R.id.numOne);
        EditText numTwo = (EditText) findViewById(R.id.numTwo);
        double sum = Double.parseDouble(numOne.getText().toString()) + Double.parseDouble(numTwo.getText().toString());
//        Toast.makeText(MainActivity.this, numOne.getText().toString(), Toast.LENGTH_LONG).show();
        goToActivity(sum);
    }

    public void subtract(View view) {
        EditText numOne = (EditText) findViewById(R.id.numOne);
        EditText numTwo = (EditText) findViewById(R.id.numTwo);
        double difference = Double.parseDouble(numOne.getText().toString()) - Double.parseDouble(numTwo.getText().toString());
//        Toast.makeText(MainActivity.this, numOne.getText().toString(), Toast.LENGTH_LONG).show();
        goToActivity(difference);
    }

    public void multiply(View view) {
        EditText numOne = (EditText) findViewById(R.id.numOne);
        EditText numTwo = (EditText) findViewById(R.id.numTwo);
        double product = Double.parseDouble(numOne.getText().toString()) * Double.parseDouble(numTwo.getText().toString());
//        Toast.makeText(MainActivity.this, numOne.getText().toString(), Toast.LENGTH_LONG).show();
        goToActivity(product);
    }

    public void divide(View view) {
        EditText numOne = (EditText) findViewById(R.id.numOne);
        EditText numTwo = (EditText) findViewById(R.id.numTwo);

        double numerator = Double.parseDouble(numOne.getText().toString());
        double denominator = Double.parseDouble(numTwo.getText().toString());

        if (denominator == 0) {
            Toast.makeText(MainActivity.this, "Can't divide by zero!", Toast.LENGTH_SHORT).show();
        } else {
            double quotient = numerator / denominator;
//        Toast.makeText(MainActivity.this, numOne.getText().toString(), Toast.LENGTH_LONG).show();
            goToActivity(quotient);
        }
    }

    public void goToActivity(double result) {
        Intent intent = new Intent(this, CalculatorActivity.class);
        String s = String.valueOf(result);
        intent.putExtra("message", s);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}