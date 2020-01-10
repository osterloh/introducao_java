package digitalInnovation.javaBasico;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;

public class Aula_12_Optionals {

	public static void main(String[] args) {
				
		Optional<String> optionalString = Optional.of("Valor presente");	//declaracao do Optional com valor presente
		System.out.print("Valor do Optional presente: ");
		optionalString.ifPresentOrElse(System.out::println, () -> System.out.println("Valor nao esta presente"));	//verifica se Optinal possui valor ou nao

		Optional<String> optionalNull = Optional.ofNullable(null);	//declaracao do Optional com valor vazio Null
		System.out.print("Valor do Optional vazio: ");
		optionalNull.ifPresentOrElse(System.out::println, () -> System.out.println("Null - nao esta presente"));	//verifica se Optinal possui valor ou nao
		
		Optional<String> optionalEmpty = Optional.empty();	//declaracao do Optional com valor vazio Empyt
		System.out.print("Valor do Optional empty: ");
		optionalEmpty.ifPresentOrElse(System.out::println, () -> System.out.println("Empty - nao esta presente"));	//verifica se Optinal possui valor ou nao'
		
//		Optional<String> optionalNullPointer = Optional.of(null);
//		System.out.print("Valor do Optional of Null: ");
//		optionalNullPointer.ifPresentOrElse(System.out::println, () -> System.out.println("NullPointerException - nao esta presente"));
		
		System.out.println("\n\n");
		
		System.out.print("Valor INT opcional: ");
		OptionalInt.of(29).ifPresent(System.out::println);
		
		System.out.print("Valor DOUBLE opcional: ");
		OptionalDouble.of(71.2).ifPresent(System.out::println);
		
		System.out.print("Valor LONG opcional: ");
		OptionalLong.of(25L).ifPresent(System.out::println);
		
		System.out.println("\n\n");
		
		System.out.println("Optional isPresent: " + optionalString.isPresent());
		//System.out.println("Optional isEmpty: " + optionalString.isEmpty());
		
		optionalString.ifPresent(System.out::println);
		
	}

}
