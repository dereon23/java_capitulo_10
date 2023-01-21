package Capitulo10;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		ArrayList<Integer> n= new ArrayList<Integer>();
		Scanner s=new Scanner(System.in);
		System.out.println("Introduce 10 numeros:");
		for(int i=0;i<10;i++) {
			n.add(Integer.parseInt(s.nextLine()));
		}
		Collections.sort(n);
		for(int i: n) {
			System.out.print(i+" ");
		}
	}
	
}