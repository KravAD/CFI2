package MantenimientoSeguridad;

public class camara extends ElementoSeguridad{
    private String calidad;

    public camara(String lugar, String calidad) {
        super(lugar);
        this.calidad = calidad;
    }

    public String getCalidad() {
        return calidad;
    }

    public void setCalidad(String calidad) {
        this.calidad = calidad;
    }
}
