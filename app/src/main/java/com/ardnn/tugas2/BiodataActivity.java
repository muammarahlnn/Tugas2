package com.ardnn.tugas2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class BiodataActivity extends AppCompatActivity implements View.OnClickListener {

    LinearLayout btnHome;
    Button btnArtikel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata);

        btnHome = findViewById(R.id.btn_home);
        btnHome.setOnClickListener(this);

        btnArtikel = findViewById(R.id.btn_artikel);
        btnArtikel.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_home:
                Intent goToMain = new Intent(BiodataActivity.this, MainActivity.class);
                startActivity(goToMain);
                finishAffinity();
                break;
            case R.id.btn_artikel:
                Intent goToArtikel = new Intent(BiodataActivity.this, ArtikelActivity.class);
                startActivity(goToArtikel);
                break;
        }
    }
}