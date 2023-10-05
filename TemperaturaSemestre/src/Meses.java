import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Meses {
	
	static final int ESCALA = 2; // Escala desejada para a temperatura
	static final int QTD = 6; // Quantidade de meses a ser trabalhado
	static final Double MIN = 0.0; // Temperatura minima
	static final Double MAX = 30.0; // Temperatura maxima
	
	public static void main(String[] args) {
		
		Double totalTemperaturas = 0.0; // Variável para armazenar o total das temperatuas
		Double mediaTemperaturas = 0.0; // Variável para armazenar a média das temperaturas
		List<Double> temperaturas = new ArrayList<Double>();
		
		// For para atribuir uma temperatura aleatoria entre min e max e arredondando as casas decimais para 2
		for (int i = 0; i<=QTD-1; i++)
		{
			BigDecimal temperatura = new BigDecimal(ThreadLocalRandom.current().nextDouble(MIN,MAX));
			temperaturas.add(i,temperatura.setScale(ESCALA,RoundingMode.HALF_UP).doubleValue());
			totalTemperaturas += temperaturas.get(i);
		}
		
		// Calculo da temperatura média dos meses e também arredondando as casas decimais para 2
		BigDecimal media = new BigDecimal(mediaTemperaturas = totalTemperaturas / QTD).setScale(ESCALA, RoundingMode.HALF_UP);
		mediaTemperaturas = media.doubleValue();
		
		// printando as temperaturas armazenadas e buscando o nome do mês de acordo com o index armazenado na lista de temperaturas
		// Utilizando a Month para buscar os nomes dos meses
		System.out.println("--- MESES E SUAS TEMPERATURAS ---");
		for (int i = 0; i<=QTD-1; i++)
		{
			Month mes = Month.of(i+1);
			System.out.println(i+1 + " - " + mes + ": " + temperaturas.get(i));
		}
		
		// Apresentando a temperatura média
		System.out.println("\n--- Temperatura média dos meses: " + mediaTemperaturas);
		
		// Buscando no arrayList os meses que estão com a temperatura acima da média
		System.out.println("--- MESES QUE ESTÃO ACIMA DA MÉDIA DE TEMPERATURA ---");
		for (int i = 0; i<=QTD-1; i++)
		{
			if (temperaturas.get(i)>=mediaTemperaturas)
			{
				Month mes = Month.of(i+1);
				System.out.println(mes + " - " + temperaturas.get(i));
			}
		}
		
		
	}

}
