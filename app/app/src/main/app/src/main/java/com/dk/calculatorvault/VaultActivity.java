package com.dk.calculatorvault;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class VaultActivity extends AppCompatActivity {

    TextView textVault;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vault);

        textVault = findViewById(R.id.textVault);
        textVault.setText("Welcome to Vault! (Here you can hide files)");
    }
}
