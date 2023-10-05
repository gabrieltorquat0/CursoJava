package Bandas;

import java.util.Scanner;

public class Bandas {
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String escolha;
		boolean achou = false;
		
		do{
			
			System.out.println("Digite uma das opções abaixo para saber mais sobre a banda: ");
			for(BandasEnum b : BandasEnum.values()) 
			{
				System.out.println(b.getNumero() + " - " + b);
			}
		
			escolha = scanner.nextLine();

		
		
			for(BandasEnum b : BandasEnum.values()) 
			{
				if (escolha.equals(b.getNumero())) 
				{
					System.out.println("\nSobre: " + b + "\n" + b.getSobre());
					achou = true;
					break;
				}
			}
		
			if (!achou)
			{
				System.out.println("\nA opçcao digitada não existe, favor digite uma das opções disponíveis");
			}
		
		} while(!achou);
		
		scanner.close();
	}

}
