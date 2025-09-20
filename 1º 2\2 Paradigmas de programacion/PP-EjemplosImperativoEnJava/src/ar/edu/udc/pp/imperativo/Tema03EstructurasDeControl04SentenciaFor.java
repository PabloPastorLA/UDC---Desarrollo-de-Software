package ar.edu.udc.pp.imperativo;

public class Tema03EstructurasDeControl04SentenciaFor {
	public static void main(String[] args) {

		// Arreglo de Strings con los nombres de los días de la semana
		String[] dias = { "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo" };

		// Bucle for tradicional: itera usando un índice (i)
		for (int i = 0; i < dias.length; i++) {
		    System.out.println("- " + dias[i]);
		}

		System.out.println(); // Salto de línea

		// Bucle for-each: itera directamente sobre los elementos del arreglo
		for (String dia : dias) {
		    System.out.println("+ " + dia);
		}				
	}
}
