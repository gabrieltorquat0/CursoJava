package ProgramasDeMensagem;

import ServiçoDeMensagem.ServicoDeMensagem;

public class Mensager extends ServicoDeMensagem{


	public void enviarMensagem() {
		validarConexao();
		System.out.println("Enviando mensagem pelo Mensager");
		
	}


	public void receberMensagem() {
		validarConexao();
		System.out.println("Recebeno mensagem pelo Mensager");
		
	}
	

}
