package Bandas;

public enum BandasEnum {

	Foo_Fighters("1", "Foo Fighters é uma banda de rock americana formada em 1994, em Seattle, Washington. A banda foi fundada pelo ex-baterista do Nirvana, Dave Grohl, como um projeto de um homem só, após a dissolução do Nirvana, devido ao suicídio de Kurt Cobain."),
	Bon_Jovi("2", "Bon Jovi é uma banda americana de rock, formada em 1983, em Sayreville, Nova Jersey. A formação atual da banda consiste no cantor Jon Bon Jovi, no tecladista David Bryan, no baterista Tico Torres, no guitarrista Phil X e no baixista Hugh McDonald."),
	Iron_Maiden("3", "Iron Maiden é uma banda inglesa de heavy metal formada em Leyton, East London, em 1975 pelo baixista e compositor Steve Harris.");

	
	private String numero;
	private String sobre;

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getSobre() {
		return sobre;
	}

	public void setSobre(String sobre) {
		this.sobre = sobre;
	}

	private BandasEnum(String numero, String sobre) {
		this.numero = numero;
		this.sobre = sobre;
	}
	
	
	
	
}
