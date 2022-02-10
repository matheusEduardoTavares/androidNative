package com.example.alcoolougasolina;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    private TextInputEditText alcoolLabel;
    private TextInputEditText gasolinaLabel;
    private TextView resultLabel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        alcoolLabel = findViewById(R.id.alcoolLabel);
        gasolinaLabel = findViewById(R.id.gasolinaLabel);
        resultLabel = findViewById(R.id.resultLabel);
    }

    public void calcular(View view) {
        try {
            double alcool = Double.parseDouble(alcoolLabel.getText().toString());
            double gasolina = Double.parseDouble(gasolinaLabel.getText().toString());

            System.out.println("alcool: " + alcool);
            System.out.println("gasolina: " + gasolina);

            boolean deveUsarGasolina = (alcool / gasolina) >= 0.7;

            if (deveUsarGasolina) {
                resultLabel.setText("Melhor utilizar Gasolina");
            } else {
                resultLabel.setText("Melhor utilizar Álcool");
            }
        }
        catch (Exception e) {
            System.out.println("ERRO: " + e);
        }
    }
}