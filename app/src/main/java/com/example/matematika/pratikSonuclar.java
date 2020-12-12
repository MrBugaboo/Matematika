package com.example.matematika;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class pratikSonuclar extends AppCompatActivity {

    TextView pratikSonucToplam;
    TextView pratikSonucYanlis;
    TextView pratikSonucDogru;

    TextView pratikSonucYuzde;
    Button pratikSonucMenuGit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pratik_sonuclar);

        Intent sonuclariAl = getIntent();
        Integer toplamSoru = sonuclariAl.getIntExtra("Tsayisi",0);
        Integer yanlisSoru = sonuclariAl.getIntExtra("Ysayisi",0);
        Integer dogruSoru = sonuclariAl.getIntExtra("Dsayisi",0);

        pratikSonucToplam = findViewById(R.id.cevaplananSoruSayisi);
        pratikSonucYanlis = findViewById(R.id.yanlisSorularSayisi);
        pratikSonucDogru = findViewById(R.id.dogruSorularSayisi);

        pratikSonucToplam.setText(""+toplamSoru);
        pratikSonucYanlis.setText(""+yanlisSoru);
        pratikSonucDogru.setText(""+dogruSoru);

        pratikSonucYuzde = findViewById(R.id.dogruYuzdesi);
        Integer yuzdeHesapla = 0;
        if (toplamSoru != 0){
            yuzdeHesapla = dogruSoru * 100 / toplamSoru;
        }
        pratikSonucYuzde.setText("%"+yuzdeHesapla);

        pratikSonucMenuGit = findViewById(R.id.pratikSonuclarCikis);
        pratikSonucMenuGit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pratikSonuctanMenuye = new Intent(pratikSonuclar.this, MainActivity.class);
                startActivity(pratikSonuctanMenuye);
            }
        });
    }
}