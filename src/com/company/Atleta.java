package com.company;

import java.time.LocalDate;
import java.time.Period;

public class Atleta {
    private String name;
    private Gender gender;
    private LocalDate birthDate;
    private LocalDate careerStart;
    private LocalDate careerEnd;

    public Atleta(String name, Gender gender, LocalDate birthDate, LocalDate careerStart, LocalDate careerEnd) {
        this.name = name;
        this.gender = gender;
        this.birthDate = birthDate;
        this.careerStart = careerStart;
        this.careerEnd = careerEnd;

    }

    public Atleta(String name, Gender gender, LocalDate birthDate, LocalDate careerStart) {
        this.name = name;
        this.gender = gender;
        this.birthDate = birthDate;
        this.careerStart = careerStart;
    }

    public Atleta(String name, Gender gender, LocalDate birthDate) {
        this.name = name;
        this.gender = gender;
        this.birthDate = birthDate;
    }
        /*public static int edad(int edadAtleta){

    }
    public static boolean debutar(LocalDate careerStart){

    }
    public static boolean retirar(LocalDate careerEnd){

    }
    public static boolean estaActivo(LocalDate fecha){

    }
    public static int diasActivo(int debutar, int retirar){

    }*/
}

