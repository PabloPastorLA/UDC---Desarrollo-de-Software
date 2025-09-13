algoritmo n01_para_Socios

	definir cant como entero
	definir val, val_total como real 
	definir dto1, dto2, dto3, dto4, dto5 como entero 
	definir text Como Caracter

	//Defina los descuentos 
	dto1 = 10  // <- vitalicios
	dto2 = 10  // <- mayores
	dto3 = 25  // <- juveniles
	dto4 = 25  // <- cadetes
	dto5 = 10  // <- infantiles
	
	
	
	valtotal = 0
	
	para i=1 Hasta 5 con paso 1 Hacer
		si i=1 entonces text= "vitalicios"
		sino si i=2 entonces text= "mayores"
		sino si i=3 entonces text= "juveniles"
		sino si i=4 entonces text= "cadetes"
		sino si i=5 entonces text= "infantiles"
		FinSi
		FinSi
		FinSi
		FinSi
		FinSi
		

		Mostrar "Ingrese la cantidad de socios " text " seguido del valor de la cuota."
		leer cant, val
		Mientras cant < 0 o val < 0 Hacer
			Mostrar "Los valores no pueden ser negativos."
			Mostrar "Reingrese la cantidad de socios " text " seguido del valor de la cuota."
			leer cant, val			
		FinMientras
		
		si i=1 entonces valtotal = valtotal + (cant * val / ((100 + dto1) / 100 ))
		sino si i=2 entonces valtotal = valtotal + (cant * val / ((100 + dto2) / 100 ))
		sino si i=3 entonces valtotal = valtotal + (cant * val / ((100 + dto3) / 100 ))
		sino si i=4 entonces valtotal = valtotal + (cant * val / ((100 + dto4) / 100 ))
		sino si i=5 entonces valtotal = valtotal + (cant * val / ((100 + dto5) / 100 ))
		FinSi
		FinSi
		FinSi
		FinSi
		FinSi
	FinPara
	
	Mostrar "La recaudacion mensual es igual a: " valtotal
	
FinAlgoritmo
