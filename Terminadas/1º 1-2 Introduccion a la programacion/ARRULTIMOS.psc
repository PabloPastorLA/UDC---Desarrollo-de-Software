Proceso ARRULTIMOS
	definir arr2 Como Entero;
	Dimensionar arr2[5];
	arr2[0] = 9;
	arr2[1] = 7;
	arr2[2] = 3;
	arr2[3] = 5;
	arr2[4] = 1;
	
	mostrarnotas(arr2);
	mostrarpromedio(arr2);
FinProceso

Funcion mostrarpromedio(arr2 Por referencia)
	definir prom Como Real;
	
	mostrar "----------------";
	mostrar "Promedio:";
	para i=0 Hasta 5-1 Hacer
		prom = prom + arr2[i];
	FinPara
	Mostrar prom / 5;
	mostrar "----------------";
	
FinFuncion

Funcion mostrarnotas(arr2 Por referencia)
	
	mostrar "----------------";
	mostrar "Valores:";
	para i=0 Hasta 5-1 Hacer
		Mostrar arr2[i];
	FinPara
	mostrar "----------------";
	
FinFuncion