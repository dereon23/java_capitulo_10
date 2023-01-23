package Capitulo10;
import java.util.ArrayList;

public class Ejercicio8 {
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
		System.out.println(cartas);
	}
}

class Carta implements Comparable<Carta>{
	private Simbolo simbolo; private Numero numero;
	public Carta(int simbolo, int numero){
		switch(simbolo) {
		case 0: this.simbolo=Simbolo.oros; break;
		case 1: this.simbolo=Simbolo.copas; break;
		case 2: this.simbolo=Simbolo.bastos; break;
		case 3: this.simbolo=Simbolo.espadas; break;
		}
		switch(numero) {
		case 0: this.numero=Numero.uno; break;
		case 1: this.numero=Numero.dos; break;
		case 2: this.numero=Numero.tres; break;
		case 3: this.numero=Numero.cuatro; break;
		case 4: this.numero=Numero.cinco; break;
		case 5: this.numero=Numero.seis; break;
		case 6: this.numero=Numero.siete; break;
		case 7: this.numero=Numero.sota; break;
		case 8: this.numero=Numero.caballo; break;
		default: this.numero=Numero.rey;
		}
	}
	public String toString() {
		String str="";
		switch(numero) {
		case uno: str+="uno de "; break;
		case dos: str+="dos de "; break;
		case tres: str+="tres de "; break;
		case cuatro: str+="cuatro de "; break;
		case cinco: str+="cinco de "; break;
		case seis: str+="seis de "; break;
		case siete: str+="siete de "; break;
		case sota: str+="sota de "; break;
		case caballo: str+="caballo de "; break;
		default: str+="rey de ";
		}
		switch(simbolo) {
		case oros: str+="oros"; break;
		case copas: str+="copas"; break;
		case bastos: str+="bastos"; break;
		default: str+="espadas";
		}
		return str;
	}
	@Override
	public boolean equals(Object c) {
		if(c==this) {
			return true;
		}
		if(c.getClass()!=Carta.class) {
			return false;
		}
		Carta nueva=(Carta)c;
		return this.simbolo == nueva.simbolo ? this.numero == nueva.numero : false;
	}
	public int compareTo(Carta c) {
		return this.simbolo==c.simbolo ? this.numero.compareTo(c.numero) : this.simbolo.compareTo(c.simbolo);
	}
	public Numero getNumero() {
		return numero;
	}
	public Simbolo getSimbolo() {
		return simbolo;
	}
}

enum Simbolo{
	bastos, copas, espadas, oros
}
enum Numero{
	uno, dos, tres, cuatro, cinco, seis, siete, sota, caballo, rey
}