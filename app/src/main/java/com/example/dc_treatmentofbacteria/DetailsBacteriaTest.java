package com.example.dc_treatmentofbacteria;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailsBacteriaTest extends AppCompatActivity {

    private String bacteria, gram, antibiotic1, antibiotic2, obs;
    private TextView txtBacteria, txtGram, txtAntibiotic1, txtAntibiotic2, txtObs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_bacteria_test);

        txtBacteria = findViewById(R.id.txtBacteria);
        txtGram = findViewById(R.id.txtGram2);
        txtAntibiotic1 = findViewById(R.id.txtAntibiotic1);
        txtAntibiotic2 = findViewById(R.id.txtAntibiotic2);
        txtObs = findViewById(R.id.txtObs);


        Bundle dados = getIntent().getExtras();
        bacteria = dados.getString("bacteria");
        gram = dados.getString("gram");
        antibiotic1 = dados.getString("antibiotic1");
        antibiotic2 = dados.getString("antibiotic2");
        obs = dados.getString("obs");

        txtBacteria.setText(bacteria);
        txtGram.setText(gram);
        txtAntibiotic1.setText(antibiotic1);
        txtAntibiotic2.setText(antibiotic2);
        txtObs.setText(obs);
    }
}
