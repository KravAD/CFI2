package habitats;

public class H_Acuatico extends habitats{
    private int volumen;
    public H_Acuatico(int temperatura, int humedad, boolean limpieza, int volumen) {
        super(temperatura, humedad, limpieza);
        this.volumen = volumen;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }
}
