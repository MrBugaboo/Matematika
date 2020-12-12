package com.example.matematika;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class toplamaCikarmaActivity extends AppCompatActivity {

    Button CTsifir, CTbir, CTiki, CTuc, CTdort, CTbes, CTalti, CTyedi, CTsekiz, CTdokuz, CTenter, CTsil;
    TextView CTIslem, CTCevap;

    String CTIslemi, CTCevabi;

    TextView CTsuresi;
    Button CTcikis;

    Integer CTtoplamSoru = 0;
    Integer CTyanlisSoru = 0;
    Integer CTdogruSoru = 0;
    Integer CTsoruCevabi = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toplama_cikarma);

        CTsuresi = findViewById(R.id.toplamaCikarmaSure);
        CTcikis = findViewById(R.id.toplamaCikarmaCikis);

        CTsifir = findViewById(R.id.toplamaCikarmaSifirButonu);
        CTbir = findViewById(R.id.toplamaCikarmaBirButonu);
        CTiki = findViewById(R.id.toplamaCikarmaIkiButonu);
        CTuc = findViewById(R.id.toplamaCikarmaUcButonu);
        CTdort = findViewById(R.id.toplamaCikarmaDortButonu);
        CTbes = findViewById(R.id.toplamaCikarmaBesButonu);
        CTalti = findViewById(R.id.toplamaCikarmaAltiButonu);
        CTyedi = findViewById(R.id.toplamaCikarmaYediButonu);
        CTsekiz = findViewById(R.id.toplamaCikarmaSekizButonu);
        CTdokuz = findViewById(R.id.toplamaCikarmaDokuzButonu);

        CTenter = findViewById(R.id.toplamaCikarmaEnterButonu);
        CTsil = findViewById(R.id.toplamaCikarmaSilButonu);

        CTsureyiBaslat();

        int[] CTsoru;
        Random rr = new Random();
        Integer CTilkSoru = rr.nextInt(2);

        CTIslem = findViewById(R.id.toplamaCikarmaIslem);
        if (CTilkSoru == 0) {
            CTsoru = cikarmaSorusuYarat();
            CTIslem.setText(CTsoru[0] + "-" + CTsoru[1]);
        }
        else {
            CTsoru = toplamaSorusuYarat();
            CTIslem.setText(CTsoru[0] + "+" + CTsoru[1]);
        }
        CTIslemi = CTIslem.getText().toString();

        Integer CTSoruCevap = CTsoru[2];
        CTsoruCevabi = CTSoruCevap;

        CTCevap = findViewById(R.id.toplamaCikarmaCevap);
        CTCevabi = CTCevap.getText().toString();

        CTenter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String CTcevapKutusu = CTCevap.getText().toString();
                if (!CTcevapKutusu.matches("")) {
                    int CTc = Integer.parseInt(CTcevapKutusu);
                    if (CTsoruCevabi == CTc) {
                        CTdogruSoru += 1;
                    } else {
                        CTyanlisSoru += 1;
                    }
                    CTCevap.setText("");

                    int[] CTyeniSoru;
                    Integer CTdigerSorular = rr.nextInt(2);
                    if (CTdigerSorular == 0) {
                        CTyeniSoru = cikarmaSorusuYarat();
                        CTIslem.setText(CTyeniSoru[0] + "-" + CTyeniSoru[1]);
                    } else {
                        CTyeniSoru = toplamaSorusuYarat();
                        CTIslem.setText(CTyeniSoru[0] + "+" + CTyeniSoru[1]);
                    }
                    CTtoplamSoru += 1;

                    CTsoruCevabi = CTyeniSoru[2];
                }
            }
        });

        CTsifir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CTCevabi = CTCevap.getText().toString() + "0";
                CTCevap.setText(CTCevabi);
            }
        });
        CTbir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CTCevabi = CTCevap.getText().toString() + "1";
                CTCevap.setText(CTCevabi);
            }
        });
        CTiki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CTCevabi = CTCevap.getText().toString() + "2";
                CTCevap.setText(CTCevabi);
            }
        });
        CTuc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CTCevabi = CTCevap.getText().toString() + "3";
                CTCevap.setText(CTCevabi);
            }
        });
        CTdort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CTCevabi = CTCevap.getText().toString() + "4";
                CTCevap.setText(CTCevabi);
            }
        });
        CTbes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CTCevabi = CTCevap.getText().toString() + "5";
                CTCevap.setText(CTCevabi);
            }
        });
        CTalti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CTCevabi = CTCevap.getText().toString() + "6";
                CTCevap.setText(CTCevabi);
            }
        });
        CTyedi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CTCevabi = CTCevap.getText().toString() + "7";
                CTCevap.setText(CTCevabi);
            }
        });
        CTsekiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CTCevabi = CTCevap.getText().toString() + "8";
                CTCevap.setText(CTCevabi);
            }
        });
        CTdokuz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CTCevabi = CTCevap.getText().toString() + "9";
                CTCevap.setText(CTCevabi);
            }
        });
        CTsil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String CTcevapKutusu = CTCevap.getText().toString();
                if (!CTcevapKutusu.matches("")) {
                    String yeniDeger = CTcevapKutusu.substring(0, CTcevapKutusu.length() - 1);
                    CTCevap.setText(yeniDeger);
                }
            }
        });
        CTcikis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CTsureyiBitir();

                Intent pratikSonuc = new Intent(toplamaCikarmaActivity.this, pratikSonuclar.class);
                pratikSonuc.putExtra("Tsayisi",CTtoplamSoru);
                pratikSonuc.putExtra("Ysayisi",CTyanlisSoru);
                pratikSonuc.putExtra("Dsayisi",CTdogruSoru);
                startActivity(pratikSonuc);
            }
        });
    }
    public int[] cikarmaSorusuYarat() {
        final Random r = new Random();
        int[] cikarilanCikanCevap = new int[3];
        cikarilanCikanCevap[0] = r.nextInt(100) + 1;
        int cikan = cikarilanCikanCevap[0];
        cikarilanCikanCevap[1] = r.nextInt(cikan) + 1;
        cikarilanCikanCevap[2] = cikarilanCikanCevap[0] - cikarilanCikanCevap[1];
        return cikarilanCikanCevap;
    }
    public int[] toplamaSorusuYarat(){
        int[] cikarma = cikarmaSorusuYarat();
        int[] TbirIkiCevap = new int[3];
        TbirIkiCevap[0] = cikarma[2];
        TbirIkiCevap[1] = cikarma[1];
        TbirIkiCevap[2] = cikarma[0];
        return TbirIkiCevap;
    }

    CountDownTimer CTsure = null;

    void CTsureyiBaslat() {
        CTsure = new CountDownTimer(120000, 1000) {
            public void onTick(long CTbitmeyeKalanSure) {
                CTsuresi.setText("" + CTbitmeyeKalanSure / 1000);
            }
            public void onFinish() {
                CTsureyiBitir();
                CTcikis.callOnClick();
            }
        };
        CTsure.start();
    }

    void CTsureyiBitir() {
        if(CTsure!=null)
            CTsure.cancel();
    }
}