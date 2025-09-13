Proceso Ordenamiento_burbuja
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

