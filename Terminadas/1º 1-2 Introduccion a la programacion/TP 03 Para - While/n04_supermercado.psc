Algoritmo n04_supermercado
	
	//	4) Una persona que va al supermercado habitualmente, ha notado que en las últimas veces que ha comprado le han cobrado mal, Por lo que necesita
	//una app para saber cuánto deberá pagar al finalizar la compra. Para ello recurrió a los alumnos de la carrera de TUDS de la UDC, quienes le diseñarán
	//un algoritmo para solucionar su problema. 
	
	//	La persona pondrá en su carrito los artículos que va tomando de los estantes, por lo que cada vez que toma un artículo
	//ingresará en la app el precio y  la cantidad de artículos iguales que ha tomado, la app sumará cuánto dinero va gastando
	//en esos artículos y a esta suma le agregará lo que va gaste en los demás artículos, cuando decida que ya tomo todo lo que necesitaba
	//y finalice la carga, la app mostrará en pantalla  cuál va a ser el importe de su compra. No es necesario registrar el nombre del producto
	
	definir pre, total Como Real
	definir cant Como Entero
	definir mostraar como logico

	mostraar = verdadero
	total = 0
	pre = 1
	mostrar "pre " pre
	mostrar "cant " cant

	mientras pre <> 0 o cant <> 0
	
		si mostraar Entonces
			mostrar "Ingrese el precio de los articulos, seguido de su cantidad."
			mostrar "Para finalizar, ingrese cero como ambos."
			mostraar = falso
		sino 		
			mostrar "sgte producto (precio seguido de cantidad). Para finalizar, ingrese cero como ambos."
		FinSi
		leer pre, cant
		
		si pre = 0 y cant <> 0 Entonces mostrar "ingresó un articulo gratis???? APROVECHE!!!"
		FinSi
		si pre <> 0 y cant = 0 Entonces mostrar "Mepa que te equivocaste, ingresaste 0 en la cantidad"
			mostrar "No te preocupes, reingresalo"
		FinSi
		
		para i = 1 hasta cant Hacer
			total = total + pre
		FinPara
		
	FinMientras

	mostrar "El total de la compra es: " total

FinAlgoritmo

