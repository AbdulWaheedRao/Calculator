package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView tvtext;
Button btnac;
    Button btnpercent;
    Button btndel;
    Button btndiv;
    Button btn7;
    Button btn8;
    Button btn9;
    Button btnmul;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btnminus;
    Button btn1;
    Button btn2;
    Button btn3;
    Button btnplus;
    Button btn0;
    Button btndot;
    Button btnequal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvtext = findViewById(R.id.tvtext);
        btnac = findViewById(R.id.btnac);
        btnpercent = findViewById(R.id.btnpercent);
        btndel = findViewById(R.id.btndel);
        btndiv = findViewById(R.id.btndiv);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btnmul = findViewById(R.id.btnmul);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btnminus = findViewById(R.id.btnminus);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btnplus = findViewById(R.id.btnplus);
        btn0 = findViewById(R.id.btn0);
        btndot = findViewById(R.id.btndot);
        btnequal = findViewById(R.id.btnequal);
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvtext.setText(tvtext.getText() + "0");
//                        String butn0 = tvtext.getText().toString();
//                        tvtext.setText(butn0 + "0");
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvtext.setText(tvtext.getText() + "1");
//                        String butn1 = tvtext.getText().toString();
//                        tvtext.setText(butn1 + "1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvtext.setText(tvtext.getText() + "2");
//                        String butn2 = tvtext.getText().toString();
//                        tvtext.setText(butn2 + "2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvtext.setText(tvtext.getText() + "3");
//                        String butn3 = tvtext.getText().toString();
//                        tvtext.setText(butn3 + "3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvtext.setText(tvtext.getText() + "4");
//                String butn4 = tvtext.getText().toString();
//                tvtext.setText(butn4 + "4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvtext.setText(tvtext.getText() + "5");
//                String butn5 = tvtext.getText().toString();
//                tvtext.setText(butn5 + "5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvtext.setText(tvtext.getText() + "6");
//                String butn6 = tvtext.getText().toString();
//                tvtext.setText(butn6 + "6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvtext.setText(tvtext.getText() + "7");
//                String butn7 = tvtext.getText().toString();
//                tvtext.setText(butn7 + "7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvtext.setText(tvtext.getText() + "8");
//                String butn8 = tvtext.getText().toString();
//                tvtext.setText(butn8 + "8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvtext.setText(tvtext.getText() + "9");
//                String butn9 = tvtext.getText().toString();
//                tvtext.setText(butn9 + "9");
            }
        });
        btnplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (tvtext.getText().toString().isEmpty()) {
                } else if (tvtext.getText().toString().contains("+")) {
                } else {
                    String btunplus = tvtext.getText().toString();
                    tvtext.setText(btunplus + "+");
                }
            }
        });
        btnminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (tvtext.getText().toString().isEmpty()) {
                } else if (tvtext.getText().toString().contains("-")) {
                } else {
                    String btunminus = tvtext.getText().toString();
                    tvtext.setText(btunminus + "-");
                }
            }
        });
        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (tvtext.getText().toString().isEmpty()) {
                } else if (tvtext.getText().toString().contains("*")) {
                } else {
                    String butnmul = tvtext.getText().toString();
                    tvtext.setText(butnmul + "*");
                }
            }
        });
        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (tvtext.getText().toString().isEmpty()) {
                } else if (tvtext.getText().toString().contains("/")) {
                } else {
                    String butndiv = tvtext.getText().toString();
                    tvtext.setText(butndiv + "/");
                }
            }
        });

        btnac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvtext.setText("");
            }
        });
        btnpercent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (tvtext.getText().toString().isEmpty()) {
                } else {
                    String butnpercent = tvtext.getText().toString();
                    tvtext.setText(String.valueOf(Double.parseDouble(butnpercent) / 100));
                }
            }
        });
        btndel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (tvtext.getText().toString().isEmpty()) {
                } else {
                    String btundel = tvtext.getText().toString();
                    tvtext.setText(btundel.substring(0, btundel.length() - 1));
                }
            }
        });


        btndot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String butndot = tvtext.getText().toString();
                tvtext.setText(butndot + ".");
            }
        });
        btnequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String btunequal = tvtext.getText().toString();
                if (btunequal.contains("+")) {
                    int index = btunequal.indexOf("+");
                    String s1 = btunequal.substring(0, index);
                    String s2 = btunequal.substring(index + 1, btunequal.length());
                    try {
                        double numb1 = Double.parseDouble(s1);
                        double numb2 = Double.parseDouble(s2);
                        tvtext.setText(String.valueOf(numb1 + numb2));
                    } catch (Exception ex) {
                        System.out.println(ex);
                    }
                } else if (btunequal.contains("-")) {
                    int index = btunequal.indexOf("-");
                    String s1 = btunequal.substring(0, index);
                    String s2 = btunequal.substring(index + 1, btunequal.length());
                    try {
                        double numb1 = Double.parseDouble(s1);
                        double numb2 = Double.parseDouble(s2);
                        tvtext.setText(String.valueOf(numb1 - numb2));
                    } catch (Exception ex) {
                        System.out.println(ex);
                    }
                } else if (btunequal.contains("*")) {
                    int index = btunequal.indexOf("*");
                    String s1 = btunequal.substring(0, index);
                    String s2 = btunequal.substring(index + 1, btunequal.length());
                    try {
                        double numb1 = Double.parseDouble(s1);
                        double numb2 = Double.parseDouble(s2);
                        tvtext.setText(String.valueOf(numb1 * numb2));
                    } catch (Exception ex) {
                        System.out.println(ex);
                    }
                } else if (btunequal.contains("/")) {
                    int index = btunequal.indexOf("/");
                    String s1 = btunequal.substring(0, index);
                    String s2 = btunequal.substring(index + 1, btunequal.length());
                    try {
                        double numb1 = Double.parseDouble(s1);
                        double numb2 = Double.parseDouble(s2);
                        tvtext.setText(String.valueOf(numb1 / numb2));
                    } catch (Exception ex) {
                        System.out.println(ex);
                    }
                } else {
                    tvtext.getText().toString().isEmpty();
                }

            }
        });

    }
}

