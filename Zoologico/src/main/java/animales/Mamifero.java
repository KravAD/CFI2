package animales;

public class Mamifero extends animales{
    private String pelo;

    public Mamifero(String nombre, String alimento, int salud,String pelo) {
        super(nombre, nombre, salud);
        this.pelo = pelo;
    }
}
