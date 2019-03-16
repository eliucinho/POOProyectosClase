/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.poo.parcial2.objetos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author uth
 */
public class Poder {
    private String  nombre;
    private int nivelDanio;
    private int cantidadCarga;
    private List<Tipo> tiposEfectivos;

    public Poder(String nombre, int nivelDanio, int cantidadCarga, List<Tipo> tiposEfectivos) {
        this.nombre = nombre;
        this.nivelDanio = nivelDanio;
        this.cantidadCarga = cantidadCarga;
        this.tiposEfectivos = tiposEfectivos;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivelDanio() {
        return nivelDanio;
    }

    public void setNivelDanio(int nivelDanio) {
        this.nivelDanio = nivelDanio;
    }

    public int getCantidadCarga() {
        return cantidadCarga;
    }

    public void setCantidadCarga(int cantidadCarga) {
        this.cantidadCarga = cantidadCarga;
    }

    public List<Tipo> getTiposEfectivos() {
        return tiposEfectivos;
    }

    public void setTiposEfectivos(List<Tipo> tiposEfectivos) {
        this.tiposEfectivos = tiposEfectivos;
    }

    @Override
    public String toString() {
        return "Poder{" + "nombre=" + nombre + ", nivelDanio=" + nivelDanio + ", cantidadCarga=" + cantidadCarga + ", tiposEfectivos=" + tiposEfectivos + '}';
    }
    
    
    
}
