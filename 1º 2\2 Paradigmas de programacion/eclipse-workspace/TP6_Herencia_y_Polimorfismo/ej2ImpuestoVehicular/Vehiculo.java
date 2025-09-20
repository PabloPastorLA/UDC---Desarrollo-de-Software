/*Ejercicio número 2
	En la Municipalidad de Trulalá se cobra el impuesto vehicular para cuatro categorías de vehículos: automóviles, camiones, lanchas y aviones.
	De todos los vehículos se conoce: la marca, el modelo, el número de patente, el valor, el año de fabricación y el propietario.
	De cada propietario se conoce el nombre y el domicilio.
	El cálculo de la patente (liquidación mensual) se realiza de la siguiente manera:
	– Para automóviles y camiones de hasta treinta años se usa la fórmula (1.5 - (años_de_antigüedad/30)) * indice * (valor / 10).
		Los autos y camiones de más de 30 años no pagan impuesto.
	– El impuesto para las lanchas se hace con la fórmula indice * valor
	– Los aviones pagan se usa la fórmula antigüedad * índice * (valor / 100).
	El índice para camiones, autos y lanchas es de 0.012 (1,2 %)
	El índice para aviones es 0.0015 (0,15%)
	
	Escriba las clases necesarias para modelar este escenario en Java e implemente el método calcularImpuesto en los vehículos. 
	Escriba además una clase Principal donde se use lo implementado para obtener el valor total del impuesto para la siguiente flota de vehículos:

 	Tipo	Modelo 		Patente		Año 	Valor 		Propietario 		Domicilio
 	Camion 	Fiat 15000 	FRE 123		1990 	150.000 	Expreso Morresi 	Echeverria 432
 	Camion 	Volvo 324 	GUL 812 	2007 	234.000 	Transportes Ruben 	Yapeyu 678
 	Avion 	Boeing 727 	DFXCVBERT 	1993 	12.000.000 	Aerolineas Pluma 	Belgrano 12
 	Auto 	VW Passat 	JMH 234 	2010 	120.000 	Aerolineas Pluma 	Belgrano 12
 	Auto 	VW Gol 		FFD 321 	2005 	28.000 		Juan Perez 			Rondeau 432
 	Lancha 	Cuto 345 	FHUTYR 		2000 	15.000 		Juan Perez 			Rondeau 432
*/

package ej2ImpuestoVehicular;

public abstract class Vehiculo implements Interface {
	//atributos
	private String marca;
	private String modelo;
	private String patente;
	private int valor;
	private int año;
	private String nombre;
	private String domicilio;
	
	//constructor
	public Vehiculo(String marca, String modelo, String patente, int valor, int año, String nombre, String domicilio) {
		this.marca=marca;
		this.modelo=modelo;
		this.patente=patente;
		this.valor=valor;
		this.año=año;
		this.nombre=nombre;
		this.domicilio=domicilio;
	}

	public String getMarca() {
		return marca;
	}
	public String getModelo() {
		return modelo;
	}
	public String getPatente() {
		return patente;
	}
	public int getValor() {
		return valor;
	}
	public int getAño() {
		return año;
	}
	public String getNombre() {
		return nombre;
	}
	public String getDomicilio() {
		return domicilio;
	}


}

