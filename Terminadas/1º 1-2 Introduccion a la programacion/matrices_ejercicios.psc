Proceso matrices_ejercicios
	
	definir matriz, filas, columnas, sumaPares, cantPares Como Entero;
	
	Mostrar "ingrese colum de matriz";
	leer columnas;
	Mostrar "ingrese filas de matriz";
	leer filas;
	
	Dimensionar matriz[filas,columnas];
	
	para i = 0 Hasta  filas -1 Hacer
		para j = 0 Hasta columnas -1 Hacer
			//mostrar "i j: " i j;
			matriz[i,j] = azar(9);
		FinPara		
	FinPara
	
	
	mostrar Sin Saltar " ";
	para i = 0 Hasta  columnas -1 Hacer
		Mostrar Sin Saltar "----";
	FinPara
	Mostrar Sin Saltar "-";
	mostrar "";
	
	para i = 0 Hasta  filas -1 Hacer
		para j = 0 Hasta columnas -1 Hacer
			si matriz[i,j] mod 2 = 0 Entonces
				mostrar Sin Saltar" | " matriz[i,j];
			sino mostrar Sin Saltar " | x";
			FinSi		
		FinPara	
		Mostrar  Sin Saltar " | ";
		Mostrar "";
		mostrar "--------------";
	FinPara
	
	
	
FinProceso
