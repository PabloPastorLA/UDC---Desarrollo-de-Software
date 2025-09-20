Algoritmo Para_4
	Definir n, acum Como Entero
	definir noEsPrimo Como Logico
	acum = 0
	
//	repetir
//		mostrar "ingrese un nro entero positivo"
//		leer n
//	mientras que n<0
	
	Para i = 2 Hasta 100 con Paso 1 Hacer
		noEsPrimo = falso
		Para j = 2 Hasta i con Paso 1 Hacer
			si i mod j = 0 y i <> j Entonces
				noEsPrimo = Verdadero
			FinSi
		FinPara
		si noEsPrimo = falso Entonces
			mostrar i " "
			acum = acum + 1
		FinSi
		
		
	Fin Para
	mostrar "La cantidad de primos son: " acum
	
FinAlgoritmo
