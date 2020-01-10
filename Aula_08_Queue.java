package digitalInnovation.javaBasico;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Aula_08_Queue {

	public static void main(String[] args) {

		Queue<String> filaBanco = new LinkedList<>();	//define um novo objeto do tipo Queue (fila)
		
		filaBanco.add("Luiz");		//adicionar elementos na fila
		filaBanco.add("Mayara");
		filaBanco.add("Johnatan");
		filaBanco.add("Anthony");
		filaBanco.add("Isaura");
		
		System.out.println(filaBanco);
		
		System.out.println(filaBanco.poll());	//retorna o primeiro elemento da fila e remove
		System.out.println(filaBanco);
		
		System.out.println(filaBanco.peek());	//retorna o primeiro elemento da fila mas nao remove, caso a fila esteja vazia retorna NULL
		System.out.println(filaBanco);
		
		
		System.out.println(filaBanco.element());	//retorna o primeiro elemento da fila mas nao remove, caso a fila esteja vazia retorna Exception	
		System.out.println(filaBanco);
//		filaBanco.clear();		//limpa a lista
		System.out.println(filaBanco.element());
		System.out.println(filaBanco);
		
		for(String element : filaBanco) {	//percorre a fila e imprime os elementos
			System.out.println(element);
		}
		
		Iterator<String> iteratorFilaBanco = filaBanco.iterator();
		while(iteratorFilaBanco.hasNext()) {		//percorre a fila e imprime os elementos com ITERATOR
			System.out.println("===> " + iteratorFilaBanco.next());
		}
		
		System.out.println(filaBanco.size());	//retorna a quantia de lementos contidos na fila
		
//		filaBanco.clear();
		System.out.println(filaBanco.isEmpty());	//retorna se a fila esta vazia ou nao (true / false)
		
	}

}
