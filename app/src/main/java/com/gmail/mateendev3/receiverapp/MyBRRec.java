package com.gmail.mateendev3.receiverapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyBRRec extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
            Toast.makeText(context, "Receiver App", Toast.LENGTH_LONG).show();
    }
}
