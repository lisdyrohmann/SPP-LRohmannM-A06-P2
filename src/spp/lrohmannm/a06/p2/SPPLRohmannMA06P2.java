/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.lrohmannm.a06.p2;
import java.util.Scanner;
/**
 *
 * @author lisdyrohmann
 */
public class SPPLRohmannMA06P2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaración de variables
   int numero;
       numero = solicitarDatos();
       Factorial(numero);
    }
    
    public static int solicitarDatos(){
        int numero;
        Scanner Sc = new Scanner(System.in);
        System.out.println("Favor de introducir un valor entre 1 y 10:");
        numero = Sc.nextInt();
        if (numero < 1 || numero > 10){
            System.out.println("Fuera de rango");
            solicitarDatos();  
        } else {
            
        }
        return numero;
    }
    
    public static void Factorial(int numero){
        int contador, fact;
        contador = 1;
        fact = 1;
        do {
            contador++;
            fact = fact*(contador);
        } while (contador < (numero));
        System.out.println("Su factorial es: " + fact);

    }
    
}
