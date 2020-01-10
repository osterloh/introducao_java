package digitalInnovation.javaBasico;

import java.util.Calendar;

public class Aula_02_Calendar {

	public static void main(String[] args) {
		
		//instanciando um objeto do tipo Calendar
		Calendar agora = Calendar.getInstance();
		System.out.println(agora);
		
		System.out.println("A data de hoje: " + agora.getTime());
		
		agora.add(Calendar.DATE, -15);
		System.out.println("15 dias a tras: " + agora.getTime());
		
		agora.add(Calendar.MONTH, 4);
		System.out.println("4 meses depois: " + agora.getTime());
		
		agora.add(Calendar.YEAR, 2);
		System.out.println("2 anos depois: " + agora.getTime());
		
		//Calendar com impressao formatada
		Calendar hoje = Calendar.getInstance();
		System.out.printf("%tc\n", hoje);	//data completa detalhada
		System.out.printf("%tF\n", hoje);	//aaa-mm-dd
		System.out.printf("%tD\n", hoje);	//mm/dd/aa
		System.out.printf("%tr\n", hoje);	//hh:mm:ss AM/PM
		System.out.printf("%tT\n", hoje);	//HH:mm:ss	(24hrs)

	}

}
