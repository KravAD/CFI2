package habitats;

public class H_Aviario extends habitats{
    private int arboles;
    public H_Aviario(int temperatura, int humedad, boolean limpieza, int arboles){
        super(temperatura, humedad, limpieza);
        this.arboles = arboles;
    }

    public int getArboles() {
        return arboles;
    }

    public void setArboles(int arboles) {
        this.arboles = arboles;
    }
}
