package com.Ercilla;

import java.util.Scanner;

public class Mensaje {
    public String solicitarDatos(String mensaje) {
        System.out.print(mensaje);
        Scanner scn = new Scanner(System.in);
        return scn.nextLine();
    }
}