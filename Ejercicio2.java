package Capitulo10;
import java.util.ArrayList;

public class Ejercicio2 {
	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		int max=(int)(Math.random()*11+10);
		for(int i=0;i<max;i++) {
			numeros.add((int)(Math.random()*101));
		}
		for(int i: numeros) {
			System.out.print(i+" ");
		}
	}
}
