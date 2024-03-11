package MantenimientoSeguridad;
import java.util.ArrayList;
import java.util.List;

public class registroTarea {
    private List<Mantenimiento> tareasMantenimiento;
    private List<RepararUrgente> tareasReparacionUrgente;


    public registroTarea() {
        this.tareasMantenimiento = new ArrayList<>();
        this.tareasReparacionUrgente = new ArrayList<>();
    }
    public void agregarTareaMantenimiento(Mantenimiento mantenimiento) {
        this.tareasMantenimiento.add(mantenimiento);
    }

    public void agregarTareaReparacionUrgente(RepararUrgente reparacionUrgente) {
        this.tareasReparacionUrgente.add(reparacionUrgente);
    }
}
