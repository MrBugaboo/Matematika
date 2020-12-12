package com.example.matematika;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class ayarlarActivity extends AppCompatActivity {

    Button ayarlardanMenuye;
    Button kirmiziSet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ayarlar);

        ayarlardanMenuye = findViewById(R.id.ayarlarMenu);
        kirmiziSet=findViewById(R.id.ayarlarKirmiziRenk);

        ayarlardanMenuye.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ayardanMenuyeGit = new Intent(ayarlarActivity.this, MainActivity.class);
                startActivity(ayardanMenuyeGit);
            }
        });

        kirmiziSet.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {
                View ayarlarEkraniBackground = findViewById(R.id.ayarlarEkrani);
                Button ayarlarSifirlaButonu = findViewById(R.id.ayarlarIstatistikleriSifirla);
                ImageButton ayarlarMuzikBtn = findViewById(R.id.ayarlarMuzikButonu);
                Button ayarlardanMenuyeGidisButonu = findViewById(R.id.ayarlarMenu);

                ayarlarEkraniBackground.setBackgroundResource(R.drawable.kirmizi_background);
                ayarlarSifirlaButonu.setBackgroundResource(R.drawable.kirmizi_button_background);
                ayarlarMuzikBtn.setBackgroundResource(R.drawable.kirmizi_button_background);
                ayarlardanMenuyeGidisButonu.setBackgroundResource(R.drawable.kirmizi_button_background);
            }
        });
    }
}