package com.example.sp20_bse_001_assi_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
public Button btn1,btn2,btn3,btn4,btn5,btn6, btn7,btn8,btn9,btn0,btnclear,btnopen;
private TextView Code;
int i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=(Button)findViewById(R.id.btn1);
        btn2=(Button)findViewById(R.id.btn2);
        btn3=(Button)findViewById(R.id.btn3);
        btn4=(Button)findViewById(R.id.btn4);
        btn5=(Button)findViewById(R.id.btn5);
        btn6=(Button)findViewById(R.id.btn6);
        btn7=(Button)findViewById(R.id.btn7);
        btn8=(Button)findViewById(R.id.btn8);
        btn9=(Button)findViewById(R.id.btn9);
        btn0=(Button)findViewById(R.id.btn0);
        btnclear=(Button)findViewById(R.id.btnclear);
        btnopen=(Button)findViewById(R.id.btnopen);
Code=(TextView)findViewById(R.id.Code) ;
Code.setText("");
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
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Code.setText(Code.getText()+"3");
            }
        });btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Code.setText(Code.getText()+"4");
            }
        });btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Code.setText(Code.getText()+"5");
            }
        });btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Code.setText(Code.getText()+"6");
            }
        });btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Code.setText(Code.getText()+"7");
            }
        });btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Code.setText(Code.getText()+"8");
            }
        });btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Code.setText(Code.getText()+"9");
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Code.setText(Code.getText()+"0");
            }
        });
        btnclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

////               Code.getText().toString();
                String s = Code.getText().toString();
                s = s.substring(0, s.length() - 1);
                Code.setText(s);

            }
        });
        btnopen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Code.getText().equals("1234")){
                    Toast.makeText(MainActivity.this,"Welcome to your safe",Toast.LENGTH_SHORT).show();
                }
                else{

                             Toast.makeText(MainActivity.this,"Wrong Key",Toast.LENGTH_SHORT).show();
                    i++;
                    if(i>=3){
                        finish();
                        Toast.makeText(MainActivity.this,"Account Blocked 😢",Toast.LENGTH_SHORT).show();

                    }


                }
            }
        });
    }


}