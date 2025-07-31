package com.dk.calculatorvault;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class CalculatorActivity extends AppCompatActivity {

    EditText passwordField;
    Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        passwordField = findViewById(R.id.passwordEditText);
        loginButton = findViewById(R.id.loginButton);

        loginButton.setOnClickListener(v -> {
            String password = passwordField.getText().toString();
            if (password.equals("1234")) {
                // Correct password, go to vault
                Intent intent = new Intent(CalculatorActivity.this, VaultActivity.class);
                startActivity(intent);
            } else {
                passwordField.setError("Wrong Password");
            }
        });
    }
}
