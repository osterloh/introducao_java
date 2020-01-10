package digitalInnovation.javaBasico;

import java.util.HashMap;
import java.util.Map;

public class Aula_10_Map {

	public static void main(String[] args) {
		
		Map<String, Integer> mundialFifa = new HashMap<>();
		
		//Adiciona dados no MAP
		mundialFifa.put("Brasil", 5);
		mundialFifa.put("Alemanha", 4);
		mundialFifa.put("Italia", 4);
		mundialFifa.put("Uruguai", 2);
		mundialFifa.put("Argentina", 2);
		mundialFifa.put("Franca", 2);
		mundialFifa.put("Inglaterra", 1);
		mundialFifa.put("Espanha", 1);
		
		System.out.println(mundialFifa);
		
		mundialFifa.put("Brasil", 6);		//atualiza valor
		System.out.println(mundialFifa);
		
		System.out.println("Valor da chave Alemanha: " + mundialFifa.get("Alemanha"));	//retorna o VALOR da CHAVE informada
		
		System.out.println("Contem a chave Italia? " + mundialFifa.containsKey("Italia"));	//verifca se contem no MAP a chave informada
		
		mundialFifa.remove("Franca");	//remove uma chave do MAP
		
		System.out.println("Contem a chave Franca? " + mundialFifa.containsKey("Franca"));
		
		System.out.println("Contem o valor 5? " + mundialFifa.containsValue(5));	//verifica se contem no MAP o valor informado
		
		System.out.println("Qtd de itens no MAP? " + mundialFifa.size());	//retorna a quantia de itens contidos no MAP
		
		System.out.println("---------------------");
		
		for(Map.Entry<String, Integer> entry : mundialFifa.entrySet()) {		//navegar no MAP
			System.out.println(entry.getKey() + " --- " + entry.getValue());
		}
		
		System.out.println("---------------------");
		
		for(String key : mundialFifa.keySet()) {		//navegar no MAP
			System.out.println(key + " --- " + mundialFifa.get(key));
		}
		
		System.out.println("---------------------");
		
		System.out.println(mundialFifa.size());
		mundialFifa.clear();
		System.out.println(mundialFifa.size());
		System.out.println(mundialFifa);
	}

}
