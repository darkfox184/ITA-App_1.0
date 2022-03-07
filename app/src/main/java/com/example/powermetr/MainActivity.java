package com.example.powermetr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LOCKED);
    }
    public void goToAnActivity(View view) {
        Intent Intent = new Intent(MainActivity.this, thrifases.class);
        startActivity(Intent);
    }
    public void goToAnActivity2(View view) {
        Intent Intent2 = new Intent(MainActivity.this, onefase2.class);
        startActivity(Intent2);
    }
    public void goToAnActivity3(View view) {
        Intent Intent3 = new Intent(MainActivity.this, avtomat.class);
        startActivity(Intent3);
    }
    public void goToAnActivity4(View view) {
        Intent Intent4 = new Intent(MainActivity.this, avtomat3f.class);
        startActivity(Intent4);
    }
}