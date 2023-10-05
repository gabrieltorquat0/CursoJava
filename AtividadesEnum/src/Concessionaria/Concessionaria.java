package Concessionaria;

import java.util.Scanner;

public class Concessionaria {
	
	public static void main(String[] args) {
		
		boolean achou = false;
		String escolha;
		Scanner scanner = new Scanner(System.in);
		
		
		do {
			
			System.out.println("Digite uma das opções abaixo: ");
			for(ConcessionariaEnum e : ConcessionariaEnum.values())
			{
				System.out.println(e.getNumero() + " - " + e);
			}
			
			escolha = scanner.nextLine();
			
			scanner.close();
			
			switch (escolha) 
			{
				case "1":
					achou = true;
					ConcessionariaEnum carro = ConcessionariaEnum.valueOf("Chevrolet_Cobalt");
					System.out.println("O carro selecionado foi: " + carro +
										"\nTipo: " + carro.getTipo() + 
										"\nPortas: " + carro.getPortas() + 
										"\nLitros do portamala: " + carro.getLitros());
				break;
				
				case "2":
					achou = true;
					carro = ConcessionariaEnum.valueOf("Mitsubishi_Eclipse_Cross");
					System.out.println("O carro selecionado foi: " + carro +
										"\nTipo: " + carro.getTipo() + 
										"\nPortas: " + carro.getPortas() + 
										"\nLitros do portamala: " + carro.getLitros());
				break;
				
				case "3":
					achou = true;
					carro = ConcessionariaEnum.valueOf("Mercedes_Sprinter_415");
					System.out.println("O carro selecionado foi: " + carro +
							"\nTipo: " + carro.getTipo() + 
							"\nPortas: " + carro.getPortas() + 
							"\nLitros do portamala: " + carro.getLitros());
				break;
				
				case "4":
					achou = true;
					carro = ConcessionariaEnum.valueOf("Ford_EcoSport_2021");
					System.out.println("O carro selecionado foi: " + carro +
							"\nTipo: " + carro.getTipo() + 
							"\nPortas: " + carro.getPortas() + 
							"\nLitros do portamala: " + carro.getLitros());
				break;
				
				default:
					System.out.println("Opção não encontrada, favor digitar uma opção valida.");
			}
			
			
		} while (!achou);
	}

}
