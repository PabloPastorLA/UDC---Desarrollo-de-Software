Algoritmo Para_3
	Definir n, acum Como Entero
	acum = 1
	
	repetir
		mostrar "ingrese un nro entero positivo"
		leer n
	mientras que n<0
	
	Para i = 1 Hasta n con Paso 1 Hacer
		acum = acum * i
	Fin Para
	mostrar "El valor acumulado es: " acum 
	
FinAlgoritmo
