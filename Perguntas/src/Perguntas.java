import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Perguntas {

	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		List<String> perguntas = new ArrayList<String>();
		
		perguntas.add("Telefonou para a vitima? (S/N)");
		perguntas.add("Esteve no local do crime? (S/N)");
		perguntas.add("Morava perto da vítima? (S/N)");
		perguntas.add("Devia para a vítima? (S/N)");
		perguntas.add("Já trabalhou para a vítima? (S/N)");
		
		int cont = 0;
		boolean erro = false;
		Iterator<String> stringPerguntas = perguntas.iterator();
		String respostaScanner;
		
		
		while(stringPerguntas.hasNext())
		{
			System.out.println(stringPerguntas.next());
			
			do {
			
			respostaScanner = scanner.nextLine().toLowerCase();
			
			if (respostaScanner.equals("s"))
			{
				cont++;
				erro = false;
				System.out.println("resposta: S");
			}
			else if (respostaScanner.equals("n"))
			{
				erro = false;
				System.out.println("resposta: N");
			} 
			else
			{
				System.out.println("Erro, digite apenas S/N");
				erro = true;
			}
			
			
			}while(erro);
			
		}
		
		scanner.close();
		
		switch(cont)
		{
		case 0,1:
			System.out.println("Você foi declarado Inocente");
			break;
		case 2:
			System.out.println("Você foi declarado Suspeito");
			break;
		case 3,4:
			System.out.println("Você foi declarado Cúmplice");
			break;
		case 5:
			System.out.println("Você foi declarado Assasino!");
		}

		
	}

}
