package com.company;

import java.time.LocalDate;
import java.time.Period;
import java.time.chrono.ChronoLocalDate;
import java.time.temporal.ChronoUnit;

public class Atleta {
    private String name;

    public String getName() {
        return name;
    }

    private Gender gender;
    private LocalDate birthDate;
    private LocalDate careerStart;
    private LocalDate careerEnd;
    private int edadAtleta;

    public Atleta(String name, Gender gender, LocalDate birthDate, LocalDate careerStart, LocalDate careerEnd) {
        this.name = name;
        this.gender = gender;
        this.birthDate = birthDate;
        this.careerStart = careerStart;
        this.careerEnd = careerEnd;

    }

    public Atleta(String name, Gender gender, LocalDate birthDate, LocalDate careerStart) {
        this(name,gender,birthDate,careerStart,null);
    }

    public Atleta(String name, Gender gender, LocalDate birthDate) {
        this(name,gender,birthDate,null,null);
    }

    public int edad() {
        edadAtleta = Period.between(birthDate, LocalDate.now()).getYears();
        return edadAtleta;
    }

    public boolean debutar(LocalDate careerStart) {
        boolean debuta = true;
        if (this.careerEnd != null)
            debuta = false;
        if (birthDate != null)
            debuta = false;
        if (debuta = false)
            return debuta;
        if (debuta = true) {
            this.careerStart = careerStart;
            return debuta;
        }
    }


    public boolean retirar(LocalDate careerEnd) {
        if (this.careerStart != null)
            return false;
        if (this.birthDate != null)
            return false;

            this.careerEnd = careerEnd;
            return true;
        }


    public boolean estaActivo(LocalDate fecha) {
if (this.careerEnd!=null)
    return false;
if (fecha.isBefore(careerStart))
    return false;

return true;

    }

    public int diasActivo(){
if (estaActivo(LocalDate.now()))
    return (int) careerStart.until(LocalDate.now(),ChronoUnit.DAYS);

else return (int) careerStart.until(careerEnd,ChronoUnit.DAYS);
    }
}

