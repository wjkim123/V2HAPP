package com.bliss.csc.v2happ;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private Chart chartfragment;
    private Monitoring monitoringfragment;
    private Setting settingfragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        chartfragment = new Chart();
        monitoringfragment = new Monitoring();
        settingfragment = new Setting();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportFragmentManager().beginTransaction().replace(R.id.container, monitoringfragment).commit();
    }
}