import java.util.concurrent.ThreadLocalRandom;
public class Aleatorio {
    public static void main(String[] args) throws Exception {

        int mesada = 50;
        int preco;
        int qtdDoces = 0;

        System.out.println("Joaozinho possui: R$" + mesada);

        do{

            preco = ThreadLocalRandom.current().nextInt(1, 5);

            if (mesada < preco)
            {
                System.out.println("Joazinho encontrou um doce por: R$" + preco +
                                   "\nPorém não conseguiu comprar pois sobrou apenas: R$" + mesada);
            }
            else 
            {
                qtdDoces++;
                mesada = mesada - preco;
                System.out.println("Joaozinho encontrou um doce por: R$" + preco +
                                   "\nE comprou, sobrando: R$" + mesada);
            }

        }while(mesada > 0);

        System.out.println("Joaozinho conseguiu comprar: " + qtdDoces + " Doces!");
        
    }
}
