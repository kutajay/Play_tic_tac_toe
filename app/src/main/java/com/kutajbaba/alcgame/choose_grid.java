package com.kutajbaba.alcgame;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class choose_grid extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_grid);
    }

    public void chooseGrid(View view){
        Intent intent = new Intent(this, the_5by5_grid_activity.class);
        startActivity(intent);
    }
}
