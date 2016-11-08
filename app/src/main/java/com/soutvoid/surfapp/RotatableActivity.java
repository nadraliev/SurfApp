package com.soutvoid.surfapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class RotatableActivity extends AppCompatActivity {

    public static void start(Context context) {
        Intent intent = new Intent(context, RotatableActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rotatable);
    }
}
