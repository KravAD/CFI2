package administrarRecursos;

public class Alimento extends Recurso{
    private String tipo;
    public Alimento(String nombre, int cantidad, String descripcion,String tipo) {
        super(nombre, cantidad, descripcion);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
