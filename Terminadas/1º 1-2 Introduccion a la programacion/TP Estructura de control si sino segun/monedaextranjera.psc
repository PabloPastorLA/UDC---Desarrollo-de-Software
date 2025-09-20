Algoritmo operacion_matematica
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
			mostrar n1 + n2
		caso "dolar":
			mostrar n1 - n2
		caso "yen":
			mostrar n1 * n2
		otro:
			mostrar "este msg no deberia verse, ya que se validó el ingreso"
	FinSegun
	
FinAlgoritmo

