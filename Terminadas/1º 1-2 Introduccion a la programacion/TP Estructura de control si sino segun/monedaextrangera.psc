Algoritmo operacion_matematica
	definir n1, n2 Como Real
	definir op Como cadena
	mostrar "ingrese los 2 nros a operar"
	Leer n1, n2
	
	mostrar "Ahora ingrese: suma, resta, multi o divi "
	Leer op
	
	Mientras op <> "suma" y op <> "resta" y op <> "multi" y op <> "divi"
		mostrar "Error en la operacion, reintente (suma, resta, multi o divi)"
		Leer op		
	FinMientras
	
	Segun op hacer
		caso "suma":
			mostrar n1 + n2
		caso "resta":
			mostrar n1 - n2
		caso "multi":
			mostrar n1 * n2
		caso "divi":
			mostrar n1 / n2
		otro:
			mostrar "este msg no deberia verse, ya que se validó el ingreso"
	FinSegun
	
FinAlgoritmo
