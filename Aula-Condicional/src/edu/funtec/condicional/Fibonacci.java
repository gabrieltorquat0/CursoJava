package edu.funtec.condicional;
public class Fibonacci {

    public static void main (String[] args){
        int fibonacci = 1;
        int fibonacciAntigo = 0;
        int aux;


        System.out.println(fibonacciAntigo);
        while(fibonacci < 100){
            System.out.println(fibonacci);
            
            aux = fibonacci;
            fibonacci = fibonacci + fibonacciAntigo;
            fibonacciAntigo = aux;
             
        }


    }
    
}
