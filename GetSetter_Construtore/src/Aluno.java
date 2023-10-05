
public class Aluno {
	
	public static void main(String[] args) {
		
		Pessoa aluno1 = new Pessoa("Gabriel", "Rua Tal", "1234567");
		
		System.out.println("Nome: " + aluno1.getNome() +
						   "\nEndereco: " + aluno1.getEndereco() + 
						   "\nCPF: " + aluno1.getCpf());
		
		aluno1.setCpf("7654321");
		aluno1.setEndereco("Outro endereco");
		aluno1.setNome("Leirbag");
		
		System.out.println("Nome: " + aluno1.getNome() + 
						   "\nEndereco: " + aluno1.getEndereco() + 
						   "\nCPF: " + aluno1.getCpf());
		
		boolean teste = true;
		
		System.out.println("Teste: " + (teste ? "Sim" : "Não"));
		
		teste = false;
		
		System.out.println("Teste: " + (teste ? "Sim" : "Não"));
		
		aluno1.mostrarEnum();
		
	}

}
