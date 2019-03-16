/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uth;

/**
 *
 * @author uth
 */
public class programa {
    public static void main(String [] args){
        System.out.println("hola mundo");
        
        System.out.println("Creando la instancia de una clase (la clase automovil)");
        automovil honda=new automovil();
        automovil ford=new automovil();
        automovil toyota=new automovil();
        automovil kia=new automovil();
        
        /*
        //Cuando un atributo es publico (en este caso con placa)
        System.out.println("accediendo a los atributos publicos de la clase");
        honda.placa="uth1";
        
        System.out.println("imprimiendo un atributo publico de la clase");
        System.out.println(honda.placa);*/
        
        //Utilizando los metodos GET y SET
        //asignando valor
        ford.setPlaca("UTH1");
        //utilizando el valor
        System.out.println(ford.getPlaca());
        
        System.out.print("Imprimiendo el objeto directamente: ");
        System.out.println(ford);
    }
}
