package com.example.fivethingproject;

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
    private void displaycurry() {
        //TextView curryText = (TextView) findViewById(R.id.curryText);
        ImageView curryImg =  (ImageView) findViewById(R.id.curry);
        //curryText.setText("Warrior");

    }
}
