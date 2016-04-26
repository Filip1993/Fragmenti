package com.filipkesteli.fragmenti;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private EditText etFirstNumber;
    private EditText etSecondNumber;
    private TextView tvSum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        initWidgets();
        handleIntents();
    }

    private void initWidgets() {
        etFirstNumber = (EditText) findViewById(R.id.etFirstNumber);
        etSecondNumber = (EditText) findViewById(R.id.etSecondNumber);
        tvSum = (TextView) findViewById(R.id.tvSum);
    }

    private void handleIntents() {
        Intent intent = getIntent();
        if (intent.hasExtra(MainActivity.PARAMETER_FIRST) && intent.hasExtra(MainActivity.PARAMETER_SECOND)) {
            int firstNumber = intent.getIntExtra(MainActivity.PARAMETER_FIRST, 0);
            int secondNumber = intent.getIntExtra(MainActivity.PARAMETER_SECOND, 0);
            etFirstNumber.setText(firstNumber + "");
            etSecondNumber.setText(secondNumber + "");
        }
    }
}
