package com.jaytala.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button i1, i2, i3, i4, i5, i6, i7, i8, i9, i00, i0, iac;
    Button plus, equal, min, multi, div;
    TextView text_number;

    int f_num, s_num;
    char op;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        equal = findViewById(R.id.equal);
        div = findViewById(R.id.idiv);
        min = findViewById(R.id.imin);
        multi = findViewById(R.id.imulti);
        plus = findViewById(R.id.plus);
        text_number = findViewById(R.id.text_number);
        i1 = findViewById(R.id.i1);
        i2 = findViewById(R.id.i2);
        i3 = findViewById(R.id.i3);
        i4 = findViewById(R.id.i4);
        i5 = findViewById(R.id.i5);
        i6 = findViewById(R.id.i6);
        i7 = findViewById(R.id.i7);
        i8 = findViewById(R.id.i8);
        i9 = findViewById(R.id.i9);
        i00 = findViewById(R.id.i00);
        i0 = findViewById(R.id.i0);
        iac = findViewById(R.id.iac);


        text_number.setText("");

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (op == '+') {
                    s_num = Integer.parseInt(text_number.getText().toString());
                    Addition();
                }else if(op == '-'){
                    s_num = Integer.parseInt(text_number.getText().toString());
                    min();
                }else if(op == '*'){
                    s_num = Integer.parseInt(text_number.getText().toString());
                    multi();
                }else if(op == '/'){
                    s_num = Integer.parseInt(text_number.getText().toString());
                    div();
                }
            }
        });

        iac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                text_number.setText("");

            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                f_num = Integer.parseInt(text_number.getText().toString());
                text_number.setText("");
                op = '+';
            }
        });
        min.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                f_num = Integer.parseInt(text_number.getText().toString());
                text_number.setText("");
                op = '-';
            }
        });
        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                f_num = Integer.parseInt(text_number.getText().toString());
                text_number.setText("");
                op = '*';
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                f_num = Integer.parseInt(text_number.getText().toString());
                text_number.setText("");
                op = '/';
            }
        });

        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String old = text_number.getText().toString();
                text_number.setText(old + "1");

            }
        });
        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String old = text_number.getText().toString();
                text_number.setText(old + "2");

            }
        });
        i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String old = text_number.getText().toString();
                text_number.setText(old + "3");

            }
        });
        i4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String old = text_number.getText().toString();
                text_number.setText(old + "4");

            }
        });
        i5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String old = text_number.getText().toString();
                text_number.setText(old + "5");

            }
        });
        i6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String old = text_number.getText().toString();
                text_number.setText(old + "6");

            }
        });
        i7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String old = text_number.getText().toString();
                text_number.setText(old + "7");

            }
        });
        i8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String old = text_number.getText().toString();
                text_number.setText(old + "8");

            }
        });
        i9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String old = text_number.getText().toString();
                text_number.setText(old + "9");

            }
        });
        i00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String old = text_number.getText().toString();
                text_number.setText(old + "00");

            }
        });
        i0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String old = text_number.getText().toString();
                text_number.setText(old + "0");

            }
        });

    }

    private void Addition() {

        int sum = f_num + s_num;
        text_number.setText(sum + "");

    }

    private void min() {

        int sum = f_num - s_num;
        text_number.setText(sum + "");

    }

    private void multi() {

        int sum = f_num * s_num;
        text_number.setText(sum + "");

    }

    private void div() {


        int sum = f_num / s_num;
        text_number.setText(sum + "");

    }

}