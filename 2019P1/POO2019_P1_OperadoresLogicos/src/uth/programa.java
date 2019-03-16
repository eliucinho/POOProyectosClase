/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uth;

import java.util.Scanner;

/**
 *
 * @author uth
 */
public class programa {

    //Procedimiento que indica cual de los dos valores es mayor
    public static void evaluar(int valorA, int valorB) {
        if (valorA == valorB) {
            System.out.println("Ambos numeros son iguales");
        } else if (valorA < valorB) {
            System.out.println("el valor A es menor que el valor B");
        } else {
            System.out.println("el valor A es mayor que el valor B");
        }
    }

    public static void programaEvaluador(int numeroPreguntas) {
        for (int i = 0; //Una variable contadora inicializada en un valor 
                i < numeroPreguntas; //Es una condicion que cierra las repeticiones
                i = i + 1 //Es una instuccion que permite alcanzar la condicion de salida
                ) {
            int valorA;
            int valorB;
            //Declaracion del lector de información
            Scanner scan = new Scanner(System.in);

            System.out.println("Ingrese Valor A: ");
            valorA = scan.nextInt();

            System.out.println("Ingrese Valor B: ");
            valorB = scan.nextInt();

            evaluar(valorA, valorB);
        }

    }

    public static void main(String[] args) {
        int valorA = 4;
        int valorB = 5;

        /*====================================
            Operadores logicos con estructuras IF
        ====================================*/
        //if simple
        if (valorA > valorB) {
            System.out.println("El valor A es mayor que el valor B");
        }

        //utilizando el procedimiento de ecvaluación
        evaluar(valorA, valorB);

        /*====================================
            Lectura de información
        ====================================*/
        //Declaracion del lector de información
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese Valor A: ");
        valorA = scan.nextInt();

        System.out.println("Ingrese Valor B: ");
        valorB = scan.nextInt();

        evaluar(valorA, valorB);
        /*====================================
            Estructura repetitivas con FOR
        ====================================*/
        //estructura FOR
        for (int i = 0; //Una variable contadora inicializada en un valor 
                i < 10; //Es una condicion que cierra las repeticiones
                i = i + 1 //Es una instuccion que permite alcanzar la condicion de salida
                ) {
            String instruccion = "i: " + i;
            System.out.println(instruccion);
            //Es igual al bloque de arriba
            //System.out.println("i: "+i);
        }

        for (int i = 10; //Una variable contadora inicializada en un valor 
                i > 0; //Es una condicion que cierra las repeticiones
                i = i - 1 //Es una instuccion que permite alcanzar la condicion de salida
                ) {
            String instruccion = "i: " + i;
            System.out.println(instruccion);
            //Es igual al bloque de arriba
            //System.out.println("i: "+i);
        }
        
        System.out.println("Cuantas evaluaciones desea hacer?");
        int numeroPreguntas=scan.nextInt();
        
        programaEvaluador(numeroPreguntas);
    }

}
