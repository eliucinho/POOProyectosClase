/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uth;

import objetos.CajaHerramienta;
import objetos.Herramienta;

/**
 *
 * @author uth
 */
public class programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CajaHerramienta caja=new CajaHerramienta("madera", "roja");
        
        caja.addHerramienta(new Herramienta(1,"martillo", "para martillar", 10));
        caja.addHerramienta(new Herramienta(2,"clavo", "unir partes", 2));
        
        System.out.println(caja.calcularCostoTotal());
        
        /*Falta crear un formulacio que ingrese estos valores 
                al objeto*/
    }
    
}
