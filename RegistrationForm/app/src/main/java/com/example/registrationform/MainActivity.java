package com.example.registrationform;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText name , email , pass , cpass;
    Button rgs;
    TextView data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        name=findViewById(R.id.name);
        email=findViewById(R.id.email);
        pass=findViewById(R.id.pass);
        cpass=findViewById(R.id.cpass);
        rgs=findViewById(R.id.rgs);
        data=findViewById(R.id.data);

        rgs.setOnClickListener(view -> {
            String n= name.getText().toString();
            String em= email.getText().toString();
            String p=pass.getText().toString();
            String c=cpass.getText().toString();

            if ( n.isEmpty() || em.isEmpty() || p.isEmpty() || c.isEmpty()){
                Toast.makeText(this,"Please fill all fields" , Toast.LENGTH_SHORT).show();
            } else if (!p.equals(c)) {
                Toast.makeText(this, "Password do not match" , Toast.LENGTH_SHORT).show();
            } else if(!n.isEmpty()&& p.equals(c)){
                String result = "Full Name: " + n + "\n" +
                                "Email: " + em + "\n" +
                                "Password: " + p ;

                data.setText(result);
            }else{
                Toast.makeText(this,"Registered Successfully" , Toast.LENGTH_SHORT).show();
            }
        });


    }
}