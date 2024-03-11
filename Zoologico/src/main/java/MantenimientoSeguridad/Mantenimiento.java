package MantenimientoSeguridad;
import java.util.Date;

public class Mantenimiento extends Cuidar{
    private String constancia;
    public Mantenimiento(String nombre, String descripcion,Date fechaInicio, String estado, String constancia) {
        super(nombre, descripcion,fechaInicio, estado);
        this.constancia = constancia;
    }

    public String getConstancia() {
        return constancia;
    }

    public void setConstancia(String constancia) {
        this.constancia = constancia;
    }
}
