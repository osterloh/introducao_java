package digitalInnovation.javaBasico;

public class Aula_05_Strings {

	public static void main(String[] args) {
		
		String nome = new String(" Johnatan Luiz Osterloh ");
		
		System.out.println("Nome: " + nome);
		System.out.println("Valor na posicao: " + nome.charAt(3));
		System.out.println("Com TRIM declarado: [" + nome.trim() + "]");
		System.out.println("Sem TRIM: [" + nome + "]");
		System.out.println("Quantia de caracteres: " + nome.length());
		System.out.println("Toda em minuscula: " + nome.toLowerCase());
		System.out.println("Toda em maiuscula:" + nome.toUpperCase());
		System.out.println("Cotem U? " + nome.contains("u"));
		System.out.println("Contem X? " + nome.contains("x"));
		System.out.println("Substitui S por 5: " + nome.replace("s", "5"));
		System.out.println("Eh identica (equals)? " + nome.equals(" johnatan luiz osterloh "));
		System.out.println("Eh igual (equalIgnoreCase)? " + nome.equalsIgnoreCase(" johnatan luiz osterloh "));
		System.out.println("Da posicao 4 ate a 12: " + nome.substring(4, 12));
		
		System.out.println("\n--------------------------\n");
		
		System.out.println("A B C D E F G".toCharArray());
		System.out.println("Aula de Java".split(" "));
		System.out.println("Aula de ".concat("Java"));	//concatena valores na string
		System.out.println("1234 asda qw".replaceAll("[0-9]", "#"));	//substitui valores indicados pelo valor apresentado

	}

}
