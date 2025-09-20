package ar.edu.udc.pp.imperativo;

import java.util.Random;

public class Tema03EstructurasDeControl01SentenciaIf {
	
	private static Random rnd = new Random(); 

	public static void main(String[] args) {
		
		int num1, num2;
		
		num1 = rnd.nextInt(10) + 1;
		num2 = rnd.nextInt(10) + 1;
		
		System.out.printf("Los n�meros generados son %d y %d\n", num1, num2 );
		
		if (num1 % num2 != 0) {
			System.out.println("El resto es: " + num1 % num2);
		} else {
			System.out.println("El primer n�mero es divisible por el segundo");
		}

		if (num1 == num2) {
			System.out.println("Los n�meros son iguales");
		} else if (num1 > num2) {
			System.out.println("El primero es mayor que segundo");
		} else {
			System.out.println("El primero es menor que segundo");
		}
		
		//Con operador condiconal
		System.out.println("El primero es " + ((num1==num2) ? "igual" : (num1< num2) ? "menor": "mayor") + " que segundo");
		
		
	}

}
