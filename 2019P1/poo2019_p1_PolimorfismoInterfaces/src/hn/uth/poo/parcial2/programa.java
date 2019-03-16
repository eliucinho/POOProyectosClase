/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.poo.parcial2;

import hn.uth.poo.parcial2.Objetos.Kirby;
import hn.uth.poo.parcial2.interfaces.Acuatico;
import hn.uth.poo.parcial2.interfaces.Volador;

/**
 *
 * @author uth
 */
public class programa {
    public static void main(String [] args){
        System.out.println("hola mundo");
        Kirby personaje1=new Kirby("p1", 7);
        
        personaje1.volar();
        
        Volador ovni=personaje1;
        
        ovni.lanzarBomba();
        
        Acuatico acua=personaje1;
        
        acua.hidroBomba();
        
        Kirby darkK=new Kirby("pablito", 10);
        
        Acuatico acua2=darkK;
        
        acua2.hidroBomba();
    }
}
