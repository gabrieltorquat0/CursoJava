package Modalidades;

import java.util.Scanner;

public class Modalidades {
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String escolha;
		boolean achou = false;
		
		do{
			
			System.out.println("Digite uma das opções abaixo: ");
			for (ModalidadeEnum m : ModalidadeEnum.values()) 
			{
				System.out.println(m.getNumero() + " - " + m);
			}
		
			escolha = scanner.nextLine();

		
		
			for(ModalidadeEnum m : ModalidadeEnum.values()) {
				if (escolha.equals(m.getNumero())) 
				{
					System.out.println("\n A modalidade escolhida foi " + m);
					achou = true;
					break;
				}
			}
		
		if (!achou){
			System.out.println("\nA opçcao digitada não existe, favor digite uma das opções disponíveis");
		}
		
		} while(!achou);
		
		scanner.close();
	}

}
