Algoritmo claseasd111
	definir random, ingreso, pruebas Como Entero
	random = azar(10)
	pruebas = 3
	mostrar "ingrese nro del 1 al 10"
	leer ingreso
	pruebas = pruebas -1
	
	Mientras random <> ingreso y pruebas <> 0
		mostrar "numero equivocado " pruebas " intentos restantes"
		Leer ingreso
		pruebas = pruebas -1
	FinMientras
	
	
	
	si pruebas <> 0 Entonces
		Mostrar "felicitaciones, le acertó"
	sino 
		mostrar "se quedo sin intentos"
	FinSi
	
	
FinAlgoritmo
