Proceso ordenamiento_Burbuja
	//	Este algoritmo permite ordenar un arreglo de enteros de menor a mayor
	//	recorriendolo tantas veces como sea su tamaño, e intercambiando posiciones
	// en comparaciones entre el elemento y su posterior, una a una. El recorrerlo
	// tantas veces como su tamaño permite ordenarlo por mas que este de mayor a menor
	
	// el script fue escrito hace unos meses, y no llego a renombrar las variables a nombres acordes
	
	definir ar, tamar, aux, almax Como Entero;
	definir loopear Como Logico;
	
//	constantes modificables
	tamar = 6;
	almax= 6;
	
	
	loopear = Verdadero;
	Dimensionar ar[tamar];
	llenararreglo(ar, tamar, almax);
	
	mostrararreglo(ar, tamar);
	
	Mientras loopear
		loopear = Falso;
		para i=0 hasta tamar-2
			si ar[i] > ar[i+1] Entonces
				aux = ar[i];
				ar[i] = ar[i+1];
				ar[i+1]=aux;
				loopear = Verdadero;
			FinSi
		FinPara
	FinMientras
	
	mostrararreglo(ar, tamar);

FinProceso

Funcion llenararreglo(ar, tamar, almax)
	para i=0 Hasta tamar-1
		ar[i] = Aleatorio(0,almax);
	FinPara
FinFuncion

Funcion mostrararreglo(ar Por Referencia, tamar)
	mostrar "--------------------------";
	mostrar Sin Saltar "| ";
	para i = 0 hasta tamar -1
		mostrar Sin Saltar ar[i] " | ";
	FinPara
	mostrar"";
	mostrar "--------------------------";
FinFuncion

