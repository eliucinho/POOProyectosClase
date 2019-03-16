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
public class Herramienta {
    private int id;
    private String nombre;
    private String descripcion;
    private double precio;
    
    public Herramienta(
            int id,
            String nombre,
            String descripcion,
            double precio
    ){
        this.id=id;
        this.nombre=nombre;
        this.descripcion=descripcion;
        this.precio=precio;        
    }
    
    public void setPrecio(double precio){
        this.precio=precio;
    }
    public void setDescripcion(String descripcion){
        this.descripcion=descripcion;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setId(int id){
        this.id=id;
    }
    
    public int getId(){
        return this.id;
    }
    public String getNombre(){
        return this.nombre;
    }
    public String getDescripcion(){
        return this.descripcion;
    }
    public double getPrecio(){
        return this.precio;
    }
    
    public String toString(){
        String texto="Herramienta[%s,%s,%s,%s]";
        return String.format(texto, this.id,this.nombre,this.descripcion,this.precio);
    }
}
