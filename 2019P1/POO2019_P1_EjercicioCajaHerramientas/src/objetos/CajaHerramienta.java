/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author uth
 */
public class CajaHerramienta {    
    private String nombre;
    private String color;
    private List<Herramienta> contenido;
    
    public CajaHerramienta(
            String nombre,
            String color
    ){
        //Las listas se instancian en el constructor
        contenido=new ArrayList<Herramienta>();
        this.nombre=nombre;
        this.color=color;
    }
    
    public void setColor(String color){
        this.color=color;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    public String getColor(){
        return this.color;
    }
    public String toString(){
        String texto="Herramienta[%s,%s]";
        return String.format(texto, this.nombre,this.color);
    }
    
    public void addHerramienta(Herramienta herramienta){
        contenido.add(herramienta);
    }
    
    public double calcularCostoTotal(){
        double total=0;
        for (Herramienta tmpHerramienta : contenido) {
            total=total+tmpHerramienta.getPrecio();
        }
        return total;
    }
}
