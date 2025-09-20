Proceso recursivaContarDigitos
	definir nro, cont, aux Como Entero;
	
	Mostrar "ingrese nro para contar sus digitos";
	leer nro;
	
	mostrar "nro: " nro;
	
	aux =nro;
//    Mientras aux>0 hacer // mientras no sea cero
//        cont <- cont + 1; // contar cuantos digitos
//        aux <- trunc(aux/10); // dividir por 10 y despreciar los de
//    FinMientras	
//	mostrar "tiene digitos: " cont;
	retor = contarDigitos(nro);
	Mostrar "Los digitos sumados dan: " retor;
	
FinProceso

Funcion ret= contarDigitos(nro)
	//definir ret Como Entero;
	
	
	
	si nro > 10 Entonces
		ret = 1 + contarDigitos(trunc(nro/10));
	sino 
		ret=1;
	FinSi
FinFuncion
