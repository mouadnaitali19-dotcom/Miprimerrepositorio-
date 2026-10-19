package com.Ercilla;

import java.util.Scanner;

public class HolaMundo {
    public static void main(String[] args) {
        Mensaje msg = new Mensaje();
        String nombre = msg.solicitarDatos("Introduce tu nombre: ");
        String apellidos = msg.solicitarDatos("Escribe tus apellidos");
        Personas p1 = new Personas(nombre,apellidos);
        msg.saludar(p1);


    }
}