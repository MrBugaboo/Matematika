package com.example.matematika;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class pratikActivity extends AppCompatActivity {

    Button carpmaBolmeGit;
    Button toplamaCikarmaGit;
    Button pratikMenuGit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pratik);

        carpmaBolmeGit = findViewById(R.id.pratikCarpmaBolme);
        toplamaCikarmaGit = findViewById(R.id.pratikToplamaCikarma);
        pratikMenuGit = findViewById(R.id.pratikMenu);

        carpmaBolmeGit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent carpmaBolmeSeansi = new Intent(pratikActivity.this, carpmaBolmeActivity.class);
                startActivity(carpmaBolmeSeansi);
            }
        });

        pratikMenuGit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pratiktenMenuyeGit = new Intent(pratikActivity.this, MainActivity.class);
                startActivity(pratiktenMenuyeGit);
            }
        });

        toplamaCikarmaGit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toplamaCikarmaSeansi = new Intent(pratikActivity.this, toplamaCikarmaActivity.class);
                startActivity(toplamaCikarmaSeansi);
            }
        });
    }
}