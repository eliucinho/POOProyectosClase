/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.poo.parcial2.objetos;

import java.util.List;

/**
 *
 * @author uth
 */
public class Pokemon {
    private int id;
    private String nombre;
    private String color;
    private int tamanio;    
    private List<Poder> poderes;    
    private List<Tipo> debilidades;    
    private Tipo tipos;
    private Pokemon evolucion;
    private int nivelEvolucion;
    private int nivelActual;

    public Pokemon(int id, String nombre, String color, int tamanio, List<Poder> poderes, List<Tipo> debilidades, Tipo tipos, Pokemon evolucion, int nivelEvolucion, int nivelActual) {
        this.id = id;
        this.nombre = nombre;
        this.color = color;
        this.tamanio = tamanio;
        this.poderes = poderes;
        this.debilidades = debilidades;
        this.tipos = tipos;
        this.evolucion = evolucion;
        this.nivelEvolucion = nivelEvolucion;
        this.nivelActual = nivelActual;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public List<Poder> getPoderes() {
        return poderes;
    }

    public void setPoderes(List<Poder> poderes) {
        this.poderes = poderes;
    }

    public List<Tipo> getDebilidades() {
        return debilidades;
    }

    public void setDebilidades(List<Tipo> debilidades) {
        this.debilidades = debilidades;
    }

    public Tipo getTipos() {
        return tipos;
    }

    public void setTipos(Tipo tipos) {
        this.tipos = tipos;
    }

    public Pokemon getEvolucion() {
        return evolucion;
    }

    public void setEvolucion(Pokemon evolucion) {
        this.evolucion = evolucion;
    }

    public int getNivelEvolucion() {
        return nivelEvolucion;
    }

    public void setNivelEvolucion(int nivelEvolucion) {
        this.nivelEvolucion = nivelEvolucion;
    }

    public int getNivelActual() {
        return nivelActual;
    }

    public void setNivelActual(int nivelActual) {
        this.nivelActual = nivelActual;
    }

    @Override
    public String toString() {
        return "Pokemon{" + "id=" + id + ", nombre=" + nombre + ", color=" + color + ", tamanio=" + tamanio + ", poderes=" + poderes + ", debilidades=" + debilidades + ", tipos=" + tipos + ", evolucion=" + evolucion + ", nivelEvolucion=" + nivelEvolucion + ", nivelActual=" + nivelActual + '}';
    }
    
    
}
