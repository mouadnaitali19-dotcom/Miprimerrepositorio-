package com.Ercilla;

public class HolaMundo {
    public static void main(String[] args) {
        Mensaje msg = new Mensaje();
        String nombre = msg.solicitarDatos("Introduce tu nombre: ");
        System.out.println("Hola " + nombre);
    }
}