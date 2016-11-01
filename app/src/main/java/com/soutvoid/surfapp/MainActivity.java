package com.soutvoid.surfapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("TAG", "onCreate");
        setContentView(R.layout.activity_main);

        Button button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ExampleActivity.start(MainActivity.this);
            }
        });

        if (savedInstanceState != null)
            ((TextView)findViewById(R.id.textView)).setText(savedInstanceState.getString("saved"));
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("TAG", "onRestart");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("TAG", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("TAG", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("TAG", "onPause");
    }


    @Override
    protected void onStop() {
        super.onStop();
        Log.d("TAG", "onStop");
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("TAG", "onDestroy");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d("TAG", "onSaveInstance");
        outState.putString("saved", "Ooohooo, i was saved");
    }

    public static void start(Context context) {
        Intent intent = new Intent(context, MainActivity.class);
        context.startActivity(intent);
    }
}
