package com.example.sumaverage5num;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText n1 , n2 , n3, n4 , n5;
    TextView rslt;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        n1=findViewById(R.id.num1);
        n2=findViewById(R.id.num2);
        n3=findViewById(R.id.num3);
        n4=findViewById(R.id.num4);
        n5=findViewById(R.id.num5);
        rslt=findViewById(R.id.result);
        b1=findViewById(R.id.btn);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double a = Float.parseFloat(n1.getText().toString());
                double b = Float.parseFloat(n2.getText().toString());
                double c = Float.parseFloat(n3.getText().toString());
                double d = Float.parseFloat(n4.getText().toString());
                double e = Float.parseFloat(n5.getText().toString());


                double s = a+b+c+d+e;
                double av= s/5;
                String f=Double.toString(s);
                String af=Double.toString(av);
                rslt.setText("sum = "+f + "     average = "+af);

            }
        });

    }
}