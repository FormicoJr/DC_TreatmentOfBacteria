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

public class DetailsBacteriaAdapter  extends RecyclerView.Adapter<DetailsBacteriaAdapter.MyViewHolder> {

    private List<Bacteria> listBacteria;



    public DetailsBacteriaAdapter(List<Bacteria> listaProdutos) {
        this.listBacteria = listaProdutos;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        private TextView nameBacteria;
        private TextView gram;
        private TextView escolha1;
        private TextView escolha2;
        private TextView obs;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            nameBacteria = itemView.findViewById(R.id.txtBacteria);
            gram = itemView.findViewById(R.id.txtGram2);
            escolha1 = itemView.findViewById(R.id.txtEscolha1);
            escolha2 = itemView.findViewById(R.id.txtEscolha2);
            obs = itemView.findViewById(R.id.txtObs);
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
        myViewHolder.gram.setText(bacteria.getGram());
        myViewHolder.escolha1.setText(bacteria.getAntibiotic1());
        myViewHolder.escolha2.setText(bacteria.getAntibiotic2());
        if (bacteria.getObs().equals("")){
            myViewHolder.obs.setText("Sem observações.");
        }else {
            myViewHolder.obs.setText(bacteria.getObs());
        }
    }

    @Override
    public int getItemCount() {
        return listBacteria.size();
    }

}
