package com.example.largesmallavgsum;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText num1, num2, num3, num4, num5;
    TextView result;
    Button large, small, sum, avg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // Link views with XML IDs
        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        num3 = findViewById(R.id.num3);
        num4 = findViewById(R.id.num4);
        num5 = findViewById(R.id.num5);
        result = findViewById(R.id.result);

        large = findViewById(R.id.large);
        small = findViewById(R.id.small);
        sum = findViewById(R.id.sum);
        avg = findViewById(R.id.avg);

        large.setOnClickListener(view -> {
            double[] nums = getInputs();
            double largest = nums[0];
            for (double n : nums) {
                if (n > largest) largest = n;
            }
            result.setText("Largest number = " + largest);
        });

        small.setOnClickListener(view -> {
            double[] nums = getInputs();
            double smallest = nums[0];
            for (double n : nums) {
                if (n < smallest) smallest = n;
            }
            result.setText("Smallest number = " + smallest);
        });

        sum.setOnClickListener(view -> {
            double[] nums = getInputs();
            double total = 0;
            for (double n : nums) total += n;
            result.setText("Sum = " + total);
        });

        avg.setOnClickListener(view -> {
            double[] nums = getInputs();
            double total = 0;
            for (double n : nums) total += n;
            double average = total / nums.length;
            result.setText("Average = " + average);
        });
    }

    // Helper method to collect all 5 inputs as double[]
    private double[] getInputs() {
        return new double[]{
                Double.parseDouble(num1.getText().toString()),
                Double.parseDouble(num2.getText().toString()),
                Double.parseDouble(num3.getText().toString()),
                Double.parseDouble(num4.getText().toString()),
                Double.parseDouble(num5.getText().toString())
        };
    }
}
