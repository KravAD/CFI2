package administrarRecursos;
import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private List<Alimento> alimentos;
    private List<Medicina> medicinas;
    private List<Equipamiento> equipamientos;

    public Inventario() {
        this.alimentos = new ArrayList<>();
        this.medicinas = new ArrayList<>();
        this.equipamientos = new ArrayList<>();
    }

    
}
