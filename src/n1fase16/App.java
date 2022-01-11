package n1fase16;

import java.util.Arrays;
import java.util.List;

/*
 * Tienes que  hacer  la  misma impresión  del  punto  anterior  pero haciéndolo mediante method reference .         
 */
public class App {
	
	public static void main(String[]args) {
		
		List<String> mesesList = Arrays.asList("Enero","Febrero","Marzo","Abril","Mayo","Junio",
				"Julio","Septiembre","Octubre","Noviembre","Diciembre");
		
		metodo1(mesesList);
	}
	
	
	public static void metodo1(List<String> mesesList1) {
		
		System.out.println("Lista de meses:");
		mesesList1.forEach(m -> System.out.println(m+" "));
	}	

}
