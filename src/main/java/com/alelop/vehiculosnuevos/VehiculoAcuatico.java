package com.alelop.vehiculosnuevos;

/*
 * Author: Alejandra López
 * Fecha: 26/10/2025
 * Descripción: Esta interface llamada "VehiculoTerrestre"  Modela un vehículo acuático,
 * hereda de Vehiculo e implementa Vela.
 */

public class VehiculoAcuatico extends Vehiculo implements Vela {
    //Guarda el tipo de vehículo
    protected String tipo_acuatico;
    //Guarda la capacidad de pasajeros del vehículo
    protected int capacidad_pasajeros;

    /* Constructor VehiculoAcuatico
     * @param velocidad_actual, velocidad_maxima, tipo_acuatico, capacidad_pasajeros
     * */
    public VehiculoAcuatico(int velocidad_actual, int velocidad_maxima, String tipo_acuatico, int capacidad_pasajeros) {
        super(velocidad_actual, velocidad_maxima);
        this.tipo_acuatico = tipo_acuatico;
        this.capacidad_pasajeros = capacidad_pasajeros;
    }

    //Método que límita la velocidad máxima del vehículo acuático
    /*@param nueva_velocidad, velocidad_actual, velocidad, velocidad_maxima
     * */
    public void acelerar(int velocidad) {
        int nueva_velocidad = this.velocidad_actual + velocidad;

        // No puede superar la velocidad máxima
        if (nueva_velocidad > this.velocidad_maxima) {
            this.velocidad_actual = this.velocidad_maxima;
            System.out.println("Velocidad limitada a la máxima (" + this.velocidad_maxima + " km/h).");
        } else {
            this.velocidad_actual = nueva_velocidad;
        }
    }

    // Método que evita que la velocidad sea negativa
    /*@param nueva_velocidad, velocidad
     * */
    public void frenar(int velocidad) {
        int nueva_velocidad = this.velocidad_actual - velocidad;

        // No puede ser negativa [cite: 69]
        if (nueva_velocidad < 0) {
            this.velocidad_actual = 0;
            System.out.println("Detenido. La velocidad no puede ser negativa.");
        } else {
            this.velocidad_actual = nueva_velocidad;
        }
    }

    // Método que remienda una nueva velocidad
    /*@param velocidad_viento
     * */
    public void recomendarVelocidad(int velocidad_viento) {
        // Viento > 80km/h: no se recomienda salir
        if (velocidad_viento > 80) {
            System.out.println("Velocidad del viento (" + velocidad_viento + " km/h) es muy alta. NO se recomienda salir a navegar.");
        } else {
            System.out.println("Velocidad del viento (" + velocidad_viento + " km/h) es segura para navegar.");
        }
    }

    //Método usado para imprimir los datos del vehículo acuático
    public void imprimir() {
        System.out.println("\n--- Vehículo Acuático ---");
        super.imprimir();
        System.out.println("Tipo: " + tipo_acuatico);
        System.out.println("Capacidad de pasajeros: " + capacidad_pasajeros);
    }
}