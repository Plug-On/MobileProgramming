package com.example.oddevenprimedivby7;

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


    EditText num1 ;
    Button evo , prime , divs;

    TextView rslt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        num1=findViewById(R.id.num1);
        evo=findViewById(R.id.evo);
        prime=findViewById(R.id.prime);
        divs=findViewById(R.id.divs);
        rslt=findViewById(R.id.rslt);

        evo.setOnClickListener(view -> {
            Integer n= Integer.parseInt(num1.getText().toString());

            if (n%2 == 0){ rslt.setText(n + " is a even number");}
            else{ rslt.setText(n+ " is a odd number");}
        });

        prime.setOnClickListener(view -> {
            Integer n= Integer.parseInt(num1.getText().toString());
            int c=0;
            for (int i = 1 ; i <=n;i++){
                if(n%i==0){
                     c++;
                }
            }

            if (c == 2){ rslt.setText(n + " is prime number");}
            else{ rslt.setText(n+ " is composite number");}
        });

        divs.setOnClickListener(view -> {
            Integer n= Integer.parseInt(num1.getText().toString());

            if (n%7 == 0){ rslt.setText(n + " is divisible by 7");}
            else{ rslt.setText(n+ " is not is divisible by 7");}
        });


    }
}