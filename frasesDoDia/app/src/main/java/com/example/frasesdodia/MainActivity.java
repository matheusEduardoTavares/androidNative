package com.example.frasesdodia;

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

    public int generateNumber() {
        return new Random().nextInt(5);
    }

    public void updateText(View view) {
        String[] items = {
                "Item 1",
                "Item 2",
                "Item 3",
                "Item 4",
                "Item 5",
        };

        TextView textView = findViewById(R.id.editableText);

        int generatedNumber = this.generateNumber();

        String choosedItem = items[generatedNumber];

        textView.setText(choosedItem);
    }
}