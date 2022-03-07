package com.example.powermetr;

import android.content.pm.ActivityInfo;
import android.os.Bundle;

//import com.google.android.material.floatingactionbutton.FloatingActionButton;
//import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class avtomat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avtomat);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LOCKED);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

      /*  FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
    }
    public void onButtonav1fi (View View) {
        int nomiav1f;

        EditText ptokav1f = (EditText) findViewById(R.id.tokav1f);
        EditText pu1f = (EditText) findViewById(R.id.u1f);
        EditText pcosf1f = (EditText) findViewById(R.id.cosf1f);
        TextView ppiav1f = (TextView) findViewById(R.id.piav1f);
        TextView pnomiav1f = (TextView) findViewById(R.id.nomiav1f);

        float tokav1f = Float.parseFloat(ptokav1f.getText().toString());
        float u1f = Float.parseFloat(pu1f.getText().toString());
        float cosf1f = Float.parseFloat(pcosf1f.getText().toString());
        double pow1f = u1f * tokav1f * cosf1f;
        double scale = Math.pow(10, 2);
        double pow1f1 = Math.ceil(pow1f * scale) / scale;
        ppiav1f.setText(Double.toString(pow1f1)+" кВт");

        double tokav1f2 = Math.round(pow1f1*100)/100.0d;
        if   ((tokav1f2 >= 0.03) && (tokav1f2 < 1.1)) {
            nomiav1f = 6;
        }
        else if ((tokav1f2 >= 1.1) && (tokav1f2 < 2.1))
        {  nomiav1f = 10;}
        else if ((tokav1f2 >= 2.1) && (tokav1f2 < 3.1))
        {  nomiav1f = 16;}
        else if ((tokav1f2 >= 3.1) && (tokav1f2 < 4.1))
        {  nomiav1f = 20;}
        else if ((tokav1f2 >= 4.1) && (tokav1f2 < 5.1))
        {  nomiav1f = 25;}
        else if ((tokav1f2 >= 5.1) && (tokav1f2 < 6.1))
        {  nomiav1f = 32;}
        else if ((tokav1f2 >= 6.1) && (tokav1f2 < 8.1))
        {  nomiav1f = 40;}
        else if ((tokav1f2 >=8.1) && (tokav1f2 < 10.1))
        {  nomiav1f = 50;}
        else if ((tokav1f2 >= 10.1) && (tokav1f2 < 11.1))
        {  nomiav1f = 63;}
        else
        { nomiav1f = 0;}

        if (nomiav1f == 0) {
            pnomiav1f.setText("Недопустимый ток!!!");
        } else {

            pnomiav1f.setText("C" + Integer.toString(nomiav1f));
        }
    }
    public void onButtonav1fp (View View) {
        int nomiav1fi;

        EditText ptokav1fi = (EditText) findViewById(R.id.tokav1fi);
        TextView ppowras1f = (TextView) findViewById(R.id.powras1f);
        TextView pnomiav1fi = (TextView) findViewById(R.id.nomiav1fi);
        float tokav1fi = Float.parseFloat(ptokav1fi.getText().toString());

        double powras1f = 0.22 * tokav1fi * 0.92;
        double scale = Math.pow(10, 2);
        double powras1f1 = Math.ceil(powras1f * scale) / scale;
        ppowras1f.setText(Double.toString(powras1f1) + " кВт");

        double tokav1f2 = Math.round(tokav1fi * 100) / 100.0d;
        if ((tokav1f2 >= 0.1) && (tokav1f2 <= 5)) {
            nomiav1fi = 6;
        } else if ((tokav1f2 > 5) && (tokav1f2 <= 10.3)) {
            nomiav1fi = 10;
        } else if ((tokav1f2 > 10.3) && (tokav1f2 <= 15.3)) {
            nomiav1fi = 16;
        } else if ((tokav1f2 > 15.3) && (tokav1f2 <= 20.2)) {
            nomiav1fi = 20;
        } else if ((tokav1f2 > 20.2) && (tokav1f2 <= 25.1)) {
            nomiav1fi = 25;
        } else if ((tokav1f2 > 25.1) && (tokav1f2 <= 30)) {
            nomiav1fi = 32;
        } else if ((tokav1f2 > 30.0) && (tokav1f2 <= 39.9)) {
            nomiav1fi = 40;
        } else if ((tokav1f2 > 39.9) && (tokav1f2 <= 49.8)) {
            nomiav1fi = 50;
        } else if ((tokav1f2 > 49.8) && (tokav1f2 <= 54.3)) {
            nomiav1fi = 63;
        } else {
            nomiav1fi = 0;
        }

        if (nomiav1fi == 0) {
            pnomiav1fi.setText("Недопустимый ток!!!");
        } else {
            pnomiav1fi.setText("C" + Integer.toString(nomiav1fi));

        }

    }

    public void onButtonav1fpp (View View) {
        int nomiav1f1;

        EditText ppowav = (EditText) findViewById(R.id.powav);
        float powav = Float.parseFloat(ppowav.getText().toString());
        TextView pnomiav1fi2 = (TextView) findViewById(R.id.nomiav1fi2);
       /* TextView ppowras1f = (TextView) findViewById(R.id.powras1f);
        T


       double powras1f = 0.22 * tokav1fi * 0.92;
        double scale = Math.pow(10, 2);
        double powras1f1 = Math.ceil(powras1f * scale) / scale;
        ppowras1f.setText(Double.toString(powras1f1) + " кВт");*/

        double tokav1f2 = Math.round(powav*100)/100.0d;
        if   ((tokav1f2 >= 0.03) && (tokav1f2 < 1.1)) {
            nomiav1f1 = 6;
        }
        else if ((tokav1f2 >= 1.1) && (tokav1f2 < 2.1))
        {  nomiav1f1 = 10;}
        else if ((tokav1f2 >= 2.1) && (tokav1f2 < 3.1))
        {  nomiav1f1 = 16;}
        else if ((tokav1f2 >= 3.1) && (tokav1f2 < 4.1))
        {  nomiav1f1 = 20;}
        else if ((tokav1f2 >= 4.1) && (tokav1f2 < 5.1))
        {  nomiav1f1 = 25;}
        else if ((tokav1f2 >= 5.1) && (tokav1f2 < 6.1))
        {  nomiav1f1 = 32;}
        else if ((tokav1f2 >= 6.1) && (tokav1f2 < 8.1))
        {  nomiav1f1 = 40;}
        else if ((tokav1f2 >=8.1) && (tokav1f2 < 10.1))
        {  nomiav1f1 = 50;}
        else if ((tokav1f2 >= 10.1) && (tokav1f2 < 11.1))
        {  nomiav1f1 = 63;}
        else
        { nomiav1f1= 0;}

        if (nomiav1f1 == 0) {
            pnomiav1fi2.setText("Привышена мощность!!!");
        } else {
            pnomiav1fi2.setText("C" + Integer.toString(nomiav1f1));

        }

    }
}