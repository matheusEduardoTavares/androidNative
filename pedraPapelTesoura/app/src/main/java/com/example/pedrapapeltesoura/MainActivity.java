package com.example.pedrapapeltesoura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView imgPedra, imgTesoura, imgPapel, imgApp;
    private TextView resultLabel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgPedra = findViewById(R.id.imgPedra);
        imgTesoura = findViewById(R.id.imgTesoura);
        imgPapel = findViewById(R.id.imgPapel);
        imgApp = findViewById(R.id.imgApp);
        resultLabel = findViewById(R.id.resultLabel);
    }

    public void escolheuTesoura(View view) {
        rodarJogo("tesoura");
    }

    public void escolheuPedra(View view) {
        rodarJogo("pedra");
    }

    public void escolheuPapel(View view) {
        rodarJogo("papel");
    }

    public void rodarJogo(String escolhaUsuario) {
        String[] opcoes = {"pedra", "papel", "tesoura"};
        String escolhaApp = opcoes[new Random().nextInt(3)];

        String empate = "Empate";
        String vitoria = "Vitória";
        String derrota = "Derrota";

        if (escolhaApp == "pedra") {
            imgApp.setImageResource(R.drawable.pedra);
        } else if (escolhaApp == "tesoura") {
            imgApp.setImageResource(R.drawable.tesoura);
        } else {
            imgApp.setImageResource(R.drawable.papel);
        }

        if (escolhaUsuario == "pedra") {
            if (escolhaApp == "pedra") {
                resultLabel.setText(empate);
            }
            else if (escolhaApp == "tesoura") {
                resultLabel.setText(vitoria);
            }
            else {
                resultLabel.setText(derrota);
            }
        }
        else if (escolhaUsuario == "tesoura") {
            if (escolhaApp == "pedra") {
                resultLabel.setText(derrota);
            }
            else if (escolhaApp == "tesoura") {
                resultLabel.setText(empate);
            }
            else {
                resultLabel.setText(vitoria);
            }
        }
        else {
            if (escolhaApp == "pedra") {
                resultLabel.setText(vitoria);
            }
            else if (escolhaApp == "tesoura") {
                resultLabel.setText(derrota);
            }
            else {
                resultLabel.setText(empate);
            }
        }
    }
}