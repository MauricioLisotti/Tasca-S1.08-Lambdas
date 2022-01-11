package n1fase12;
/*
 * Escribe  un  m�todo  que devuelve y  una cadena separada 
 * por comas basada en una lista  de Integers . Cada  elemento 
 * debe ser precedido  por la  letra  "e" si el n�mero  es a�n , 
 * y  precedido  por la  letra  "o" si el n�mero  es im par . 
 * Por  ejemplo , si la lista  de entrada es  (3,44), la  salida 
 * deber�a  ser "o3, e44". Imprime  el  eje de resultados .      
 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App {
	
	public static void main(String[]args) {
	
		List<Integer> numbers = Arrays.asList(700,23,94,6,45,85,26);

	
		String modifiedToString = parImpar(numbers);
		
		System.out.println("Lista modificada: "+modifiedToString);

		
	}

	public static String parImpar (List<Integer> numList) {
		
		String par = numList.stream()
				.filter(n -> n%2 ==0).map(n -> "e" + n)
				.collect(Collectors.joining(", "));
		String impar = numList.stream()
				.filter(n -> n%2 !=0).map(n -> "o" + n)
				.collect(Collectors.joining(", "));
		
		return par +","+ impar;
	}
	
}
