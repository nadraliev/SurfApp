package com.soutvoid.surfapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import java.nio.charset.MalformedInputException;

/**
 * Created by andrew on 28-Oct-16.
 */

public class ExampleActivity extends AppCompatActivity {

    public static void start(Context context, String extraKey, String extraData) {
        Intent intent = new Intent(context, ExampleActivity.class);
        intent.putExtra(extraKey, extraData);

        context.startActivity(intent);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_example);

        if (getIntent().hasExtra(MainActivity.INTENT_NAME_KEY))
            Toast.makeText(this, getIntent().getStringExtra(MainActivity.INTENT_NAME_KEY), Toast.LENGTH_LONG).show();
    }


}
