package com.creatures.finalinternshipproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

public class TrackOrderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_track_order);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_order_track);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Your Orders");

    }
}