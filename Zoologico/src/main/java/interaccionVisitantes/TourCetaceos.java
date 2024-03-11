package interaccionVisitantes;
import animales.animales;
import habitats.habitats;

public class TourCetaceos extends tour{
    public TourCetaceos(habitats habitats, animales animales){
        super(habitats, animales);
    }
    @Override
    public void recorrerTour() {
        super.recorrerTour();
        System.out.println("¡Bienvenido al tour de los cetaceos!");
    }
}
