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
public class Tele extends Producto{
    private int tamanioPantalla;
    private int resolucion;
    private String tipo;
    
    public Tele(String nombre, double precio) {
        super(nombre, precio);
    }

    public Tele(int tamanioPantalla, int resolucion, String tipo, String nombre, double precio) {
        super(nombre, precio);
        this.tamanioPantalla = tamanioPantalla;
        this.resolucion = resolucion;
        this.tipo = tipo;
    }

    public int getTamanioPantalla() {
        return tamanioPantalla;
    }

    public void setTamanioPantalla(int tamanioPantalla) {
        this.tamanioPantalla = tamanioPantalla;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Tele{" + "nombre=" + super.getNombre() + ", precio=" + super.getPrecio() +"tamanioPantalla=" + tamanioPantalla + ", resolucion=" + resolucion + ", tipo=" + tipo + '}';
    }
    
    @Override
    public double getPrecioFinal(){
        double impuesto=(this.getPrecio()*0.15);
        double precioFinal=
                impuesto+this.getPrecio()*this.tamanioPantalla;
        return precioFinal;
    }
    
}
