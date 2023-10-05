package no;

public class NoRefatorada<T> { //classe do tipo generico

	 public T conteudo; //alterado para tipo generico
	    public NoRefatorada<T> proximoNo;//não recebemos mais o string e sim o tipo

	    public NoRefatorada(T conteudo){
	        this.conteudo = conteudo;
	    }

	    public T getConteudo() {//tb transformada em tipo generico
	        return conteudo;
	    }

	    public void setConteudo(T conteudo) { //aqui não recebe mais string
	        this.conteudo = conteudo;
	    }

	    public NoRefatorada<T> getProximoNo() {//o conteudo de todos nós encadeados sera do tipo T
	        return proximoNo;
	    }

	    public void setProximoNo(NoRefatorada<T> proximoNo) {
	        this.proximoNo = proximoNo;
	   
	    }

	    public String toString() {
	        return "No{" + conteudo + '}';
	    }

	    public String toStringEncadeado() {
	        String str = "No{" + conteudo + "}";

	        if(proximoNo != null){
	            str += "->" + proximoNo.toString();
	        }else{
	            str += "->null";
	        }
	        return str;
	    }

	
}
