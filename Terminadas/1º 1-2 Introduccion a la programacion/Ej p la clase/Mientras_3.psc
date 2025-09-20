Algoritmo Mientras_3
//	bir un algoritmo que permita al usuario ingresar los montos de las compras de un
//		cliente (se desconoce la cantidad de datos que cargará, la cual puede cambiar en cada
//		ejecución), cortando el ingreso de datos cuando el usuario ingrese el monto 0.
//		Si ingresa un monto negativo, no se debe procesar y se debe pedir que ingrese un nuevo
//			monto. Al finalizar, informar el total a pagar teniendo que cuenta que, si las ventas superan
//				el total de $1000, se le debe aplicar un 10% de descuento
	definir total, parcial como real
	total = 0
	parcial = 1
	mostrar "Ingrese el monto de los articulos comprados de a uno."
	mostrar "Cuando termine ingrese 0." 
	
	Mientras parcial <> 0
		leer parcial
		
		si parcial > 0 entonces total = total + parcial 
		FinSi
		si parcial < 0 entonces mostrar "No se aceptan valores negativos. Ingrese el correcto"
		FinSi
		
	FinMientras
	
	si total > 1000 Entonces
		mostrar "El monto final a abonar, con descuento incluido es: " total / 1.1
		sino mostrar "El monto final a abonar es: " total
	FinSi
	
FinAlgoritmo
