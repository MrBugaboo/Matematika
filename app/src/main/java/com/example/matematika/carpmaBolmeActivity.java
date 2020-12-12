package com.example.matematika;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class carpmaBolmeActivity extends AppCompatActivity {

    Button CBsifir, CBbir, CBiki, CBuc, CBdort, CBbes, CBalti, CByedi, CBsekiz, CBdokuz, CBenter, CBsil;
    TextView CBIslem, CBCevap;

    String CBIslemi, CBCevabi;

    TextView CBsuresi;
    Button CBcikis;

    Integer CBtoplamSoru = 0;
    Integer CByanlisSoru = 0;
    Integer CBdogruSoru = 0;
    Integer CBsoruCevabi = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carpma_bolme);

        CBsureyiBaslat();

        CBsuresi = findViewById(R.id.carpmaBolmeSure);
        CBcikis = findViewById(R.id.carpmaBolmeCikis);

        CBsifir = findViewById(R.id.carpmaBolmeSifirButonu);
        CBbir = findViewById(R.id.carpmaBolmeBirButonu);
        CBiki = findViewById(R.id.carpmaBolmeIkiButonu);
        CBuc = findViewById(R.id.carpmaBolmeUcButonu);
        CBdort = findViewById(R.id.carpmaBolmeDortButonu);
        CBbes = findViewById(R.id.carpmaBolmeBesButonu);
        CBalti = findViewById(R.id.carpmaBolmeAltiButonu);
        CByedi = findViewById(R.id.carpmaBolmeYediButonu);
        CBsekiz = findViewById(R.id.carpmaBolmeSekizButonu);
        CBdokuz = findViewById(R.id.carpmaBolmeDokuzButonu);

        CBenter = findViewById(R.id.carpmaBolmeEnterButonu);
        CBsil = findViewById(R.id.carpmaBolmeSilButonu);

        int[] CBsoru;
        Random rr = new Random();
        Integer CBilkSoru = rr.nextInt(2);

        CBIslem = findViewById(R.id.carpmaBolmeIslem);
        if (CBilkSoru == 0) {
            CBsoru = carpmaSorusuYarat();
            CBIslem.setText(CBsoru[0] + "x" + CBsoru[1]);
        }
        else {
            CBsoru = bolmeSorusuYarat();
            CBIslem.setText(CBsoru[0] + "/" + CBsoru[1]);
        }
        CBIslemi = CBIslem.getText().toString();

        Integer CBSoruCevap = CBsoru[2];
        CBsoruCevabi = CBSoruCevap;

        CBCevap = findViewById(R.id.carpmaBolmeCevap);
        CBCevabi = CBCevap.getText().toString();

        CBenter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String CBcevapKutusu = CBCevap.getText().toString();
                if (!CBcevapKutusu.matches("")) {
                    int CBc = Integer.parseInt(CBcevapKutusu);
                    if (CBsoruCevabi == CBc) {
                        CBdogruSoru += 1;
                    } else {
                        CByanlisSoru += 1;
                    }
                    CBCevap.setText("");

                    int[] CByeniSoru;
                    Integer CBdigerSorular = rr.nextInt(2);
                    if (CBdigerSorular == 0) {
                        CByeniSoru = carpmaSorusuYarat();
                        CBIslem.setText(CByeniSoru[0] + "x" + CByeniSoru[1]);
                    } else {
                        CByeniSoru = bolmeSorusuYarat();
                        CBIslem.setText(CByeniSoru[0] + "/" + CByeniSoru[1]);
                    }
                    CBtoplamSoru += 1;

                    CBsoruCevabi = CByeniSoru[2];
                }
            }
        });

        CBsifir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CBCevabi = CBCevap.getText().toString() + "0";
                CBCevap.setText(CBCevabi);
            }
        });
        CBbir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CBCevabi = CBCevap.getText().toString() + "1";
                CBCevap.setText(CBCevabi);
            }
        });
        CBiki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CBCevabi = CBCevap.getText().toString() + "2";
                CBCevap.setText(CBCevabi);
            }
        });
        CBuc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CBCevabi = CBCevap.getText().toString() + "3";
                CBCevap.setText(CBCevabi);
            }
        });
        CBdort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CBCevabi = CBCevap.getText().toString() + "4";
                CBCevap.setText(CBCevabi);
            }
        });
        CBbes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CBCevabi = CBCevap.getText().toString() + "5";
                CBCevap.setText(CBCevabi);
            }
        });
        CBalti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CBCevabi = CBCevap.getText().toString() + "6";
                CBCevap.setText(CBCevabi);
            }
        });
        CByedi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CBCevabi = CBCevap.getText().toString() + "7";
                CBCevap.setText(CBCevabi);
            }
        });
        CBsekiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CBCevabi = CBCevap.getText().toString() + "8";
                CBCevap.setText(CBCevabi);
            }
        });
        CBdokuz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CBCevabi = CBCevap.getText().toString() + "9";
                CBCevap.setText(CBCevabi);
            }
        });
        CBsil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String CBcevapKutusu = CBCevap.getText().toString();
                if (!CBcevapKutusu.matches("")) {
                    String yeniDeger = CBcevapKutusu.substring(0, CBcevapKutusu.length() - 1);
                    CBCevap.setText(yeniDeger);
                }
            }
        });
        CBcikis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CBsureyiBitir();

                Intent pratikSonuc = new Intent(carpmaBolmeActivity.this, pratikSonuclar.class);
                pratikSonuc.putExtra("Tsayisi",CBtoplamSoru);
                pratikSonuc.putExtra("Ysayisi",CByanlisSoru);
                pratikSonuc.putExtra("Dsayisi",CBdogruSoru);
                startActivity(pratikSonuc);
            }
        });
    }
    public int[] carpmaSorusuYarat() {
        final Random r = new Random();
        int[] birIkiCevap = new int[3];
        birIkiCevap[0] = r.nextInt(20) + 1;
        birIkiCevap[1] = r.nextInt(20) + 1;
        birIkiCevap[2] = birIkiCevap[0] * birIkiCevap[1];
        return birIkiCevap;
    }
    public int[] bolmeSorusuYarat(){
        int[] carpma = carpmaSorusuYarat();
        int[] bolunenBolenCevap = new int[3];
        bolunenBolenCevap[0] = carpma[2];
        bolunenBolenCevap[1] = carpma[1];
        bolunenBolenCevap[2] = carpma[0];
        return bolunenBolenCevap;
    }

    CountDownTimer CBsure = null;

    void CBsureyiBaslat() {
        CBsure = new CountDownTimer(120000, 1000) {
            public void onTick(long CBbitmeyeKalanSure) {
                CBsuresi.setText("" + CBbitmeyeKalanSure / 1000);
            }
            public void onFinish() {
                CBsureyiBitir();
                CBcikis.callOnClick();
            }
        };
        CBsure.start();
    }

    void CBsureyiBitir() {
        if(CBsure!=null)
            CBsure.cancel();
    }
}