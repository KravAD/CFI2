package habitats;

public class H_Terrestre extends habitats{
    private static String nombre;

    public H_Terrestre(int temperatura, int humedad, boolean limpieza, String nombre) {
        super(temperatura, humedad, limpieza);
        this.nombre = nombre;
    }

    public static void monitorear(H_Terrestre selva) {
        System.out.println("Monitoreando hábitat: " + nombre);
    }

    public void analizarCondiciones() {
        System.out.println("Analizando condiciones del hábitat terrestre: " + nombre);
        if (getTemperatura() > 25 && getHumedad() > 60 && isLimpieza()) {
            System.out.println("Condiciones óptimas para el hábitat terrestre: " + nombre);
        } else {
            System.out.println("Condiciones no óptimas para el hábitat terrestre: " + nombre);
        }

    }



}

