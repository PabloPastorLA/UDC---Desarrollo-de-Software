Algoritmo notaAlumno
	definir nota Como Real
	mostrar "Ingrese nota del alumno"
	leer nota
	
	si nota >= 7 y nota <= 10 Entonces
		mostrar "Promocionado"
	sino 
		si nota >= 4 y nota < 7 Entonces
			Mostrar "Aprobado"
		sino si nota >= 0 y nota < 4 entonces
				mostrar "Desaprobado"
			sino 
				mostrar "el nro ingresado no es valido"
			FinSi
		FinSi
	FinSi
FinAlgoritmo
