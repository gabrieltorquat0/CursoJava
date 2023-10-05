public class Salario {

    public static void main(String[] args) {
        Vendas vendas = new Vendas("Gabriel Pilato");

        vendas.incluirVenda("Produto 1", 10, 10);
        vendas.incluirVenda("Produto 2", 10, 10);
        vendas.incluirVenda("Produto 3", 10, 10);
        vendas.incluirVenda("Produto 4", 10, 20);

        vendas.mostrarVendas();
    }
    
}
