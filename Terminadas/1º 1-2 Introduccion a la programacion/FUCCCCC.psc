Proceso sin_titulo
	definir resultado, nro como entero;
	resultado = 1;
	Mostrar "Definir el nro a ..factorizar?";
	leer nro;
	resultado = factorial(nro);
	mostrar resultado;
FinProceso


Funcion ret = factorial(nro)
	definir ret como entero;
	mostrar "nro: " nro;
	si nro <> 0 Entonces
		Mostrar "nro - 1: " nro - 1;
		ret = nro * factorial (nro - 1);
		
		Mostrar "ret: " ret;
	sino 
		ret = 1;
		Mostrar "ret: " ret;
	finsi
FinFuncion
	