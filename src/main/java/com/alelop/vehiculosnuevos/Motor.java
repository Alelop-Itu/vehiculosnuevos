package com.alelop.vehiculosnuevos;
/*
 * Author: Alejandra López
 * Fecha: 26/10/2025
 * Descripción: Esta interface llamada "Motor"  modela el motor para vehículos terrestres.
 * Java permite que una clase herede de una sola superclase (extends Vehiculo),
 * pero que implemente múltiples interfaces (Motor, Vela).
 * Parámetros
 * @param fuerza La fuerza del motor.
 * @param radio El radio del motor.
 */

public interface Motor {
    //Calcula el número de revoluciones del motor (fuerza * radio).
    int calcularRevolucionesMotor(int fuerza, int radio);
}
