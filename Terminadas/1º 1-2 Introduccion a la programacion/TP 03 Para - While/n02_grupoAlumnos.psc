Algoritmo n02_grupoAlumnos
//2) El docente de la asignatura Introducción a la programación, para la realización del trabajo práctico de Estructuras de Control Repetitivas
//decidió formar 3 grupos de 4 alumnos.
//Necesitamos ingresar por teclado la nota de cada alumno y el grupo al que pertenece, estos pares de datos llegan sin ningún tipo de orden.
//El programa que diseñes tiene que informar el promedio de cada grupo y si el grupo está
//(desaprobado de 1 a 3, aprobado de 4 a 7 o promocionado de 8 a 10)	
	
	definir nota, notag1, notag2, notag3 Como Real
	definir grupo, validog1, validog2, validog3 Como Entero
	
	validog1 = 4
	validog2 = 4
	validog3 = 4

	grupo = 1
	para i=1 Hasta 12 Hacer
		
		mostrar "Ingrese la nota del alumno, seguido del grupo al que pertenece"
		leer nota, grupo
		mientras grupo <1 o grupo > 3 o nota < 0 o nota > 10 o (validog1 = 0 y grupo = 1) o (validog2 = 0 y grupo = 2)  o (validog3 = 0 y grupo = 3)  Hacer
			mostrar "ERROR: Reingrese (nota - grupo) (Hasta 4 notas por grupo)"
			leer nota, grupo
		FinMientras
	
		si grupo = 1 Entonces notag1 = notag1 + nota; validog1 = validog1 - 1
		sino si grupo = 2 Entonces notag2 = notag2 + nota; validog2 = validog2 - 1
		sino si grupo = 3 Entonces notag3 = notag3 + nota; validog3 = validog3 - 1
		FinSi
		FinSi
		FinSi
	
	FinPara

	si notag1 / 4 < 4 entonces text = "DESAPROBADO"
	sino si notag1 / 4 > 7 entonces text = "PROMOCIONADO"
	SiNo text = "APROBADO"			 
	FinSi
	FinSi
	mostrar "La nota promediada del grupo 1 es: " notag1 / 4 " y los alumnos estan: " text

	si notag2 / 4 < 4 entonces text = "DESAPROBADO"
	sino si notag2 / 4 > 7 entonces text = "PROMOCIONADO"
	SiNo text = "APROBADO"			 
	FinSi
	FinSi
	mostrar "La nota promediada del grupo 2 es: " notag2 / 4 " y los alumnos estan: " text

	si notag3 / 4 < 4 entonces text = "DESAPROBADOS"
	sino si notag3 / 4 > 7 entonces text = "PROMOCIONADOS"
	SiNo text = "APROBADOS"			 
	FinSi
	FinSi
	mostrar "La nota promediada del grupo 3 es: " notag3 / 4 " y los alumnos estan: " text
	
FinAlgoritmo

