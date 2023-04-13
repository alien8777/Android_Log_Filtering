package com.ayankumar.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                //here you just pass the TAGS in betwn I, W, E, V, A , you will get filtered data from this function , i kept this function in a separate thread so that
                // it will not crash the application and not pause the UI thread , it will run on the background thread
                StringBuilder builder = new LogData().readLogs("W");
                System.out.println(builder);
            }
        };
        runnable.run();

    }
}