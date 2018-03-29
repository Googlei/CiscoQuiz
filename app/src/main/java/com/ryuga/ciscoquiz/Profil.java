package com.ryuga.ciscoquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Profil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);
    }
    public void balik(View view) {
        Intent intent = new Intent(Profil.this, MainActivity.class);
        startActivity(intent);
    }

}
