Algoritmo Calculadora_bisiesto
	definir a�o Como Entero
	mostrar "Ingrese un a�o para saber si es bisiesto: "
	leer a�o
	
	si ( (a�o mod 4 = 0) y (a�o mod 100 <> 0) ) o (a�o mod 400 = 0) Entonces
		mostrar "es bisiesto"
	sino 
		mostrar "no es bisiesto"
	FinSi
	
FinAlgoritmo
