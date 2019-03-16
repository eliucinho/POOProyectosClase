/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

/**
 *
 * @author uth
 */
public class Producto {
    private String id;
    private String nombre;
    private String color;
    private double precio;
    private String marca;
    
    public Producto(
            String id,
            String nombre,
            String color,
            double precio,
            String marca
            ){
        this.id=id;
        this.nombre=nombre;
        this.color=color;
        this.precio=precio;
        this.marca=marca;
    }
            
    //Seccion de GET y SET
    
    public String toString(){
        String texto="Producto[%s,%s,%s,%s,%s]";
        return String.format(texto, this.id,this.nombre,this.color,this.precio,this.marca);
    }
}
