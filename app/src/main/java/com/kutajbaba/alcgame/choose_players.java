package com.kutajbaba.alcgame;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class choose_players extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_names);
    }

    public void chooseGrid(View view) {
        Intent intents = new Intent(this, choose_grid.class);
        startActivity(intents);
    }
}