package lab2p2_rodrigovasquez;

import java.awt.Color;

public class Casa {
    private int numCasa;
    private int numBloque;
    private Color color;
    private int ancho;
    private int largo;
    private int baths;
    private int cuartos;
    private String estado;
    private String owner;

    public Casa(int numCasa, int numBloque, Color color, int ancho, int largo, int baths, int cuartos, String estado, String owner) {
        this.numCasa = numCasa;
        this.numBloque = numBloque;
        this.color = color;
        this.ancho = ancho;
        this.largo = largo;
        this.baths = baths;
        this.cuartos = cuartos;
        this.estado = estado;
        this.owner = owner;
    }

    public int getNumCasa() {
        return numCasa;
    }

    public void setNumCasa(int numCasa) {
        this.numCasa = numCasa;
    }

    public int getNumBloque() {
        return numBloque;
    }

    public void setNumBloque(int numBloque) {
        this.numBloque = numBloque;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
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

    public int getBaths() {
        return baths;
    }

    public void setBaths(int baths) {
        this.baths = baths;
    }

    public int getCuartos() {
        return cuartos;
    }

    public void setCuartos(int cuartos) {
        this.cuartos = cuartos;
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
        return "Casa[" + " Numero de Casa: " + numCasa + " Numero de Bloque: " + numBloque + " Color: " + color + " Ancho: " + ancho + " Largo: " + largo + " Baños: " + baths + " Cuartos: " + cuartos + " Estado: " + estado + " Dueño: " + owner + " ]";
    }
    
    
    
}
