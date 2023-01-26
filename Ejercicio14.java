package Capitulo10;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class Ejercicio14 {

	public static void main(String[] args) {
		HashMap<String,Double> tabla = new HashMap<String,Double>();
		HashMap<Map.Entry<String,Double>,Integer> factura = 
		new HashMap<Map.Entry<String,Double>,Integer>();
		
		tabla.put("avena", 2.21);
		tabla.put("garbanzos", 2.39);
		tabla.put("tomate", 1.59);
		tabla.put("jengibre", 3.13);
		tabla.put("quinoa", 4.50);
		tabla.put("guisantes", 1.60);
		Scanner s=new Scanner(System.in);
		String entrada=""; int cant;
		while(!entrada.equals("fin")) {
		System.out.print("Producto: "); entrada=s.nextLine();
		if(tabla.containsKey(entrada)) {
			System.out.println("Cantidad: "); cant=Integer.parseInt(s.nextLine());
			for(Map.Entry<String,Double> par : tabla.entrySet()) {
				if(par.getKey().equals(entrada)) {
					factura.put(par, cant);
				}
			}
		}
		}
		double total=0;
		System.out.println("Producto Precio Cantidad Subtotal\n---------------------------------");
		for(Map.Entry<Map.Entry<String,Double>,Integer> linea : factura.entrySet()) {
			System.out.printf("%-10s %4.2f %-10d %6.2f\n",linea.getKey().getKey(),linea.getKey().getValue(),
					linea.getValue(),linea.getKey().getValue()*linea.getValue());
			total+=linea.getKey().getValue()*linea.getValue();
		}
		System.out.printf("TOTAL: %.2f",total);
	}
}