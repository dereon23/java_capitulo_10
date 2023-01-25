package Capitulo10;
import java.util.ArrayList;
import java.util.HashMap;
public class Ejercicio12 {
	
	public static void main(String[] args) {
		ArrayList<Carta> cartas = new ArrayList<Carta>();
		Carta aux=null;
		for(int i=0; i<5;i++) {
			do {
				aux= new Carta((int)(Math.random()*4),(int)(Math.random()*10));
			}while(cartas.contains(aux));
			cartas.add(aux);
			System.out.println(cartas.get(i));
		}
		HashMap<Numero, Integer> valoresBrisca = new HashMap<Numero,Integer>();
		valoresBrisca.put(Numero.tres, 11);
		valoresBrisca.put(Numero.uno,10);
		valoresBrisca.put(Numero.rey,4);
		valoresBrisca.put(Numero.caballo,3);
		valoresBrisca.put(Numero.sota,2);
		int suma=0;
		for(Carta c : cartas) {
			suma+= valoresBrisca.containsKey(c.getNumero()) ? valoresBrisca.get(c.getNumero()) : 0;
		}
		System.out.println("Tienes "+suma+" puntos");

	}

}
