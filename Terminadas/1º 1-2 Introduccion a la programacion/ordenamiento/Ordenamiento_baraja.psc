Proceso Ordenamiento_baraja
	definir arr, aux, tamarr, maxaleatorio como entero;
	
//	Constantes (se pueden toquetear):
	
//	tamarr = 4;	
	tamarr = 20;
	maxaleatorio = 100;
	
	
	mostrar	"--------------------------------------";
	mostrar	"Ordenamiento_baraja, crotencio version";
	mostrar	"--------------------------------------";

//	dimensionar y rellenar arreglo
	Dimensionar arr[tamarr];
	para i=0 Hasta tamarr-1 Hacer
		arr[i] = Aleatorio(0,tamarr);
	FinPara
	
//	rellenomanual(arr, tamarr);
	
	mostrarr(arr, tamarr);
	
	para i=1 Hasta tamarr-1 Hacer
		h=i-1;
		si arr[i] < arr[h] Entonces
			Repetir
				//ordenar
				aux = arr[h+1];
				arr[h+1] = arr[h];
				arr[h] = aux;
				
				//decrementar indice
				h = h-1;
			Hasta Que h = -1 o arr[h+1] >= arr[h]
		FinSi
	FinPara
	
	Mostrarr(arr, tamarr);
FinProceso

Funcion mostrarr(arr Por Referencia, tamarr)
	Mostrar " - - - - - - - - - - - ";
	para i=0 Hasta tamarr-1 Hacer
		Mostrar arr[i]  " | ";
	FinPara
	Mostrar " - - - - - - - - - - - ";
FinFuncion

Funcion rellenomanual(arr Por Referencia, tamarr)
//	arr[0]=0;
//	arr[1]=1;
//	arr[2]=2;
//	arr[3]=3;
	
//	arr[0]=1;
//	arr[1]=0;
//	arr[2]=2;
//	arr[3]=3;
//	
//	arr[0]=2;
//	arr[1]=1;
//	arr[2]=0;
//	arr[3]=3;
//	
	arr[0]=3;
	arr[1]=2;
	arr[2]=1;
	arr[3]=0;

	
FinFuncion
	