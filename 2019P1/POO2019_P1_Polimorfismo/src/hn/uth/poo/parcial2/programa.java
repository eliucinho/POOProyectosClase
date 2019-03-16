/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.poo.parcial2;

import hn.uth.poo.parcial2.objetos.Producto;
import hn.uth.poo.parcial2.objetos.Tele;
import hn.uth.poo.parcial2.objetos.Telefono;
import java.util.ArrayList;
import java.util.List;

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
        //haciendo la instancia de la clase
        Tele tvNueva=new Tele(20, 4,"smart", "sony", 1000);
        
        System.out.println("Precio Tele: "+tvNueva.getPrecioFinal());
        
        Telefono celNuevo=new Telefono("android", 12, "Samsung", "s10", 2000);
        
       System.out.println("Precio Telefono: "+celNuevo.getPrecioFinal());
       
       List<Producto> listaProductos=new ArrayList<>();
       
       listaProductos.add(tvNueva);
       listaProductos.add(celNuevo);
       
        for (Producto variableTmp : listaProductos) {
            System.out.print("Producto: "+variableTmp.getNombre());
            System.out.println(" Precio Final: "+variableTmp.getPrecioFinal());
        }
       
       
    }
    
}
