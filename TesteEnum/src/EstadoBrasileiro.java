
public enum EstadoBrasileiro {
	
	SAO_PAULO("SP","São Paulo","35"),
	RIO_JANEIRO("RJ","Rio de Janeiro","33"),
	PIAUI("PI","Piaui","22"),
	MARANHAO("MA","Maranhão", "21");
	
	private String sigla;
	private String nome;
	private String numero;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	private EstadoBrasileiro(String sigla, String nome, String numero) {
		this.sigla = sigla;
		this.nome = nome;
		this.numero = numero;
	}
	
	
	

}
