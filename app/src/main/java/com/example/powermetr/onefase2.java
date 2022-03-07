package com.example.powermetr;

import android.content.pm.ActivityInfo;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.text.TextUtils;
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

    }
    public void onButtonClick2 (View v) {
        float tok1f, kolimp1f, kosf1f,  impt1f, imph1f, u1f;

        EditText ptok1f = (EditText)findViewById(R.id.tok1f);
        EditText pimph1f = (EditText)findViewById(R.id.imph1f);
        EditText pimpt1f = (EditText)findViewById(R.id.impt1f);
        EditText pkolimp1f = (EditText)findViewById(R.id.kolimp1f);
        EditText pkosf1f = (EditText)findViewById(R.id.kosf1f);
        EditText pu1f = (EditText)findViewById(R.id.u1f);
        TextView prespow1f= (TextView)findViewById(R.id.respow1f);
        TextView prashti2= (TextView)findViewById(R.id.rashti2);
        TextView pres1epu= (TextView)findViewById(R.id.resepu1f);
        TextView ppow1fimp = (TextView) findViewById(R.id.pow1fimp);


        if (TextUtils.isEmpty(ptok1f.getText().toString())) {
            ptok1f.setError("Укажите ток!");
            tok1f = 0;
        } else {
            tok1f = Float.parseFloat(ptok1f.getText().toString());
        }
        if (TextUtils.isEmpty(pkosf1f.getText().toString())) {
            pkosf1f.setError("Укажите cosф!");
            kosf1f = 0;
        } else {
            kosf1f = Float.parseFloat(pkosf1f.getText().toString());
        }
        if (TextUtils.isEmpty(pkolimp1f.getText().toString())) {
            pkolimp1f.setError("Укажите количество импульсов!");
            kolimp1f = 0;
        } else {
            kolimp1f = Float.parseFloat(pkolimp1f.getText().toString());
        }
        if (TextUtils.isEmpty(pimpt1f.getText().toString())) {
            pimpt1f.setError("Укажите время импульсов!");
            impt1f = 0;
        } else {
            impt1f = Float.parseFloat(pimpt1f.getText().toString())/kolimp1f;
        }
        if (TextUtils.isEmpty(pimph1f.getText().toString())) {
            pimph1f.setError("Укажите количество импульсов счетчика!");
            imph1f = 0;
        } else {
            imph1f = Float.parseFloat(pimph1f.getText().toString());
        }
        if (TextUtils.isEmpty(pu1f.getText().toString())) {
            pimph1f.setError("Укажите количество импульсов счетчика!");
            u1f = 0;
        } else {
            u1f = Float.parseFloat(pu1f.getText().toString());
        }

        double pow1f =u1f*tok1f*kosf1f;
        double scale = Math.pow(10, 3);
        double pow1f1 = Math.ceil(pow1f * scale) / scale;
        prespow1f.setText(Double.toString(pow1f1));
        double res1epu = ((pow1f*impt1f*imph1f/3600)-1)*100;
        double rashti3 = (3600/(pow1f*imph1f))*kolimp1f;
        double pow1fimp = 3600/(imph1f*impt1f);
        double res1epu1 = Math.ceil(res1epu * scale) / scale;
        double rashti2 = Math.ceil(rashti3 * scale) / scale;
        double pow1fimp1 = Math.ceil(pow1fimp * scale) / scale;
        pres1epu.setText(Double.toString(res1epu1));
        prashti2.setText(Double.toString(rashti2));
        ppow1fimp.setText(Double.toString(pow1fimp1));

    }
    public void onButtonClear1f(View v) {
        EditText ptok1f = (EditText) findViewById(R.id.tok1f);
        EditText pimpt1f = (EditText) findViewById(R.id.impt1f);
        EditText pkosf1f = (EditText) findViewById(R.id.kosf1f);
        EditText pkolimp1f = (EditText) findViewById(R.id.kolimp1f);
        EditText pimph1f = (EditText)findViewById(R.id.imph1f);
        EditText pu1f = (EditText)findViewById(R.id.u1f);
        ptok1f.getText().clear();
        pimpt1f.getText().clear();
        pu1f.setText(Double.toString(0.22));
        pkosf1f.setText(Double.toString(1.0));
        pkolimp1f.setText(Integer.toString(1));
        pimph1f.setText(Integer.toString(6400));
    }
    public void onButtonClear1f2(View v) {
        EditText ptok1f = (EditText) findViewById(R.id.tok1f);
        EditText pimpt1f = (EditText) findViewById(R.id.impt1f);
        ptok1f.getText().clear();
        pimpt1f.getText().clear();

    }
}