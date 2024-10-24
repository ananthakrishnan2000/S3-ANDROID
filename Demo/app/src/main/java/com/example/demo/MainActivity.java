package com.example.demo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
EditText a,b,result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;

        });
//        TextView a=(TextView) findViewById(R.id.t1);
//        Button b=findViewById(R.id.b1);
//        b.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                a.setText("Welcome");
//            }
//
//
//        });




//        Button c = findViewById(R.id.b2);
//        c.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                a.setText("");
//            }
//        });
//        TextView d=(TextView) findViewById(R.id.t2);
//        TextView e=(TextView) findViewById(R.id.t4);
//        b.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(MainActivity.this, "Login Successful", Toast.LENGTH_SHORT).show();
//                d.setText("");
//                e.setText("");
//            }
//        });

//        TextView a=(TextView) findViewById(R.id.t1);
//        TextView b=(TextView) findViewById(R.id.t2);
//        TextView d=(TextView) findViewById(R.id.t3);
//        String a1=a.getText().toString();
//        String b1=b.getText().toString();
//        Button c=findViewById(R.id.b1);
//        c.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if(a1.isEmpty() || b1.isEmpty()) {
//                    Toast.makeText(MainActivity.this, "Login Successful", Toast.LENGTH_SHORT).show();
//                    return;
//                }
//                double n1=Double.parseDouble(a1);
//                double n2=Double.parseDouble(b1);
//                double s=n1+n2;
//                DecimalFormat m=new DecimalFormat("#.##");
//                d.setText(m.format(s));
//
//
//           }
//       });


        a=(EditText)findViewById(R.id.t1);
        b=(EditText)findViewById(R.id.t2);
        result=(TextView) findViewById(R.id.t3);

    }
    public void Add(View view) {
        double num1=Double.parseDouble(a.getText().toString());
        double num2=Double.parseDouble(b.getText().toString());
        double sum=num1+num2;
        result.setText(""+sum);
    }

    public void Sub(View view) {
        double num1=Double.parseDouble(ed1.getText().toString());
        double num2=Double.parseDouble(ed2.getText().toString());
        double sub=num1-num2;
        result.setText(""+sub);
    }

