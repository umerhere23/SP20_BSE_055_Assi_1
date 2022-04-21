package com.example.sp20_bse_001_assi_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private Button btn1,btn2,btn3,btn4,btn5,btn6, btn7,btn8,btn9,btn0,btnclear,btnopen;
private TextView Code;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1.findViewById(R.id.btn1);
        btn2.findViewById(R.id.btn2);
        btn3.findViewById(R.id.btn3);
        btn4.findViewById(R.id.btn4);
        btn5.findViewById(R.id.btn5);
        btn6.findViewById(R.id.btn6);
        btn7.findViewById(R.id.btn7);
        btn8.findViewById(R.id.btn8);
        btn9.findViewById(R.id.btn9);
        btn0.findViewById(R.id.btn0);
        btnclear.findViewById(R.id.btnopen);
        btnopen.findViewById(R.id.btnopen);

btn1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Code.setText(Code.getText()+"1");
    }
});
btn2.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Code.setText(Code.getText()+"2");
    }
});
    }

}