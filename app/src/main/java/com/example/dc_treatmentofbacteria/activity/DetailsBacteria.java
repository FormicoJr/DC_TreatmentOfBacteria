package com.example.dc_treatmentofbacteria.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;

import com.example.dc_treatmentofbacteria.R;
import com.example.dc_treatmentofbacteria.adapter.BacteriaListAdapter;
import com.example.dc_treatmentofbacteria.control.Bacteria;
import com.example.dc_treatmentofbacteria.model.ClickListener;

import java.util.ArrayList;
import java.util.List;

public class DetailsBacteria extends AppCompatActivity {

    private RecyclerView rcvDetails;
    private List<Bacteria> listDetails = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_bacteria);

        rcvDetails = findViewById(R.id.rcvDetails);

        this.detailsBacteria();
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        rcvDetails.setLayoutManager(layoutManager);

        BacteriaListAdapter adapter = new BacteriaListAdapter(listDetails);
        rcvDetails.setAdapter(adapter);

    }
    public List<Bacteria> detailsBacteria(){

        Bundle typeAnimal = getIntent().getExtras();
        String animal = typeAnimal.getString("animal");

        Bacteria bacteria = new Bacteria();

        if (animal.equals("smallSize")){
            listDetails = bacteria.smallSize();
        }else if (animal.equals("swine")){
            listDetails = bacteria.swine();
        }else if (animal.equals("bovine")){
            listDetails = bacteria.bovine();
        }else if (animal.equals("equine")){
            listDetails = bacteria.equine();
        }
        return listDetails;
    }
}
