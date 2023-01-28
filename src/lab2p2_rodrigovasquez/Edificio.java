package lab2p2_rodrigovasquez;

public class Edificio {
    private int pisos;
    private int locales;
    private String direccion;
    private String estado;
    private String owner;

    public Edificio(int pisos, int locales, String direccion, String estado, String owner) {
        this.pisos = pisos;
        this.locales = locales;
        this.direccion = direccion;
        this.estado = estado;
        this.owner = owner;
    }

    public int getPisos() {
        return pisos;
    }

    public void setPisos(int pisos) {
        this.pisos = pisos;
    }

    public int getLocales() {
        return locales;
    }

    public void setLocales(int locales) {
        this.locales = locales;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Edificio[" + " Numero de Pisos:" + pisos + " Numero de Locales: " + locales + " Direccion: " + direccion + " Estado: " + estado + " Dueño: " + owner + " ]";
    }
    
    
    
}
