package com.example.fivethingproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class lavine extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lavine);
    }

    public void lavinenext(View v) {
        Intent MainActivity_act = new Intent(this, MainActivity.class);
        startActivity(MainActivity_act);
    }


    public void lavineback(View v) {
        Intent paul_act = new Intent(this, paul.class);
        startActivity(paul_act);
    }
}
