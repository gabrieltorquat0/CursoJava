
public class ContaPoupança extends Conta{

	@Override
	public void imprimirExtrato() {
		imprimirInformações();
		System.out.println(String.format("Rendimento atual do saldo: %.2f", getSaldo()*0.10));
		
	}

}
