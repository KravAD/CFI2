package MantenimientoSeguridad;
import java.util.Date;

public class RepararUrgente extends Tarea{
    private String priorridad;

    public RepararUrgente(String nombre, String descripcion, Date fechaInicio, String estado, String priorridad) {
        super(nombre, descripcion, fechaInicio, estado);
        this.priorridad = priorridad;
    }

    public String getPriorridad() {
        return priorridad;
    }

    public void setPriorridad(String priorridad) {
        this.priorridad = priorridad;
    }
}
