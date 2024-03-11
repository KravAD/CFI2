package habitats;

public class H_Terrestre extends habitats{
    private static String nombre;

    public H_Terrestre(int temperatura, int humedad, boolean limpieza, String nombre) {
        super(temperatura, humedad, limpieza);
        this.nombre = nombre;
    }
    
}

