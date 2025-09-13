Algoritmo Mientras_2
	definir acum, parcial, total Como Entero
	acum = 0
	total = 0
	
	mientras (acum <= 9)
		acum = 	acum +1
		mostrar "Escribí el Nro " acum
		leer parcial
		total = total + parcial
		
	FinMientras
	Mostrar "El total es: " total
	mostrar ""
FinAlgoritmo
