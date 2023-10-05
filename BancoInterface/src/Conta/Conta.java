package Conta;

public abstract class Conta implements IConta{
	
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;
	
	private int agencia;
	private int numero;
	private double saldo;
	
	public Conta() {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.saldo = 0;
	}
	
	protected void imprimirInformações() 
	{
		System.out.println("Numero: " + this.numero);
		System.out.println("Agencia: " + this.agencia);
		System.out.println("Saldo: R$" + this.saldo + "\n");
	}

	@Override
	public void sacar(double valor) {
		
		if (saldo < valor) 
			{
				System.out.println("Saldo insuficiente para realizar saque. \nSaldo atual: R$" + this.saldo);
			}
		else 
			{
				this.saldo -= valor;
				System.out.println("Saque realizado com sucesso!");
				
			}
		
		
		
	}
	
	@Override
	public void depositar(double valor) {
		this.saldo += valor;
		System.out.println("Depósito realizado com sucesso!");
		
	}
	
	@Override
	public void transferir(double valor, Conta contaDestino) 
	{
		
		if (valor > this.saldo)
			
			{	
				System.out.println("Saldo insuficiente para transferência.");
			}
		else 
			{
				try 
				{
					this.sacar(valor);
					contaDestino.depositar(valor);
					System.out.println("Transferencia realizada com sucesso!");
				}
				catch (Exception e)
				{
					System.out.println("Erro, " + e.getMessage());
				}
			}
		
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	
	
}
