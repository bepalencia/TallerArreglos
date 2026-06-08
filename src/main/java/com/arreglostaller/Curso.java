package com.arreglostaller;

import java.util.Random;

public final class Curso {

    private final String nombreCurso;
    private final int cantidaMaximaAlumnos;
    private final int cantidadInscritos;

    {
        Random random = new Random();

        int max=35;
        int min=20;

        this.cantidaMaximaAlumnos = random.nextInt(max - min + 1) + min;
    }


    public Curso(String nombreCurso, int cantidadInscritos) {
        
        this.nombreCurso = nombreCurso;

        if (cantidadInscritos > cantidaMaximaAlumnos) {
            System.out.println(" El número de alumnos no puede exceder a " + this.cantidaMaximaAlumnos +" .");
            this.cantidadInscritos = this.cantidaMaximaAlumnos; 
        } else {
            this.cantidadInscritos = cantidadInscritos;
        }


    }

    


    public String getNombreCurso() {
        return nombreCurso;
    }

    public int getCantidaMaximaAlumnos() {
        return cantidaMaximaAlumnos;
    }

    public int getCantidaInscritos() {
        return cantidadInscritos;
    }   

   

    @Override
    public String toString() {
        return "Curso: " + nombreCurso + ", Inscritos: " + cantidadInscritos + ", Capacidad Máxima: " + cantidaMaximaAlumnos;
    }

    



    
}
