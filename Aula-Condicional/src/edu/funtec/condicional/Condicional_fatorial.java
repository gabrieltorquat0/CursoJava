package edu.funtec.condicional;
public class Condicional_fatorial {

    public static void main (String[] args){

        int fatorial = 1;

        for(int i = 1; i<=10;i++){

            for (int x = i; x>=1;x--){
                fatorial = fatorial * x;
            }

            System.out.println("fatorial de: " + i +
                               " = " + fatorial);
            fatorial = 1;
        }
    }
    
}
