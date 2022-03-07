package com.example.powermetr;

import android.content.pm.ActivityInfo;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class onefase2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onefase2);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LOCKED);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

      /* FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/


    }
    public void onButtonClick2 (View View) {
        EditText ptok1f = (EditText)findViewById(R.id.tok1f);
        EditText pimph1f = (EditText)findViewById(R.id.imph1f);
        EditText pimpt1f = (EditText)findViewById(R.id.impt1f);
        TextView prespow1f= (TextView)findViewById(R.id.respow1f);
        TextView prashti2= (TextView)findViewById(R.id.rashti2);
        TextView pres1epu= (TextView)findViewById(R.id.resepu1f);
        float tok1f = Float.parseFloat(ptok1f.getText().toString());
        float impt1f = Float.parseFloat(pimpt1f.getText().toString())/10;
        float imph1f = Float.parseFloat(pimph1f.getText().toString());
        double pow1f =0.22*tok1f;
        double scale = Math.pow(10, 3);
        double pow1f1 = Math.ceil(pow1f * scale) / scale;
        prespow1f.setText(Double.toString(pow1f1));
        double res1epu = ((pow1f*impt1f*imph1f/3600)-1)*100;
        double rashti3 = (3600/(pow1f*imph1f))*10;
        double res1epu1 = Math.ceil(res1epu * scale) / scale;
        double rashti2 = Math.ceil(rashti3 * scale) / scale;
        pres1epu.setText(Double.toString(res1epu1));
        prashti2.setText(Double.toString(rashti2));

    }

}