package digitalInnovation.javaBasico;

public class Aula_06_StringBuilder {

	public static void main(String[] args) {
		
		StringBuilder nome = new StringBuilder("Johnatan");
		
		System.out.println("Nome: " + nome);
		System.out.println("Valor adicionado: " + nome.append(" Osterloh"));
		System.out.println("Nome invertido: " + nome.reverse());
		System.out.println("Insercao de caracter: " + nome.insert(0, "#").insert(nome.length(), "#"));
		System.out.println("Valor atual da variavel: " + nome);

	}

}
