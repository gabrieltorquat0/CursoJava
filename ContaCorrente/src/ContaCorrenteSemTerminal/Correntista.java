package ContaCorrenteSemTerminal;
import java.util.Locale;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Correntista {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.ENGLISH);

        //Criando variaveis para armazenar o conteudo digitado para o metodo construtor
        String nome;
        int numeroConta;
        String agencia;
        double saldo;

        System.out.println("Digite o seu nome por favor: ");
        nome = scanner.nextLine();

        System.out.println("Digite a agencia: ");
        agencia = scanner.nextLine();

        System.out.println("Digite o numero da conta");
        numeroConta = scanner.nextInt();

        System.out.println("Digite o saldo da conta: ");
        saldo = scanner.nextDouble();

        ContaCorrente conta = new  ContaCorrente(nome, numeroConta, agencia, saldo);



        conta.depositar(1500);
        conta.sacar(10000);
        conta.sacar(1000);
        JOptionPane.showMessageDialog(null, "Rendimento neste mes: \nSaldo atual: R$" + conta.getSaldo() + " Redimento: R$" + conta.calcularRendimento());
        conta.sacar(-100);
        conta.depositar(-500);

        scanner.close();
    }
    
}
