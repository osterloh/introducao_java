package digitalInnovation.javaBasico;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Aula_13_StreamAPI {

	public static void main(String[] args) {
		
		List<String> estudantes = new ArrayList<>();	//define uma lista do tipo string
		
		estudantes.add("Brenda");	//adiciona elementos na lista
		estudantes.add("Braian");
		estudantes.add("Victor");
		estudantes.add("Leonardo");
		estudantes.add("Lavinia");
		estudantes.add("Ana");
		estudantes.add("Vinicus");
		estudantes.add("Nicomar");
		estudantes.add("Rafael");
		
		System.out.println("Qtd de elementos da lista: " + estudantes.stream().count());	//retorna a qtd de elementos da lista
		
		System.out.println("Maior elemento da lista: " + estudantes.stream().max(Comparator.comparingInt(String::length)));	//retorna o maior elemento
		
		System.out.println("Menor elemento da lista: " + estudantes.stream().min(Comparator.comparing(String::length)));	//retorna o menor elemento
		
		System.out.println("Elementos da lista que contenha a letra C: " +
							estudantes.stream().filter((estudante) -> estudante.toLowerCase().contains("c")).collect(Collectors.toList()));	//realiza filtro
		
		System.out.println("Nova colecao com qtd de letras: " +
							estudantes.stream().map(estudante -> estudante.concat(" - ").concat(String.valueOf(estudante.length()))).collect(Collectors.toList()));
		
		System.out.println("Tres primeiros elementos da lista: " + estudantes.stream().limit(3).collect(Collectors.toList()));	//retorna apenas uma determinada qtd de elementos
		
		System.out.println("Mesmos elementos - peek(): " + estudantes.stream().peek(System.out::println).collect(Collectors.toList()));	//retorna os mesmos elementos da lista
		
		System.out.println("Mesmos elementos - forEach(): ");
		estudantes.stream().forEach(System.out::println);	//retorna os mesmos elemento da lista
		
		System.out.println("Verifica se tem J na lista: " + estudantes.stream().allMatch((elemento) -> elemento.contains("j")));	//verifica se todos os elementos da lista contem a letra
		
		System.out.println("Verifica se ao menos um elemento da lista possui s: " + estudantes.stream().anyMatch((estudante) -> estudante.contains("s"))); //verifica se ao menos um elemento da lista com a letra
		
		System.out.println("Verifica se não contém W na lista: " + estudantes.stream().noneMatch((estudante) -> estudante.contains("w")));	//verifica se não contem a letra na lista
		
		System.out.println("Primeiro elemento da lista: ");
		estudantes.stream().findFirst().ifPresent(System.out::println);	//retorna o primeiro elemento da lista
		
		//Operacao encadeada
		System.out.println("Operacao encadeada:");
		System.out.println(estudantes.stream()
							.peek(System.out::println)
							.map(estudante -> estudante.concat(" - ").concat(String.valueOf(estudante.length())))
							.peek(System.out::println)
							.filter((estudante) -> estudante.toLowerCase().contains("r"))
//							.collect(Collectors.toList())
//							.collect(Collectors.joining(", "))
//							.collect(Collectors.toSet())
							.collect(Collectors.groupingBy(estudante -> estudante.substring(estudante.indexOf("-") + 1)))
							);

	}

}
