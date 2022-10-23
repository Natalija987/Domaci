package com.itbootcamp.bgqa.nedelja4.domaci;

import java.util.ArrayList;

public class TestRestoran {
    public static void main(String[] args) {
        ArrayList<Jelo> listaJela= new ArrayList<>();
        Jelo jelo1=new Jelo("Sarma",1000,"domace");
        Jelo jelo2=new Jelo("tortilja", 1500, "meksicko");
        Jelo jelo3=new Jelo("pizza",1800,"italijansko");
        listaJela.add(jelo1);
        listaJela.add(jelo2);
        listaJela.add(jelo3);

        System.out.println(listaJela);
        System.out.println("Vrsta drugog jela je : " + jelo2.getVrsta()  );


}}
