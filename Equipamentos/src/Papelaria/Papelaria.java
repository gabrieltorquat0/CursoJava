package Papelaria;

import Copiadora.Xerox;
import Digitalizadora.Scanner;
import Impressora.HP;
import MultiFuncional.MultiFuncional;

public class Papelaria {
	
	public static void main(String[] args) {
		
		Xerox xerox = new Xerox();
		Scanner scanner = new Scanner();
		HP hp = new HP();
		MultiFuncional multiFuncional = new MultiFuncional();
		
		xerox.copiar();
		scanner.digitalizar();
		hp.imprimir();
		
		multiFuncional.copiar();
		multiFuncional.digitalizar();
		multiFuncional.imprimir();
		
		
	}

}
