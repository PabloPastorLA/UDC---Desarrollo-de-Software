Algoritmo bbusquedaBinaria
	definir i, j, arr Como Entero;
	
	mostrar "ingrese tamanio";
	leer i;
	
	dimensionar arr[i];
	
	para 
	
	
FinAlgoritmo





Funcion retorno = BusquedaBinaria(arr, tamanio, buscar)
	Definir retorno, inicio, final, medio como Entero;
	Definir encontrado como Logico;

	inicio = 0;

	final = tamanio - 1;

	encontrado = Falso;

	retorno = -1;

	mientras no encontrado Hacer
		si inicio > final Entonces
			//no se encontró el valor y se agotò la busqueda
			encontrado = Verdadero;
			retorno = -1;
		SiNo
			medio = trunc((inicio + final) / 2);
			si arr[medio] == buscar Entonces
				encontrado = Verdadero;
				retorno = medio;
			Sino
				si buscar < arr[medio] Entonces
					final = medio - 1;
				SINO
					inicio = medio + 1;
				FinSi
			Finsi
		Finsi
	FinMientras
FinFuncion
