package habitats;

public class H_Acuatico extends habitats{
    private int volumen;
    public H_Acuatico(int temperatura, int humedad, boolean limpieza, int volumen) {
        super(temperatura, humedad, limpieza);
        this.volumen = volumen;}

}
