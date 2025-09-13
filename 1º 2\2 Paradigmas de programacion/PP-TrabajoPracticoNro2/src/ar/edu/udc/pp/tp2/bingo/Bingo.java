package ar.edu.udc.pp.tp2.bingo;

public class Bingo {
	
	void mainBingo() {
			
		int[] tirada1 = { 29, 43, 88, 36,  65, 80, 18, 87, 38, 17, 71, 7, 19, 48, 52, 59, 79};
		
		int [] tirada2 = {17, 29, 47, 67, 2, 12, 27, 88, 38, 56};
		
		int[][] carton1 = { {21, 38, 40, 50, 80},
							{ 2, 12, 27, 61, 86},
							{ 8, 17, 54, 64, 71}
							};
		
		int[][] carton2 = { {21, 38, 54, 50, 80},
							{ 2, 12, 27, 61, 86},
							{ 8, 17, 40, 64, 71}
				};
		int[][] carton3 = { { 18, 36, 43, 65, 80},
							{ 29, 38, 52, 71, 87},
							{  7, 19, 48, 59, 79}
				};
		int[][] carton4 = { { 11, 32, 44, 62, 73},
							{  8, 25, 38, 56, 80},
							{ 17, 29, 47, 67, 88}
				};
		int[][] carton5 = { { 26, 30, 55, 60, 81},
							{ 11, 37, 48, 76, 87},
							{  2, 19, 49, 69, 77}
				};
		int[][] carton6 = { {  2, 30, 55, 74, 86},
							{ 12, 28, 48, 64, 99},
							{  9, 16, 35, 58, 76}
				};
		int[][] carton7 = { { 4, 14, 38, 41, 86},
							{ 7, 19, 22, 45, 74},
							{25, 48, 57, 67, 78}
				};
		
		boolean mismos = mismosNumeros(carton1, carton2);
		System.out.println("CARTON 1 idem CARTON 2     " + (mismos ? "SI" : "NO") + " => " + ( mismos ? "OK!!!" : "FAIL!!!"));
		System.out.println("-----------------");
		System.out.println("La consigna solicita que los nros de ambos cartones se repitan, despreciando la posicion de c/elemento");
		System.out.println("Por esto el test debería ser OK!!! o cambiarse la consigna :)");
		System.out.println("-----------------");
		mismos = mismosNumeros(carton1, carton3);
		System.out.println("CARTON 1 idem CARTON 3     " + (mismos ? "SI" : "NO") + " => " + (!mismos ? "OK!!!" : "FAIL!!!"));
		
		boolean valido = esValido(carton1);
		System.out.println("CARTON 1 es valido?        " + (valido ? "SI" : "NO") + " => " + ( valido ? "OK!!!" : "FAIL!!!"));
		valido = esValido(carton4);
		System.out.println("CARTON 4 es valido?        " + (valido ? "SI" : "NO") + " => " + ( valido ? "OK!!!" : "FAIL!!!"));
		valido = esValido(carton6);
		System.out.println("CARTON 6 es valido?        " + (valido ? "SI" : "NO") + " => " + (!valido ? "OK!!!" : "FAIL!!!"));
		valido = esValido(carton7);
		System.out.println("CARTON 7 es valido?        " + (valido ? "SI" : "NO") + " => " + (!valido ? "OK!!!" : "FAIL!!!"));

		boolean hayLinea = hayLinea(carton3, tirada2);
		System.out.println("CARTON 3 tiene linea?      " + (hayLinea? "SI" : "NO") + " => " + (!hayLinea? "OK!!!" : "FAIL!!!"));

		hayLinea = hayLinea(carton4, tirada2);
		System.out.println("CARTON 4 tiene linea?      " + (hayLinea? "SI" : "NO") + " => " + ( hayLinea? "OK!!!" : "FAIL!!!"));

		boolean hayBingo = hayBingo(carton3, tirada1);
		System.out.println("CARTON 3 tiene bingo?      " + (hayBingo? "SI" : "NO") + " => " + ( hayBingo? "OK!!!" : "FAIL!!!"));

		hayBingo = hayBingo(carton4, tirada1);
		System.out.println("CARTON 4 tiene bingo?      " + (hayBingo? "SI" : "NO") + " => " + (!hayBingo? "OK!!!" : "FAIL!!!"));

		System.out.println("Los cartones");
		System.out.println("CARTON 1");
		imprimirCarton(carton1);
		System.out.println("CARTON 2");
		imprimirCarton(carton2);
		System.out.println("CARTON 3");
		imprimirCarton(carton3);
		System.out.println("CARTON 4");
		imprimirCarton(carton4);
		System.out.println("CARTON 5");
		imprimirCarton(carton5);
		System.out.println("CARTON 6");
		imprimirCarton(carton6);
				
	}	

	/**
	 * Devuelve verdadero si el carton es válido.
	 * Un carton válido está conformado por tres lineas de cinco números.
	 * Debe tener al menos un número de cada decena.
	 * No puede tener más de dos números de cada decena. 
	 * No debe tener números repetidos ni fuera del rango del 1 al 90. 
	 * Tener en cuenta que la octava docena incluye del 80 al 90.
	 * @param carton El carton a analizar
	 * @return Verdadero si el cartón es válido.
	 */
	boolean esValido (int[][] carton) {
/*		{21, 38, 40, 50, 80},
		{ 2, 12, 27, 61, 86},
		{ 8, 17, 54, 64, 71}		*/

		//Chequea que no hayan repetidos
		for (int i = 0; i<=2; i++) {
			for (int j = 0; j<=4; j++) {
				for (int k = 0; k<=2; k++) {
					for (int l = 0; l<=4; l++) {
						if (carton[i][j] == carton[k][l] && !(i == k && j == l)) {return false;}
					}
				}
			}
		}
		
		//declaramos el arreglo decenas
		int decenas[]= {0,0,0,0,0,0,0,0,0};
		for (int i = 0; i<=2; i++) {
			for (int j = 0; j<=4; j++) {
				//En cada elemento de decenas[] asignamos cuantos nros hay por decena
				if (carton[i][j] >= 1 && carton[i][j] <= 9) {decenas[0] += 1;}
				if (carton[i][j] >= 10 && carton[i][j] <= 19) {decenas[1] += 1;}
				if (carton[i][j] >= 20 && carton[i][j] <= 29) {decenas[2] += 1;}
				if (carton[i][j] >= 30 && carton[i][j] <= 39) {decenas[3] += 1;}
				if (carton[i][j] >= 40 && carton[i][j] <= 49) {decenas[4] += 1;}
				if (carton[i][j] >= 50 && carton[i][j] <= 59) {decenas[5] += 1;}
				if (carton[i][j] >= 60 && carton[i][j] <= 69) {decenas[6] += 1;}
				if (carton[i][j] >= 70 && carton[i][j] <= 79) {decenas[7] += 1;}
				if (carton[i][j] >= 80 && carton[i][j] <= 90) {decenas[8] += 1;}
				
				//Chequea que valga entre 1 y 90
				if (carton[i][j] < 1 || carton[i][j] > 90) {return false;}
			}
		}
		/*recorremos el arreglo decenas y verificamos por cada elemento asignamos cuantos nros hay por decena
		si no tiene ninguno o tiene mas de 2, retorna falso*/
		for (int i = 0; i<=8; i++) {
			if (decenas[i]==0 || decenas[i]>2) {return false;}
		}
		return true;
	}

	/**
	 * 
	 * @param carton1 El primer cartón
	 * @param carton2 El segundo cartón
	 * @return Verdadero si ambos cartones tienen los mismos quince números 
	 */
	boolean mismosNumeros(int[][] carton1, int[][] carton2) {
		
		/*en los sgtes bucles se va comparando los nros del 1er carton contra los del segundo.
		por cada vuelta en que un nro es encontrado, se interrumple el bucle y continua al proximo
		si no se encuentra retorna falso, si se encuentran todos nunca alcanza el retorno en falso
		y continua hasta retornar en verdadero*/

		boolean romper=false;
		for (int i = 0; i<=2; i++) {
			for (int j = 0; j<=4; j++) {
				for (int k = 0; k<=2; k++) {
					for (int l = 0; l<=4; l++) {
						if (carton1[i][j] == carton2[k][l]) {romper = true;}
						if (romper) {continue;}
					}
					if (romper) {continue;}
					return false;
				}
				romper = false;
			}
		}		
		return true;
	}
	
	/**
	 * 
	 * @param carton El carton a verificar.
	 * @param bolillas Las bolillas sorteadas hasta el momento.
	 * @return Verdadero si hay linea.
	 */
	boolean hayLinea(int[][] carton, int[] bolillas) {
		
		/*definimos continuar para flaguear que se encontro la bolilla
		y saltarAlProximo para indicar que la bolilla no se encontro y debe continuar a la proxima  linea*/
		boolean continuar = false;
		boolean saltarAlProximo = false;
		
		//los proximos 2 for son para recorrer el nro en el carton
		for (int i = 0; i<=2; i++) {
			for (int j = 0; j<=4; j++) {
				
				//estye es para recorrer las bolillas
				for (int k = 0; k<=bolillas.length-1; k++) {
					if (carton[i][j] == bolillas[k]) {continuar = true;} //nro de bolilla encontrado en la linea					
				}
				
				
				if (continuar) {continuar = false; continue;}
				else {saltarAlProximo = true;}
			}
			if (!saltarAlProximo) {return true;}
			else {saltarAlProximo = false;}
		}
		return false;

	}

	/**
	 * 
	 * @param carton El carton a verificar.
	 * @param bolillas Las bolillas sorteadas hasta el momento.
	 * @return Verdadero si hay bingo.
	 */
	boolean hayBingo(int[][] carton1, int[] bolillas) {
		/*definimos continuar para flaguear que se encontro la bolilla
		y saltarAlProximo para indicar que la bolilla no se encontro y debe continuar a la proxima  linea*/
		boolean continuar = false;
		
		//los proximos 2 for son para recorrer el nro en el carton
		for (int i = 0; i<=2; i++) {
			for (int j = 0; j<=4; j++) {
				
				//estye es para recorrer las bolillas
				for (int k = 0; k<=bolillas.length-1; k++) {
					if (carton1[i][j] == bolillas[k]) {continuar = true;} //nro de bolilla encontrado en la linea					
				}
				
				
				if (continuar) {continuar = false; continue;}
				else {return false;}
			}
		}
		return true;

	}

	/**
	 * Imprime el carton en formato de nueve columnas. 
	 * 
	 * @param carton El cartona imprimir
	 */
	void imprimirCarton(int[][] carton) {
		int[] vectorCarton= new int [15];

		
		//Pasamos la matriz carton a un vector 
		for (int i = 0; i<=carton.length-1; i++) {
			for (int j = 0; j<=carton[i].length-1; j++) {
				//int k= i*5 + j;
				if (carton[i][j]>90 || carton[i][j]< 1) {
					System.out.print("Valor erroneo en elemento del carton: " + carton[i][j]);
					System.out.println("\n\n\n--------------------------------------------");
					return;
				}
				vectorCarton[i*5 + j] = carton[i][j];
			}
		}
		
		//ordenamos el vector
		int aux;
		for (int i = 0; i<=vectorCarton.length-2; i++) {
			for (int j = 0; j<=vectorCarton.length-2; j++) {
				
				if (vectorCarton[j] > vectorCarton[j + 1]) {
					aux = vectorCarton[j];
					vectorCarton[j] = vectorCarton[j+1];
					vectorCarton[j+1] = aux;				
				}
			}	
		}
		
		//For para imprimir el vector. queda por posible debug futuro
		/*for (int i = 0; i<=14; i++) {
			System.out.print(vectorCarton[i]+" | ");
		} */
		
		//Constantes del tamaño del carton, para darle ALGO de dinamismo
		//(algo, en caso de variar corregir el codigo)
		int anchoDelCarton=9;
		int altoDelCarton=3;
		
		//deinimos el nuevo carton, q	ue va a incluir espacios entre nros, y vectores contadores
		//para no sobrepasar el maximo x fila y columna
		int[][] nuevoCarton= new int [altoDelCarton][anchoDelCarton];
		int[] cantHorizontal= new int [anchoDelCarton];
		int[] cantVertical= new int [altoDelCarton];
		
		for (int elem : vectorCarton) {
			boolean romper = false;
			for (int ix =0; ix < anchoDelCarton; ix++) {
				for (int iy =0; iy < altoDelCarton; iy++) {
					
					//la sgte flag es para determinar bajo que condiciones los elementos del vectos se posicionan o no como elemento del vector
//	FALTA PULIR, POR LA RESTRICCION DE 5 HORIZONTALES NO LOGRAMOS EMPLAZAR EL ELEMENTO
					boolean okPosicion= (         (iy==0 && (ix==0 || nuevoCarton[iy][ix -1]==0 || ix==1))            ||          (iy==1 )         ||          iy==2) ;
					if ( elem / 10 < ix +1 && nuevoCarton[iy][ix]==0 && cantHorizontal[ix] < 2 && cantVertical[iy] < 5 && okPosicion ){ 
						nuevoCarton[iy][ix] = elem;
						cantHorizontal[ix] = cantHorizontal[ix] + 1;
						cantVertical[iy] = cantVertical[iy] +1;
						romper = true;			
					}
					if (romper) {break;}
				}
				if (romper) {break;}
			}
		}
		
		//Imprimimos el carton, reemplazando "0" por espacios y dando formato agregando "0" a los nros
		//menores a 10 para mantener la misma cant de digitos
		System.out.println("\n--------------------------------------------");
		for (int[] fila : nuevoCarton) {
			for (int elem : fila) {
				if (elem == 0) {System.out.print("  " + " | ");}
				else if (elem > 0 && elem <10) {System.out.print("0" + elem + " | ");}
				else {System.out.print(elem + " | ");}
			}
			System.out.println("\n--------------------------------------------");
		}		
		
		System.out.println("\n\n\n--------------------------------------------");

	}

	// Pronto entenderemos porqué esto tiene esta forma. Paciencia!
	public static void main(String[] args) {
		new Bingo().mainBingo();
	}
	
}
