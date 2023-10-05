package Concessionaria;

public enum ConcessionariaEnum {

	Chevrolet_Cobalt("4","Sedan","563", "1"),
	Mitsubishi_Eclipse_Cross("4","SUV","561", "2"),
	Mercedes_Sprinter_415("3","VAN","1300", "3"),
	Ford_EcoSport_2021("4","EcoSport","362", "4");
	
	private String portas;
	private String tipo;
	private String litros;
	private String numero;
	
	
	
	private ConcessionariaEnum(String portas, String tipo, String litros, String numero) {
		this.portas = portas;
		this.tipo = tipo;
		this.litros = litros;
		this.numero = numero;
	}
	
	
	// GETTERS E SETTERS
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getPortas() {
		return portas;
	}
	public void setPortas(String portas) {
		this.portas = portas;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getLitros() {
		return litros;
	}
	public void setLitros(String litros) {
		this.litros = litros;
	}
	
	

	
	
}
