package digitalInnovation.javaBasico;

public class Aula_11_Estudante implements Comparable<Aula_11_Estudante> {
	
	private final String nome;
	private final int idade;

	public Aula_11_Estudante(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}
	
	@Override
	public String toString() {
		return nome + " - " + idade;
	}

	@Override
	public int compareTo(Aula_11_Estudante o) {
		return this.getIdade() - o.getIdade();
	}
	
	

}
