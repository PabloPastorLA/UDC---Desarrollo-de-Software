Algoritmo ConversionMoneda
	Definir cte_libra , cte_dolar, cte_yen Como Real
	cte_libra = 1081.96  	//CONSTANTES NO modificar
	cte_dolar = 856.75		//CONSTANTES NO modificar
	cte_yen = 5.65			//CONSTANTES NO modificar
	
	definir n1 Como Real
	definir op Como cadena
	mostrar "ingrese el monto a convertir"
	Leer n1
	
	mostrar "Ahora ingrese moneda: libra, dolar, yen"
	Leer op
	
	Mientras op <> "libra" y op <> "dolar" y op <> "yen"
		mostrar "Error en la operacion, reintente (libra, dolar, yen)"
		Leer op		
	FinMientras
	
	Segun op hacer
		caso "libra":
			mostrar cte_libra * n1 " pesos"
		caso "dolar":
			mostrar cte_dolar * n1 * 1.65 " pesos"
		caso "yen":
			mostrar cte_yen * n1 " pesos"
		otro:
			mostrar "este msg no deberia verse, ya que se validó el ingreso"
	FinSegun
	
FinAlgoritmo
