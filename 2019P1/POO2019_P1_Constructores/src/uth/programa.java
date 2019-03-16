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
        automovil celica=new automovil();
        celica.setPlaca("HN002"); 
        
        automovil ranger=new automovil("HN001");
        automovil escape=new automovil("HN003",100,20,40);
        
        System.out.println("placa celica: "+celica.getPlaca());
        System.out.println("placa ranger: "+ranger.getPlaca());
        System.out.println(escape);
        
    }        
}
