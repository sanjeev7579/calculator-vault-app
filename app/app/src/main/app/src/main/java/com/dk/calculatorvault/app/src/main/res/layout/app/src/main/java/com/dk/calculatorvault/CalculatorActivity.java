package com.dk.calculatorvault;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CalculatorActivity extends Activity {

    private String input = "";
    private final String secretCode = "1234";
    private TextView display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        display = findViewById(R.id.textViewDisplay);

        int[] buttonIds = {
            R.id.button0, R.id.button1, R.id.button2, R.id.button3,
            R.id.button4, R.id.button5, R.id.button6, R.id.button7,
            R.id.button8, R.id.button9
        };

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button b = (Button) v;
                input += b.getText().toString();
                display.setText(input);
            }
        };

        for (int id : buttonIds) {
            Button btn = findViewById(id);
            btn.setOnClickListener(listener);
        }

        Button equalButton = findViewById(R.id.buttonEqual);
        equalButton.setOnClickListener(v -> {
            if (input.equals(secretCode)) {
                startActivity(new Intent(CalculatorActivity.this, VaultActivity.class));
                input = "";
                display.setText("");
            } else {
                display.setText("Wrong PIN");
                input = "";
            }
        });
    }
}
