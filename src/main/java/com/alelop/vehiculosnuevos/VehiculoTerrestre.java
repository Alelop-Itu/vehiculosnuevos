package com.alelop.vehiculosnuevos;

/*
 * Author: Alejandra López
 * Fecha: 26/10/2025
 * Descripción: Esta interface llamada "VehiculoTerrestre"  Modela un vehículo terrestre,
 * hereda de Vehiculo e implementa Motor.
 */

public class VehiculoTerrestre extends Vehiculo implements Motor {
    protected int cantidad_llantas;
    protected String uso_vehiculo;

    /* Constructor VehiculoTerrestre
     * @param velocidad_actual, velocidad_maxima, cantidad_llantas, uso_vehiculo
     * */
    public VehiculoTerrestre(int velocidad_actual, int velocidad_maxima, int cantidad_llantas, String uso_vehiculo) {
        super(velocidad_actual, velocidad_maxima);
        this.cantidad_llantas = cantidad_llantas;
        this.uso_vehiculo = uso_vehiculo;
    }

    //
    public void acelerar(int velocidad) {
        int nueva_velocidad = this.velocidad_actual + velocidad;

        // No puede superar la velocidad máxima [cite: 67]
        if (nueva_velocidad > this.velocidad_maxima) {
            this.velocidad_actual = this.velocidad_maxima;
            System.out.println("Velocidad limitada a la máxima (" + this.velocidad_maxima + " km/h).");
        } else {
            this.velocidad_actual = nueva_velocidad;
        }
    }

    //
    public void frenar(int velocidad) {
        int nueva_velocidad = this.velocidad_actual - velocidad;

        // No puede ser negativa
        if (nueva_velocidad < 0) {
            this.velocidad_actual = 0;
            System.out.println("Detenido. La velocidad no puede ser negativa.");
        } else {
            this.velocidad_actual = nueva_velocidad;
        }
    }

    //
    public int calcularRevolucionesMotor(int fuerza, int radio) {
        // Multiplicación de la fuerza por el radio
        return fuerza * radio;
    }

    //
    public void imprimir() {
        System.out.println("\n--- Vehículo Terrestre ---");
        super.imprimir();
        System.out.println("Cantidad de llantas: " + cantidad_llantas);
        System.out.println("Uso: " + uso_vehiculo);
    }
}

