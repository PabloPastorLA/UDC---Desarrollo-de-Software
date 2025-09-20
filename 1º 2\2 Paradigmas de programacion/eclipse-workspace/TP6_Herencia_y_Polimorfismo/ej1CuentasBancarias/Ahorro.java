

/*
//x		//Implemente una jerarquía de clases para las cuentas bancarias de un banco.
//x		//Existen cuentas bancarias de dos tipos: caja de ahorro y cuenta corriente.
//x		//Las cuentas corrientes tienen un interés del 8% anual y las cajas de ahorro un 6% anual.
//x		//Los costos mensuales son de 52,37 pesos para las CC y de 32,24 para las CA.
		//Las cuentas corrientes tienen un descubierto máximo de 85000 pesos, el oficial de cuenta determina cuál es el monto para descubierto durante la //creación de cada cuenta
		//un cliente puede solicitar la modificación de su descubierto, de manera que debe existir una forma de modificar ese atributo.
		//Implemente los intereses como atributos de clase, y provea un método para modificar la tasa de interés anual.
		//En una cuenta bancaria se puede depositar o extraer dinero, implemente los métodos correspondientes, así como una consulta de saldo.
		//Recuerde controlar que haya fondos para las extracciones.
*/



package ej1CuentasBancarias;

public class Ahorro extends Cuenta {
	//constantes
	static final double INTERESANUAL = 1.06;
	static final double COSTOMENSUAL = 32.24;
	
	//atrib
	static private double interes_anual = INTERESANUAL;

	//atributo de clase
	
	//const
	public Ahorro(double saldo) {
		//el 0 es porque las cajas de ahorro no poseen descubierto
		super(saldo, COSTOMENSUAL, 0);
	}
	public double getInteresAnual() {
		return interes_anual;
	}
	static public void setInteresAnual(double interes) {
		interes_anual=interes;
	}
}