/*
	– Para automóviles y camiones de hasta treinta años se usa la fórmula (1.5 - (años_de_antigüedad/30)) * indice * (valor / 10).
	– Los autos y camiones de más de 30 años no pagan impuesto.
	– El impuesto para las lanchas se hace con la fórmula indice * valor
	– Los aviones pagan se usa la fórmula antigüedad * índice * (valor / 100).
	El índice para camiones, autos y lanchas es de 0.012 (1,2 %)
	El índice para aviones es 0.0015 (0,15%)
*/

package ej2ImpuestoVehicular;

public class Auto extends Vehiculo {
	
	

	
	//constantes
	//atrib clase
	static private double indice = INDICE_AUTO;
	//constructoresimplements 
	public Auto(String marca, String modelo, String patente, int año, int valor, String nombre, String domicilio) {
		super(marca, modelo, patente, año, valor, nombre, domicilio);		
	}
	
	//metodos
	public double calcularImpuesto() {
		if (AÑO_ACTUAL - getAño() <= 30) {
			return ((1.5 - (AÑO_ACTUAL - getAño())/30) * indice * getValor() / 10) / 100;
		}
		return 0;
	}
	
	public void setIndice(double indiceNuevo) {
		indice=indiceNuevo;
	}
}
