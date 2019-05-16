package com.example.dc_treatmentofbacteria.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.dc_treatmentofbacteria.R;
import com.example.dc_treatmentofbacteria.control.Bacteria;

import java.util.List;

public class BacteriaListAdapter  extends RecyclerView.Adapter<BacteriaListAdapter.MyViewHolder> {

    private List<Bacteria> listBacteria;

    public BacteriaListAdapter(List<Bacteria> listaProdutos) {
        this.listBacteria = listaProdutos;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        private TextView nameBacteria;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            nameBacteria = itemView.findViewById(R.id.txtBacteria);
        }
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemLista = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.activity_bacteria_list_adapter, viewGroup,false);
        return new MyViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int position) {

        Bacteria bacteria = listBacteria.get(position);
        myViewHolder.nameBacteria.setText(bacteria.getName());
    }

    @Override
    public int getItemCount() {
        return listBacteria.size();
    }

}