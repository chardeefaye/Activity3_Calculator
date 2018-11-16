package com.example.roleosala.calculator_leosala;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn1, btn2,btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnPlus, btnEquat;
    TextView txtInitial, txtAnswer;
    String num = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        __init__();
        exqListen();
    }

    private void exqListen() {
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setNum("1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setNum("2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setNum("3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setNum("4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setNum("5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setNum("6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setNum("7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setNum("8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setNum("9");
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setNum("0");
            }
        });
        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setNum("+");
            }
        });
        btnEquat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sumItUp();
            }
        });
    }

    public void setNum(String n){
        num += n;
        if(num.contains("++")){
            txtInitial.setText("0");
            txtAnswer.setText("0");
            num = "";
        }else{
            txtInitial.setText(num);
        }
    }

    private void sumItUp(){
        String sum[] = num.split("[+]");
        int avg = 0;
        for(int i = 0; i < sum.length; i++){
            avg += Integer.parseInt(sum[i]);
        }
        txtAnswer.setText(String.valueOf(avg));
    }

    private void __init__() {
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btn0 = findViewById(R.id.btn0);
        btnPlus = findViewById(R.id.btnPlus);
        btnEquat = findViewById(R.id.btnEqual);
        txtAnswer = findViewById(R.id.txtAnswer);
        txtInitial = findViewById(R.id.txtInitial);
    }
}
