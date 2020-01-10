package digitalInnovation.javaBasico;

import java.util.Comparator;

public class Aula_11_IdadeReversa implements Comparator<Aula_11_Estudante> {

	@Override
	public int compare(Aula_11_Estudante o1, Aula_11_Estudante o2) {
		return o2.getIdade() - o1.getIdade();
	}

}
