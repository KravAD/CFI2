package habitats;

public class H_Aviario extends habitats{
    private String arboles;
    public H_Aviario(int temperatura, int humedad, boolean limpieza, String arboles){
        super(temperatura, humedad, limpieza);
        this.arboles = arboles;
    }


}
