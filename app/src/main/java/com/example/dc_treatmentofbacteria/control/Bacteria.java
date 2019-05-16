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

        bacteria = new Bacteria("Ercherichia coli", "Positiva",
                "Tetracilinas - Trimetoprima - Sulfonamidas - Cefalosporinas",
                "Fluoroquinolonas - Aminoglicosideos ", "");
        this.bacterias.add(bacteria);

        bacteria = new Bacteria("Ercherichia coli", "Positiva",
                "Tetracilinas - Trimetoprima - Sulfonamidas - Cefalosporinas",
                "Fluoroquinolonas - Aminoglicosideos ", "");
        this.bacterias.add(bacteria);

        bacteria = new Bacteria("Ercherichia coli", "Positiva",
                "Tetracilinas - Trimetoprima - Sulfonamidas - Cefalosporinas",
                "Fluoroquinolonas - Aminoglicosideos ", "");
        this.bacterias.add(bacteria);

        return bacterias;
    }

    public List<Bacteria> smallSize() {
        Bacteria bacteria = new Bacteria("Ercherichia coli", "Positiva",
                "Tetracilinas - Trimetoprima - Sulfonamidas - Cefalosporinas",
                "Fluoroquinolonas - Aminoglicosideos ", "");
        this.bacterias.add(bacteria);

        bacteria = new Bacteria("Ercherichia coli", "Positiva",
                "Tetracilinas - Trimetoprima - Sulfonamidas - Cefalosporinas",
                "Fluoroquinolonas - Aminoglicosideos ", "");
        this.bacterias.add(bacteria);

        bacteria = new Bacteria("Ercherichia coli", "Positiva",
                "Tetracilinas - Trimetoprima - Sulfonamidas - Cefalosporinas",
                "Fluoroquinolonas - Aminoglicosideos ", "");
        this.bacterias.add(bacteria);

        bacteria = new Bacteria("Ercherichia coli", "Positiva",
                "Tetracilinas - Trimetoprima - Sulfonamidas - Cefalosporinas",
                "Fluoroquinolonas - Aminoglicosideos ", "");
        this.bacterias.add(bacteria);

        return bacterias;
    }

    public List<Bacteria> bovine() {
        Bacteria bacteria = new Bacteria("Ercherichia coli", "Positiva",
                "Tetracilinas - Trimetoprima - Sulfonamidas - Cefalosporinas",
                "Fluoroquinolonas - Aminoglicosideos ", "");
        this.bacterias.add(bacteria);

        bacteria = new Bacteria("Ercherichia coli", "Positiva",
                "Tetracilinas - Trimetoprima - Sulfonamidas - Cefalosporinas",
                "Fluoroquinolonas - Aminoglicosideos ", "");
        this.bacterias.add(bacteria);

        bacteria = new Bacteria("Ercherichia coli", "Positiva",
                "Tetracilinas - Trimetoprima - Sulfonamidas - Cefalosporinas",
                "Fluoroquinolonas - Aminoglicosideos ", "");
        this.bacterias.add(bacteria);

        bacteria = new Bacteria("Ercherichia coli", "Positiva",
                "Tetracilinas - Trimetoprima - Sulfonamidas - Cefalosporinas",
                "Fluoroquinolonas - Aminoglicosideos ", "");
        this.bacterias.add(bacteria);

        return bacterias;
    }

    public List<Bacteria> equine() {
        Bacteria bacteria = new Bacteria("Ercherichia coli", "Positiva",
                "Tetracilinas - Trimetoprima - Sulfonamidas - Cefalosporinas",
                "Fluoroquinolonas - Aminoglicosideos ", "");
        this.bacterias.add(bacteria);

        bacteria = new Bacteria("Ercherichia coli", "Positiva",
                "Tetracilinas - Trimetoprima - Sulfonamidas - Cefalosporinas",
                "Fluoroquinolonas - Aminoglicosideos ", "");
        this.bacterias.add(bacteria);

        bacteria = new Bacteria("Ercherichia coli", "Positiva",
                "Tetracilinas - Trimetoprima - Sulfonamidas - Cefalosporinas",
                "Fluoroquinolonas - Aminoglicosideos ", "");
        this.bacterias.add(bacteria);

        bacteria = new Bacteria("Ercherichia coli", "Positiva",
                "Tetracilinas - Trimetoprima - Sulfonamidas - Cefalosporinas",
                "Fluoroquinolonas - Aminoglicosideos ", "");
        this.bacterias.add(bacteria);


        return bacterias;
    }
}
