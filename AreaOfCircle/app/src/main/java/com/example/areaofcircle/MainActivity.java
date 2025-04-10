package com.example.areaofcircle;

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
    EditText r;
    Button b;
    TextView rs;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        r=findViewById(R.id.radius);
        b=findViewById(R.id.btn);
        rs = findViewById(R.id.rslt);

        b.setOnClickListener(view -> {
            double rd =Double.parseDouble(r.getText().toString());
            double area = Math.PI*rd*rd;
            rs.setText("Area of circle : "+ area);
        });

    }
}