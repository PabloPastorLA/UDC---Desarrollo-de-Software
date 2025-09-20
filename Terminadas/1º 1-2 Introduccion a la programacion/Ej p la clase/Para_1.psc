Algoritmo Para_1
	Definir n, acum Como Entero
	definir noEsPrimo Como Logico
	acum = 0
	
	repetir
		mostrar "ingrese un nro entero positivo"
		leer n
	mientras que n<0
	
	noEsPrimo = falso
	Para i = n Hasta 100 con Paso 1 Hacer
		si !(i mod n = 0 y i <> 1 y i <> n) Entonces
			mostrar "El " i " es primo."
		FinSi
	Fin Para
	
	
FinAlgoritmo
