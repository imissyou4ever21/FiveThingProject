package com.example.fivethingproject;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class westbrook extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_westbrook);
    }

    public void westbrooknext(View v) {
        Intent paul_act = new Intent(this, paul.class);
        startActivity(paul_act);
    }

    public void westbrookback(View v) {
        Intent lebron_act = new Intent(this, lebron.class);
        startActivity(lebron_act);
    }

    public void westbrookmore(View v) {
        Intent westbrookmore_act = new Intent(Intent.ACTION_VIEW);
        String webwestbrook = "https://en.wikipedia.org/wiki/Russell_Westbrook";
        westbrookmore_act.setData(Uri.parse(webwestbrook));
        startActivity(westbrookmore_act);
    }
}
