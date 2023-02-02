package Capitulo10;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

public class Ejercicio23 {
	public static void main(String[] args) {
		int capturasTotal = (int)(Math.random()*16);
		HashMap<String,Integer> fichas = new HashMap<String,Integer>();
		ArrayList<String> capturado = new ArrayList<String>();
		fichas.put("peón", 8); fichas.put("torre", 2);
		fichas.put("caballo",2); fichas.put("alfil", 2);
		fichas.put("reina", 1);
		
		int puntosRestantes=capturasTotal;
		int piezasDisponibles=0; int piezaElegida;
		while(puntosRestantes>0) {
			for(Map.Entry<String,Integer> e : fichas.entrySet()) {
				piezasDisponibles+=e.getValue();
			}
			piezaElegida=(int)(Math.random()*piezasDisponibles)+1;
			for(Map.Entry<String, Integer> e : fichas.entrySet()) {
				piezaElegida-=e.getValue();
				if(piezaElegida<1) {
					if(puntosRestantes-valorDePieza(e.getKey())>=0) {
						capturado.add(e.getKey());
						fichas.put(e.getKey(),e.getValue()-1 );
						puntosRestantes-=valorDePieza(e.getKey());
					}
					break;
				}
			}
		}
		System.out.println("Fichas capturadas por el jugador:");
		for(int i=0; i<capturado.size();i++) {
			System.out.println(capturado.get(i)+" ("+valorDePieza(capturado.get(i))+
			" peones)");
		}
		System.out.println("Puntos Totales: "+capturasTotal+" peones.");
	}
	
	public static int valorDePieza(String pieza) {
		return pieza.equals("peón") ? 1 : pieza.equals("torre") ?
		5 : pieza.equals("caballo") ? 2 : pieza.equals("alfil") ?
		3 : 9;
	}
}