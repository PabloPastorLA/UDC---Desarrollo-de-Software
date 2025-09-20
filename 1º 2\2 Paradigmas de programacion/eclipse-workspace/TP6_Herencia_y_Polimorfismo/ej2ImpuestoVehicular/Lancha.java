/*
	– Para automóviles y camiones de hasta treinta años se usa la fórmula (1.5 - (años_de_antigüedad/30)) * indice * (valor / 10).
	– Los autos y camiones de más de 30 años no pagan impuesto.
	– El impuesto para las lanchas se hace con la fórmula indice * valor
	– Los aviones pagan se usa la fórmula antigüedad * índice * (valor / 100).
	El índice para camiones, autos y lanchas es de 0.012 (1,2 %)
	El índice para aviones es 0.0015 (0,15%)
*/

package ej2ImpuestoVehicular;

public class Lancha extends Vehiculo {
	//atrib clase
	static private double indice = INDICE_LANCHA;
	//constructores
	public Lancha(String marca, String modelo, String patente, int año, int valor, String nombre, String domicilio) {
		super(marca, modelo, patente, año, valor, nombre, domicilio);		
	}
	
	//metodos
	


	public double calcularImpuesto() {
		return (indice * getValor()) / 100;
	}
	
	public void setIndice(double indiceNuevo) {
		indice=indiceNuevo;
	}
}
