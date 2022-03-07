package com.example.powermetr;

import android.content.pm.ActivityInfo;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.widget.Toolbar;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.powermetr.databinding.ActivityAvtomat3fBinding;

public class avtomat3f extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avtomat3f);
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
    public void onButtonav1fi3 (View View) {
        int nomiav1f;

        EditText ptokav1f3 = (EditText) findViewById(R.id.tokav1f3);
        EditText pu1f3 = (EditText) findViewById(R.id.u1f3);
        EditText pcosf1f3 = (EditText) findViewById(R.id.cosf1f3);
        TextView ppiav1f3 = (TextView) findViewById(R.id.piav1f3);
        TextView pnomiav1f3 = (TextView) findViewById(R.id.nomiav1f3);

        float tokav1f3 = Float.parseFloat(ptokav1f3.getText().toString());
        float u1f3 = Float.parseFloat(pu1f3.getText().toString());
        float cosf1f3 = Float.parseFloat(pcosf1f3.getText().toString());
        double pow1f3 = Math.sqrt(3)*u1f3 * tokav1f3 * cosf1f3;

        double scale = Math.pow(10, 2);
        double pow1f1 = Math.ceil(pow1f3 * scale) / scale;
        ppiav1f3.setText(Double.toString(pow1f1)+" кВт");

        double tokav1f23 = Math.round(pow1f1*100)/100.0d;
        if   ((tokav1f23 >= 0.03) && (tokav1f23 < 1.3)) {
            nomiav1f = 2;
        }
        else if ((tokav1f23 >= 1.3) && (tokav1f23 < 2.5))
        {  nomiav1f = 4;}
        else if ((tokav1f23 >= 2.5) && (tokav1f23 < 3.7))
        {  nomiav1f = 6;}
        else if ((tokav1f23 >= 3.7) && (tokav1f23 < 6.2))
        {  nomiav1f = 10;}
        else if ((tokav1f23 >= 6.2) && (tokav1f23 < 9.8))
        {  nomiav1f = 16;}
        else if ((tokav1f23 >= 9.8) && (tokav1f23 < 12.2))
        {  nomiav1f = 20;}
        else if ((tokav1f23 >= 12.2) && (tokav1f23 < 15.2))
        {  nomiav1f = 25;}
        else if ((tokav1f23 >=15.2) && (tokav1f23 < 19.5))
        {  nomiav1f = 32;}
        else if ((tokav1f23 >= 19.5) && (tokav1f23 < 24.3))
        {  nomiav1f = 40;}
        else if ((tokav1f23 >= 24.3) && (tokav1f23 < 30.4))
        {  nomiav1f = 50;}
        else if ((tokav1f23 >= 30.4) && (tokav1f23 < 38.2))
        {  nomiav1f = 63;}
        else if ((tokav1f23 >= 38.2) && (tokav1f23 < 48.5))
        {  nomiav1f = 80;}
        else if ((tokav1f23 >= 48.5) && (tokav1f23 < 60.6))
        {  nomiav1f = 100;}
        else if ((tokav1f23 >= 60.6) && (tokav1f23 < 76.02))
        {  nomiav1f = 125;}
        else if ((tokav1f23 >= 76.02) && (tokav1f23 < 97.31))
        {  nomiav1f = 160;}
        else if ((tokav1f23 >= 97.31) && (tokav1f23 < 121.64))
        {  nomiav1f = 200;}
        else if ((tokav1f23 >= 121.64) && (tokav1f23 < 152.04))
        {  nomiav1f = 250;}
        else if ((tokav1f23 >= 152.04) && (tokav1f23 < 194.62))
        {  nomiav1f = 320;}
        else if ((tokav1f23 >= 194.62) && (tokav1f23 < 243.27))
        {  nomiav1f = 400;}
        else if ((tokav1f23 >= 243.27) && (tokav1f23 < 304.08))
        {  nomiav1f = 500;}
        else if ((tokav1f23 >= 304.08) && (tokav1f23 < 383.14))
        {  nomiav1f = 630;}
        else if ((tokav1f23 >= 383.14) && (tokav1f23 < 486.53))
        {  nomiav1f = 800;}
        else if ((tokav1f23 >= 486.53) && (tokav1f23 < 760.20))
        {  nomiav1f = 1250;}
        else if ((tokav1f23 >= 760.20) && (tokav1f23 < 973.06))
        {  nomiav1f = 1600;}
        else if ((tokav1f23 >= 973.06) && (tokav1f23 < 1216.32))
        {  nomiav1f = 2000;}
        else
        { nomiav1f = 0;}

        if (nomiav1f == 0) {
            pnomiav1f3.setText("Недопустимый ток!!!");
        } else {

            pnomiav1f3.setText("C" + Integer.toString(nomiav1f));
        }
    }
    public void onButtonav1fp3 (View View) {
        int nomiav1fi;

        EditText ptokav1fi3 = (EditText) findViewById(R.id.tokav1fi3);
        TextView ppowras1f3 = (TextView) findViewById(R.id.powras1f3);
        TextView pnomiav1fi3 = (TextView) findViewById(R.id.nomiav1fi32);
        float tokav1fi3 = Float.parseFloat(ptokav1fi3.getText().toString());

        double powras1f3 = Math.sqrt(3)*0.38 * tokav1fi3 * 0.924;
        double scale = Math.pow(10, 2);
        double powras1f1 = Math.ceil(powras1f3 * scale) / scale;
        ppowras1f3.setText(Double.toString(powras1f1) + " кВт");

        double tokav1f2 = Math.round(tokav1fi3 * 100) / 100.0d;
        if ((tokav1f2 >= 0.1) && (tokav1f2 < 2.1)) {
            nomiav1fi = 2;
        } else if ((tokav1f2 >= 2.1) && (tokav1f2 < 4.1)) {
            nomiav1fi = 4;
        } else if ((tokav1f2 >=4.1) && (tokav1f2 < 6.1)) {
            nomiav1fi = 6;
        } else if ((tokav1f2 >= 6.1) && (tokav1f2 < 10.2)) {
            nomiav1fi = 10;
        } else if ((tokav1f2 >=10.2) && (tokav1f2 < 16.1)) {
            nomiav1fi = 16;
        } else if ((tokav1f2 >=16.1) && (tokav1f2 < 20)) {
            nomiav1fi = 20;
        } else if ((tokav1f2 >=20.0) && (tokav1f2 < 25.0)) {
            nomiav1fi = 25;
        } else if ((tokav1f2 >= 25.0) && (tokav1f2 < 32.1)) {
            nomiav1fi = 32;
        } else if ((tokav1f2 >= 32.1) && (tokav1f2 < 40.0)) {
            nomiav1fi = 40;}
            else if ((tokav1f2 >= 40.0) && (tokav1f2 < 50.0)) {
                nomiav1fi = 50;}
        else if ((tokav1f2 >= 50.0) && (tokav1f2 < 62.9)) {
            nomiav1fi = 63;}
        else if ((tokav1f2 >= 62.9) && (tokav1f2 < 79.9)) {
            nomiav1fi = 80;}
        else if ((tokav1f2 >= 79.9) && (tokav1f2 < 99.8)) {
            nomiav1fi = 100;}
        else if ((tokav1f2 >= 99.8) && (tokav1f2 < 125)) {
            nomiav1fi = 125;}
        else if ((tokav1f2 >= 125) && (tokav1f2 < 160)) {
            nomiav1fi = 160;}
        else if ((tokav1f2 >= 160) && (tokav1f2 < 200)) {
            nomiav1fi = 200;}
        else if ((tokav1f2 >= 200) && (tokav1f2 < 250)) {
            nomiav1fi = 250;}
        else if ((tokav1f2 >= 250) && (tokav1f2 < 320)) {
            nomiav1fi = 320;}
        else if ((tokav1f2 >= 320) && (tokav1f2 < 400)) {
            nomiav1fi = 400;}
        else if ((tokav1f2 >= 400) && (tokav1f2 < 500)) {
            nomiav1fi = 500;}
        else if ((tokav1f2 >= 500) && (tokav1f2 < 630)) {
            nomiav1fi = 630;}
        else if ((tokav1f2 >= 630) && (tokav1f2 < 800)) {
            nomiav1fi = 800;}
        else if ((tokav1f2 >= 800) && (tokav1f2 < 1250)) {
            nomiav1fi = 1250;}
        else if ((tokav1f2 >= 1250) && (tokav1f2 < 1600)) {
            nomiav1fi = 1600;}
        else if ((tokav1f2 >= 1600) && (tokav1f2 < 2000)) {
            nomiav1fi = 2000;}
         else {
            nomiav1fi = 0;
        }

        if (nomiav1fi == 0) {
            pnomiav1fi3.setText("Недопустимый ток!!!");
        } else {
            pnomiav1fi3.setText("C" + Integer.toString(nomiav1fi));

        }

    }

    public void onButtonav1fpp3 (View View) {
        int nomiav1f1;

        EditText ppowav3 = (EditText) findViewById(R.id.powav3);
        float powav3 = Float.parseFloat(ppowav3.getText().toString());
        TextView pnomiav1fi33 = (TextView) findViewById(R.id.nomiav1fi33);
       TextView ptokav1fi4 = (TextView) findViewById(R.id.tokav1fi4);



        double tokav1fi4 = powav3/(Math.sqrt(3)*0.38  * 0.924);
        double scale = Math.pow(10, 2);
        double powras1f1 = Math.ceil(tokav1fi4 * scale) / scale;
        ptokav1fi4.setText(Double.toString(powras1f1) + " А");


        double tokav1f23 = Math.round(powav3*100)/100.0d;
        if   ((tokav1f23 >= 0.03) && (tokav1f23< 1.3)) {
            nomiav1f1 = 2;
        }
        else if ((tokav1f23 >= 1.3) && (tokav1f23 < 2.5))
        {  nomiav1f1 = 4;}
        else if ((tokav1f23 >= 2.5) && (tokav1f23 < 3.7))
        {  nomiav1f1 = 6;}
        else if ((tokav1f23 >= 3.7) && (tokav1f23 < 6.2))
        {  nomiav1f1 = 10;}
        else if ((tokav1f23 >= 6.2) && (tokav1f23 < 9.8))
        {  nomiav1f1 = 16;}
        else if ((tokav1f23 >= 9.8) && (tokav1f23 < 12.2))
        {  nomiav1f1 = 20;}
        else if ((tokav1f23 >= 12.2) && (tokav1f23 < 15.2))
        {  nomiav1f1 = 25;}
        else if ((tokav1f23 >=15.2) && (tokav1f23 < 19.5))
        {  nomiav1f1 = 32;}
        else if ((tokav1f23 >= 19.5) && (tokav1f23 < 24.3))
        {  nomiav1f1 = 40;}
        else if ((tokav1f23 >= 24.3) && (tokav1f23 < 30.4))
        {  nomiav1f1 = 50;}
        else if ((tokav1f23 >= 30.4) && (tokav1f23 < 38.2))
        {  nomiav1f1 = 63;}
        else if ((tokav1f23 >= 38.2) && (tokav1f23 < 48.5))
        {  nomiav1f1 = 80;}
        else if ((tokav1f23 >= 48.5) && (tokav1f23 < 60.6))
        {  nomiav1f1 = 100;}
        else if ((tokav1f23 >= 60.6) && (tokav1f23 < 76.02))
        {  nomiav1f1 = 125;}
        else if ((tokav1f23 >= 76.02) && (tokav1f23 < 97.31))
        {  nomiav1f1 = 160;}
        else if ((tokav1f23 >= 97.31) && (tokav1f23 < 121.64))
        {  nomiav1f1 = 200;}
        else if ((tokav1f23 >= 121.64) && (tokav1f23 < 152.04))
        {  nomiav1f1 = 250;}
        else if ((tokav1f23 >= 152.04) && (tokav1f23 < 194.62))
        {  nomiav1f1 = 320;}
        else if ((tokav1f23 >= 194.62) && (tokav1f23 < 243.27))
        {  nomiav1f1 = 400;}
        else if ((tokav1f23 >= 243.27) && (tokav1f23 < 304.08))
        {  nomiav1f1 = 500;}
        else if ((tokav1f23 >= 304.08) && (tokav1f23 < 383.14))
        {  nomiav1f1 = 630;}
        else if ((tokav1f23 >= 383.14) && (tokav1f23 < 486.53))
        {  nomiav1f1 = 800;}
        else if ((tokav1f23 >= 486.53) && (tokav1f23 < 760.20))
        {  nomiav1f1 = 1250;}
        else if ((tokav1f23 >= 760.20) && (tokav1f23 < 973.06))
        {  nomiav1f1 = 1600;}
        else if ((tokav1f23 >= 973.06) && (tokav1f23 < 1216.32))
        {  nomiav1f1 = 2000;}
        else
        { nomiav1f1 = 0;}


        if (nomiav1f1 == 0) {
            pnomiav1fi33.setText("Привышена мощность!!!");
        } else {
            pnomiav1fi33.setText("C" + Integer.toString(nomiav1f1));

        }

    }
}