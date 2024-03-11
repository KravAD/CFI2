package MantenimientoSeguridad;
import java.util.ArrayList;
import java.util.List;

public class SistemaSeguridad {
    private List<camara> camaras;
    private List<sensor> sensores;

    public SistemaSeguridad() {
        this.camaras = new ArrayList<>();
        this.sensores = new ArrayList<>();
    }
}
