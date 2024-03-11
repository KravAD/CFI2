package habitats;

public class H_Terrestre extends habitats{
    private static int rocas;

    public H_Terrestre(int temperatura, int humedad, boolean limpieza, int rocas) {
        super(temperatura, humedad, limpieza);
        this.rocas = rocas;
    }

    public static int getRocas() {
        return rocas;
    }

    public static void setRocas(int rocas) {
        H_Terrestre.rocas = rocas;
    }
}

