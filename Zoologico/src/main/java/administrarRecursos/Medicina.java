package administrarRecursos;

public class Medicina extends Recurso{
    private String uso;
    public Medicina(String nombre, int cantidad, String descripcion,String uso) {
        super(nombre, cantidad, descripcion);
        this.uso = uso;
    }

    public String getUso() {
        return uso;
    }

    public void setUso(String uso) {
        this.uso = uso;
    }
}
