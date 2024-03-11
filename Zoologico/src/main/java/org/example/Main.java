package org.example;

import habitats.H_Acuatico;
import habitats.H_Aviario;
import habitats.H_Terrestre;

import static habitats.H_Terrestre.monitorear;

public class Main {
    public static void main(String[] args) {

        H_Terrestre selva = new H_Terrestre(28, 70, true, "Selva");
        H_Acuatico acuario = new H_Acuatico(3, 80, true, "Acuario");
        H_Aviario jaula = new H_Aviario(20, 60, false, "Jaula");

        H_Terrestre.monitorear(selva);
        selva.analizarCondiciones();


    }
}