package com.filipkesteli.fragmenti;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String PARAMETER_FIRST = "com.filipkesteli.fragmenti.PARAMETER_FIRST";
    public static final String PARAMETER_SECOND = "com.filipkesteli.fragmenti.PARAMETER_SECOND";
    private EditText etInsertFisrst;
    private EditText etInsertSecond;
    private Button btnGoToSecondActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initWidgets();
        setupListeners();
    }


    private void initWidgets() {
        etInsertFisrst = (EditText) findViewById(R.id.etInsertFirst);
        etInsertSecond = (EditText) findViewById(R.id.etInsertSecond);
        btnGoToSecondActivity = (Button) findViewById(R.id.btnGoToSecondActivity);
    }

    private void setupListeners() {
        btnGoToSecondActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iGoToSecondActivity();
            }
        });
    }

    private void iGoToSecondActivity() {
        Intent intent = new Intent(this, SecondActivity.class);
        mFirstNumberEdit(intent);
        mSecondNumberEdit(intent);
        startActivityForResult(intent, 1);
    }

    private void mFirstNumberEdit(Intent intent) {
        int firstNumber = Integer.parseInt(etInsertFisrst.getText().toString());
        intent.putExtra(PARAMETER_FIRST, firstNumber);
    }

    private void mSecondNumberEdit(Intent intent) {
        int secondNumber = Integer.parseInt(etInsertSecond.getText().toString());
        intent.putExtra(PARAMETER_SECOND, secondNumber);
    }
}