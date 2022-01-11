package n1fase14;
/*
 * Tienes que  hacer  lo  mismo  que en el  punto  anterior,  
 * pero devolviendo  una lista que  incluya los elementos con 
 * más  de 5  letras . Imprime  el  eje de resultados .       
 */

import java.util.*;
import java.util.stream.Collectors;

public class App {
	
	public static void main(String[]args) {
		
		List<String> nameList = Arrays.asList("Juan","Ara","Pedro","Carlos","Ana","Ada","Ricardo");
		
		System.out.println("Nombres con o:" + longitudCinco(nameList));
		
		
	}
	
	private static List<String> longitudCinco (List<String> names) {
		
		List<String> nameListMetodo = names.stream()
				.filter(n -> n.length() == 5)
				.collect(Collectors.toList()); 
		
		return nameListMetodo;
	}	
	
	


}
