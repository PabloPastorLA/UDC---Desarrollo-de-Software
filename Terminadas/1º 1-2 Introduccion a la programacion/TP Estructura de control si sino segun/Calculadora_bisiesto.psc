Algoritmo Calculadora_bisiesto
	definir año Como Entero
	mostrar "Ingrese un año para saber si es bisiesto: "
	leer año
	
	si ( (año mod 4 = 0) y (año mod 100 <> 0) ) o (año mod 400 = 0) Entonces
		mostrar "es bisiesto"
	sino 
		mostrar "no es bisiesto"
	FinSi
	
FinAlgoritmo
