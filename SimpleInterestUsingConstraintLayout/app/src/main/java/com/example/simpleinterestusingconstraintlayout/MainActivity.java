package com.example.simpleinterestusingconstraintlayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText principalInput, rateInput, timeInput;
    Button calculateButton;
    TextView resultView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize Views
        principalInput = findViewById(R.id.principal);
        rateInput = findViewById(R.id.rate);
        timeInput = findViewById(R.id.time);
        calculateButton = findViewById(R.id.calculateButton);
        resultView = findViewById(R.id.resultView);

        // Set button click listener
        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateSimpleInterest();
            }
        });
    }

    private void calculateSimpleInterest() {
        double principal = Double.parseDouble(principalInput.getText().toString());
        double rate = Double.parseDouble(rateInput.getText().toString());
        double time = Double.parseDouble(timeInput.getText().toString());

        double simpleInterest = (principal * rate * time) / 100;
        resultView.setText("Simple Interest: " + simpleInterest);
    }
}