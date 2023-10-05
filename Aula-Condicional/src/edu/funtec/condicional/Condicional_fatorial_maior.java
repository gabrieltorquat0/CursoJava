package edu.funtec.condicional;
public class Condicional_fatorial_maior {
        public static void main (String[] args){

        long fatorial = 1;

        for(int i = 1; i<=20;i++){

            for (int x = i; x>=1;x--){
                fatorial = fatorial * x;
            }

            System.out.println("fatorial de: " + i +
                               " = " + fatorial);
            fatorial = 1;
        }
    }
}
