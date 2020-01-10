package digitalInnovation.javaBasico;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Aula_03_DateFormat {

	public static void main(String[] args) {
		
		Date agora = new Date();
		
		String dateToStr = DateFormat.getInstance().format(agora);
		System.out.println(dateToStr);	// retorna um SHORT da data e hora, padrao default da classe DateFormat - dd/MM/aa HH:MM
		
		dateToStr = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.SHORT).format(agora);
		System.out.println(dateToStr);	// retorna um LONG da data e um SHORT da hora, padrao modificado no codigo
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");	// define um novo objeto com um padrao de fromato para data
		String dataFormatada = formatter.format(agora);	// atribui para a variavel a data formata
		System.out.println(dataFormatada);

	}

}
