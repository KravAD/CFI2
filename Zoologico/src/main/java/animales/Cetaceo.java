package animales;

public class Cetaceo extends animales {
private Boolean emerger;
    public Cetaceo(String nombre, String alimento, int salud,String aleta) {
        super(nombre, nombre, salud);
        this.emerger = emerger;
    }

    public Boolean getEmerger() {
        return emerger;
    }

    public void setEmerger(Boolean emerger) {
        this.emerger = emerger;
    }
}


