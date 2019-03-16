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
    
    public static void main(String[] args){
        // Definiendo variables
        String nombreVariable;
        String soyTexto1,soyTexto2,soyTexto3;
        int soyEntero1,soyEntero2;
        
        // Definiendo una variable con un valor predeterminado
        int soyUnNumeroEntero=2019;
        String soyUnTexto="Hola y bienvenidos a POO 2019";
        char soyUnCaracter='d';
        double soyUnNumeroDecimal=45.3;
        String soyString1,soyString2,soyString3="inicializando";
        
        //Operaciones aritmeticas
        int sumaTotal=4+2;
        sumaTotal=soyUnNumeroEntero+10;
                
        sumaTotal=sumaTotal+soyUnNumeroEntero;
        
        int restaTotal=sumaTotal-2019;        
        int multiplicacionTotal=restaTotal*2;        
        int divisionTotal=multiplicacionTotal/2;
        
        int divisionPorCero=100/0;
        
        
        //sout y tabular
        System.out.println(sumaTotal);
        
    }
    
}
