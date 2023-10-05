package ServiçoDeMensagem;

public abstract class ServicoDeMensagem {

    protected void validarConexao() {
    	System.out.println("Validando conexao com a internet...");
    }
    
	abstract public void enviarMensagem();
	abstract public void receberMensagem();
	
	
}
