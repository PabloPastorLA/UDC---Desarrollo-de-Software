Proceso FuncRecursivaSumar
	definir num, retorno como entero;
	
	Escribir "Ingrese nro para sumar";
	leer num;
	
	si nro >= 0 Entonces
		retorno = sumarrr(num);
	sino
		mostrar "Error y fin";
		
	FinSi
	
	mostrar "la funcion retorno " retorno;
FinProceso

funcion ret = sumarrr(num)
	definir ret como entero;
	
	si num > 0 Entonces
		ret = num + sumarrr(num -1);
//	sino 
		//ret = 0;
	FinSi
	
	
FinFuncion

