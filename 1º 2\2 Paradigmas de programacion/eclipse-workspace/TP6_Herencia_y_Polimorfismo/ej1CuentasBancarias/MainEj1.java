package ej1CuentasBancarias;

public class MainEj1 {

	public static void main(String[] args) {
		//Ejercicio número 1
		//Implemente una jerarquía de clases para las cuentas bancarias de un banco.
		//Existen cuentas bancarias de dos tipos: caja de ahorro y cuenta corriente.
		//Las cuentas corrientes tienen un interés del 8% anual y las cajas de ahorro un 6% anual.
		//Los costos mensuales son de 52,37 pesos para las CC y de 32,24 para las CA.
		//Las cuentas corrientes tienen un descubierto máximo de 85000 pesos, el oficial de cuenta determina cuál es el monto para descubierto durante la
		//creación de cada cuenta; un cliente puede solicitar la modificación de su descubierto, de manera que debe existir una forma de modificar ese atributo.
		//Implemente los intereses como atributos de clase, y provea un método para modificar la tasa de interés anual.
		//En una cuenta bancaria se puede depositar o extraer dinero, implemente los métodos correspondientes, así como una consulta de saldo.
		//Recuerde controlar que haya fondos para las extracciones.

		
//		public Cuenta(double saldo, double costo_mensual, double descubierto) {
//		public Corriente(double saldo, double descubierto) {
//		public Ahorro(double saldo) {

		Ahorro ca1 = new Ahorro (152.5);
		Ahorro ca2 = new Ahorro (30000.50);
		Corriente cc1 = new Corriente(15000, 5000);
		Corriente cc2 = new Corriente(100000, 85001);
		System.out.println(cc2.getDescubierto());
		
		
		
		System.out.println(ca1.getSaldo());
		System.out.println(ca2.getSaldo());
		System.out.println(cc1.getSaldo());
		System.out.println(cc2.getSaldo());
		
		System.out.println(ca1.getCostoMensual());
		System.out.println(ca2.getCostoMensual());
		System.out.println(cc1.getCostoMensual());
		System.out.println(cc2.getCostoMensual());
		
		System.out.println(ca1.getInteresAnual());
		System.out.println(ca2.getInteresAnual());
		System.out.println(cc1.getInteresAnual());
		System.out.println(cc2.getInteresAnual());

		
		System.out.println(ca1.getDescubierto());
		System.out.println(ca2.getDescubierto());
		System.out.println(cc1.getDescubierto());
		System.out.println(cc2.getDescubierto());

		
		Corriente.setInteresAnual(1.12);
		System.out.println(cc1.getInteresAnual());
		
		Corriente cc3 = new Corriente(15000, 5000);
		System.out.println(cc3.getSaldo());
		System.out.println(cc3.getDescubierto());
		if (cc3.setExtraer(16000)) {
			System.out.println("Saldo: " + cc3.getSaldo());
			System.out.println("Descubierto: " + cc3.getDescubierto());
		} else {System.out.println("Fondos insuficientes. Descubierto Superado");}

		if (cc3.setExtraer(4000)) {
			System.out.println("Saldo: " + cc3.getSaldo());
			System.out.println("Descubierto: " + cc3.getDescubierto());
		} else {System.out.println("Fondos insuficientes. Descubierto Superado");}
		
		if (cc3.setExtraer(4)) {
			System.out.println("Saldo: " + cc3.getSaldo());
			System.out.println("Descubierto: " + cc3.getDescubierto());
		} else {System.out.println("Fondos insuficientes. Descubierto Superado");}

		
		
		
	}

}
