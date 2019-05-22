package com.example.dc_treatmentofbacteria.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.dc_treatmentofbacteria.DetailsBacteriaTest;
import com.example.dc_treatmentofbacteria.R;
import com.example.dc_treatmentofbacteria.adapter.BacteriaListAdapter;
import com.example.dc_treatmentofbacteria.control.Bacteria;
import com.example.dc_treatmentofbacteria.model.ClickListener;

import java.util.ArrayList;
import java.util.List;

public class BacteriaList extends AppCompatActivity {

    private RecyclerView rcvBacteria;
    private List<Bacteria> listBacteria = new ArrayList<>();
    private TextView txtBacteria, txtGram, txtAntibiotic1, txtAntibiotic2, txtObs;
    String bacteria, gram, antibiotic1, antibiotic2, obs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bacteria_list);

        getSupportActionBar().hide();

        Bundle typeAnimal = getIntent().getExtras();
        final String animal = typeAnimal.getString("animal");

        rcvBacteria = findViewById(R.id.rcvBacteria);

        this.detailsBacteria();
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        rcvBacteria.setLayoutManager(layoutManager);

        BacteriaListAdapter adapter = new BacteriaListAdapter(listBacteria);
        rcvBacteria.setAdapter(adapter);

        rcvBacteria.addOnItemTouchListener(
                new ClickListener(
                        getApplicationContext(), rcvBacteria, new ClickListener.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {

                        detailsBacteria();
                        Bacteria list = listBacteria.get(position);

                        Intent enviar = new Intent(BacteriaList.this, DetailsBacteriaTest.class);
                        enviar.putExtra("bacteria", list.getName());
                        enviar.putExtra("gram", list.getGram());
                        enviar.putExtra("antibiotic1", list.getAntibiotic1());
                        enviar.putExtra("antibiotic2", list.getAntibiotic2());
                        enviar.putExtra("obs", list.getObs());
                        startActivity(enviar);
                    }

                    @Override
                    public void onLongItemClick(View view, int position) {

                    }

                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    }
                }
                ) {
                }
        );
    }

    public List<Bacteria> detailsBacteria(){

        Bundle typeAnimal = getIntent().getExtras();
        String animal = typeAnimal.getString("animal");

        Bacteria bacteria = new Bacteria();

        if (animal.equals("smallSize")){
            listBacteria = bacteria.smallSize();
        }else if (animal.equals("swine")){
            listBacteria = bacteria.swine();
        }else if (animal.equals("bovine")){
            listBacteria = bacteria.bovine();
        }else if (animal.equals("equine")){
            listBacteria = bacteria.equine();
        }
        return listBacteria;
    }
}
