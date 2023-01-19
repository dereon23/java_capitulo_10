package Capitulo10;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		ArrayList<String> nombres = new ArrayList<String>();
		Scanner s=new Scanner(System.in);
		System.out.println("Introduce 6 nombres:");
		for(int i=0;i<6;i++) {
			nombres.add(s.nextLine());
		}
		for(String n : nombres) {
			System.out.print(n+" ");
		}
	}
	
}
