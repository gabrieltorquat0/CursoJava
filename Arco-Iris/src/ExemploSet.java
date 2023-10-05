import java.util.*;

public class ExemploSet {
	public static void main(String args []) {
		Set<String> setArcoIris = new TreeSet<>();
	
		setArcoIris.add("Vemelho");
		setArcoIris.add("Laranja");
		setArcoIris.add("Amarelo");
		setArcoIris.add("Verde");
		setArcoIris.add("Azul");
		setArcoIris.add("Violeta");
		
		// EM ORDEM ALFABÉTICA
		System.out.println(setArcoIris);
		
		List<String> listArcoIris = new ArrayList<>(setArcoIris);
		
		Collections.reverse(listArcoIris);
		
		Set<String> invertedSetArcoIris = new LinkedHashSet<>(listArcoIris);
		
		// EM ORDEM INVERSA
		System.out.println(invertedSetArcoIris);
		
		// MANTER CORES QUE COMEÇAM COM A LETRA V 
		for(String coresV : setArcoIris) {
			if (coresV.startsWith(String.valueOf("V"))) {
                System.out.println(coresV);
            }
		}
		
		Iterator<String> iteratorArcoIris = setArcoIris.iterator();
        
		while (iteratorArcoIris.hasNext()) {
            String word = iteratorArcoIris.next();
            if (!word.startsWith(String.valueOf("V"))) {
            	iteratorArcoIris.remove();
            }
        }
		
		// REMOVER TODAS AS CORES QUE NÃO COMEÇAM COM V
		System.out.println(setArcoIris);
		
	}
}
