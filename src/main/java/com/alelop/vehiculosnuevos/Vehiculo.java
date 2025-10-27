package com.alelop.vehiculosnuevos;

/*
 * Author: Alejandra López
 * Fecha: 26/10/2025
 * Descripción: Esta interface llamada "Vehiculo"  define los atributos
 * y comportamientos comunes de todos los vehículos.
 */

public abstract class Vehiculo {
    //Guarda la velocidad actual
    protected int velocidad_actual;
    //Guarda la velocidad máxima
    protected int velocidad_maxima;

    public Vehiculo(int velocidad_actual, int velocidad_maxima) {
        this.velocidad_actual = velocidad_actual;
        this.velocidad_maxima = velocidad_maxima;
    }

    // Método que imprime los resultados
    public void imprimir() {
        System.out.println("Velocidad actual: " + velocidad_actual + " km/h");
        System.out.println("Velocidad máxima: " + velocidad_maxima + " km/h");
    }

    //Método abstracto para incrementar la velocidad.
    public abstract void acelerar(int velocidad);

    //Método abstracto para disminuir la velocidad.
    public abstract void frenar(int velocidad);
}
