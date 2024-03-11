package MantenimientoSeguridad;
import java.util.Date;


public class Cuidar {
    private String nombre;
    private String descripcion;
    private Date fechaInicio;
    private String estado;

    public Cuidar(String nombre, String descripcion, Date fechaInicio, String estado) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
        this.estado = estado;
    }
    
}
