package com.example.drnabipor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

public class Splash_Activity extends AppCompatActivity {

    TextView textViewUni, textViewUnit, textViewMas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_);

        textViewUni = findViewById(R.id.textUni);
        textViewUnit = findViewById(R.id.textUnit);
        textViewMas = findViewById(R.id.textMaster);

        textViewUni.setTypeface(MyApp.typeface);
        textViewUnit.setTypeface(MyApp.typeface);
        textViewMas.setTypeface(MyApp.typeface);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, 1800);

    }

    @Override
    public void onBackPressed() {}
}