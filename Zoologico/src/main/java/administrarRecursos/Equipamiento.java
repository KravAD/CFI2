package administrarRecursos;

public class Equipamiento extends Recurso{
    private String tipo;
    public Equipamiento(String nombre, int cantidad, String proveedor, String tipo) {
        super(nombre, cantidad, proveedor);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
