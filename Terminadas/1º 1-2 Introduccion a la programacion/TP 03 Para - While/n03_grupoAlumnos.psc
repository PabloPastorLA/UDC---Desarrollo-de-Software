Algoritmo n03_grupoAlumnos
	definir nota, notag1, notag2, notag3, notag4 Como Real
	definir alum, alum1, alum2, alum3, alum4, grupo Como Entero
	definir noSalir Como Logico
	alum1 = 0
	alum2 = 0
	alum3 = 0
	alum4 = 0
	
	noSalir = verdadero
	mostrar "Con el siguiente programa puede promediar la nota de hasta 4 grupos de estudiantes"

	repetir 
		mostrar "Ingrese la nota del alumno, seguido del grupo (1 al 4) al que pertenece"
		leer nota, grupo
		si nota =0 y grupo = 0 Entonces noSalir = falso
		FinSi

		//mientras grupo<1 o grupo>4 o nota<0 o nota>10 o (validog1=0 y grupo=1) o (validog2=0 y grupo=2) o (validog3=0 y grupo=3) o (validog3=0 y grupo=3) Hacer
		mientras (grupo<1 o grupo>4 o nota<0 o nota>10) y noSalir Hacer
			mostrar "ERROR: Reingrese (nota - grupo)"
			leer nota, grupo
		FinMientras

		si grupo = 1 Entonces notag1 = notag1 + nota; alum1 = alum1 + 1
		sino si grupo = 2 Entonces notag2 = notag2 + nota; alum2 = alum2 + 1
		sino si grupo = 3 Entonces notag3 = notag3 + nota; alum3 = alum3 + 1
		sino si grupo = 4 Entonces notag4 = notag4 + nota; alum4 = alum4 + 1
		FinSi
		FinSi
		FinSi
		FinSi

	Hasta Que no noSalir

	si alum1 <> 0 Entonces mostrar "La nota promediada del grupo 1 es: " notag1 / alum1
	si alum2 <> 0 Entonces mostrar "La nota promediada del grupo 2 es: " notag2 / alum2
	si alum3 <> 0 Entonces mostrar "La nota promediada del grupo 3 es: " notag3 / alum3
	si alum4 <> 0 Entonces mostrar "La nota promediada del grupo 4 es: " notag4 / alum4
	FinSi
	FinSi
	FinSi
	FinSi
FinAlgoritmo

