package com.example.dc_treatmentofbacteria.activity;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.dc_treatmentofbacteria.R;
import com.example.dc_treatmentofbacteria.control.Bacteria;

import java.util.ArrayList;
import java.util.List;

public class Home extends AppCompatActivity {

    private ImageButton btnSmallSize;
    private ImageButton btnSwine;
    private ImageButton btnEquine;
    private ImageButton btnBovine;
    ArrayList<Bacteria> listBacteria = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        getSupportActionBar().hide();

        btnSmallSize = findViewById(R.id.btnSmallSize);
        btnSwine = findViewById(R.id.btnSwine);
        btnBovine = findViewById(R.id.btnBovine);
        btnEquine = findViewById(R.id.btnEquine);

        btnSmallSize.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent smallSize = new Intent(getApplicationContext(), BacteriaList.class);
                smallSize.putExtra("animal", "smallSize");
                startActivity(smallSize);
            }
        });

        btnSwine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent swine = new Intent(getApplicationContext(), BacteriaList.class);
                swine.putExtra("animal", "swine");
                startActivity(swine);
            }
        });

        btnBovine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bovine = new Intent(getApplicationContext(), BacteriaList.class);
                bovine.putExtra("animal", "bovine");
                startActivity(bovine);
            }
        });

        btnEquine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent equine = new Intent(getApplicationContext(), BacteriaList.class);
                equine.putExtra("animal", "equine");
                startActivity(equine);
            }
        });
    }
}