package com.example.fivethingproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class paul extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paul);
    }

    public void paulnext(View v) {
        Intent lavine_act = new Intent(this, lavine.class);
        startActivity(lavine_act);
    }


    public void paulback(View v) {
        Intent westbrook_act = new Intent(this, westbrook.class);
        startActivity(westbrook_act);
    }
}
