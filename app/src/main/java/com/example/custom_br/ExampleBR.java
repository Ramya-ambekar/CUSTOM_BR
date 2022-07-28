package com.example.custom_br;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.widget.Toast;

public class ExampleBR extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if ("com.example.custom_br".equals(intent.getAction())) {
            String receivedtext = intent.getStringExtra("name_key");
            Toast.makeText(context,receivedtext, Toast.LENGTH_SHORT).show();
        }

    }

}
