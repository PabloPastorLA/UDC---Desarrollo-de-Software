Algoritmo Arreglo111
	definir arreglo como caracter;
	definir cant Como Entero;
	
	Escribir  "Ingrese la cantidad de alumnos a cargar";
	leer cant;
	
	
	Dimensionar arreglo[cant];
	
	escribir "a continuacion vaya ingresando de a uno los " cant " nombres";


	para i = 0 hasta cant -1 Hacer
		leer arreglo[i];
	FinPara
	
	escribir "fin de carga";
	
	para i = 0 hasta cant -1 Hacer
		mostrar i + 1 ": " arreglo[i];
	FinPara
		
 FinAlgoritmo
 
 
 
 
