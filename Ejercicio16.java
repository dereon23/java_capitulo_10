package Capitulo10;
import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio16 {
	public static void main(String[] args) {
		HashMap<String, String> paisCapital = new HashMap<String,String>();
		paisCapital.put("España", "Madrid");
		paisCapital.put("Portugal", "Lisboa");
		paisCapital.put("Francia", "París");
		Scanner s = new Scanner(System.in);
		String entrada="";
		String nuevaCapital;
		while(!entrada.equalsIgnoreCase("salir")) {
			System.out.print("Escribe el nombre de un país y te diré su capital: ");
			entrada=s.nextLine();
			if(paisCapital.containsKey(entrada)) {
				System.out.println("La capital de "+entrada+" es "+paisCapital.get(entrada));
			}else {
				System.out.print("No conozco la respuesta ¿cuál es la capital de "+entrada+"?: ");
				nuevaCapital=s.nextLine();
				paisCapital.put(entrada, nuevaCapital);
				System.out.println("Gracias por enseñarme nuevas capitales");
			}
		}
	}
}