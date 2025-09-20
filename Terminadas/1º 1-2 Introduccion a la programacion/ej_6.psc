Algoritmo ej_6
	//Ejercicio 6: Intercambio de Valores (sin variable auxiliar)
	//Escribe un pseudocódigo que:
	//Pida al usuario dos números enteros A y B.
	//Intercambie los valores de A y B sin usar una tercera variable.
	//Muestre los valores intercambiados en pantalla.
	
	definir v1, v2 Como Entero
	mostrar "ingrese 2 enteros"
	leer v1
	leer v2
	
	v1 = v1 +v2
	mostrar "v1: " v1 " v2: " v2
	v2 = v1 +v2
	mostrar "v1: " v1 " v2: " v2
	v1 = v2 - v1
	
	mostrar "v1: " v1 " v2: " v2
	v2 = v2 - v1 - v1
	mostrar "v1: " v1 " v2: " v2
	
	
FinAlgoritmo
