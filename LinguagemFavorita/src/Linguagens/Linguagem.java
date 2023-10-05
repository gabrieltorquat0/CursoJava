package Linguagens;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class Linguagem implements Comparator<Linguagem>{
	
	private Set<String> nome = new HashSet<String>();
	private Set<String> anoDeCriacao = new HashSet<String>();
	private Set<String> ide = new HashSet<String>();
	
	public Linguagem(String nome, String anoDeCriacao, String ide) {
		super();
		this.nome.add(nome);
		this.anoDeCriacao.add(anoDeCriacao);
		this.ide.add(ide);
	}

	public Set<String> getNome() {
		return nome;
	}

	public void setNome(Set<String> nome) {
		this.nome = nome;
	}

	public Set<String> getAnoDeCriacao() {
		return anoDeCriacao;
	}

	public void setAnoDeCriacao(Set<String> anoDeCriacao) {
		this.anoDeCriacao = anoDeCriacao;
	}

	public Set<String> getIde() {
		return ide;
	}

	public void setIde(Set<String> ide) {
		this.ide = ide;
	}

	@Override
	public int compare(Linguagem o1, Linguagem o2) {
		
		int nameCompare = o1.getNome().toString().compareTo(o2.getNome().toString());
		
		if (nameCompare != 0)
		{
			return nameCompare;
		}
		
		return 0;
	}
	
	
	

	
	
	
	

}
