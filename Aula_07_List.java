package digitalInnovation.javaBasico;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Aula_07_List {

	public static void main(String[] args) {
		
		List<String> nome = new ArrayList<>();	//instanciando um novo objeto List do tipo String
		
		nome.add("Johnatan");
		nome.add("Luiz");
		nome.add("Mayara");
		nome.add("Thais");
		nome.add("Anthony");
		nome.add("Nico");
		nome.add("Neia");
		nome.add("Eloiza");
		System.out.println(nome);	//imprime os valores da List
		
		nome.set(1, "Paulo");	//atualiza valor da List na posicao informada
		System.out.println(nome);
		
		Collections.sort(nome);		//metodo Collection da API Java com parametro Sort: ordena a List
		System.out.println(nome);
		
		nome.set(7, "Eloiza");
		System.out.println(nome);
		
		nome.remove(6);		//remove um valor da List atraves do indice informado
		System.out.println(nome);
		
		nome.remove("Eloiza");	//remove um valor da List atraves do objeto informado
		System.out.println(nome);
		
		System.out.println(nome.get(2));	//retorna o valor da posicao informada
		
		System.out.println(nome.size()); 	//retorna a quantidade de elementos na List
		
		System.out.println(nome.contains("Johnatan"));	//verifca se possui o valor na List, retorna booleano
		System.out.println(nome.contains("marcos"));
		
		System.out.println(nome.isEmpty()); 	//verifica se a List esta vazia, retornando true / false
		
		System.out.println(nome.indexOf("Mayara"));		//retorna o valor da posicao do objeto em que se encontra na List
		System.out.println(nome.indexOf("Jean"));
		
		for (String item : nome) {		//foreach: percorre um List
			System.out.println("--->" + item);
		}
		
		Iterator<String> valores = nome.iterator();
		System.out.println(valores.hasNext());
		while(valores.hasNext()) {	//elemento iterator com atributo hasNext, retorna true caso exista mais um elemento na List
			System.out.println("=====>" + valores.next());	//elemento iterator com atributo next, retorna o elemento que esta entrando
		}
		
		nome.clear();	//limpa a lista, remove todos os elementos armazendos na List
		System.out.println(nome.isEmpty());

	}

}
