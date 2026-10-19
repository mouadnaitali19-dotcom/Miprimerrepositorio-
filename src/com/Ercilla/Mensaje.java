package com.Ercilla;

import java.util.Scanner;

public class Mensaje {
    public String solicitarDatos(String mensaje) {
        System.out.print(mensaje);
        Scanner scn = new Scanner(System.in);
        return scn.nextLine();
    }
    public void saludar(Personas p1){
        System.out.printf("Hola %s, bienvenido a java\n", p1.getNombre() + " " + p1.getApellidos() );
    }

}