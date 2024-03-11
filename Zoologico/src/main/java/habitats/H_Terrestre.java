package habitats;

public class H_Terrestre extends habitats{
    private static String rocas;

    public H_Terrestre(int temperatura, int humedad, boolean limpieza, String rocas) {
        super(temperatura, humedad, limpieza);
        this.rocas = rocas;
    }

}

