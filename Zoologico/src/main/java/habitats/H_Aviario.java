package habitats;

public class H_Aviario extends habitats{
    private String nombre;
    public H_Aviario(int temperatura, int humedad, boolean limpieza, String nombre) {
        super(temperatura, humedad, limpieza);
        this.nombre = nombre;
    }


}
