package digitalInnovation.javaBasico;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Aula_09_Set {

	public static void main(String[] args) {

		/*
		 * Exemplo 1: utilizacao do HashSet
		 */
		Set<Double> notas = new HashSet<>();	//declaracao de um novo objeto do tipo Set instanciado de HashSet
		
		notas.add(null);
		notas.add(7.5);		//adiciona valores na lista
		notas.add(8.0);
		notas.add(3.5);
		notas.add(4.5);
		notas.add(9.0);
		notas.add(2.5);
		notas.add(2.0);
		notas.add(10.0);
		
		System.out.println(notas);
		
		notas.remove(4.5);		//remove um valor especifico
		System.out.println(notas);
		
		System.out.println(notas.size());	//retorna a quantia de itens
		
		Iterator<Double> iterator = notas.iterator();	//navega em todos os itens do iterator
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}
		
		System.out.println("---");
		
		for(Double valor : notas) {
			System.out.println(valor);
		}
		
//		notas.clear();	//limpa a lista
		System.out.println("A lista esta vazia? " + notas.isEmpty());	//retorna se contem ou nao itens na lista
		
		
		System.out.println("=================================================================================");
		
		
		
		/*
		 * Exemplo 2: utilizacao do LinkedHashSet
		 */
		LinkedHashSet<Integer> idades = new LinkedHashSet<>();	//declara um novo objeto do tipo e instanciado LinkedHashSet
		
		idades.add(12);	//adiciona valores na lista
		idades.add(29);
		idades.add(25);
		idades.add(8);
		idades.add(15);
		idades.add(21);
		
		System.out.println(idades);
		
		idades.remove(15);	//remove um valor especifico da lista
		System.out.println(idades);
		
		System.out.println(idades.size());	//retorna a quantia de itens na lista
		
		Iterator<Integer> iterator2 = idades.iterator();	//navega em todos os itens do ietartor
		while (iterator2.hasNext()) {
			System.out.println(iterator2.next());
			
		}
		
		System.out.println("---");
		
		for(Integer num : idades) {
			System.out.println(num);
		}
		
//		idades.clear();	//limpa  a lista
		System.out.println(idades.isEmpty());	//retorna se contem ou nao itens na lista
		
		
		System.out.println("=================================================================================");

		
		
		/*
		 * Exemplo 3: utilizacao do TreeSet
		 */
		TreeSet<String> cidades = new TreeSet<>();	//definicao de um novo objeto e instanciado TreeSet
		
		//Monta a arvore com as cidades
		cidades.add("Jaragua do Sul");	//adiciona um novo elemento na lista
		cidades.add("Corupa");
		cidades.add("Sao do Sul");
		cidades.add("Mafra");
		cidades.add("Rio Negrinho");
		cidades.add("Pomerode");
		cidades.add("Guaramirim");
		cidades.add("Massaranduba");
		cidades.add("Schroeder");
		
		System.out.println(cidades);
		
		System.out.println(cidades.first());	//retorna o primeiro elemento da arvore, o que esta no topo
		
		System.out.println(cidades.last());		//retorna o ultimo elemento da arvore
		
		System.out.println(cidades.lower("Mafra"));	//retorna o elemento que esta abaixo do elemento parametrizado (informada);
		
		System.out.println(cidades.higher("Mafra"));	//retorna o elemento que esta acima do elemento parametrizado (informada);
		
		System.out.println(cidades.pollFirst());	//retorna o primeiro elemento da lista e remove
		System.out.println(cidades);
		
		System.out.println(cidades.pollLast());		//retorna o ultimo elemento da lista e remove
		System.out.println(cidades);
		
	}

}
