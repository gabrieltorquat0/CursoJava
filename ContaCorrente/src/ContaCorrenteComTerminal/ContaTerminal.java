package ContaCorrenteComTerminal;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.ENGLISH);
        
        //Instanciando a classe para armazenar as informações digitadas
        ContaBanco conta = new ContaBanco();

        //A sequencia de souts e scanners para receber e atribuir os valores digitados para suas respectivas variaveis no objeto instanciado
        //Utilizando os métodos sets
        System.out.println("Digite o seu nome por favor: ");
        conta.setNomeCliente(scanner.nextLine());

        System.out.println("Agora digite a agência: ");
        conta.setAgencia(scanner.nextLine());
        
        System.out.println("Digite o numero da conta: ");
        conta.setNumero(scanner.nextInt());

        System.out.println("Digite o saldo da conta: ");
        conta.setSaldo(scanner.nextDouble());

        scanner.close();

        System.out.println("Olá " + conta.getNomeCliente() + ", obrigado por criar uma conta em nosso banco, sua agência é " + conta.getAgencia() + ", conta " + conta.getNumero() + "\nE seu saldo: R$" + conta.getSaldo() + " já disponível para saque.");

        

    }

}
