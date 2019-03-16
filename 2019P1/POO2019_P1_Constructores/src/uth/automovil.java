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
    private double velocidad;
    private double distancia;
    private int gasolina;
    
    //Constructores
    public automovil(){
        System.out.println("hola desde el automovil");
    }
    
    public automovil(String placa){
        this.placa=placa;
    }
    
    public automovil(String placa
            , double velocidad
            , double distancia
            , int gasolina){
        this.placa=placa;
        this.velocidad=velocidad;
        this.distancia=distancia;
        this.gasolina=gasolina;
    }
    public String getPlaca(){
        return this.placa;
    }
    public void setPlaca(String placa){
        this.placa=placa;
    }
    public double getVelocidad(){
        return this.velocidad;
    }
    public void setVelocidad(double velocidad){
        this.velocidad=velocidad;
    }
    public double getDistancia(){
        return this.distancia;
    }
    public void setDistancia(double distancia){
        this.distancia=distancia;
    }
    public int getGasolina(){
        return this.gasolina;
    }
    public void setGasolina(int gasolina){
        this.gasolina=gasolina;
    }
    
    public String toString(){
        String texto="automovil[ %s, %s, %s, %s]";
        return 
                String.format(texto, 
                        this.placa, 
                        this.distancia, 
                        this.velocidad, 
                        this.gasolina);
    }
}
