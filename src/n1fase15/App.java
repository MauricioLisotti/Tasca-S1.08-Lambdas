package n1fase15;
import java.util.*;
/*
 * Cree una  lista  con el n�mero de meses  del  a�o .
 *  Imprime todos los elementos  de la lista  con  una lambda.           
 */

public class App {
	public static void main(String[]args) {
		
		List<String> mesesList = Arrays.asList("Enero","Febrero","Marzo","Abril","Mayo","Junio",
				"Julio","Septiembre","Octubre","Noviembre","Diciembre");
		
		
		System.out.println("Lista de meses:");
		mesesList.forEach(m -> System.out.println(m+" "));
	}
	
		
}
