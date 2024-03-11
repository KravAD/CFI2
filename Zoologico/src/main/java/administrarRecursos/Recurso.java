package administrarRecursos;

public class Recurso {
    private String nombre;
    private int cantidad;
    private String descripcion;

    public Recurso(String nombre, int cantidad, String descripcion) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.descripcion = descripcion;
    }
}
