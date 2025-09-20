package ar.edu.udc.pp.tp2.imperativo;

import static org.junit.Assert.assertFalse;

public class ImperativoEnJava {
	
	/*
	 * Realiza la suma algebraica entre los operadores
	 * 
	 */
	public static int suma(int a, int b) {
		return a + b;
	}
	
	/*
	 * Devolver el máximo valor
	 */
	public static double maximo (double a, double b) {
		if (a >= b ) {return a;} else {return b;}
	}
	
	/*
	 * Devolver el máximo valor
	 */
	public static double maximo (double a, double b, double c) {
		if (a >= b ) && (a >= c) {return a;} else if (b >= a ) && (b >= c) {return b;} else {return c;};
	}
	
	/*
	 * Devolver el máximo valor
	 */
	public static int maximo(int... valores) {
		int valorMaximo = valores[0];
		for (int i = 1; i <= valores.length; i++) {if (valores[i] > valorMaximo) {valorMaximo = valores[i];}}
		return valorMaximo;
	}
	
	/*
	 * Devolver el valor absoluto
	 */
	public static float valorAbsoluto(float valor) {
		if (valor < 0) {return valor * (-1);}
		else {return valor;}
	}
	
	/*
	 * Devolver verdadero se el valor es par
	 */
	public static boolean esPar(int valor) {
		if (valor % 2 == 0) {return true;} else {return false;}
	}
	

	/*
	 * Indicar si el año recibido como paremtro es bisiesto.
	 * Son bisisetos los años divisibles por cuatro que no sean 
	 * divisibles por cien, los años divisibles por cuatrocientos 
	 * son siempre bisiestos.
	 */
	public static boolean esBisiesto(int anio) {
		if (anio % 400 == 0) {return true;}
		else if (anio % 4 == 0 && anio % 100 != 0) {return true;}
		else {return false;}
	}
	
	/*
	 * Devolver la cantidad de días que tien cada mes, 28 para el mes de febrero
	 */
	public static int cantidadDias(int mes) {
		if (mes == 2) {return 28;}
		else if (mes <= 7 && mes % 2 == 0) {return 30;}
		else if (mes <= 7 && mes % 2 != 0) {return 31;}
		else if (mes >= 7 && mes % 2 == 0) {return 31;}
		else if (mes >= 7 && mes % 2 != 0) {return 30;}
		else {return -1;}
	}
	
	
	/*
	 * Convierte temperatura expresada en Fahrenheit a centígrados  
	 */
	public static float fahrenheitToCelsius(float fahrenheit) {
		//(°F − 32) × 5/9 = 0 °C
		return (fahrenheit - 32) * 5/9;
	}

	/*
	 * Convierte temperatura expresada en centígrados a Fahrenheit   
	 */	
	public static float celsiusToFahrenheit(float celsius) {
		//(°C × 9/5) + 32 = 89.6 °F
		return celsius * 9/5 + 32 ;
	}

	/*
	 * Día de la semana según la norma ISO8601
	 * domingo=7, lunes=1, martes=2,..., sabado=6
	 * En minúsculas y sin tilde
	 */
	public static String diaSemana (int numeroDia) {
		switch (numeroDia) {
			case 1: return "lunes";
			case 2: return "martes";
			case 3: return "miercoles";
			case 4: return "jueves";
			case 5: return "viernes";
			case 6: return "sabado";
			case 7: return "domingo";
			case 8: return "osvaldo";
			default: return "error";
		}
	}

	/*
	 * Devuelve la suma acumulada de los números de 1 a n 
	 */
	public static int sumaAcumulada(int n) {
		int acumulado = 0;
		while (n > 0) {
			acumulado += n;
			n-=1;			
		}
		return acumulado;
	}
	
	/*
	 * Devuelve el factorial de n
	 */
	public static int factorial(int n) {		
		int acumulado = 1;
		while (n > 1) {
			acumulado *= n;
			n-=1;			
		}
		return acumulado;
	}
	
	/*
	 * Devuelve verdadero si el número es primo
	 */
	public static boolean esPrimo(int valor){
		if (valor <= 0) { return false;}
		else if (valor >= 1 && valor <= 3) {return true;}
		else {
			for (int i = 2; i<= valor/2; i++) {
				if (valor % i == 0) {return false;}
			}
			return true;
		}
	}
		

	/*
	 * Devuelve el valor promedio de los números informadoa 
	 */
	public static float promedio(int... valores) {
		int cont = 0;
		float acum = 0;
		for (int i=0; i < valores.length; i++) {
			cont++;
			acum+=valores[i];
		}
		return acum / cont;
	}
		
	/*
	 * Ordena el arreglo informado, devuelve una referencia 
	 * al arreglo recibido
	 */
	public static int[] ordenar (int[] valores) {
		return valores;
	}

	/*
	 * Invierte los valores del arreglo informado, 
	 * devuelve una referencia al arreglo recibido 
	 */
	public static int[] invertir (int[] valores) {
		return valores;
	}
	
	/*
	 * Devuelve el enésimo valor de la sucesión de fibonacci
	 */
	public static int fibonacci(int n) {
		return 0;
	}
	
	/*
	 * Devuelve la sucesión de fibonacci de orden n 
	 */
	public static int[] sucesionFibonacci (int n) {
		int[] retval = {1, 2, 3};
		return retval;
	}
	
	/*
	 * Devuelve un arreglo que es la concatenación de los arreglos recibidos
	 */
	public static String[] concatenar(String[] arreglo1, String [] arreglo2) {
		String[] concatenado;
		for (int i=0;i<arreglo1.length;i++) {
				concatenado[i] = arreglo1[i];
		}
		for (int i=0;i<arreglo2.length;i++) {
			concatenado[i + arreglo1.length] = arreglo2[i];
		}
		return concatenado;
	}

	/*
	 * Cifrado Cesar para codificar y decodificar un texto
	 * con desplazamaiento 1
	 * https://es.wikipedia.org/wiki/Cifrado_C%C3%A9sar
	 * alfabeto abcdefghijklmnopqrstuvwxyz
	 * los espacios se mantienencomo espacios
	 */
	public static String cifradoCesar (String cadena) {
		return cadena;
	}

	/*
	 * Cifrado Cesar para codificar y decodificar un texto con
	 * desplazamaiento arbitrario
	 */
	public static String cifradoCesar (String cadena, int desplazamiento) {
		return cadena;
	}
	
	/*
	 * Generar el Tríangulo de Pascal de orden n
	 * https://es.wikipedia.org/wiki/Tri%C3%A1ngulo_de_Pascal
	 *  
	 */
	public static int [][] trinaguloPascal (int n) {
		int [][] retval = {{1},{1,1}};
		return retval;
	}
	
}
