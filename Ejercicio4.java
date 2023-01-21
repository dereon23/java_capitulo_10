package Capitulo10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		ArrayList<String> n= new ArrayList<String>();
		Scanner s=new Scanner(System.in);
		System.out.println("Introduce 10 palabras:");
		for(int i=0;i<10;i++) {
			n.add(s.nextLine());
		}
		Collections.sort(n);
		System.out.println(n);
	}
}
