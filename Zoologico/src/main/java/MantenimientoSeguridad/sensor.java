package MantenimientoSeguridad;

public class sensor extends ElementoSeguridad{
    private String sensibilidad;

    public sensor(String lugar, String sensibilidad) {
        super(lugar);
        this.sensibilidad = sensibilidad;
    }
}
