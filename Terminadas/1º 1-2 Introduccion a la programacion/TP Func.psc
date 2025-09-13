Proceso sin_titulo
//	Los alumnos de la UDC están desarrollando un pequeño sistema de facturación para un
//		comercio local. Se les pide trabajar con una lista de precios correspondiente a distintos
//		productos.
//	Deberán implementar dos funciones:
//	? CalcularDescuento(precio, medioPago):
//		Esta función debe recibir el precio del producto por valor y el medio de pago (cadena
//	de texto: "efectivo", "transferencia", "debito", u otro).
//	La función debe retornar el precio final con descuento, según esta lógica:
//		Si el medio de pago es "efectivo" o "transferencia", aplicar 10% de descuento.
//			Si es "debito", aplicar 5% de descuento.
//			Para cualquier otro medio de pago, no aplicar descuento.
//			? AplicarIVA(precio):
//				Esta función debe recibir el precio del producto por referencia y sumarle el IVA (21%).
//				El nuevo precio con IVA debe reemplazar al precio original dentro de la lista.
//			Requisitos del ejercicio:
//				1. Cargar una lista con 5 precios ingresados por el usuario.
//				2. Solicitar al usuario el medio de pago (solo una vez).
//			3. Para cada precio de la lista:
//					? Aplicar la función CalcularDescuento y mostrar el resultado.
//					? Luego aplicar la función AplicarIVA al precio original por referencia.
//				4. Mostrar por pantalla los precios:
//					? Originales
//					? Con descuento
//					? Con IVA aplicado (al precio original, después del descuento)
	
	definir 
FinProceso

Funcion  CalcularDescuento(precio, medioPago)
	
FinFuncion

Funcion AplicarIVA(precio)
	
FinFuncion
	