package Capitulo10;
import java.util.ArrayList;

public class Ejercicio7 {
	public static void main(String[] args) {
		ArrayList<Moneda> al = new ArrayList<Moneda>();
		for(int i=0;i<6;i++) {
			al.add(new Moneda((int)(Math.random()*8),(int)(Math.random()*2)));
		}
		System.out.println(al);
	}
}

class Moneda{
	Tamanyo valor;
	Lado lado;
	Moneda(int valor, int lado){
		switch(valor) {
		case 0: this.valor=Tamanyo.uncent; break;
		case 1: this.valor=Tamanyo.doscent; break;
		case 2: this.valor=Tamanyo.cincocent; break;
		case 3: this.valor=Tamanyo.diezcent; break;
		case 4: this.valor=Tamanyo.veinticincocent; break;
		case 5: this.valor=Tamanyo.cincuentcent; break;
		case 6: this.valor=Tamanyo.uneuro; break;
		default: this.valor=Tamanyo.doseuro;
		}
		switch(lado) {
		case 0: this.lado=Lado.cara; break;
		default: this.lado=Lado.cruz;
		}
	}
	public String toString() {
		String str="";
		switch(valor) {
		case uncent: str+="1 céntimo - "; break;
		case doscent: str+="2 céntimos - "; break;
		case cincocent: str+="5 céntimos - "; break;
		case diezcent: str+="10 céntimos - "; break;
		case veinticincocent: str+="25 céntimos - "; break;
		case cincuentcent: str+="50 céntimos - "; break;
		case uneuro: str+="1 euro - "; break;
		default: str+="2 euro - ";
		}
		switch(lado) {
		case cara: str+="cara"; break;
		default:str+="cruz";
		}
		return str;
	}
}

enum Tamanyo{
	uncent, doscent, cincocent, diezcent, veinticincocent, cincuentcent, uneuro, doseuro
}

enum Lado{
	cara,cruz
}