package ar.edu.udc.pp.imperativo;

/**
 * Ejemplos de declaraciones y asignaciones de tipos primitivos.
 * 
 * @author Santiago Della Torre
 *
 */
public class Tema01TiposPrimitivos {
	
	public static void main(String[] args) {
		
		byte b;
		short s;
		int i;
		long l = 123L;      //Se puede inicializar en la declaración 
		float f;
		double d;
		char c;
		boolean bool;
		
		b = 8;
		
		/* Hay una clase asociada a cada tipo de datos primitivo. 
		 * Entre otrras cosas le podemos pedir a la cada una de ellas 
		 * el mínimo y máximo valor permitido para cada tipo.  
		 */
		b = Byte.MIN_VALUE; 		
		
		System.out.println(
				"El máximo valor que se puede almacenar "
				+ "en una variable de tipo byte es " 
				+ Byte.MAX_VALUE);
		
		/*
		 * Ejercicio:
		 * a) Escriba un programa que imprima el mínimo valor permitido
		 * y el máximo valor permitido para cada uno d elos tipos enteros.
		 * b) Responda ¿Estos valores máximos y mínimos difieren entre distintos sistemas (SO y hardware)? 
		 */
		
		
		/* Ejercicio
		 * ¿Porqué la asignación que está a continuación no funciona? 
		 */
		// b = 5000; // <---- Descomentar para corroborar que no funciona 

		// En java se controla que toda variable local deba ser incializada antes de usarla 
		// b = i;    // <---- Al descomentar vermos que falla
		
		i = 12;
		// b = i;    // <---- Preguta: ¿Porqué falla si 12 es un valor aceptado por un byte?
		             //       Pregunta ¿Como puedo forzar la asignación?

		//Asignación de literales
		i = 12;    //Decimal
		i = 012;   //Octal
		i = 0x12;  //Hexadecimal
		System.out.println("c = " + i);

		
		//Literales con underscore 
		long habitantesDeLaTierra = 7490475892L;
		//O mejor, por temas de legibilidad
		habitantesDeLaTierra = 7_490_475_892L;

		/* Para el dato actualizado ver:
		 *    http://www.worldometers.info/world-population/ 
		 */		
		
		System.out.println("En la tierra hay " + habitantesDeLaTierra + " habitantes");
		System.out.printf("En la tierra hay %d habitantes\n", habitantesDeLaTierra);
		System.out.printf("En la tierra hay %,d habitantes\n", habitantesDeLaTierra);
		/* Es aconsejable usar salida con formato
		 * Referencia rápida printf 
		 * http://web.cerritos.edu/jwilson/SitePages/java_language_resources/Java_printf_method_quick_reference.pdf 
		 */
		
		/* Flotantes */		
		double d1 = 123.4;
		double d2 = 1.234e2;
		float f1  = 123.4f;
		
		/* Caracteres */
		char caracterEspecial = '\u00e4'; //La letra a con diéresis
		System.out.println(caracterEspecial);

		String cad = "";
		for (i = 0; i<=30 ; i++) {
			cad += caracterEspecial++;  
		}
		System.out.println(cad);
		
		
		/*Secuencias de escape*/
		cad = "M\u00e6ler\nc:\\";
		System.out.println(cad);
		
		/*  
		 * Java tutorial
		 * https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
		 * 
		 * Traducido no oficial: 
		 * http://www.codexion.com/tutorialesjava/java/nutsandbolts/datatypes.html
		 */
		
	}

}
