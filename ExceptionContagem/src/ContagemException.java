import java.util.Scanner;

public class ContagemException {
    public static void main(String[] args) throws Exception {

        int valor1, valor2;
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        valor1 = scanner.nextInt();

        System.out.println("Digite outro valor: ");
        valor2 = scanner.nextInt();

        try {
            conta(valor1, valor2);
        } catch (Exception e) 
        {
            System.out.println(e.getMessage());
        }
        scanner.close();



    }

    static void conta(int numero1, int numero2)throws Exception
    {
        if (numero2 < numero1)
           { 
            throw new Exception("O segundo numero deve ser maior do que o primeiro ", null); 
           } 

        System.out.println("Contando...");

        for(int i = 1; i<= (numero2-numero1);i++)
        {
            System.out.println(i);
        }
        
    }   
}
