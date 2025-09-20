/*
//x		//Implemente una jerarquía de clases para las cuentas bancarias de un banco.
		//Existen cuentas bancarias de dos tipos: caja de ahorro y cuenta corriente.
		//Las cuentas corrientes tienen un interés del 8% anual y las cajas de ahorro un 6% anual.
		//Los costos mensuales son de 52,37 pesos para las CC y de 32,24 para las CA.
		//Las cuentas corrientes tienen un descubierto máximo de 85000 pesos, el oficial de cuenta determina cuál es el monto para descubierto durante la
		//creación de cada cuenta; un cliente puede solicitar la modificación de su descubierto, de manera que debe existir una forma de modificar ese atributo.
		//Implemente los intereses como atributos de clase, y provea un método para modificar la tasa de interés anual.
		//En una cuenta bancaria se puede depositar o extraer dinero, implemente los métodos correspondientes, así como una consulta de saldo.
		//Recuerde controlar que haya fondos para las extracciones.

*/
package ej1CuentasBancarias;

public class Corriente extends Cuenta{
	//Constantes
	static final double INTERESANUAL = 1.08;
	static final double COSTOMENSUAL = 52.37;
	
	//atributo de clase
	static private double interes_anual = INTERESANUAL;

	//constructor
	public Corriente(double saldo, double descubierto) {
//		public Cuenta(double saldo, double interes_anual, double costo_mensual, double descubierto) {
		super(saldo, COSTOMENSUAL, descubierto);
	}
	
	//metodos
	public int setDescubierto(double descubiertoNuevo) {
        if (descubiertoNuevo <= descubierto_MAX) {
    	    descubierto = descubiertoNuevo;
        	return 0;
        }
    	else {return 1;}
	}

	public double getInteresAnual() {
		return interes_anual;
	}
	
	public static void setInteresAnual(double interes) {
		interes_anual=interes;
	}
}
