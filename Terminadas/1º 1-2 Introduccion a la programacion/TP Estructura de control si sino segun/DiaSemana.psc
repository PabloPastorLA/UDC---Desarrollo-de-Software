Algoritmo DiaSemana
	definir nro Como Entero
	mostrar "ingrese un nro de la semana"
	Leer nro
	si nro < 1 o nro > 7 Entonces
		repetir 
			mostrar "opcion no valida. Reintente"
			Leer nro
		Hasta Que nro >= 1 y nro <= 7
	FinSi
	Segun nro Hacer
		
		caso 1: 
			mostrar "El dia de la semana es: Lunes"
		caso 2: 
			mostrar "El dia de la semana es: Martes"
		caso 3: 
			mostrar "El dia de la semana es: Miercoles"
		caso 4: 
			mostrar "El dia de la semana es: Jueves"
		caso 5: 
			mostrar "El dia de la semana es: Viernes"
		caso 6: 
			mostrar "El dia de la semana es: Sabado"
		caso 7: 
			mostrar "El dia de la semana es: Domingo"
	FinSegun
FinAlgoritmo
