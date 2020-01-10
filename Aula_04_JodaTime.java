package digitalInnovation.javaBasico;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Aula_04_JodaTime {

	public static void main(String[] args) {

		// LocalDate - trabalha somente com as datas - padrao yyyy/MM/dd
		LocalDate hoje = LocalDate.now();	// instancia um objeto do tipo LocalDate que retorna a data atual - yyyy/MM/dd
		System.out.println(hoje);
		
		LocalDate ontem = hoje.minusDays(1);	// subtrai 1 dia da var ONTEM
		System.out.println(ontem);
		
		// LocalTime - trabalha somente com os horarios - padrao hh:mm:ss.ms
		LocalTime agora = LocalTime.now();	// instancia um objeto do tipo LocalTime que retorna a hora atual - hh:mm:ss.ms
		System.out.println(agora);
		
		LocalTime maisUmaHora = agora.plusHours(1);	// soma 1 hora da var AGORA
		System.out.println(maisUmaHora);
		
		// LocalDateTime - trabala com datas e horas - padrao yyyy-MM-dd hh:mm:ss.ms
		LocalDateTime hojeAgora = LocalDateTime.now(); // instancia um objeto do tipo LocalDateTime que retorna o dia e a hora atual
		System.out.println(hojeAgora);
		
		LocalDateTime futuro = hojeAgora.plusHours(1).plusDays(2).plusSeconds(10);	// soma 1 hora 2 dias e 10 segundos na var HOJEAGORA
		System.out.println(futuro);
		
	}

}
