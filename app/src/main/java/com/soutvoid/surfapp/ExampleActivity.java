package com.soutvoid.surfapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by andrew on 28-Oct-16.
 */

public class ExampleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_example);
    }

    public static void start(Context context) {
        Intent intent = new Intent(context, ExampleActivity.class);
        context.startActivity(intent);
    }
}
