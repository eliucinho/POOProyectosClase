/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.poo.parcial2.Objetos;

import hn.uth.poo.parcial2.interfaces.Acuatico;
import hn.uth.poo.parcial2.interfaces.Volador;

/**
 *
 * @author uth
 */
public class Kirby extends Personaje implements Volador,Acuatico{
    
    public Kirby(String nombre, int nivel) {
        super(nombre, nivel);
    }

    @Override
    public void volar() {
        System.out.println("Estoy volando a una velocidad "+super.getNivel());
    }

    @Override
    public boolean estaVolando() {
        return false;
    }

    @Override
    public void lanzarBomba() {
        System.out.println("lanzar bomba a una potencia de "+super.getNivel());
    }

    @Override
    public void nadar() {
        System.out.println("nadando a una velocidad de "+super.getNivel());
    }

    @Override
    public void sumergir() {
        System.out.println("sumergiendo a una profundidad de "+super.getNivel());
    }

    @Override
    public void hidroBomba() {
        System.out.println("lanzando agua a una potencia de "+super.getNivel());
    }
    
}
