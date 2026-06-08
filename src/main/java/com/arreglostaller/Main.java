package com.arreglostaller;

public class Main {
    public static void main(String[] args) {
        Curso[][] sucursales = new Curso[3][];
        sucursales[0] = new Curso[5]; 
        sucursales[1] = new Curso[7]; 
        sucursales[2] = new Curso[4];
        // Datos de la Sucursal A
        sucursales[0][0] = new Curso("Matemáticas", 18);
        sucursales[0][1] = new Curso("Física", 25);
        sucursales[0][2] = new Curso("Química", 20);
        // Datos de la Sucursal B   
        sucursales[1][0] = new Curso("Matemáticas", 32);
        sucursales[1][1] = new Curso("Física", 15);
        sucursales[1][2] = new Curso("Química", 28);
        sucursales[1][3] = new Curso("Biología", 32);
        sucursales[1][4] = new Curso("Historia", 32);
        sucursales[1][5] = new Curso("Geografía", 32);
        // Datos de la Sucursal C
        sucursales[2][0] = new Curso("Literatura", 18);
        sucursales[2][1] = new Curso("Artes", 25);
        sucursales[2][2] = new Curso("Botánica", 20);
        sucursales[2][3] = new Curso("Programación", 34);

        char identificadorSucursal = 'A';

        for (int i = 0; i < sucursales.length; i++) {
            System.out.println("Sucursal " + identificadorSucursal + ":");
            int cursosActivos = 0;
            for (int j = 0; j < sucursales[i].length; j++) {
                if (sucursales[i][j] != null) {
                    System.out.println("  " + sucursales[i][j].toString());
                    cursosActivos++;
                }
            }

            System.out.println("  Resumen: " + cursosActivos + " cursos registrados con una capacidad máxima de " + sucursales[i].length );
            identificadorSucursal++;  
        } 
    }
}