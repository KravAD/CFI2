package org.example;

import habitats.H_Acuatico;
import habitats.H_Aviario;
import habitats.H_Terrestre;

public class Main {
    public static void main(String[] args) {

        H_Terrestre selva = new H_Terrestre(28, 70, true);
        H_Acuatico acuario = new H_Acuatico(3, 80, true, "Acuario");
        H_Aviario jaula = new H_Aviario(20, 60, false, "Jaula");


    }
}