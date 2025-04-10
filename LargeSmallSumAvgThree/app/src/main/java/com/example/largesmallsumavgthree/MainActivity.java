package com.example.largesmallsumavgthree;

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

    EditText num1 , num2 , num3;
    TextView result;

    Button large , small , sum , avg;
    double lrg,sm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


            num1=findViewById(R.id.num1);
            num2=findViewById(R.id.num2);
            num3=findViewById(R.id.num3);
            result=findViewById(R.id.result);
            large=findViewById(R.id.large);
            small=findViewById(R.id.small);
            sum=findViewById(R.id.sum);
            avg=findViewById(R.id.avg);

            large.setOnClickListener(view->{
                double n1 = Double.parseDouble(num1.getText().toString());
                double n2 = Double.parseDouble(num2.getText().toString());
                double n3 = Double.parseDouble(num3.getText().toString());

                if(n1>n2 && n1>n3)
                {
                    lrg=n1;
                } else if (n2>n1 && n2>n3) {
                    lrg=n2;
                }
                else {
                    lrg=n3;}

                result.setText("Largest number= " + lrg);

            });

        small.setOnClickListener(view->{
            double n1 = Double.parseDouble(num1.getText().toString());
            double n2 = Double.parseDouble(num2.getText().toString());
            double n3 = Double.parseDouble(num3.getText().toString());

            if(n1<n2 && n1<n3)
            {
                sm=n1;
            } else if (n2<n1 && n2<n3) {
                sm=n2;
            }
            else {
                sm=n3;}

            result.setText("Smallest number= " + sm);

        });

        sum.setOnClickListener(view->{
            double n1 = Double.parseDouble(num1.getText().toString());
            double n2 = Double.parseDouble(num2.getText().toString());
            double n3 = Double.parseDouble(num3.getText().toString());

            double sum = n1+n2+n3;

            result.setText("Sum of three number= " + sum);

        });

        avg.setOnClickListener(view->{
            double n1 = Double.parseDouble(num1.getText().toString());
            double n2 = Double.parseDouble(num2.getText().toString());
            double n3 = Double.parseDouble(num3.getText().toString());

            double average= (n1+n2+n3)/3;

            result.setText("Average of three number= " + average);

        });





    }
}