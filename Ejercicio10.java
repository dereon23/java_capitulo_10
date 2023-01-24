package Capitulo10;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		HashMap<String, String> diccionario = new HashMap<String, String>();
		diccionario.put("red", "rojo");
		diccionario.put("blue", "azul");
		diccionario.put("cyan", "cian");
		diccionario.put("green", "verde");
		diccionario.put("reddish", "rojizo");
		diccionario.put("magenta", "magenta");
		diccionario.put("lime", "lima");
		diccionario.put("purple", "morado");
		diccionario.put("brown", "marrón");
		diccionario.put("black", "negro");
		diccionario.put("crimson", "carmesí");
		diccionario.put("white", "blanco");
		diccionario.put("yellow", "amarillo");
		diccionario.put("beige", "beige");
		diccionario.put("dark blue", "azul oscuro");
		diccionario.put("dark green", "verde oscuro");
		diccionario.put("pink", "rosa");
		diccionario.put("grey", "gris");
		diccionario.put("gold", "oro");
		diccionario.put("silver", "plata");
		
		System.out.println("Introduce un color en español");
		Scanner s = new Scanner(System.in);
		String entrada = s.nextLine();
		for(Entry<String, String> par : diccionario.entrySet()) {
			if(par.getValue().equals(entrada)) {
				System.out.println("En inglés es "+par.getKey());
				break;
			}
		}
	}
	
}

