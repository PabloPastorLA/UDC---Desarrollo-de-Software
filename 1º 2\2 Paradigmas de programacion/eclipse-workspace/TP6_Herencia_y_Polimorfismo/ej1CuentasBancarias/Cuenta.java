//x		//Implemente una jerarquía de clases para las cuentas bancarias de un banco.
		//Existen cuentas bancarias de dos tipos: caja de ahorro y cuenta corriente.
		//Las cuentas corrientes tienen un interés del 8% anual y las cajas de ahorro un 6% anual.
		//Los costos mensuales son de 52,37 pesos para las CC y de 32,24 para las CA.
		//Las cuentas corrientes tienen un descubierto máximo de 85000 pesos
		//el oficial de cuenta determina cuál es el monto para descubierto durante la creación de cada cuenta;
		//un cliente puede solicitar la modificación de su descubierto, de manera que debe existir una forma de modificar ese atributo.
		//Implemente los intereses como atributos de clase, y provea un método para modificar la tasa de interés anual.
		//En una cuenta bancaria se puede depositar o extraer dinero, implemente los métodos correspondientes, así como una consulta de saldo.
		//Recuerde controlar que haya fondos para las extracciones.

package ej1CuentasBancarias;

public class Cuenta {
	//constantes
	static final double descubierto_MAX = 85000;
	
	//atrib
	private double saldo;
	private double costo_mensual;
	//protected pata podes acceder al atrib desde la subclase
	protected double descubierto;
	
	//const
	public Cuenta(double saldo, double costo_mensual, double descubierto) {
		this.saldo=saldo;
		this.costo_mensual=costo_mensual;		
	
        if (descubierto <= descubierto_MAX) {
    	    this.descubierto = descubierto;}
    	else {
            // para detener el constructor
    		System.out.println("Se excedió en el descubierto, q ue es de: " + descubierto_MAX);
    		this.descubierto = descubierto_MAX;
    		System.out.println("Creamos la cuenta con " + descubierto_MAX);
    		//throw new IllegalArgumentException("Saldo inicial menor que el mínimo: " + descubierto_MAX);
    		
        }
	}
 	//metodos
	public double getSaldo() {
		return saldo;
	}

	public double getDescubierto() {
		return descubierto;
	}

	public double getCostoMensual() {
		return costo_mensual;
	}

	public boolean setExtraer(double saldoAExtraer) {
		if (saldoAExtraer <= saldo + descubierto) {
			saldo -= saldoAExtraer;
			return true;
		}
		else {return false;}	
	}

	public void setDepositar(double saldoADepositar) {
		saldo += saldoADepositar;
	}
}