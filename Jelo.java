package com.itbootcamp.bgqa.nedelja4.domaci;

public class Jelo {
    private String naziv;
    private double cena;
    private String vrsta; // Meksicko, Italijansko,..

    public Jelo(String naziv, double cena, String vrsta) {
        this.naziv = naziv;
        this.cena = cena;
        this.vrsta = vrsta;
    }

    public String getNaziv() {
        return naziv;
    }


    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public String getVrsta() {
        return vrsta;
    }

    public void setVrsta(String vrsta) {
        this.vrsta = vrsta;
    }
    @Override
    public String toString() {
        return "Jelo{" +
                "naziv='" + naziv + '\'' +
                ", cena=" + cena +
                ", vrsta='" + vrsta + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Jelo jelo1=new Jelo("Sarma",1000,"domace");
        Jelo jelo2=new Jelo("tortilja", 1500, "meksicko");
        Jelo jelo3=new Jelo("pizza",1800,"italijansko");
        System.out.println(jelo3.getCena());
    }
}
