import java.util.TreeMap;
import java.util.concurrent.ThreadLocalRandom;

public class Dados {
	
	public static void main(String[] args) {
		
		TreeMap<Integer, Integer> rolagemDeDados = new TreeMap<Integer, Integer>();
		
		for (int i = 0; i <= 100; i++)
		{
			int rolagem = ThreadLocalRandom.current().nextInt(1, 7);

			try {
			rolagemDeDados.put(rolagem, rolagemDeDados.get(rolagem)+1);
			} catch (Exception e)
			{
				rolagemDeDados.put(rolagem, 1);
			}

		}
		
		System.out.println(rolagemDeDados);
		
	}

}
