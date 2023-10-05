package Computador;

import java.util.Scanner;

import ProgramasDeMensagem.Mensager;
import ProgramasDeMensagem.Telegram;
import ProgramasDeMensagem.Whatsapp;

public class Computador {
	
	public static void main(String[] args) {
		
		String escolha;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite qual das opções abaixo deseja mandar ou enviar mensagem");
		
		do 
		{
			
			System.out.println("1 - Telegram" + 
								"\n2 - Whatsapp" + 
								"\n3 - Mensager");
			
			escolha = scanner.nextLine();
			
			switch(escolha) 
			
			{
			case "1":
				Telegram telegram = new Telegram();
				telegram.enviarMensagem();
				telegram.receberMensagem();
			break;
			
			case "2":
				Whatsapp whatsapp = new Whatsapp();
				whatsapp.enviarMensagem();
				whatsapp.receberMensagem();
			break;
			
			case "3":
				Mensager mensager = new Mensager();
				mensager.enviarMensagem();
				mensager.receberMensagem();
			break;
			
			default:
				System.out.println("Opção invalida, favor digitar uma opção valida abaixo: ");
			}
			
		}while(!escolha.equals("1") && !escolha.equals("2") && !escolha.equals("3") );
		
		scanner.close();
	}

}
