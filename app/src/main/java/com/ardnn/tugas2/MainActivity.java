package com.ardnn.tugas2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnArtikel, btnBiodata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnArtikel = findViewById(R.id.btn_artikel);
        btnArtikel.setOnClickListener(this);

        btnBiodata = findViewById(R.id.btn_biodata);
        btnBiodata.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_artikel:
                break;
            case R.id.btn_biodata:
                Intent goToBiodata = new Intent(MainActivity.this, BiodataActivity.class);
                startActivity(goToBiodata);
                break;

        }
    }
}