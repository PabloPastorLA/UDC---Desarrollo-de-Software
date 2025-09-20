Algoritmo Promedio_2
	definir n, acum Como real
	mostrar "Ingrese el primero de 3 numeros a promediar:"
	leer acum
	mostrar "Ingrese el segundo de los 3:"
	leer n
	acum = acum + n
	mostrar "Ingrese el ultimo"
	leer n
	acum = (acum + n) / 3
	mostrar "El promedio es: " n
	
	si n > 0 entonces 
		Mostrar "El promedio es positivo"
	sino
		si n < 0 Entonces
			mostrar "El promedio negativo"
		sino mostrar "El promedio es 0 (cero)" 
		FinSi
	fin si
FinAlgoritmo
