Algoritmo Para_5
	
	//Escrib� un algoritmo que permita al usuario ingresar:
//		a. la cantidad de n�mero que podr� ingresar
//		b. luego solicite ingresar un n�mero la cantidad de veces que seleccion� en el punto a.
//		c. el programa debe calcular y mostrar en pantalla el promedio de los n�mero
//		ingrsados.
	
	
	Definir cant, n, acum Como Entero
	acum = 0
	
	
	
	repetir
		mostrar "Ingrese la cant de nros que desea promediar:"
		leer cant
	mientras que n<0
	
	mostrar "Ahora ingreselos:"
	Para i = 1 Hasta cant con Paso 1 Hacer
		leer n
		acum = acum + n
	Fin Para
	mostrar "El promedio acumulado es: " acum / cant
	
FinAlgoritmo







