Algoritmo Para_5
	
	//Escribí un algoritmo que permita al usuario ingresar:
//		a. la cantidad de número que podrá ingresar
//		b. luego solicite ingresar un número la cantidad de veces que seleccionó en el punto a.
//		c. el programa debe calcular y mostrar en pantalla el promedio de los número
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







