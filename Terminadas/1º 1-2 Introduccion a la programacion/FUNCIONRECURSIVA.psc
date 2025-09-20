Proceso FUNCIONRECURSIVA
	definir nro, fact Como Entero;
	mostrar "Ingrese nro positivo";
	leer nro;
	
	si nro < 0 Entonces
		mostrar "ingresaste un negativo";
	sino
		fact = factorial(nro);
	FinSi
	Mostrar "el factorial de " nro " es " fact; 
FinProceso


funcion retorno = factorial(nro)
	definir retorno como entero;
	si nro > 0 Entonces
		retorno = nro * factorial (nro - 1);
	SiNo
		retorno = 1;
	FinSi
FinFuncion
	