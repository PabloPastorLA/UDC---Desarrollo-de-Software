Proceso Matrix
	Definir i, j como entero;
	Definir matriz, nro Como Real;
	
	suma =0;
	
	a = 2;
	b = 3;
	
	
	Dimensionar matriz[a,b];
	
	Para i = 0 hasta a - 1 Hacer
		Para j = 0 hasta b - 1 Hacer
			mostrar "ingrese [" i "] [" j "]";
			Leer nro;
			matriz[i,j] = nro;
			suma = suma + matriz[i,j];
		FinPara
	FinPara
	
	
	mostrar " -------------";
	Para i = 0 hasta a - 1 Hacer
		Para j = 0 hasta b - 1 Hacer
			mostrar Sin Saltar " | " matriz[i,j];
		FinPara
		Mostrar " |";
		mostrar " -------------";

	FinPara

	
	
FinProceso
