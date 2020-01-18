package com.example.daggerdemo.car;

import android.util.Log;

import javax.inject.Inject;

public class Remote {
    private static final String TAG = "Remote";
    @Inject
    public Remote() {
    }

    void setRemote(Car car){
        Log.d(TAG, "Remote Set");
    }
}
