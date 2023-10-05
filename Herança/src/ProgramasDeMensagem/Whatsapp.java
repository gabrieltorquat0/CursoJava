package ProgramasDeMensagem;

import ServiçoDeMensagem.ServicoDeMensagem;

public class Whatsapp extends ServicoDeMensagem{


	public void enviarMensagem() {
		validarConexao();
		System.out.println("Enviando mensagem pelo Whatsapp");
		
	}


	public void receberMensagem() {
		validarConexao();
		System.out.println("Recebendo mensagem pelo Whatsapp");
		
	}
	
	

}
