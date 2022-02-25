package com.company;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Atleta atleta1 = new Atleta("Pepe", Gender.MALE, LocalDate.of(1990, 9, 25), LocalDate.of(2002, 9, 25), LocalDate.of(2010, 9, 25));
        Prueba Trial= new Prueba("100m lisos");
        System.out.println(Trial.prueba("100m natacion"));
        System.out.println(atleta1.edad());
        System.out.println(atleta1.debutar(LocalDate.of(2002, 9, 25)));
        System.out.println(atleta1.retirar(LocalDate.of(2010, 9, 25)));
    }
}
