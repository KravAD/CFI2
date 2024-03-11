package habitats;

public class habitats {
private int temperatura;
private int humedad;
private boolean limpieza;

    public habitats(int temperatura, int humedad, boolean limpieza) {
        this.temperatura = temperatura;
        this.humedad = humedad;
        this.limpieza = limpieza;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public int getHumedad() {
        return humedad;
    }

    public void setHumedad(int humedad) {
        this.humedad = humedad;
    }

    public boolean isLimpieza() {
        return limpieza;
    }

    public void setLimpieza(boolean limpieza) {
        this.limpieza = limpieza;
    }

    public String getInfo() {
        return "Temperatura: " + this.temperatura + " Humedad: " + this.humedad + " Limpieza: " + this.limpieza;
    }
    
}
