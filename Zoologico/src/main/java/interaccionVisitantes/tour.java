package interaccionVisitantes;

import habitats.habitats;
import animales.animales;

public class tour {
    private habitats habitats;
    private animales animales;

    public tour(habitats habitats, animales animales) {
        this.habitats = habitats;
        this.animales = animales;
    }

    public void recorrerTour() {
        System.out.println("Información del hábitat:");
        System.out.println(habitats.getInfo());
        System.out.println("Información del animal:");
        System.out.println(animales.getInfo());

    }

}
