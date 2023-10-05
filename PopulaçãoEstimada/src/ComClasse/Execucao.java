package ComClasse;
import java.util.LinkedHashMap;
import java.util.Map;

public class Execucao {
	
	public static void main(String[] args) {
		
		LinkedHashMap<String, Populacao> mapPopulacao = new LinkedHashMap<String, Populacao>();
		
		mapPopulacao.put("PE",new Populacao(9616621));
		mapPopulacao.put("AL",new Populacao(3351543));
		mapPopulacao.put("CE",new Populacao(9187103));
		mapPopulacao.put("RN",new Populacao(3534265));
		
		for (Map.Entry<String, Populacao> a: mapPopulacao.entrySet()) 
		{
			System.out.println(a.getKey() + ", População: " + a.getValue().getPopulacao());
		};
		
		System.out.println("\nPrintando utilizando o for each:");
		mapPopulacao.forEach((a,b) -> System.out.println(a + ", População: " + b.getPopulacao()));
		
		mapPopulacao.put("RN", new Populacao(3534165));
		
		System.out.println("\nPrintando para ver a alteração no RN");
		mapPopulacao.forEach((a,b) -> System.out.println(a + ", População: " + b.getPopulacao()));
		
		
		
		
		
	}

}
