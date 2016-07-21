package com.example.fivethingproject;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class More extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more);
    }

    public void namederazan(View v) {
        Intent namederazan_act = new Intent(Intent.ACTION_VIEW);
        String webderazan = "https://en.wikipedia.org/wiki/DeMar_DeRozan";
        namederazan_act.setData(Uri.parse(webderazan));
        startActivity(namederazan_act);
    }

    public void namecousins(View v) {
        Intent namecousins_act = new Intent(Intent.ACTION_VIEW);
        String webcousins = "https://en.wikipedia.org/wiki/DeMarcus_Cousins";
        namecousins_act.setData(Uri.parse(webcousins));
        startActivity(namecousins_act);
    }

    public void nameduncan(View v) {
        Intent nameduncan_act = new Intent(Intent.ACTION_VIEW);
        String webduncan = "https://en.wikipedia.org/wiki/Tim_Duncan";
        nameduncan_act.setData(Uri.parse( webduncan));
        startActivity(nameduncan_act);
    }

    public void namedurant(View v) {
        Intent namedurant_act = new Intent(Intent.ACTION_VIEW);
        String webdurant = "https://en.wikipedia.org/wiki/Kevin_Durant";
        namedurant_act.setData(Uri.parse(webdurant));
        startActivity(namedurant_act);
    }

    public void namegeorge(View v) {
        Intent namegeorge_act = new Intent(Intent.ACTION_VIEW);
        String webgeorge = "https://en.wikipedia.org/wiki/Paul_George";
        namegeorge_act.setData(Uri.parse(webgeorge));
        startActivity(namegeorge_act);
    }

    public void namegriffin(View v) {
        Intent namegriffin_act = new Intent(Intent.ACTION_VIEW);
        String webgriffin = "https://en.wikipedia.org/wiki/Blake_Griffin";
        namegriffin_act.setData(Uri.parse(webgriffin));
        startActivity(namegriffin_act);
    }

    public void namehardens(View v) {
        Intent namehardens_act = new Intent(Intent.ACTION_VIEW);
        String webharden = "https://en.wikipedia.org/wiki/James_Harden";
        namehardens_act.setData(Uri.parse(webharden));
        startActivity(namehardens_act);
    }

    public void nameirving(View v) {
        Intent nameirving_act = new Intent(Intent.ACTION_VIEW);
        String webirving = "https://en.wikipedia.org/wiki/Kyrie_Irving";
        nameirving_act.setData(Uri.parse(webirving));
        startActivity(nameirving_act);
    }

    public void namekobe(View v) {
        Intent namekobe_act = new Intent(Intent.ACTION_VIEW);
        String webkobe = "https://en.wikipedia.org/wiki/Kobe_Bryant";
        namekobe_act.setData(Uri.parse(webkobe));
        startActivity( namekobe_act);
    }

    public void namelowry(View v) {
        Intent namelowry_act = new Intent(Intent.ACTION_VIEW);
        String weblowry = "https://en.wikipedia.org/wiki/Kyle_Lowry";
        namelowry_act.setData(Uri.parse(weblowry));
        startActivity(namelowry_act);
    }

    public void nameparker(View v) {
        Intent nameparker_act = new Intent(Intent.ACTION_VIEW);
        String webparker = "https://en.wikipedia.org/wiki/Tony_Parker";
        nameparker_act.setData(Uri.parse(webparker));
        startActivity(nameparker_act);
    }

    public void namerose(View v) {
        Intent namerose_act = new Intent(Intent.ACTION_VIEW);
        String webrose = "https://en.wikipedia.org/wiki/Derrick_Rose";
        namerose_act.setData(Uri.parse(webrose));
        startActivity(namerose_act);
    }

    public void namethompson(View v) {
        Intent namethompson_act = new Intent(Intent.ACTION_VIEW);
        String webthompson = "https://en.wikipedia.org/wiki/Klay_Thompson";
        namethompson_act.setData(Uri.parse(webthompson));
        startActivity(namethompson_act);
    }

    public void namewade(View v) {
        Intent namewade_act = new Intent(Intent.ACTION_VIEW);
        String webwade = "https://en.wikipedia.org/wiki/Dwyane_Wade";
        namewade_act.setData(Uri.parse(webwade));
        startActivity(namewade_act);
    }




}
