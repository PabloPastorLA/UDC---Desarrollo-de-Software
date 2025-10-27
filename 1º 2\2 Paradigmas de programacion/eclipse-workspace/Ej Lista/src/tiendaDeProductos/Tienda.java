package tiendaDeProductos;

import java.util.List;
import java.util.ArrayList;

public class Tienda extends Inventario{
	private List<Producto> productos; 

	public Tienda() {
		this.productos = new ArrayList<>();
	}


	public void agregarProducto(Producto prod) {
		productos.add(prod);
	}
	
	public void consultarProductos() {
		productos.forEach(prod -> {
			System.out.println("Producto: " + prod.getNombre() + " a: " + prod.getPrecio() + " c/u." + "stock: " + prod.getStock());
		});
	}



}



