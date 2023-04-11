package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FormFormatPlus extends AppCompatActivity {

    EditText edt1,edt2,edt3,edt4;
    TextView txtAns;
    Button btnCalculate,btnClear;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_format_plus);

        program();

    }

    private void program() {

        edt1= findViewById(R.id.edt1);
        edt2= findViewById(R.id.edt2);
        edt3= findViewById(R.id.edt3);
        edt4= findViewById(R.id.edt4);
        txtAns= findViewById(R.id.txtAns);
        btnCalculate= findViewById(R.id.btnCalculate);
        btnClear= findViewById(R.id.btnClear);


        btnCalculate.setOnClickListener(a ->{

            String n1= edt1.getText().toString();
            String n2= edt2.getText().toString();
            String n3= edt3.getText().toString();
            String n4= edt4.getText().toString();


            int bb=Integer.parseInt(n1);
            int b=Integer.parseInt(n2);
            int c=Integer.parseInt(n3);
            int d=Integer.parseInt(n4);

             int answer;
             answer=bb+b+c+d;

             txtAns.setText(answer+"");

        btnClear.setOnClickListener( x ->{

            edt1.setText("");
            edt2.setText("");
            edt3.setText("");
            edt4.setText("");
            txtAns.setText("");
        });


        });
    }
}