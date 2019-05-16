package com.example.dc_treatmentofbacteria.control;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Bacteria implements Serializable {

    private String name;
    private String gram;
    private String antibiotic1;
    private String antibiotic2;
    private String obs;

    public List<Bacteria> bacterias = new ArrayList<>();

    public List<Bacteria> getBacterias() {
        return bacterias;
    }

    public Bacteria() {
    }

    public Bacteria(String name, String gram, String antibiotic1, String antibiotic2, String obs) {
        this.name = name;
        this.gram = gram;
        this.antibiotic1 = antibiotic1;
        this.antibiotic2 = antibiotic2;
        this.obs = obs;
    }

    public String getName() {   return name;    }

    public String getGram() {   return gram;    }

    public String getAntibiotic1() { return antibiotic1;  }

    public String getAntibiotic2() { return antibiotic2;  }

    public String getObs() {    return obs; }


    public List<Bacteria> swine() {
        Bacteria bacteria = new Bacteria("Ercherichia coli", "Positiva",
                "Tetracilinas - Trimetoprima - Sulfonamidas - Cefalosporinas",
                "Fluoroquinolonas - Aminoglicosideos ", "");
        this.bacterias.add(bacteria);

        bacteria = new Bacteria("Clostridium perfringens", "Gram Positiva",
                "Tetracilinas - Trimetoprima - Sulfonamidas - Cefalosporinas",
                "Fluoroquinolonas - Aminoglicosideos - Tulatromicina", "");
        this.bacterias.add(bacteria);

        bacteria = new Bacteria("Bosdetella bronchiseptica", "Gram Negativa",
                "Tetracilinas - Trimetoprima - Sulfonamidas - Cefalosporinas",
                "Fluoroquinolonas - Tianfenicois - Macrolideos - Lincosamidas - Tulatromicina", "");
        this.bacterias.add(bacteria);

        return bacterias;
    }

    public List<Bacteria> smallSize() {
        Bacteria bacteria = new Bacteria("Actinomyces  sp", "Gram Positiva",
                "Penicilina",
                "Tetracilinas", "");
        this.bacterias.add(bacteria);


        bacteria = new Bacteria("Borrelia burgdorferi", "Gram Negativa",
                "Tetramicina",
                "Penicilina", "");
        this.bacterias.add(bacteria);

        bacteria = new Bacteria("Listeria monocytogenes", "Gram Positiva",
                "Ampicilina",
                "Tetracilinas", "");
        this.bacterias.add(bacteria);

        return bacterias;
    }

    public List<Bacteria> bovine() {
        Bacteria bacteria = new Bacteria("E. coli", "Gram Negativa",
                "Aminoglicosideos",
                "Sulfonamidas - Fluoroquinolonas", "");
        this.bacterias.add(bacteria);

        bacteria = new Bacteria("Staphylococcus aureus", "Gram Positiva",
                "Tilmicosinas",
                "Fluoroquinolonas - Lincosamidas", "");
        this.bacterias.add(bacteria);

        bacteria = new Bacteria("Mycoplasma spp", "Gram Negativa",
                "Oxitetraciclina - Espectinomicina",
                "Fluoroquinolonas - Florfenicol", "");
        this.bacterias.add(bacteria);

        return bacterias;
    }

    public List<Bacteria> equine() {
        Bacteria bacteria = new Bacteria("Proteus", "Gram Negativa",
                "Penicilina",
                "Trimetoprima - Sulfonamidas - Amplicilina", "");
        this.bacterias.add(bacteria);


        bacteria = new Bacteria("Estreptococcus equi", "Gram Positiva",
                "Penicilina",
                "Trimetoprima - Sulfonamidas", "");
        this.bacterias.add(bacteria);

        bacteria = new Bacteria("Brucella abortus", "Gram Negativa",
                "Oxitetraciclina",
                "Gentamicina", "");
        this.bacterias.add(bacteria);


        return bacterias;
    }
}
