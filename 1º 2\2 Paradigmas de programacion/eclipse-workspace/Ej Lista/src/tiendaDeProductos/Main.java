/*🧠 Qué podrías agregar (sin código, solo ideas)

	Mostrar tipo de producto (polimorfismo o instanceof):
	Al listar, podrías mostrar si el producto es electrónico o alimenticio.
	
	Calcular total de la tienda:
	Método que recorra la lista y sume los precios (calcularTotalInventario()).
	
	Eliminar o buscar producto:
	Buscar un producto por nombre o eliminar uno específico.
	
	Agregar atributo o comportamiento propio por subclase:
	Por ejemplo:
	
	ProductoElectronico: garantía o voltaje.
	
	ProductoAlimenticio: fecha de vencimiento.
	
	Control de duplicados o validaciones:
	Evitar agregar dos productos con el mismo nombre, o verificar precios válidos (>0).
	
	Uso de toString() en lugar de System.out.println:
	Para simplificar el código de impresión.
*/
package tiendaDeProductos;

public class Main {

	public static void main(String[] args) {
		
		Tienda kioskitoChico = new Tienda();

		Tienda distriElectro = new Tienda();
		ProductoElectronico teleSony32 = new ProductoElectronico("TV Sony 32 pulg LED",150000);
		ProductoElectronico teleLG55 = new ProductoElectronico("TV LG 55 pulg OLED", 500000);
		ProductoElectronico radioAmFm = new ProductoElectronico("Radio china AM FM", 20000);
		
		ProductoAlimenticio tallarines = new ProductoAlimenticio("Tallarines al huevo", 2000);
		
		
		
		kioskitoChico.agregarProducto(teleSony32);
//		kioskitoChico.agregarProducto(teleLG55);
		kioskitoChico.agregarProducto(tallarines);

		kioskitoChico.consultarProductos();

		distriElectro.agregarProducto(teleLG55);
		distriElectro.agregarProducto(teleSony32);
		distriElectro.agregarProducto(radioAmFm);
		
		distriElectro.consultarProductos();
	}

}
