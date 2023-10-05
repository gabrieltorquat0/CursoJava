import java.util.Scanner;

public class GetSet {
	
	public static void main(String[] args) {
		String nomeTime;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o nome do seu time: ");
		nomeTime = scanner.nextLine();
		
		Futebol time = new Futebol();
		
		time.setNomeTime(nomeTime);
		System.out.println("O nome do time é: " + time.getNomeTime());
		
		scanner.close();
	}

}
