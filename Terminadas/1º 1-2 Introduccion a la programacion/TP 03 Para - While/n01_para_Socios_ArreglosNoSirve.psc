algoritmo n01_para_Socios_ArreglosNoSirve

//1) Un club deportivo posee N cantidad de socios. Los socios se dividen en 5 categorías:
//    ? vitalicios
//    ? mayores
//    ? juveniles
//    ? cadetes
//    ? infantiles
//	A cada categoría le corresponde abonar una cuota mensual diferente, a excepción de las categorías cadetes e infantiles que pagan igual monto.
//	Además las categorías cadetes y juveniles tienen un descuento del 25% en el valor de la cuota, mientras que para el resto de las categorías el descuento es del 10%.
//		La comisión directiva desea conocer la recaudación mensual por el abono de cuotas, suponiendo que abonan la totalidad de los socios.
	dimension cant[5]
	
	dimension val[5]
	dimension dto[5] 
	dimension text[5]
	
	text[1]= "vitalicios"
	text[2]= "mayores"
	text[3]= "juveniles"
	text[4]= "cadetes"
	text[5]= "infantiles"
	
	dto[1] = 10
	dto[2] = 10
	dto[3] = 25 
	dto[4] = 25
	dto[5] = 10
	
	para i=1 Hasta 5 con paso 1 Hacer		
		Mostrar "Ingrese la cantidad de socios " text[i] " seguido del valor de la cuota"
		leer cant[i], val[i]
		Mientras cant[i] < 0 o val[i] < 0 Hacer
			Mostrar "Los valores no pueden ser negativos."
			Mostrar "Reingrese la cantidad de socios " text[i] " seguido del valor de la cuota"
			leer cant[i], val[i]			
		FinMientras
	FinPara
	
	
	
FinAlgoritmo
