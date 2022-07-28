package com.example.custom_br;

import androidx.appcompat.app.AppCompatActivity;

import android.content.IntentFilter;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    ExampleBR ex = new ExampleBR();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        IntentFilter filter = new IntentFilter("com.example.custom_br");
        registerReceiver(ex,filter);
        //testinggggg
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unregisterReceiver(ex);
    }
}