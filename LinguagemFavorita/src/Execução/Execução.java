package Execução;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;


import Linguagens.Linguagem;

public class Execução{
	
	
	
	public static void main(String[] args) {
		
		Linguagem ling1 = new Linguagem("C#","1992","NetBeans");
		Linguagem ling2 = new Linguagem("C#","1992","Visual Studio");
		Linguagem ling3 = new Linguagem("Python","1992","PyCharm");
		
		HashSet<Linguagem> set = new HashSet<Linguagem>();
		
		set.add(ling1);
		set.add(ling2);
		set.add(ling3);
		
		set.forEach(a -> System.out.println(a.getNome() + " " + a.getAnoDeCriacao() + " " + a.getIde()));
		
		
		List<Linguagem> lista = new ArrayList<Linguagem>(set);
		
		System.out.println("\n--- ORGANIZANDO POR ORDEM DE NOME ---");
		lista.sort((l1,l2) -> 
		{
			int cmp = l1.getNome().toString().compareTo(l2.getNome().toString());
			
				return cmp;
			
		});
		
		
		lista.forEach(a -> System.out.println(a.getNome() + " " + a.getAnoDeCriacao() + " " + a.getIde()));
		
		System.out.println("\n--- ORGANIZANDO POR IDE ---");
		lista.sort((l1,l2) -> 
		{
			int cmp = l1.getIde().toString().compareTo(l2.getIde().toString());
			
				return cmp;
			
		});
		
		
		lista.forEach(a -> System.out.println(a.getNome() + " " + a.getAnoDeCriacao() + " " + a.getIde()));
		
		System.out.println("\n--- ORGANIZANDO POR ANO DE CRIAÇÃO ---");
		lista.sort((l1,l2) -> 
		{
			int cmp = Integer.valueOf(l1.getAnoDeCriacao().toString().replaceAll("\\[|\\]|\\s", "")).compareTo(Integer.valueOf(l2.getAnoDeCriacao().toString().replaceAll("\\[|\\]|\\s", "")));
			
				return cmp;
			
		});
		
		lista.forEach(a -> System.out.println(a.getNome() + " " + a.getAnoDeCriacao() + " " + a.getIde()));
		
		
		System.out.println("\n--- ORGANIZANDO POR ANO DE CRIAÇÃO E NOME ---");
		lista.sort((l1,l2) -> 
		{
			int cmp = Integer.valueOf(l1.getAnoDeCriacao().toString().replaceAll("\\[|\\]|\\s", "")).compareTo(Integer.valueOf(l2.getAnoDeCriacao().toString().replaceAll("\\[|\\]|\\s", "")));
			
			if (cmp != 0)
			{
				return cmp;
			}
			return l1.getNome().toString().compareTo(l2.getNome().toString());
			
		});
		
		lista.forEach(a -> System.out.println(a.getNome() + " " + a.getAnoDeCriacao() + " " + a.getIde()));
		
		System.out.println("\n--- ORGANIZANDO POR NOME, ANO DE CRIAÇÃO E IDE ---");
		lista.sort((l1,l2) -> 
		{
			int cmp = l1.getNome().toString().compareTo(l2.getNome().toString());
			
			if (cmp != 0)
			{
				return cmp;
			}
			
			cmp = Integer.valueOf(l1.getAnoDeCriacao().toString().replaceAll("\\[|\\]|\\s", "")).compareTo(Integer.valueOf(l2.getAnoDeCriacao().toString().replaceAll("\\[|\\]|\\s", "")));
			
			if (cmp !=0)
			{
				return cmp;
			}
			
			return l1.getIde().toString().compareTo(l2.getIde().toString());
			
		});
		
		lista.forEach(a -> System.out.println(a.getNome() + " " + a.getAnoDeCriacao() + " " + a.getIde()));
		
	}

}
