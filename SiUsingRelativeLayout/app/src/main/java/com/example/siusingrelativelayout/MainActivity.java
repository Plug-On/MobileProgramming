package com.example.siusingrelativelayout;

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

    EditText pri, time , rate ;
    TextView rslt;

    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        pri = findViewById(R.id.pri);
        time = findViewById(R.id.time);
        rate = findViewById(R.id.rate);
        rslt = findViewById(R.id.rslt);
        btn = findViewById(R.id.btn);

        btn.setOnClickListener(v -> {
            try {
                double p = Double.parseDouble(pri.getText().toString());
                double t = Double.parseDouble(time.getText().toString());
                double r = Double.parseDouble(rate.getText().toString());

                double si = (p*t*r)/100;
                rslt.setText("Simple Interest : " + si);
            }
            catch (NumberFormatException e) {
                rslt.setText("Please Enter Valid Numbers");
            }
        });


    }
}