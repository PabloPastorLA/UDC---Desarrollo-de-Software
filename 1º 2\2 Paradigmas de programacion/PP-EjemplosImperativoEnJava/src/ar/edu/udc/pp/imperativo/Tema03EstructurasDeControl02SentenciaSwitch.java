package ar.edu.udc.pp.imperativo;

import java.util.Random;

public class Tema03EstructurasDeControl02SentenciaSwitch {

	private static Random rnd = new Random();

	public static void main(String[] args) {

		String[] dias = { "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo" };
		String dia = dias[rnd.nextInt(dias.length)];

		System.out.println("[" + dia + "]");

		if (dia.equals("Lunes")) {
			System.out.println("Ufff!, justo empezando la semana");
		} else if (dia.equals("Miercoles")) {
			System.out.println("A mitad de semana");
		} else if (dia.equals("Viernes")) {
			System.out.println("Mañana es fin de semana");
		} else if (dia.equals("Sábado") || dia.equals("Domingo")) {
			System.out.println("Disfruta del finde");
		} else {
			System.out.println("que tengas un buen día");
		}

		switch (dia) {
		case "Lunes":
			System.out.println("Ufff!, que la fuerza te acompañe");
			break;
		case "Miérccoles":
			System.out.println("Estamos a mitad de semana");
			break;
		case "Viernes":
			System.out.println("Mañana empieza el fin de semana");
			break;
		case "Sábado":
		case "Domingo":
			System.out.println("Disfruta del fin de semana");
			break;
		default:
			System.out.println("Que tengas un buen día");
			break;
		}
	}
}
