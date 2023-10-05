package Modalidades;

public enum ModalidadeEnum {

	Futebol("1"),
	Ginastica("2"),
	Natacao("3"),
	Atletismo("4");
	
	private String numero;

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	private ModalidadeEnum(String numero) {
		this.numero = numero;
	}
	
	
	
	
}
