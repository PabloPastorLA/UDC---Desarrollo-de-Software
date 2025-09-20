Proceso recursivaBaseyExponente
	definir base, expo Como Entero;
	
	mostrar "ingrese base, luego exponente";
	leer base, expo;
	
	ret = potencia (base, expo);
	mostrar "Retorno: " ret;
FinProceso


Funcion retorno = potencia (base, expo)
	definir retorno como entero;
	si expo <> 0 Entonces
		retorno = base * potencia(base, expo -1);
	sino retorno = 1;
	FinSi
	
FinFuncion
	