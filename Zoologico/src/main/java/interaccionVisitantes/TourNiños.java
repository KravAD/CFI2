package interaccionVisitantes;
import animales.animales;
import habitats.habitats;

public class TourNiños extends tour{
    public TourNiños(habitats habitats, animales animales){
        super(habitats, animales);
    }
    @Override
    public void recorrerTour() {
        super.recorrerTour();
        System.out.println("¡Bienvenido al tour para niños!");
    }
}
