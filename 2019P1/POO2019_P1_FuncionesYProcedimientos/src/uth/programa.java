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
    /*
    Funcion: es metodo que retorna un tipo de dato
    Procedimiento: es igual que una funcion pero no retorna ningun valor
    */
    
    /*===========================================
        PROCEDIMIENTOS
    ===========================================*/
    //Ejemplo de una procedimiento sin parametros
    public static void imprimirSaludo(){
        System.out.println("Hola UTH");
    }
    
    //Ejemplo de procedimiento con parametro
    public static void imprimirSaludoA(String nombrePersonaParametro){
        System.out.print("Hola ");
        System.out.println(nombrePersonaParametro);
    }
    
    //Ejemplo de procedimiento con mas parametros
    //sobrecarga de procedimiento
    public static void imprimirSaludoA(
             String nombrePersonaParametro
            ,String saludoPersonalizado){
        System.out.print(saludoPersonalizado);
        System.out.println(nombrePersonaParametro);
    }
    
    //Ejemplo con parametros de tipo int
    public static void imprimirSuma(int valorA, int valorB){
        int suma=valorA+valorB;
        
        System.out.println(suma);
    }
    /*===========================================
        FUNCIONES
    ===========================================*/
    public static String concatenar(String valorA, String valorB){
        String valorConcatenado=valorA+" "+valorB;
        
        return valorConcatenado;
    }
    /*===========================================
        METODO PRINCIPAL: Ejecuta todo
    ===========================================*/
    public static void main(String [] args){
        //invocando un procedimiento
        imprimirSaludo();
        
        //Ejemplo de envio de parametro
        imprimirSaludoA("Manuel");        
        
        //Ejemplo de envio de paramtros
        imprimirSaludoA("Manuel","Gusto en verte ");
        imprimirSaludoA("Julian","Gusto en verte ");
        imprimirSaludoA("Marina","Gusto en verte ");
        
        //Utilizando un procedimiento que suma enteros
        imprimirSuma(20, 25);
        
        //NOTA: las funciones deben ser asignadas para ser utilizadas
        String valorConcatenadoDelMain=concatenar("Programacion", "Orientada a Objetos");
        System.out.println(valorConcatenadoDelMain);
        
        //Funcion utilizada como parametro
        System.out.println(concatenar("Soy funcion","mediante parametro"));
    }
}
