package Capitulo10;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Ejercicio13 {
	public static void main(String[] args) {
		ArrayList<Articulo> articulos= new ArrayList<Articulo>();
		Scanner s = new Scanner(System.in);
		boolean salir=false;
		int opcion;
		String descripcion; double precioCompra, precioVenta; int stock;
		HashMap<Articulo, Integer> venta = new HashMap<Articulo, Integer>();		
		while(!salir) {
		System.out.println("1. Listado\n"
				+ "2. Alta\n"
				+ "3. Baja\n"
				+ "4. Modificación\n"
				+ "5. Entrada de mercancía\n"
				+ "6. Venta\n"
				+ "7. Salir\n");
		
		opcion=Integer.parseInt(s.nextLine());
		
		switch(opcion) {
		case 1:
			for(Articulo a: articulos) {
				System.out.println(a);
			}
		break;
		case 2:
			System.out.println("Introduzca la descripcion");
			descripcion=s.nextLine();
			System.out.println("Introduza el precio de compra");
			precioCompra=Double.parseDouble(s.nextLine());
			System.out.println("Introduza el precio de venta");
			precioVenta=Double.parseDouble(s.nextLine());
			System.out.println("Introduza el stock");
			stock=Integer.parseInt(s.nextLine());
			articulos.add(new Articulo(descripcion,precioCompra,precioVenta,stock));
			break;
			case 3:
				System.out.println("Introduzca el codigo");
				opcion=Integer.parseInt(s.nextLine());
				for(Articulo a : articulos) {
					if(a.getCodigo()==opcion) {
						articulos.remove(articulos.indexOf(a));
						break;
					}
				}
			break;
			case 4:
				System.out.println("Introduzca el codigo");
				opcion=Integer.parseInt(s.nextLine());
				System.out.println("Introduzca la descripcion");
				descripcion=s.nextLine();
				System.out.println("Introduza el precio de compra");
				precioCompra=Double.parseDouble(s.nextLine());
				System.out.println("Introduza el precio de venta");
				precioVenta=Double.parseDouble(s.nextLine());
				System.out.println("Introduza el stock");
				stock=Integer.parseInt(s.nextLine());
				for(Articulo a : articulos) {
					if(a.getCodigo()==opcion) {
						articulos.set(articulos.indexOf(a), new Articulo(descripcion, precioCompra, precioVenta, stock));
						break;
					}
				}
				break;
			case 5:
				System.out.println("Introduzca el codigo");
				opcion=Integer.parseInt(s.nextLine());
				System.out.println("Introduzca la cantidad");
				stock=Integer.parseInt(s.nextLine());
				for(Articulo a : articulos) {
					if(a.getCodigo()==opcion) {
						a.incrementarStock(stock);;
						break;
					}
				}
				break;
			case 6:
				venta.clear();
				while(true) {
				System.out.print("\nAñada el código de un artículo o 'no' para terminar: ");
				descripcion = s.nextLine();
				if(descripcion.equals("no")) {
					break;
				}else {
					System.out.println("¿Qué cantidad quiere?");
					opcion=Integer.parseInt(s.nextLine());
					for(Articulo a : articulos) {
						if(a.getCodigo()==Integer.parseInt(descripcion)) {
							venta.put(a, opcion);
							a.decrementarStock(opcion);
						break;
						}
					}
				}
				}
				System.out.println("FACTURA");
				for(Map.Entry<Articulo,Integer> e : venta.entrySet()) {
					System.out.printf("%-30S %4d %4.2f\n", e.getKey().getDescripcion(),e.getValue(),e.getKey().getPrecioVenta());
				}
				precioVenta=0;
				for(Map.Entry<Articulo,Integer> e : venta.entrySet()) {
					precioVenta+=e.getKey().getPrecioVenta()*e.getValue();
				}
				System.out.printf("\nTOTAL: %31.2f", precioVenta);
				break;
			default: salir=true;
			}
		}
	}
}

class Articulo{
	private int codigo;
	private String descripcion;
	private double precioCompra, precioVenta;
	private int stock;
	private static int contadorCodigo=0;
	public Articulo(String descripcion, double precioCompra, double precioVenta, int stock){
		this.descripcion=descripcion; this.precioCompra=precioCompra; this.precioVenta=precioVenta;
		this.stock=stock;
		contadorCodigo++; codigo=contadorCodigo;
	}
	public String toString() {
		return "Codigo: "+codigo+"|Descripciom: "+descripcion+"| Precio de Compra: "+precioCompra+"|Precio de Venta: "+precioVenta+"|Stock: "+stock;
	}
	public int getCodigo() {
		return codigo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public double getPrecioVenta() {
		return precioVenta;
	}
	public void CodigoCero() {
		codigo=0;
	}
	public void incrementarStock(int incremento) {
		stock+=incremento;
	}
	public void decrementarStock(int decremento) {
		if(stock>decremento) {stock-=decremento;}
		else {
			System.out.println("Supera el stock");
		}
	}
	public boolean equals(Object o) {
		if(this==o) {
			return true;
		}
		if(o==null) {
			return false;
		}
		if(!(o instanceof Articulo)) {
			return false;
		}
		Articulo c=(Articulo)o;
		return c.getCodigo()==this.getCodigo();
	}
}