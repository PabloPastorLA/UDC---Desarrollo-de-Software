Algoritmo Mientras_1
	definir n1, n2 Como entero
	mostrar "Ingrese 2 nros enteros"
	leer n1
	leer n2
	mientras n2 <= n1 Hacer
		Mostrar "El segundo nro no es válido. Debe ser mayor al primero (" n1 ")"
		Leer  n2
	FinMientras
	
	n1 = n1 + 1
	Mientras n1 <> n2 Hacer
		Mostrar n1 
		n1 = n1 + 1
		
	FinMientras
	
FinAlgoritmo
