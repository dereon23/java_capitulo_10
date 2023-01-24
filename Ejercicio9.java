package Capitulo10;

import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio9 {
	
	public static void main(String[] args) {
		ArrayList<Carta> cartas=new ArrayList<Carta>();
		for(int i=0; i<10; i++) {
			cartas.add(new Carta((int)(Math.random()*4),(int)(Math.random()*10)));
			for(int j=0;j<cartas.size()-1;j++) {
				if(cartas.get(j).equals(cartas.get(cartas.size()-1))) {
					cartas.remove(cartas.size()-1);
					break;
				}
			}
		}
		Collections.sort(cartas);
		System.out.println(cartas);
	}

}
