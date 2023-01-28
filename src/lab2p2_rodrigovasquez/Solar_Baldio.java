package lab2p2_rodrigovasquez;

public class Solar_Baldio {
    private int ancho;
    private int largo;
    private int area;
    private String owner;

    public Solar_Baldio(int ancho, int largo, int area, String owner) {
        this.ancho = ancho;
        this.largo = largo;
        this.area = area;
        this.owner = owner;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Solar Baldio[" + " Ancho: " + ancho + " Largo: " + largo + " Area: " + area + " Owner: " + owner + " ]";
    }
    
    
    
}
