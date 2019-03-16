/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.poo.parcial2.objetos;

/**
 *
 * @author uth
 */
public class Telefono extends Producto{
    private String so;
    private int pixelCamara;
    private String modelo;

    public Telefono(String nombre, double precio) {
        super(nombre, precio);
    }

    public Telefono(String so, int pixelCamara, String modelo, String nombre, double precio) {
        super(nombre, precio);
        this.so = so;
        this.pixelCamara = pixelCamara;
        this.modelo = modelo;
    }

    public String getSo() {
        return so;
    }

    public void setSo(String so) {
        this.so = so;
    }

    public int getPixelCamara() {
        return pixelCamara;
    }

    public void setPixelCamara(int pixelCamara) {
        this.pixelCamara = pixelCamara;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Telefono{"+ "nombre=" + super.getNombre()+ ", precio=" + super.getPrecio() + "so=" + so + ", pixelCamara=" + pixelCamara + ", modelo=" + modelo + '}';
    }
    
    public double getPrecioFinal(){
        return this.pixelCamara*super.getPrecio();
    }
}
