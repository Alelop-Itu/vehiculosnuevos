package com.alelop.vehiculosnuevos;

public class Main {
    public static void main(String[] args) {

        System.out.println("--- PRUEBA DE VEHÍCULOS ---");

        // 1. Crear una camioneta (Terrestre, implementa Motor)
        VehiculoTerrestre camioneta = new VehiculoTerrestre(100, 250, 4, "Civil");
        camioneta.imprimir();

        // Pruebas de acelerar
        camioneta.acelerar(100);
        System.out.println("-> Después de acelerar 100: " + camioneta.velocidad_actual + " km/h");

        camioneta.acelerar(100);
        System.out.println("-> Después de acelerar 100 más: " + camioneta.velocidad_actual + " km/h");

        // Método de la interfaz Motor
        int revoluciones = camioneta.calcularRevolucionesMotor(120, 5);
        System.out.println("Revoluciones del motor (120 * 5): " + revoluciones + " rpm");

        System.out.println("\n-------------");

        // 2. Crear una moto acuática (Acuatico, implementa Vela)
        VehiculoAcuatico motoAcuatica = new VehiculoAcuatico(50, 110, "Superficie", 2);
        motoAcuatica.imprimir();

        // Pruebas de frenar
        motoAcuatica.frenar(60); //
        System.out.println("-> Después de frenar 60: " + motoAcuatica.velocidad_actual + " km/h");

        motoAcuatica.acelerar(40);
        System.out.println("-> Después de acelerar 40: " + motoAcuatica.velocidad_actual + " km/h");

        // Método de la interfaz Vela
        motoAcuatica.recomendarVelocidad(90);
        motoAcuatica.recomendarVelocidad(45);
    }
}