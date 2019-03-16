/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uth;

import objetos.Instrumento;
import objetos.Producto;

/**
 *
 * @author uth
 */
public class programa {
    public static void main
        (String [] args){
        System.out.println("hola mundo");
        
        Producto camisaPolo=new Producto("C001","Camisa Polo de Hombre ","rojo",200,"t");
        
        System.out.println(camisaPolo);
        
        Instrumento guitarra=new Instrumento("002", "paul", "negro", 1000, "fender", "electrico", 2.2);
        
        System.out.println(guitarra);
    }
}
