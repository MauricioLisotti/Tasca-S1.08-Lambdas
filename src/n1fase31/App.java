package n1fase31;
/*
 * Crea  un  funcional  de interfaz que  contingencias como  un  
 * método abstracto inversa  (), que devuelve y  valor  de cadena ; 
 * en  otra clase ,  inyecte a  la  interfaz  creado  por  un cuerpo 
 * lambda del método , para que el tiempo y  la  misma  cadena que  
 * recibe como  un  parámetro , pero  en  reversa . Invoca  la 
 * instancia  de la  interfaz pasándole  una cadena y  comprobando  el  resultado .   
 */
public class App {
	
	public static void main(String[] args) {
		ReverseFunctionalInterface reverseString = (str) -> {
			String result = "";
			for(int i=str.length() -1; i >= 0; i--)
				result += str.charAt(i);
			return result;
		};
		System.out.println(reverseString.reverse("IT Academy"));
	}

}
