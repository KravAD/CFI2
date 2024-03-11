package MantenimientoSeguridad;
import java.util.Date;

public class RepararUrgente extends Cuidar{
    private String priorridad;

    public RepararUrgente(String nombre, String descripcion, Date fechaInicio, String estado, String priorridad) {
        super(nombre, descripcion, fechaInicio, estado);
        this.priorridad = priorridad;
    }
}
