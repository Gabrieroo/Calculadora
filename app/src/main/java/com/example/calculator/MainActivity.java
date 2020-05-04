package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnSum,btnSub,btnDiv,btnMult,btnEqual,btnDot,btnClear,btnParent,btnPercent;
    TextView indexInput, indexOutput;
    String index;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn0 = findViewById(R.id.button0);
        btn1 = findViewById(R.id.button1);
        btn2 = findViewById(R.id.button2);
        btn3 = findViewById(R.id.button3);
        btn4 = findViewById(R.id.button4);
        btn5 = findViewById(R.id.button5);
        btn6 = findViewById(R.id.button6);
        btn7 = findViewById(R.id.button7);
        btn8 = findViewById(R.id.button8);
        btn9 = findViewById(R.id.button9);

        btnSum = findViewById(R.id.buttonAdd);
        btnSub = findViewById(R.id.buttonSub);
        btnDiv = findViewById(R.id.buttonDivision);
        btnMult = findViewById(R.id.buttonMultiplication);
        btnEqual = findViewById(R.id.buttonEqual);
        btnDot = findViewById(R.id.buttonDot);
        btnClear = findViewById(R.id.buttonClear);
        btnParent = findViewById(R.id.buttonParentheses);
        btnPercent = findViewById(R.id.buttonPercent);

        indexInput = findViewById(R.id.input);
        indexOutput = findViewById(R.id.output);








    }
}
