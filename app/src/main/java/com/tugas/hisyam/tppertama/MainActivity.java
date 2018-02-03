package com.tugas.hisyam.tppertama;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText jumlah;
    EditText menu;
    int harga;
    String tempat;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        menu = (EditText) findViewById(R.id.tMakanan);
        jumlah = (EditText) findViewById(R.id.tJumlah);
}



    public void clEat(View view) {
        String makan = menu.getText().toString();
        int porsi = Integer.parseInt(jumlah.getText().toString());
        harga = porsi * 50000;
        tempat="Eatbus";
        Intent tampil = new Intent(this, Tampil.class);
        tampil.putExtra("menu",makan);
        tampil.putExtra("porsi",porsi);
        tampil.putExtra("harga",harga);
        tampil.putExtra("tempat",tempat);
        startActivity(tampil);

    }

    public void clUp(View view) {
        String makan = menu.getText().toString();
        int porsi = Integer.parseInt(jumlah.getText().toString());
        tempat = "Abnormal";
        harga = porsi * 30000;
        Intent tampil = new Intent(this, Tampil.class);
        tampil.putExtra("menu",makan);
        tampil.putExtra("porsi",porsi);
        tampil.putExtra("harga",harga);
        tampil.putExtra("tempat",tempat);
        startActivity(tampil);
    }
}
