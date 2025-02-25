package com.example.simpleinterest;

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
 EditText a,b,c;
 Button b1;
  TextView dis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        a=findViewById(R.id.pri);
        b=findViewById(R.id.time);
        c=findViewById(R.id.rate);
        dis=findViewById(R.id.ans);
        b1=findViewById(R.id.calc);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double p = Double.parseDouble(a.getText().toString());
                double t =Double.parseDouble(b.getText().toString());
                double r = Double.parseDouble(c.getText().toString());

                double d=(p*t*r)/100;
                String s = Double.toString(d);
                dis.setText("Simple Interest = " + s);
            }
        });


        }
}
