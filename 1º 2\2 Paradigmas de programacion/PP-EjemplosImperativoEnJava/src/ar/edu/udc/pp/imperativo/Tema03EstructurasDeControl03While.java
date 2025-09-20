package ar.edu.udc.pp.imperativo;

public class Tema03EstructurasDeControl03While {

	public static void main(String[] args) {
		int numero = 15;
		while (numero > 2) {
			System.out.println("El numero es " + numero);
			numero = numero - 3;
		}
		System.out.println("De vuelta...");
		numero = 15;
		do {
			System.out.println("El numero es " + numero);
			numero = numero - 3;
		} while (numero > 2);
		System.out.println("Final");
	}
}
