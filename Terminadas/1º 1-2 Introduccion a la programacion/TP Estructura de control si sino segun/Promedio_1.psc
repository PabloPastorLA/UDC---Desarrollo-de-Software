Algoritmo Promedio_1
	definir n1, n2, n3 Como entero
	mostrar "Ingrese 3 numeros a promediar:"
	leer n1, n2, n3
	n1 = (n1 + n2 + n3) / 3  
	
	si n1 > 0 entonces 
		Mostrar "El promedio positivo es: " n1 ",00"
	sino
		si n1 < 0 Entonces
			mostrar "El promedio negativo es: " n1 ",00"
		sino mostrar "El promedio es 0 (cero)" 
		FinSi
	fin si
FinAlgoritmo
