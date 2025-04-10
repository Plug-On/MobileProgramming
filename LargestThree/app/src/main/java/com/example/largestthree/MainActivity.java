package com.example.largestthree;

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
    EditText num1;
    EditText num2;
    EditText num3;
    TextView large;
    Button btn;
    int lrg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        num1=findViewById(R.id.num1);
        num2=findViewById(R.id.num2);
        num3=findViewById(R.id.num3);
        btn=findViewById(R.id.btn);
        large=findViewById(R.id.large);

        btn.setOnClickListener(view ->{

          double n1=Double.parseDouble(num1.getText().toString());
          double n2=Double.parseDouble(num2.getText().toString());
          double n3=Double.parseDouble(num3.getText().toString());

            if (n1>n2 && n1>n3){
                lrg =n1;}
            else if (n2>n1 && n2>n3)
            {  lrg= n2;}
            else {lrg= n3;}

            large.setText(lrg + " is the largest number.");

        });
    }
}