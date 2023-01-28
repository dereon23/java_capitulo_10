package Capitulo10;
import java.util.ArrayList;

public class Ejercicio17 {

	public static void main(String[] args) {
		Carrito miCarrito = new Carrito();
		miCarrito.agrega(new Elemento("Tarjeta SD 64Gb", 19.95, 2));
		miCarrito.agrega(new Elemento("Canon EOS 2000D", 449, 1));
		System.out.println(miCarrito);
		System.out.print("Hay " + miCarrito.numeroDeElementos());
		System.out.println(" productos en la cesta.");
		System.out.println("El total asciende a "
		+ String.format("%.2f", miCarrito.importeTotal()) + " euros");
		System.out.println("\nContinúa la compra...\n");
		miCarrito.agrega(new Elemento("Samsung Galaxy Tab", 199, 3));
		miCarrito.agrega(new Elemento("Tarjeta SD 64Gb", 19.95, 1));
		System.out.println(miCarrito);
		System.out.print("Ahora hay " + miCarrito.numeroDeElementos());
		System.out.println(" productos en la cesta.");
		System.out.println("El total asciende a "
		+ String.format("%.2f", miCarrito.importeTotal()) + " euros");
	}
	
}

class Carrito{
	private ArrayList<Elemento> lista;
	public Carrito(){
		lista=new ArrayList<Elemento>();
	}
	
	public void agrega(Elemento e) {
		lista.add(e);
	}
	public void agrega2(Elemento e) {
		boolean sinAñadir=true;
		for(Elemento elista : lista) {
			if(elista.nombre.equals(e.nombre)) {
				sinAñadir=false;
				elista.unidades+=e.unidades;
				break;
			}
		}
		if(sinAñadir) {
			lista.add(e);
		}
	}
	public int numeroDeElementos() {
		return lista.size();
	}
	public double importeTotal() {
		double total=0;
		for(Elemento e : lista) {
			total+=e.precio*e.unidades;
		}
		return total;
	}
	public String toString() {
		String salida="Contenido del carrito\n=====================\n";
		for(Elemento e : lista) {
			salida+=e.toString()+"\n";
		}
		return salida;
	}
}

class Elemento{
	String nombre;
	double precio;
	int unidades;
	public Elemento(String nombre, double precio, int unidades) {
		this.nombre=nombre; this.precio=precio; this.unidades=unidades;
	}
	public String toString() {
		return nombre+" PVP: "+precio+" Unidades: "+unidades+" Subtotal: "+precio*unidades;
	}
}
