package digitalInnovation.javaBasico;

import java.time.Instant;
import java.util.Date;

public class Aula_01_Date {

	public static void main(String[] args) {
		
		//Trabalhando com datas - Classe Date
		Date novaData = new Date();
		
		System.out.println(novaData + " --- Data atual");
		
		//currentTimeMillis - retorna um long da data do sistema - Ex: 1565748479741
		System.out.println(System.currentTimeMillis() + " --- LONG do Date retornado acima");

		//Tue Aug 13 23:09:07 BRT 2019 - Data retornada pelo Date()
		//1565748547546 - long retornado pelo currentTimeMillis do Date acima
		
		// instanciando um novo objeto com o long do Date anterior e imprimindo na tela para comparar o resultado
		Date nova = new Date(1565748547546L);
		System.out.println(nova + " --- Date retornado pela instancia de um LONG");
		
		//atributos BEFORE e AFTER
		//atributos booleano que retonam se o valor eh true ou false conforme o atributo definido
		Date dataPassado = new Date(1513124807691L);
		//Tue Dec 12 22:26:47 BRST 2017
		Date dataFuturo = new Date(1613124807691L);
		//Fri Feb 12 08:13:27 BRST 2021
		
		//dataPassado eh posterior a dataFuturo?
		boolean isAfter = dataPassado.after(dataFuturo);
		System.out.println(isAfter + " --- Verificando se dataPassado eh posterior a dataFuturo");
		
		//dataPassado eh anterior a dataFuturo?
		boolean isBefore = dataPassado.before(dataFuturo);
		System.out.println(isBefore + "  --- Verificando se dataPassado eh anterior a dataFuturo");
		
		Date mesmaDataFuturo = new Date(1613124807691L);
		
		//comparando se as datas sao iguais
		boolean isEquals = dataFuturo.equals(mesmaDataFuturo);
		System.out.println(isEquals + " --- Comparando se dataFuturo eh igual a mesmaDataFuturo");
		
		//comparando uma data com a outra
		int compareCase1 = dataPassado.compareTo(dataFuturo); //passado - futuro
		int compareCase2 = dataFuturo.compareTo(dataPassado); //futuro - passado
		int compareCase3 = dataFuturo.compareTo(dataFuturo); //datas equivalentes
		
		System.out.println(compareCase1 + " --- prq dataPassado eh menor que dataFuturo");
		System.out.println(compareCase2 + " --- prq dataFuturo eh maior que dataPassado");
		System.out.println(compareCase3 + " --- prq dataFuturo eh igual a dataFuturo");
		
		//classe Instant - retorna um valor mais intuitivo
		Instant instant = novaData.toInstant();
		System.out.println(instant);
	}

}
