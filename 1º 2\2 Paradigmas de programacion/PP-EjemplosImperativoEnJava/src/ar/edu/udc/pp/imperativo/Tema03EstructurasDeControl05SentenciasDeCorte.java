package ar.edu.udc.pp.imperativo;

public class Tema03EstructurasDeControl05SentenciasDeCorte {

	public static void main(String[] args) {
		for (int i = 1; i <= 15; i++) {
			if (i < 5) {
				continue; // Salta los números menores que 5
			}
			if (i > 10) {
				break; // Termina el ciclo después del 10
			}
			System.out.println(i); // Imprime los números entre 5 y 10
		}
	}
}
