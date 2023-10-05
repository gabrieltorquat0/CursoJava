package SemClasse;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class PopulaçãoEstimada {
	
	public static void main(String[] args) {
		
		Map<String,Integer> populacao = new HashMap<String, Integer>();
			
		populacao.put("PE", 9616621);
		populacao.put("AL", 3351543);
		populacao.put("CE", 9187103);
		populacao.put("RN", 3534265);
		
		System.out.println(populacao);
		
		populacao.put("RN", 3534165);
		
		System.out.println("\n" + populacao);
		
		if (!populacao.containsKey("PB"))
		{
			populacao.put("PB", 4039277);
		}
		
		System.out.println("\n" + populacao);
		
		System.out.println("\nPopulacao de PE: " + populacao.get("PE"));
		
		Map<String, Integer> populacaoLinkada = new LinkedHashMap<String, Integer>();
		
		populacaoLinkada.put("PE", 9616621);
		populacaoLinkada.put("AL", 3351543);
		populacaoLinkada.put("CE", 9187103);
		populacaoLinkada.put("RN", 3534265);
		
		System.out.println("\n" + populacaoLinkada);
		
		TreeMap<String, Integer> populacaoTree = new TreeMap<String, Integer>(populacao);
		
		System.out.println("\n" + populacaoTree);
		
		for(String a : populacao.keySet())
		{
			if (Collections.max(populacao.values()).equals(populacao.get(a)))
			{
				System.out.println("\nEstado com maior população: " + a + ", População: " + populacao.get(a));
			}
		}
		
		Integer somatoria = 0;
		for(Integer a : populacao.values())
		{
			somatoria += a;
		}
		
		System.out.println("\nSomatoria da população dos estados cadastrados: " + somatoria);
		
		Integer media = somatoria/populacao.size();
		
		System.out.println("\nMédia das populaçoes: " + media);
		
		populacao.entrySet().removeIf(a -> a.getValue() < 4000000);
		
		System.out.println("\n" + populacao);
		
		populacao.clear();
		
		System.out.println(populacao);
		
	}

}
