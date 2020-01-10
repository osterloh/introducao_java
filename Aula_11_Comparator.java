package digitalInnovation.javaBasico;

import java.awt.SecondaryLoop;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Aula_11_Comparator {

	public static void main(String[] args) {
		
		List<Aula_11_Estudante> estudantes = new ArrayList<>();
		
		estudantes.add(new Aula_11_Estudante("Pedro", 19));
		estudantes.add(new Aula_11_Estudante("Carlos", 23));
		estudantes.add(new Aula_11_Estudante("Mariana", 21));
		estudantes.add(new Aula_11_Estudante("João", 18));
		estudantes.add(new Aula_11_Estudante("Thiago", 20));
		estudantes.add(new Aula_11_Estudante("George", 22));
		estudantes.add(new Aula_11_Estudante("Larissa", 21));
		
		System.out.println("--- Lista de estudantes ---\n" + estudantes);
		
		estudantes.sort((first, second) -> first.getIdade() - second.getIdade());
		System.out.println("\n--- Ordena conforme idade - do menor ao maior ---\n" + estudantes);
		
		estudantes.sort((first, second) -> second.getIdade() - first.getIdade());
		System.out.println("\n--- Ordena conforme idade - do maior ao menor ---\n" + estudantes);
		
		estudantes.sort(Comparator.comparingInt(Aula_11_Estudante::getIdade));
		System.out.println("\n--- Ordena conforme idade - manor ao maior - (method reference) ---\n" + estudantes);
		
		estudantes.sort(Comparator.comparingInt(Aula_11_Estudante::getIdade).reversed());
		System.out.println("\n--- Ordena conforme idade - maior ao manor - (method reference) ---\n" + estudantes);
		
		Collections.sort(estudantes);
		System.out.println("\n--- Ordena conforme idade (interface Comparable) ---\n" + estudantes);
		
		Collections.sort(estudantes, new Aula_11_IdadeReversa());
		System.out.println("\n--- Ordem reversa da idade (interface Comparator) ---\n" + estudantes);

	}

}
