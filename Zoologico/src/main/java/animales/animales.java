package animales;

abstract class animales {
    private String nombre;
    private String alimento;
    private int salud;

    public animales(String nombre, String alimento, int salud) {
        this.nombre = nombre;
        this.alimento = alimento;
        this.salud = salud;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }
}

