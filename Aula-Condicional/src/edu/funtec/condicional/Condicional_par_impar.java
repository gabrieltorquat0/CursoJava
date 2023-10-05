package edu.funtec.condicional;
import java.io.Console;

public class Condicional_par_impar {

    public static void main (String[] args){
        Console console = System.console();

        Integer x = Integer.parseInt(console.readLine("Digite um valor: "));

        System.out.println(x);

        for (int i = x;i!=1;)
        {
            if (i%2==0)
            {
                i = i/2;
                System.out.println(i);

            } else
            {
                i = 3 *i+1;
                System.out.println(i);
            }
        }
    }
    
}
