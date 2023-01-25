package Capitulo10;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Ejercicio11 {

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
		
		
		Scanner s = new Scanner(System.in);
		boolean sinPregunta; int correctas=0;
		for(int i=0; i<5;i++) {
			sinPregunta=true;
			while(sinPregunta) {
				for(Map.Entry<String, String> parPalabras : diccionario.entrySet()) {
					if((int)(Math.random()*diccionario.size())==0) {
						System.out.println("¿Cómo se escribe "+parPalabras.getValue()+" en inglés?");
						if(s.nextLine().equals(parPalabras.getKey())) {
							correctas++;
						}else {
							System.out.println("Incorrecto");
						}
						sinPregunta=false;
						break;
					}
				}
			}
		}
		System.out.println("Acertaste "+correctas+" preguntas");
		s.close();
		
	}
	
}
