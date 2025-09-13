Proceso matriz_gauss
	definir tamanio como entero;
	definir matriz Como Real;;
	definir debug como logico;
	
	
	debug=verdadero;
	
	mostrar "ingrese tamanio de la matriz (ej: 3 para 3x3)";
	leer tamanio;
	Dimensionar matriz[tamanio, tamanio +1];
	
	
	para i = 0 hasta tamanio-1 Hacer
		mostrar "Ingrese los " tamanio + 1 " valores de la fila " i +1; 
		para j = 0 hasta tamanio Hacer
			leer matriz[i, j];
		FinPara
	FinPara
	
	imprimirArreglo(matriz, tamanio);
	
	
//	a11	a12	a13	a14	a15	
//	a21	a22	a23	a24	a25	
//	a31	a32	a33	a34	a35	
//	a41	a42	a43	a44	a45	
//	a51	a52	a53	a54	a55	
//	
	
	para recursear = 0 Hasta tamanio -2 hacer
	//	m = a/pivot
		para i = 1 hasta tamanio-1 Hacer
			pivot = matriz[i-1,i-1];
			ipivot=i-1;
	//		si debug entonces debugear(pivot, "pivot");
	//		FinSi
			para j = 0 hasta tamanio Hacer
				
				m=matriz[i,recursear]/pivot;
				
	//			mostrar "matriz[i,j]: " matriz[i,j];
				si debug entonces debugear(m, "m");
				FinSi
				
				
	//			val= matriz[i,j] - m * matriz[ipivot,j];

	//			mostrar "Para el valor: " matriz[i,j] " remplaco con " val ", tenemos m: " m " pivot: " pivot " y ipivot: " ipivot; 
				
				matriz[i,j]= matriz[i,j] - m * matriz[ipivot,j];
				
	//			si i = j Entonces Esperar Tecla;
	//			FinSi
				
	//			si i<>j Entonces
	//				si i > j Entonces
	//					m=matriz[i,j]/pivot;
	//					si debug entonces debugear(m, "m");
	//					FinSi
	//					matriz[i,j] = matriz[i,j] - m * ;
	//					//matriz[i,j]
	//				FinSi
	//			FinSi
				
			FinPara
			esperartecla;
		FinPara
		
	FinPara

	imprimirArreglo(matriz, tamanio);
	
	
FinProceso

funcion debugear(var, nombrevar)
	Mostrar nombrevar ": " var;
//	Esperar Tecla;	
FinFuncion



Funcion imprimirArreglo(matriz Por Referencia, tamanio Por Referencia)
	para i = 0 hasta tamanio-1 Hacer
		para j = 0 hasta tamanio Hacer
			si j <> tamanio entonces mostrar Sin Saltar matriz[i, j] " ";
			FinSi
			si j = tamanio entonces mostrar Sin Saltar "| " matriz[i, j] ;
			FinSi
		FinPara
		mostrar "";
	FinPara
	mostrar "--------------------------------------";
FinFuncion
