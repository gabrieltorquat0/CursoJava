
public class Teste {
	
	
	
	public static void main(String[] args) {
		
		EstadoBrasileiro maranhao = EstadoBrasileiro.MARANHAO;
		
		System.out.println("sigla " + maranhao.getSigla());
		
		for (EstadoBrasileiro uf : EstadoBrasileiro.values()) {
			System.out.println(uf + " Sigla: " + uf.getSigla() + " Nome: " + uf.getNome() + " Numero: " + uf.getNumero() + "\n");
		}
		
	}

}
