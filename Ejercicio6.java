package Capitulo10;
import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {
		HashMap<String, String> usuarios = new HashMap<String, String>();
		Scanner s=new Scanner(System.in);
		System.out.println("Introduce un nombre de usuario");
		String nombre=s.nextLine();
		System.out.println("Introduce una contraseña");
		String contrasena=s.nextLine();
		usuarios.put(nombre, contrasena);
		int intentos=0; boolean dentro=false;
		while(intentos<3&&!dentro) {
		System.out.println("Introduce tu nombre de usuario");
		nombre=s.nextLine();
			if(usuarios.containsKey(nombre)) {
				System.out.println("Introduce tu contraseña de usuario");
				contrasena=s.nextLine();
				if(usuarios.get(nombre).equals(contrasena)) {
					System.out.println("Sesion iniciada");
					dentro=true;
				}else {
					System.out.println("Contrasena incorrecta");
					intentos++;
				}
			}else {
				System.out.println("No existe ese usuario");
				intentos++;
			}
		}
		
		
	}
}
