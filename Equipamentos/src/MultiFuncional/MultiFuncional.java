package MultiFuncional;

import Copiadora.Copiadora;
import Digitalizadora.Digitalizadora;
import Impressora.Impressora;

public class MultiFuncional implements Copiadora, Digitalizadora, Impressora{

	public void imprimir() {
		System.out.println("Imprimindo pela Multifuncional...");
		
	}

	public void digitalizar() {
		System.out.println("Digitalizando pela Multifuncional...");
		
	}

	public void copiar() {
		System.out.println("Copiando pela Multifuncional...");
		
	}

	
	
}
