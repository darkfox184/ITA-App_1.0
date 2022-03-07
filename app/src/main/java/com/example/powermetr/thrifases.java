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
import java.text.DecimalFormat;
public class thrifases extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LOCKED);
        setContentView(R.layout.activity_thrifases);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

       /*FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/

    }

    public void onButtonClick3f(View view) {
        float toka, tokb, tokc, kolimp, impt, ktt;
        Double rashti;
        EditText ptoka = (EditText) findViewById(R.id.toka);
        EditText ptokb = (EditText) findViewById(R.id.tokb);
        EditText ptokc = (EditText) findViewById(R.id.tokc);
        EditText pkosf = (EditText) findViewById(R.id.kosf);
        EditText pkolimp = (EditText) findViewById(R.id.kolimp);
        TextView prestok3f = (TextView) findViewById(R.id.restok3f);
        TextView prespow3f = (TextView) findViewById(R.id.respow3f);
        TextView prashti = (TextView) findViewById(R.id.rashti);
        EditText pimph = (EditText) findViewById(R.id.imph);
        EditText pimpt = (EditText) findViewById(R.id.impt);
        TextView pres3epu = (TextView) findViewById(R.id.res3epu);
        TextView ppow3fimp = (TextView) findViewById(R.id.pow3fimp);
        EditText pktt = (EditText) findViewById(R.id.ktt);

        if (TextUtils.isEmpty(ptoka.getText().toString())) {
            ptoka.setError("Укажите ток!");
            toka = 0;
        } else {
            toka = Float.parseFloat(ptoka.getText().toString());
        }
        if (TextUtils.isEmpty(ptokb.getText().toString())) {
            ptokb.setError("Укажите ток!");
            tokb = 0;
        } else {
            tokb = Float.parseFloat(ptokb.getText().toString());
        }
        if (TextUtils.isEmpty(ptokc.getText().toString())) {
            ptokc.setError("Укажите ток!");
            tokc = 0;
        } else {
            tokc = Float.parseFloat(ptokc.getText().toString());
        }

       ktt = Float.parseFloat(pktt.getText().toString());

        float kosf = Float.parseFloat(pkosf.getText().toString());
             kolimp= Float.parseFloat(pkolimp.getText().toString());
        float tok3f = (toka + tokb + tokc) / 3;
        double scale = Math.pow(10, 3);
        double tok3f1 = Math.ceil(tok3f * scale) / scale;
        prestok3f.setText(Double.toString(tok3f1));

        double pow3f = Math.sqrt(3) * 0.38 * tok3f * kosf;

        double pow3f1 = Math.ceil(pow3f * scale) / scale;
        prespow3f.setText(Double.toString(pow3f1));
        if (TextUtils.isEmpty(pimpt.getText().toString())) {
            pimpt.setError("Укажите время!");
            impt = 0;
        } else {
            impt = Float.parseFloat(pimpt.getText().toString()) / kolimp;
        }


        float imph = Float.parseFloat(pimph.getText().toString());
        double pow3fimp = (3600*ktt)/(imph*impt);
        double res3epu = (((pow3f * impt * imph) / (3600*ktt)) - 1)* 100;

        if (pow3f==0) {

            rashti = 0.0;
        } else {
             rashti = (3600 / (pow3f * imph)) * kolimp*ktt;
        }

        double res3epu1 = Math.ceil(res3epu * scale) / scale;
        double rashti1 = Math.ceil(rashti * scale) / scale;
        double pow3fimp1 = Math.ceil(pow3fimp * scale) / scale;
        pres3epu.setText(Double.toString(res3epu1));
        prashti.setText(Double.toString(rashti1));
        ppow3fimp.setText(Double.toString(pow3fimp1));
    }

    public void onButtonClear3f(View view) {
        EditText ptoka = (EditText) findViewById(R.id.toka);
        EditText ptokb = (EditText) findViewById(R.id.tokb);
        EditText ptokc = (EditText) findViewById(R.id.tokc);
        EditText pimpt = (EditText) findViewById(R.id.impt);
        ptoka.getText().clear();
        ptokb.getText().clear();
        ptokc.getText().clear();
        pimpt.getText().clear();
    }
}