package com.example.matematika;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button pratigeGit;
    Button ayarlaraGit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pratigeGit = findViewById(R.id.menuPratik);
        ayarlaraGit = findViewById(R.id.menuAyarlar);

        pratigeGit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pratikSayfasi = new Intent(MainActivity.this, pratikActivity.class);
                startActivity(pratikSayfasi);
            }
        });
        ayarlaraGit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ayarlarSayfasi = new Intent(MainActivity.this, ayarlarActivity.class);
                startActivity(ayarlarSayfasi);
            }
        });
    }
}