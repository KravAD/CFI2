package animales;

public class Pajaro extends animales{
    private String plumaje;

    public Pajaro(String nombre, String alimento, int salud,String plumaje) {
        super(nombre, nombre, salud);
        this.plumaje = plumaje;
    }

    public String getPlumaje() {
        return plumaje;
    }

    public void setPlumaje(String plumaje) {
        this.plumaje = plumaje;
    }
}
