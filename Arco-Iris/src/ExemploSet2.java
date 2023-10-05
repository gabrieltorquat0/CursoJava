import java.util.*;

public class ExemploSet2 {
	public static void main(String [] args) {
		Set<LinguagemFavorita> minhasLinguagensFavoritas = new HashSet<>();
		
		minhasLinguagensFavoritas.add(new LinguagemFavorita("Python", 1998, "Pycharm"));
		minhasLinguagensFavoritas.add(new LinguagemFavorita("Java", 1995, "Eclipse IDE"));
		minhasLinguagensFavoritas.add(new LinguagemFavorita("C++", 1991, "Visual Studio"));
		
        System.out.println("--------\tOrdem de Inserção\t--------");
        Set<LinguagemFavorita> minhasLinguagensFavoritas1 = new LinkedHashSet<>(
                Arrays.asList(
                        new LinguagemFavorita("Python", 1998, "Pycharm"),
                        new LinguagemFavorita("Java", 1995, "Eclipse IDE"),
                        new LinguagemFavorita("C++", 1991, "Visual Studio")
                )
        );
        for (LinguagemFavorita linguagem : minhasLinguagensFavoritas1) System.out.println(linguagem);
        
        System.out.println("--------\tOrdem Natural\t--------");
        Set<LinguagemFavorita> minhasLinguagensFavoritas2 = new TreeSet<>(minhasLinguagensFavoritas1);
        for (LinguagemFavorita linguagem : minhasLinguagensFavoritas2) System.out.println(linguagem);
        
        System.out.println("--------\tOrdem IDE\t--------");
        Set<LinguagemFavorita> minhasLinguagensFavoritas3 = new TreeSet<>(new ComparatorIde());
        minhasLinguagensFavoritas3.addAll(minhasLinguagensFavoritas);
        for (LinguagemFavorita ide : minhasLinguagensFavoritas3) System.out.println(ide);
        
        System.out.println("--------\tOrdem Ano de criação -> Linguagem\t--------");
        Set<LinguagemFavorita> minhasLinguagensFavoritas4 = new TreeSet<>(new ComparatorAnoNome());
        minhasLinguagensFavoritas4.addAll(minhasLinguagensFavoritas);
        for (LinguagemFavorita anoDeCriacao : minhasLinguagensFavoritas4) System.out.println(anoDeCriacao);
        
        System.out.println("--------\tOrdem Linguagem -> Ano de criação -> IDE\t--------");
        Set<LinguagemFavorita> minhasLinguagensFavoritas5 = new TreeSet<>(new ComparatorNomeAnoIde());
        minhasLinguagensFavoritas5.addAll(minhasLinguagensFavoritas);
        for (LinguagemFavorita linguagem : minhasLinguagensFavoritas5) System.out.println(linguagem);
        
	}
}

class LinguagemFavorita implements Comparable<LinguagemFavorita> {
    public String linguagem;
    public Integer anoDeCriacao;
    public String ide;
    
    public LinguagemFavorita(String linguagem, Integer anoDeCriacao, String ide) {
        this.linguagem = linguagem;
        this.anoDeCriacao = anoDeCriacao;
        this.ide = ide;
    }
    
    @Override
    public int compareTo(LinguagemFavorita outraLinguagem) {
        // Comparação baseada no ano de criação
        return this.anoDeCriacao.compareTo(outraLinguagem.anoDeCriacao);
    }
    
    @Override
    public String toString() {
    	return "{" + "nome= '" + linguagem + "\'" + " ano de criação= " + anoDeCriacao + " ide= '" + ide + '\'' + '}'; 
    }
    
}

class ComparatorIde implements Comparator<LinguagemFavorita> {
    @Override
    public int compare(LinguagemFavorita lf1, LinguagemFavorita lf2) {
        return lf1.ide.compareToIgnoreCase(lf2.ide);
    }
}

class ComparatorAnoNome implements Comparator<LinguagemFavorita> {
    @Override
    public int compare(LinguagemFavorita lf1, LinguagemFavorita lf2) {
        int anoDeCriacao = Integer.compare(lf1.anoDeCriacao, lf2.anoDeCriacao);
        if (anoDeCriacao != 0) return anoDeCriacao;
        return lf1.linguagem.compareToIgnoreCase(lf2.linguagem);
    }
}

class ComparatorNomeAnoIde implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita lf1, LinguagemFavorita lf2) {
        int nome = lf1.linguagem.compareToIgnoreCase(lf2.linguagem);
        int anoDeCriacao = Integer.compare(lf1.anoDeCriacao, lf2.anoDeCriacao);
        if (nome != 0) return nome;
        if (anoDeCriacao != 0) return anoDeCriacao;
        return lf1.ide.compareToIgnoreCase(lf2.ide);
    }
}