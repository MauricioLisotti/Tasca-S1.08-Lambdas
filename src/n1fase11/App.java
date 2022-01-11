package n1fase11;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
/*
 * Teniendo  una lista de  cadenas  de  nombres  propios ,  
 * escribe  un  método  que devuelve e  una lista de todas 
 * las  cadenas  que  comienzan con  la  letra  'a' ( mayuscula ) 
 * y  tienen exactamente  3  letras . Imprime  el  eje de resultados.       
 */

public class App {
	
	public static void main(String[]args) {
				
		List<String> nameList = Arrays.asList("Juan","Ara","Pedro","Carlos","Ana","Ada","Ricardo");

		
		System.out.println("Nombres que comienzan con A y tienen 3 letras: "+aAnd3(nameList));
	}
	
	
	
	private static List<String> aAnd3(List<String> names) {
		
		List<String> nameListA3 = names.stream()
				.filter(n -> n.startsWith("A") && n.length() == 3)
				.collect(Collectors.toList()); 
		
		return nameListA3;
	}
	
	

}
