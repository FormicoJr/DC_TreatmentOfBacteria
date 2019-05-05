package com.example.dc_treatmentofbacteria.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.dc_treatmentofbacteria.R;

public class Home extends AppCompatActivity {

    private Button btnCanino;
    private Button btnFelino;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //Referência dos botões da activity
        btnCanino = findViewById(R.id.btnCanino);
        btnFelino = findViewById(R.id.btnFelino);

        btnCanino.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nextActivity = new Intent(getApplicationContext(), BacteriaList.class);
                startActivity(nextActivity);
            }
        });

        btnFelino.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nextActivity = new Intent(getApplicationContext(), BacteriaList.class);
                startActivity(nextActivity);
            }
        });
    }
}