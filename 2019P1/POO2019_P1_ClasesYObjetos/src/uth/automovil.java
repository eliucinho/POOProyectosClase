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
public class automovil {
    private String placa;
    private int distancia;
    private double velocidad;
    private double gasolina;
    
    /*Metodos de Get y Set
    get: siempre retornamos un valor (funcion)
    set: se configura un valor que no necesita un retorno (procedimiento)
    */
    /**********************************+
     METODOS DE ACCESO Y MODIFICACION DE PLACA
     ***********************************/    
    //funcion GET
    public String getPlaca(){
        return this.placa;
    }
    //procedimiento SET
    public void setPlaca(String placa){
        this.placa=placa;
    }
        /**********************************+
     METODOS DE ACCESO Y MODIFICACION DE DISTANCIA
     ***********************************/    
    //funcion GET
    public int getDistancia(){
        return this.distancia;
    }
    //procedimiento SET
    public void setDistancia(int distancia){
        this.distancia=distancia;
    }
    
    /**************************
     SOBREESCRITURA 
     ***************************/
    /**
     * transformar la información de un objeto en texto
     * @return 
     */
    @Override
    /*public String toString(){
        String variableTexto="automovil[%s, %s, %s, %s]";
        return String.format
            (variableTexto, this.placa, this.distancia,this.velocidad,this.gasolina);
    }*/
    public String toString(){
        String variableTexto=
                "automovil["+this.placa+", "+this.distancia+", "+this.velocidad+", "+this.gasolina+"]";
        return variableTexto;                
    }
}
