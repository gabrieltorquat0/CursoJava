import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Vendas {

    private String vendedor;
    private List<String> produto = new ArrayList<String>(); //Inicializando as Listas
    private List<Double> valorProduto = new ArrayList<Double>();
    private List<Integer> quantidadeVendida = new ArrayList<Integer>();
    private double salario;
    private int index = 0; //Index utilizado para armazenar os produtos na lista

    //Método construtor para definir o nome do vendedor e o salário padrão
    public Vendas(String vendedor) { 
        this.vendedor = vendedor;
        this.salario = 2500;
    }

    //Método para armazenar os produtos na lista
    public void incluirVenda(String produto, double valorProduto, int quantidadeVendida){
        //Verificando se o valor do produto e a quantidade é menor ou igual a zero
        if (valorProduto <= 0 || quantidadeVendida <= 0)
        {
            JOptionPane.showMessageDialog(null, "Não é possível realizar a venda com o valor menor ou igual a 0\n ou quantidade menor ou igual a 0");
        }
        else
        {
            //Adicionando o produto, o valor e a quantidade nas listas
            this.produto.add(produto);
            this.valorProduto.add(valorProduto);
            this.quantidadeVendida.add(quantidadeVendida);
            JOptionPane.showMessageDialog(null, "Venda realizada com sucesso!\n Produto: " + this.produto.get(index) + "\nValor do produto: R$" + this.valorProduto.get(index) + "\nQuantidade vendida: " + this.quantidadeVendida.get(index));
            index++;
        }


    }

    public double totalVendas() 
    {
        double _total = 0;

        /*Um for que passa por toda a lista e multiplica a quantidade vendida e o valor de cada produto vendido
          E soma tudo na variável total.*/
        for (int i = (this.produto.size())-1;i>=0;i--)
        {
            _total = _total + (this.quantidadeVendida.get(i) * this.valorProduto.get(i));
        }

        return _total;
    }

    public void mostrarVendas()
    {
        System.out.println("TOTAL DE VENDAS");

        /*Um for que começa do primeiro elemento da lista até o ultimo e vai printando no terminal as informações
         como o nome, quantidade e o valor */
        for (int i = 0;i<=this.produto.size()-1;i++)
        {
            System.out.println("Venda [" + i + "] = " + this.produto.get(i) + ", Quantidade: " + this.quantidadeVendida.get(i) + ", Valor de venda: R$" + this.valorProduto.get(i) + ", Total: R$" + this.quantidadeVendida.get(i)*this.valorProduto.get(i));
        }

        //Printa o total de Vendas
        System.out.println("Total das Vendas: R$" + totalVendas());
        // Printa o nome do vendedor
        System.out.println("Vendedor responsável: " + this.vendedor); 

        //Printa o salário, a comissão calculada em cima do valor total das vendas da lista, e também a soma dos dois
        System.out.println("Salario: R$" + this.salario + "\nComissão: R$" + (totalVendas()*0.15) + "\nTotal Final: R$" + (this.salario + (totalVendas()*0.15)));
    }
   
}
