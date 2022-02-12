package com.example.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class JogoActivity extends AppCompatActivity {

    private ImageView imgResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jogo);

        imgResultado = findViewById(R.id.imgResultado);

        Bundle bundle = getIntent().getExtras();
        int result = bundle.getInt("result");

        if (result == 0) {
            imgResultado.setImageResource(R.drawable.moeda_cara);
        }
        else {
            imgResultado.setImageResource(R.drawable.moeda_coroa);
        }
    }

    public void closeActivity(View view) {
        finish();
    }
}