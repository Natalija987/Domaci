package com.itbootcamp.bgqa.nedelja4.domaci;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;

public class Restoran implements Guzva {
    private String naziv;
    private ArrayList<Jelo> meni;
    private int brSlobodnihStolova;


    public Restoran(String naziv, ArrayList<Jelo> meni, int brSlobodnihStolova) {
        this.naziv = naziv;
        this.meni = meni;
        this.brSlobodnihStolova = brSlobodnihStolova;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public ArrayList<Jelo> getMeni() {
        return meni;
    }

    public void setMeni(ArrayList<Jelo> meni) {
        this.meni = meni;
    }

    public int getBrSlobodnihStolova() {
        return brSlobodnihStolova;
    }

    public void setBrSlobodnihStolova(int brSlobodnihStolova) {
        this.brSlobodnihStolova = brSlobodnihStolova;
    }

    @Override
    public String toString() {
        return "Restoran{" +
                "naziv='" + naziv + '\'' +
                ", meni=" + meni +
                ", brSlobodnihStolova=" + brSlobodnihStolova +
                '}';
    }

    @Override
    public double JeloNajskuplje(){
       int[] jelo={1,2,3};
        int max=0;
       for(int i=0;i< jelo.length;i++)
        if(jelo[i]>max)
            max=jelo[i];
        return max;
    }
    @Override
    public void rezervisiSto() {
        int slobodanSto=0;
        if(slobodanSto>0 ){
            System.out.println("Rezervisi broj slobodnih stolova " + slobodanSto);
        }
    }
    @Override
    public void StampajNaziveJela(String vrsta) {
       System.out.println("nazivi jela su : " + getNaziv() + getNaziv() + getNaziv() );
    }


}
