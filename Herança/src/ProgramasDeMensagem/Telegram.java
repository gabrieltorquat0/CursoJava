package ProgramasDeMensagem;

import ServiçoDeMensagem.ServicoDeMensagem;

public class Telegram extends ServicoDeMensagem{

	public void enviarMensagem() {
		validarConexao();
		System.out.println("Enviando mensagem pelo Telegram");
		
	}

	public void receberMensagem() {
		validarConexao();
		System.out.println("Recebendo mensagem pelo Telegram");
		
	}
	
	

}
