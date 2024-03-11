package animales;

public class Mamifero extends animales{
    private String pelo;

    public Mamifero(String nombre, String alimento, int salud,String pelo) {
        super(nombre, nombre, salud);
        this.pelo = pelo;
    }

    public String getPelo() {
        return pelo;
    }

    public void setPelo(String pelo) {
        this.pelo = pelo;
    }
}
