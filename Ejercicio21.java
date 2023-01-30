package Capitulo10;
import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio21 {
	
	public static void main(String[] args) {
		HashMap<String,String> anfHab = new HashMap<String,String>();
		HashMap<String,String> anfAli = new HashMap<String,String>();
		anfHab.put("rana", "En los trópicos y cerca de las zonas húmedas y acuáticas");
		anfAli.put("rana", "Larvas e insectos");
		anfHab.put("salamandra", "Ecosistemas húmedos");
		anfAli.put("salamandra", "Pequeños crustáceos e insectos");
		anfHab.put("sapo", "En cualquier sitio salvo el desierto y la Antártida");
		anfAli.put("sapo", "Insectos, lombrices y pequeños roedores");
		anfHab.put("tritón", "América y África");
		anfAli.put("tritón", "Insectos");
		
		System.out.println("Introduzca el tipo de anfibio:  ");
		Scanner s = new Scanner(System.in);
		String entrada= s.nextLine();
		if(anfHab.containsKey(entrada)) {
			System.out.println("Hábitat: "+anfHab.get(entrada)+".");
			System.out.println("Alimentación: "+anfAli.get(entrada)+".");
		}else {
			System.out.println("Ese tipo de anfibio no existe");
		}
		s.close();
	}

}
