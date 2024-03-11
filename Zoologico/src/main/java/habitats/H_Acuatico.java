package habitats;

public class H_Acuatico extends habitats{
    private String nombre;
    public H_Acuatico(int temperatura, int humedad, boolean limpieza, String nombre) {
        super(temperatura, humedad, limpieza);
        this.nombre = nombre;
    }

}
