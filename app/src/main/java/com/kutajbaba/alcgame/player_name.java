package com.kutajbaba.alcgame;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class player_name extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_players);
    }

    public void playerName(View view) {
        Intent intent = new Intent(this, choose_players.class);
        startActivity(intent);

    }
}
