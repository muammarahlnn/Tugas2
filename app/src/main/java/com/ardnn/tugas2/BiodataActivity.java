package com.ardnn.tugas2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class BiodataActivity extends AppCompatActivity implements View.OnClickListener {

    LinearLayout btnHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata);

        btnHome = findViewById(R.id.btn_home);
        btnHome.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_home:
                finish();
                break;
        }
    }
}