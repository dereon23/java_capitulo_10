package Capitulo10;


import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

public class Ejercicio22 {
	
	public static void main(String[] args) {
		CuentaCorriente cuenta1 = new CuentaCorriente();
		CuentaCorriente cuenta2 = new CuentaCorriente(1500);
		CuentaCorriente cuenta3 = new CuentaCorriente(6000);
		cuenta1.ingreso(2000);
		cuenta1.cargo(600);
		cuenta3.ingreso(75);
		cuenta1.cargo(55);
		cuenta2.transferencia(cuenta1, 100);
		cuenta1.transferencia(cuenta3, 250);
		cuenta3.transferencia(cuenta1, 22);
		cuenta1.movimientos();

	}

}

class CuentaCorriente{
	private double dinero;
	private String numero;
	public static DecimalFormat dosCeros=new DecimalFormat("0.00");
	private ArrayList<Operacion> movimientos;
	public CuentaCorriente(){
		dinero=0;
		numero="";
		for(int i=0;i<10;i++) {
			numero+=(int)(Math.random()*10);
		}
		movimientos=new ArrayList<Operacion>();
	}
	public CuentaCorriente(double dinero) {
		this.dinero=dinero;
		numero="";
		for(int i=0;i<10;i++) {
			numero+=(int)(Math.random()*10);
		}
		movimientos=new ArrayList<Operacion>();
	}
	public String toString() {
		return "Número de cta: "+numero+" Saldo: "+dosCeros.format(dinero)+" €";
	}
	public void ingreso(double ingresos) {
		dinero+=ingresos;
		movimientos.add(new Operacion("Ingreso", ingresos, this.dinero));
	}
	public void cargo(double cargos) {
		dinero-=cargos;
		movimientos.add(new Operacion("Cargo",cargos,this.dinero));
	}
	public void transferencia(CuentaCorriente cuenta, double transferido) {
			this.dinero-=transferido;
			cuenta.dinero+=transferido;
			movimientos.add(new Operacion("Transf", -transferido, cuenta.numero, this.dinero));
			cuenta.movimientos.add(new Operacion("Transf",transferido,numero, cuenta.dinero));
	}
	public void movimientos() {
		System.out.println("Movimientos de la cuenta "+numero);
		System.out.println("-----------------------------------");
		for(int i=0;i<movimientos.size();i++) {
			System.out.println(movimientos.get(i));
		}
	}
}

class Operacion{
	String tipoOperacion;
	double cant;
	String num;
	double saldo;
	public Operacion(String to, double cant, double saldo) {
		tipoOperacion=to; this.cant=cant; this.saldo=saldo;
	}
	public Operacion(String to, double cant, String num, double saldo) {
		tipoOperacion=to; this.cant=cant;this.num=num; this.saldo=saldo;
	}
	public String toString() {
		if(tipoOperacion.equals("Transf")) {
			return cant<0 ? "Transf. emitida de "+CuentaCorriente.dosCeros.format(-cant)+" € a la cuenta "+num+
			"  Saldo "+CuentaCorriente.dosCeros.format(saldo)+" €" 
			:
			"Transf. recibida de "+CuentaCorriente.dosCeros.format(cant)+" € de la cuenta "+num
			+"  Saldo "+CuentaCorriente.dosCeros.format(saldo)+" €";
		}else {
			return tipoOperacion+" de "+CuentaCorriente.dosCeros.format(cant)+
					" €  Saldo "+CuentaCorriente.dosCeros.format(saldo)+" €";
		}
	}
}
