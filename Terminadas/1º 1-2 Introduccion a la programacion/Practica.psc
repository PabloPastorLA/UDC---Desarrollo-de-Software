Algoritmo Practica
	definir cantidad_de_bancos como entero;
	definir cantidad_de_alumnos como entero;
	mostrar "Ingrese la cantidad de alumnos en el curso, seguido de la cantidad de bancos"
	leer cantidad_de_alumnos, cantidad_de_bancos
	
	si (cantidad_de_alumnos > cantidad_de_bancos y cantidad_de_alumnos - cantidad_de_bancos = 1) Entonces
		
		mostrar "Falta " cantidad_de_alumnos - cantidad_de_bancos " banco"
	sino si (cantidad_de_alumnos > cantidad_de_bancos ) Entonces
		mostrar "Faltan " cantidad_de_alumnos - cantidad_de_bancos " bancos"
	FinSi
	FinSi
		
	
	
FinAlgoritmo
