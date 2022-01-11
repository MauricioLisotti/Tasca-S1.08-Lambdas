package n1fase21;
/*
 * Cree en  una  Functional  Interfaz que  conting a  un  
 * método abstracto getPiValue  (), que devuelve en  un 
 * valor  double ; en  otra clase , instancie la  interfaz  
 * y  asigne mediante  una lambda el valor 3.1415. Invo en  
 * el  método getPiValue  la  interfaz de solicitud  y el  
 * eje Imprim  el  resultado .  
 * 
 */

public class App {
	public static void main(String[]args) {
	
		FunctionalInterface pi = () -> 3.14516;
		
		System.out.println(pi.getPiValue());
		
		
		
	}
	
	
}
