package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.ContextFactory;
import org.mozilla.javascript.Scriptable;

public class MainActivity extends AppCompatActivity {
    Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnSum,btnSub,btnDiv,btnMult,btnEqual,btnDot,btnClear,btnParent,btnPercent;
    TextView indexInput, indexOutput;
    String index;
    boolean checkBracket = false;



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

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                indexInput.setText("");
                indexOutput.setText("");

            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                index = indexInput.getText().toString();
                indexInput.setText(index + "0");
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                index = indexInput.getText().toString();
                indexInput.setText(index + "1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                index = indexInput.getText().toString();
                indexInput.setText(index + "2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                index = indexInput.getText().toString();
                indexInput.setText(index + "3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                index = indexInput.getText().toString();
                indexInput.setText(index + "4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                index = indexInput.getText().toString();
                indexInput.setText(index + "5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                index = indexInput.getText().toString();
                indexInput.setText(index + "6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                index = indexInput.getText().toString();
                indexInput.setText(index + "7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                index = indexInput.getText().toString();
                indexInput.setText(index + "8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                index = indexInput.getText().toString();
                indexInput.setText(index + "9");
            }
        });

        btnSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                index = indexInput.getText().toString();
                indexInput.setText(index + "+");
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                index = indexInput.getText().toString();
                indexInput.setText(index + "-");
            }
        });

        btnMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                index = indexInput.getText().toString();
                indexInput.setText(index + "x");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                index = indexInput.getText().toString();
                indexInput.setText(index + "2");
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                index = indexInput.getText().toString();
                indexInput.setText(index + "/");
            }
        });

        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                index = indexInput.getText().toString();
                indexInput.setText(index + ".");
            }
        });

        btnPercent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                index = indexInput.getText().toString();
                indexInput.setText(index + "%");
            }
        });

        btnParent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              if (checkBracket){
                  index = indexInput.getText().toString();
                  indexInput.setText(index + ")");
                  checkBracket = false;
              }else {
                  index = indexInput.getText().toString();
                  indexInput.setText(index + "(");
                  checkBracket = true;
              }

            }
        });

        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                index = indexInput.getText().toString();
                index = index.replaceAll("x","*");
                index = index.replaceAll("%","/100");
                index = index.replaceAll("/","/");

                Context rhino = Context.enter();

                rhino.setOptimizationLevel(-1);

                String result = "";

                try{
                    Scriptable scriptable = rhino.initStandardObjects();
                    result = rhino.evaluateString(scriptable,index,"javascript", 1 ,null).toString();
                }catch (Exception e){
                    result = "0";
                }
                indexOutput.setText(result);
            }
        });












    }
}
