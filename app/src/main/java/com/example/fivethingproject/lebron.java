package com.example.fivethingproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class lebron extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lebron);
    }



    public void lebronnext(View v) {
        Intent westbrook_act = new Intent(this, westbrook.class);
        startActivity(westbrook_act);
    }

    public void lebronback(View v) {
        Intent curry_act = new Intent(this, curry.class);
        startActivity(curry_act);
    }
}
