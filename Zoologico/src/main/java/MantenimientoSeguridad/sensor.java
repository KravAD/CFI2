package MantenimientoSeguridad;

public class sensor extends ElementoSeguridad{
    private int sensibilidad;

    public sensor(String lugar, int sensibilidad) {
        super(lugar);
        this.sensibilidad = sensibilidad;
    }

    public int getSensibilidad() {
        return sensibilidad;
    }

    public void setSensibilidad(int sensibilidad) {
        this.sensibilidad = sensibilidad;
    }
}
