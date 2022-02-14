package com.example.adicionandopackages;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;

import mehdi.sakout.aboutpage.AboutPage;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ConstraintLayout layout = findViewById(R.id.layout);

        View aboutPage = new AboutPage(this)
            .isRTL(false)
            .setDescription("Descrição")
            .addGroup("Teste")
            .addGitHub("matheusEduardoTavares", "GitHub")
            .create();

        layout.addView(aboutPage);
    }
}