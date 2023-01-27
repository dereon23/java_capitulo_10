package Capitulo10;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class Ejercicio15 {

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
			System.out.print("Cantidad: "); cant=Integer.parseInt(s.nextLine());
			for(Map.Entry<String,Double> par : tabla.entrySet()) {
				if(par.getKey().equals(entrada)) {
					if(!factura.containsKey(par)) {
						factura.put(par, cant);
					}else {
						for(Map.Entry<Map.Entry<String, Double>, Integer> par2 : factura.entrySet()) {
							if(par2.getKey().getKey().equals(par.getKey())) {
								par2.setValue(par2.getValue()+cant);
								break;
							}
						}
					}
				}
			}
		}
		}
		System.out.println("Introduzca código de descuento (INTRO si no tiene ninguno): ");
		entrada=s.nextLine();
		double total=0;
		System.out.println("\n\nProducto Precio Cantidad Subtotal\n---------------------------------");
		for(Map.Entry<Map.Entry<String,Double>,Integer> linea : factura.entrySet()) {
			System.out.printf("%-10s %4.2f %-10d %6.2f\n",linea.getKey().getKey(),linea.getKey().getValue(),
					linea.getValue(),linea.getKey().getValue()*linea.getValue());
			total+=linea.getKey().getValue()*linea.getValue();
		}
		System.out.printf("TOTAL: %.2f",entrada.equals("ECODTO") ? total-total*1/10 : total);
	}
}
