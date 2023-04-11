package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int n1=0,n2=0,n3=0,n4=0,n5=0,n6=0,n7=0,n8=0,n9=0,n0=0,ans;
    TextView txtResult;
    Button btn1,btn2,btn3,btn0,btnPlus,btnClear,btn4,btn5,btn6,btn7,btn8,btn9,btnMulti,btnPercent,btnDivide,btnMinus;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonBind();
        clickbutton();
    }
    private void buttonBind() {

        txtResult = findViewById(R.id.txtResult);
        btn1 = findViewById(R.id.btn1);
        btnMulti=findViewById(R.id.btnMulti);
        btnPercent= findViewById(R.id.btnPercent);
        btnDivide=findViewById(R.id.btnDivide);
        btnMinus=findViewById(R.id.btnMinus);
        btn2 = findViewById(R.id.btn2);
        btn0= findViewById(R.id.btn0);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btnPlus = findViewById(R.id.btnPlus);
        btnClear= findViewById(R.id.btnClear);
    }


    private void clickbutton() {
        btn1.setOnClickListener( a -> {
        n1=1;

        });

        btn2.setOnClickListener( b -> {
        n2=2;

        });

        btn3.setOnClickListener( c -> {
        n3=3;

        });

        btn4.setOnClickListener(g -> {
         n4=4;
        });

        btn5.setOnClickListener( h -> {
        n5=5;

        });

        btn6.setOnClickListener( i -> {
        n6=6;
        });

        btn7.setOnClickListener( j -> {
        n7=7;

        });

        btn8.setOnClickListener( k -> {
        n8=8;
        });
        btn9.setOnClickListener( l -> {
        n9=9;
        });

        btn0.setOnClickListener( pp -> {
          n0=0;
        });


        btnClear.setOnClickListener(e -> {

            n1=0;
            n2=0;
            n3=0;
            n4=0;
            n5=0;
            n6=0;
            n7=0;
            n8=0;
            n9=0;
            n0=0;
            txtResult.setText("");
        });

        btnPlus.setOnClickListener(f -> {

                    ans = n1+n2+n3+n4+n5+n6+n7+n8+n9+n0;
                    txtResult.setText(ans + "");
        });
        btnMinus.setOnClickListener( kk -> {

            ans = n9-n8-n7-n6-n5-n4-n3-n2-n1-n0;
            txtResult.setText(ans+"");

        });


        btnPercent.setOnClickListener( ll -> {

            ans=n1*n2/100;
            txtResult.setText(ans+"");
        });

    }

}