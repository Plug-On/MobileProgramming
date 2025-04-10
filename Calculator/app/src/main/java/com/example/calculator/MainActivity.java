package com.example.calculator;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText n1 ,n2;
    TextView rslt;
    Button add , sub , mul , div;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        n1=findViewById(R.id.n1);
        n2=findViewById(R.id.n2);
        rslt=findViewById(R.id.rslt);
        add=findViewById(R.id.add);
        sub=findViewById(R.id.sub);
        mul=findViewById(R.id.mul);
        div=findViewById(R.id.div);

        add.setOnClickListener(view -> {
            int num1 = Integer.parseInt(n1.getText().toString());
            int num2 = Integer.parseInt(n2.getText().toString());
            int result = num1+num2;
            rslt.setText("Sum= " + result );
        });

        sub.setOnClickListener(view -> {
            int num1 = Integer.parseInt(n1.getText().toString());
            int num2 = Integer.parseInt(n2.getText().toString());
            int result = num1-num2;
            rslt.setText("Difference= " + result );
        });

        mul.setOnClickListener(view -> {
            int num1 = Integer.parseInt(n1.getText().toString());
            int num2 = Integer.parseInt(n2.getText().toString());
            int result = num1*num2;
            rslt.setText("Multiplication= " + result );
        });

        div.setOnClickListener(view -> {
            double num1 = Integer.parseInt(n1.getText().toString());
            double num2 = Integer.parseInt(n2.getText().toString());
            double result = num1/num2;
            rslt.setText("Division= " + result );
        });
    }
}