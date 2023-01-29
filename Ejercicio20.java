package Capitulo10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio20 {
	
	public static void main(String[] args) {
		HashMap<String, String> dicc = new HashMap<String,String>();
		ArrayList<String> sinom = new ArrayList<String>();
		dicc.put("caliente", "hot");
		dicc.put("rojo", "red");
		dicc.put("ardiente", "hot");
		dicc.put("verde", "green");
		dicc.put("agujetas", "stiff");
		dicc.put("abrasador", "hot");
		dicc.put("hierro", "iron");
		dicc.put("grande", "big");
		
		Scanner s= new Scanner(System.in);
		String entrada=""; String entrada2;
		while(!entrada.equals("salir")) {
			System.out.print("\nIntroduzca una palabra y le daré los sinónimos: ");
			entrada=s.nextLine();
			sinom.clear();
			if(!entrada.equals("salir")) {
			if(dicc.containsKey(entrada)) {
			for(Map.Entry<String,String> par : dicc.entrySet()) {
				if(par.getKey().equals(entrada)) {
					for(Map.Entry<String, String> par2 : dicc.entrySet()) {
						if(par2.getValue().equals(par.getValue())&&!par2.getKey().equals(entrada)) {
							sinom.add(par2.getKey());
						}
					}
					break;
				}
			}
			if(sinom.size()>0) {
			System.out.print("Sinónimos de "+entrada+": ");
			for(int i=0; i<sinom.size();i++) {
				if(i<sinom.size()-1) {
				System.out.print(sinom.get(i)+", ");
				}else {
					System.out.println(sinom.get(i));
				}
			}
			}else {
				System.out.print("No conozco sinónimos de esa palabra ¿quiere añadir alguno? (s/n):");
				entrada2=s.nextLine();
				if(entrada2.equals("s")) {
					System.out.print("Introduzca un sinónimo de "+entrada+": ");
					entrada2=s.nextLine();
					dicc.put(entrada2,dicc.get(entrada));
					System.out.println("Gracias por enseñarme nuevos sinónimos.");
				}
			}
			}else {
				System.out.print("No conozco esa palabra ¿quiere añadirla al diccionario? (s/n): ");
				entrada2=s.nextLine();
				if(entrada2.equals("s")) {
					System.out.print("Introduzca la traducción de "+entrada+" en inglés:");
					entrada2=s.nextLine();
					dicc.put(entrada,entrada2);
				}
			}
			}
		}
		

	}

}