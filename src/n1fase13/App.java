package n1fase13;
/*
 * Dada  una lista de  cadenas ,  escribe  un  método  que 
 * el regreso y  una lista de todas las  cadenas  que  
 * contienen e n  la  letra  'o' y  Imprim eje  del  resultado . 
 */
import java.util.*;
import java.util.stream.Collectors;

public class App {
	public static void main(String[]args) {
		
		List<String> nameList = Arrays.asList("Juan","Ara","Pedro","Carlos","Ana","Ada","Ricardo");
		
		System.out.println("Nombres con o:" + contieneO(nameList));
		
		
	}
	
	private static List<String> contieneO (List<String> names) {
		
		List<String> nameListMetodo = names.stream()
				.filter(n -> n.contains("o"))
				.collect(Collectors.toList()); 
		
		return nameListMetodo;
	}	

}
