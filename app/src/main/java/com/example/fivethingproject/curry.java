package com.example.fivethingproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class curry extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_curry);
    }


    public void currynext(View v) {
        Intent lebron_act = new Intent(this, lebron.class);
        startActivity(lebron_act);
    }

    public void curryback(View v) {
        Intent MainActivity_act = new Intent(this, MainActivity.class);
        startActivity(MainActivity_act);
    }
}
