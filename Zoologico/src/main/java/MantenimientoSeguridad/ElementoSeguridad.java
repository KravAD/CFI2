package MantenimientoSeguridad;

public class ElementoSeguridad {
    private String lugar;
    private boolean estado;

    public ElementoSeguridad(String lugar) {
        this.lugar = lugar;
        this.estado = true;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
