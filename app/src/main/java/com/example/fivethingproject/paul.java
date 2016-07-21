package com.example.fivethingproject;

import android.content.Intent;
import android.net.Uri;
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

    public void paulmore(View v) {
        Intent paulmore_act = new Intent(Intent.ACTION_VIEW);
        String webpaul = "https://en.wikipedia.org/wiki/Chris_Paul";
        paulmore_act.setData(Uri.parse(webpaul));
        startActivity(paulmore_act);
    }


}
