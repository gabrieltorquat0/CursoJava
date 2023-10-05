package ContaCorrenteSemTerminal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;

public class ContaCorrente {
    
    private String titular;
    private int numero;
    private String agencia;
    private double saldo;
    private String dataAbertura;

    public ContaCorrente(String titular, int numero, String agencia, double saldo) {
        this.titular = titular;
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");  
        LocalDateTime now = LocalDateTime.now();  

        this.dataAbertura = (String)(dtf.format(now));

        JOptionPane.showMessageDialog(null, "Nome: " + this.titular + "\nAgencia e Numero: " + this.agencia + " " + this.numero + "\nData de abertura: " + this.dataAbertura + "\nSaldo atual: " + this.saldo);

    }

    public void sacar(double valor)
    {
        if (saldo < valor) 
        {
            JOptionPane.showMessageDialog(null,"Saldo insuficiente para realizar saque. \nSaldo atual: R$" + this.saldo);
        }
        else if(valor <= 0)
        {
            JOptionPane.showMessageDialog(null, "Não é possível sacar um valor igual a 0 ou negativo");
        }
        else
        {
            this.saldo = this.saldo - valor;
            JOptionPane.showMessageDialog(null,"Saque realizado com sucesso. \nNovo saldo: R$" + this.saldo);
        }
    }

    public void depositar(double valor)
    {
        if (valor <= 0) 
        {
            JOptionPane.showMessageDialog(null,"Não é possivel depositar um valor igual ou menor a zero.");
        }
        else
        {   
            this.saldo = this.saldo + valor;
            JOptionPane.showMessageDialog(null,"Valor depositado com sucesso, \nNovo saldo: R$" + this.saldo);
        }

    }

    public double calcularRendimento(){
        return this.saldo * 0.10;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getDataAbertura() {
        return dataAbertura;
    }


}
