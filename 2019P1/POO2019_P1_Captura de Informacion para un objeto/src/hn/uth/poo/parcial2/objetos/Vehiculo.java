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
public class Vehiculo {
    private String  placa;
    private String color;
    private int anio;
    private String marca;
    private String modelo;
    private double costo;

    public Vehiculo(String placa, String color, int anio, String marca, String modelo, double costo) {
        this.placa = placa;
        this.color = color;
        this.anio = anio;
        this.marca = marca;
        this.modelo = modelo;
        this.costo = costo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "placa=" + placa + ", color=" + color + ", anio=" + anio + ", marca=" + marca + ", modelo=" + modelo + ", costo=" + costo + '}';
    }
    
}
