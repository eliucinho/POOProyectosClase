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
public class Instrumento extends Producto{
    private String tipoInstrumento;
    private double peso;

    public Instrumento(String id, 
            String nombre, 
            String color, 
            double precio, 
            String marca,
            String tipoInstrumento,
            double peso
    ) {
        //LLamando el constructor de productos con la palabra reservada SUPER
        super(id, nombre, color, precio, marca);
        this.tipoInstrumento=tipoInstrumento;
        this.peso=peso;
    }
    
    
}

    
    

