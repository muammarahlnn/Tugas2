package com.ardnn.tugas2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class ArtikelActivity extends AppCompatActivity implements View.OnClickListener {

    LinearLayout btnHome;
    Button btnBiodata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artikel);

        btnHome = findViewById(R.id.btn_home);
        btnHome.setOnClickListener(this);

        btnBiodata = findViewById(R.id.btn_biodata);
        btnBiodata.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_home:
                Intent goToMain = new Intent(ArtikelActivity.this, MainActivity.class);
                startActivity(goToMain);
                finishAffinity();
                break;

            case R.id.btn_biodata:
                Intent goToBiodata = new Intent(ArtikelActivity.this, BiodataActivity.class);
                startActivity(goToBiodata);
                finish();
                break;
        }
    }
}