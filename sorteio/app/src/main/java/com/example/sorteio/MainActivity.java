package com.example.sorteio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void generateNumber(View view) {
        int generatedNumber = new Random().nextInt(10);
        TextView labelResult = findViewById(R.id.labelResult);
        labelResult.setText("O número selecionado: " + generatedNumber);
    }
}