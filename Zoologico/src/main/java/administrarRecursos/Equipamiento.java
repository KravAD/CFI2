package administrarRecursos;

public class Equipamiento extends Recurso{
    private String tipo;
    public Equipamiento(String nombre, int cantidad, String descripcion, String tipo) {
        super(nombre, cantidad, descripcion);
        this.tipo = tipo;
    }
}
