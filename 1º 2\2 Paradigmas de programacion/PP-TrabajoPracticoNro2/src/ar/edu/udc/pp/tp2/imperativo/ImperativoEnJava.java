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
		return a > b ? a : b;
	}
	
	/*
	 * Devolver el máximo valor
	 */
	public static double maximo (double a, double b, double c) {
		return (a > b && a > c) ? a : b > c ? b : c;
	}
	
	/*
	 * Devolver el máximo valor
	 */
	public static int maximo(int... valores) {
		int maximo = valores [0];
		for (int v: valores) {
			if (v > maximo) {
				maximo = v;
			}
		}
		return maximo;
	}
	
	/*
	 * Devolver el valor absoluto
	 */
	public static float valorAbsoluto(float valor) {
	
		return (valor < 0) ? -valor : valor;
	}
	
	/*
	 * Devolver verdadero se el valor es par
	 */
	public static boolean esPar(int valor) {
		return valor % 2 == 0;
	}
	

	/*
	 * Indicar si el año recibido como paremtro es bisiesto.
	 * Son bisisetos los años divisibles por cuatro que no sean 
	 * divisibles por cien, los años divisibles por cuatrocientos 
	 * son siempre bisiestos.
	 */
	public static boolean esBisiesto(int anio) {
		return (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
	}
	
	/*
	 * Devolver la cantidad de días que tien cada mes, 28 para el mes de febrero
	 */
	public static int cantidadDias(int mes) {
		switch (mes) {
			case 1: 
			case 3:
			case 5: 
			case 7:
			case 8:
			case 10:
			case 12:
				return 31;
			case 4:
			case 6:
			case 9:
			case 11:
				return 30;
			case 2:
				return 28;
			default:
				return -1;
		}
		}
	
	
	/*
	 * Convierte temperatura expresada en Fahrenheit a centígrados  
	 */
	public static float fahrenheitToCelsius(float fahrenheit) {
		return (fahrenheit - 32) * 5f / 9f;
	}

	/*
	 * Convierte temperatura expresada en centígrados a Fahrenheit   
	 */	
	public static float celsiusToFahrenheit(float celsius) {
		return celsius * 9 / 5 + 32;
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
        default: return "Ese dia no existe.";
    }
	}	

	/*
	 * Devuelve la suma acumulada de los números de 1 a n 
	 */
	public static int sumaAcumulada(int n) {
		int suma = 0;
	    for (int i = 1; i <= n; i++) {
	        suma += i;
	    }
	    return suma;
	}
	
	/*
	 * Devuelve el factorial de n
	 */
	public static int factorial(int n) {		
		return (n <= 1) ? 1 : n * factorial(n - 1);
	}
	
	/*
	 * Devuelve verdadero si el número es primo
	 */
	public static boolean esPrimo(int valor){
		if (valor <= 1) return false;
	    for (int i = 2; i * i <= valor; i++) {
	        if (valor % i == 0) return false;
	    }
		return true;		
	}
		
	/*
	 * Devuelve el valor promedio de los números informadoa 
	 */
	public static float promedio(int... valores) {
		int suma = 0;
	    int contador = 0;
	    for (int v : valores) {
	        suma += v;
	        contador++;
	    }
	    if (contador == 0) return 0;  
	    return (float) suma / contador;
	}
	
		
	/*
	 * Ordena el arreglo informado, devuelve una referencia 
	 * al arreglo recibido
	 */
	public static int[] ordenar (int[] valores) {
		for (int i = 0; i < valores.length - 1; i++) {
            for (int j = 0; j < valores.length - 1 - i; j++) {
                if (valores[j] > valores[j + 1]) {
                    int temp = valores[j];
                    valores[j] = valores[j + 1];
                    valores[j + 1] = temp;
                }
            }
        }
		return valores;
	}

	/*
	 * Invierte los valores del arreglo informado, 
	 * devuelve una referencia al arreglo recibido 
	 */
	public static int[] invertir (int[] valores) {
		int inicio = 0;
        int fin = valores.length - 1;

        while (inicio < fin) {
            int temp = valores[inicio];
            valores[inicio] = valores[fin];
            valores[fin] = temp;

            inicio++;
            fin--;
        }
		return valores;
	}
	
	/*
	 * Devuelve el enésimo valor de la sucesión de fibonacci
	 */
	public static int fibonacci(int n) {
		if (n == 0) return 0;
        if (n == 1) return 1;

        int a = 0; 
        int b = 1; 

        for (int i = 2; i <= n; i++) {
            b = b + a; 
            a = b - a; 
        }

        return b;
    }
	
	/*
	 * Devuelve la sucesión de fibonacci de orden n 
	 */
	public static int[] sucesionFibonacci (int n) {
		int[] retval = {1, 2, 3};
	    if (n <= 0) {
	        retval = new int[0];
	    } else if (n == 1) {
	        retval = new int[]{1};
	    } else if (n == 2) {
	        retval = new int[]{1, 1};
	    } else if (n >= 3) {
	        retval = new int[n];
	        retval[0] = 1;
	        retval[1] = 1;
	        for (int i = 2; i < n; i++) {
	            retval[i] = retval[i - 1] + retval[i - 2];
	        }
	    }
	    return retval;
	}
	/*
	 * Devuelve un arreglo que es la concatenación de los arreglos recibidos
	 */
	public static String[] concatenar(String[] arreglo1, String [] arreglo2) {
		String[] resultado = new String[arreglo1.length + arreglo2.length];

        
        for (int i = 0; i < arreglo1.length; i++) {
            resultado[i] = arreglo1[i];
        }

        
        for (int i = 0; i < arreglo2.length; i++) {
            resultado[arreglo1.length + i] = arreglo2[i];
        }

        return resultado;
    }

	/*
	 * Cifrado Cesar para codificar y decodificar un texto
	 * con desplazamaiento 1
	 * https://es.wikipedia.org/wiki/Cifrado_C%C3%A9sar
	 * alfabeto abcdefghijklmnopqrstuvwxyz
	 * los espacios se mantienencomo espacios
	 */
	public static String cifradoCesar (String cadena) {
		String resultado = "";

        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);

            if (c >= 'a' && c <= 'z') {
                c = (char) ('a' + (c - 'a' + 1) % 26);
            }
            resultado += c;
        }
        return resultado;
    }
	/*
	 * Cifrado Cesar para codificar y decodificar un texto con
	 * desplazamaiento arbitrario
	 */
	public static String cifradoCesar (String cadena, int desplazamiento) {
		desplazamiento = desplazamiento % 26;

	    String resultado = "";

	    for (int i = 0; i < cadena.length(); i++) {
	        char c = cadena.charAt(i);

	        if (Character.isUpperCase(c)) {
	            char ch = (char) ((c - 'A' + desplazamiento + 26) % 26 + 'A');
	            resultado += ch;
	        } else if (Character.isLowerCase(c)) {
	            char ch = (char) ((c - 'a' + desplazamiento + 26) % 26 + 'a');
	            resultado += ch;
	        } else {
	            resultado += c;
	        }
	    }

	    cadena = resultado;  
	    return cadena;
	}
	
	/*
	 * Generar el Tríangulo de Pascal de orden n
	 * https://es.wikipedia.org/wiki/Tri%C3%A1ngulo_de_Pascal
	 *  
	 */
	public static int [][] trinaguloPascal (int n) {
		int [][] retval = {{1},{1,1}};
		if (n <= 0) {
	        retval = new int[0][];
	    } else if (n == 1) {
	        retval = new int[1][];
	        retval[0] = new int[]{1};
	    } else if (n == 2) {
	        
	    } else {
	        retval = new int[n][];
	        retval[0] = new int[]{1};
	        retval[1] = new int[]{1, 1};

	        
	        for (int i = 2; i < n; i++) {
	            retval[i] = new int[i + 1];
	            retval[i][0] = 1;
	            retval[i][i] = 1;

	            for (int j = 1; j < i; j++) {
	                retval[i][j] = retval[i - 1][j - 1] + retval[i - 1][j];
	            }
	        }
	    }

	    return retval;
	}
	
}
