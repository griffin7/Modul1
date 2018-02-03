package com.tugas.hisyam.tppertama;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Tampil extends AppCompatActivity {
    TextView vMakan;
    TextView vPorsi;
    TextView vHarga;
    TextView vTempat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampil);
        vMakan = (TextView) findViewById(R.id.vMakanan);
        vPorsi = (TextView) findViewById(R.id.vPorsi);
        vHarga = (TextView) findViewById(R.id.vHarga);
        vTempat = (TextView) findViewById(R.id.vTempat);

        Bundle b = getIntent().getExtras();
        String menu = b.getString("menu");
        int porsi = b.getInt("porsi");
        int harga = b.getInt("harga");
        String tempat = b.getString("tempat");

        vMakan.setText(menu);
        vPorsi.setText(String.valueOf(porsi));
      vHarga.setText(String.valueOf(harga));
        vTempat.setText(tempat);

        if (harga <= 65000){
            Toast.makeText(this, "Disini Aja Makan Malamnya",Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, "Jangan di sini makan malamnya, uang kamu gak cukup",Toast.LENGTH_LONG).show();
        }
    }







}
