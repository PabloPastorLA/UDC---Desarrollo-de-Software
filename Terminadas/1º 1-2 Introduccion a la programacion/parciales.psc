Proceso parciales
//	2. Un grupo de alumnos de la UDC rinde 5 parciales. Guardar las notas en un arreglo
//	bidimensional (alumnos x parciales). Mostrar el promedio de cada alumno y el promedio
//	general del grupo. Usar funciones para calcular los promedios.
	definir promtotal, notas, prom como real;
	definir cant Como Entero;
	definir nombres Como Caracter;
	
	
	escribir "Ingrese la cantidad de alumnos";
	leer cant;
	
	
	Dimensionar  alumNotas[cant,6], nombres[cant];
	
	
	para i=0 Hasta cant -1 Hacer
		Mostrar "ingrese nombre de alumno";
		leer nombres[i];
		Mostrar "ahora ingrese las 5 notas";
		para j=0 Hasta 4 Hacer
			leer alumNotas[i,j];
		FinPara
	FinPara
	para l = 0 Hasta 1 Hacer
		para k=0 Hasta 4 Hacer
			prom= prom + promediar(alumNotas, k);
			
			Mostrar "El promedio de " nombres[l] " es " prom;
			Mostrar "prom " prom;
	
		FinPara
		
	FinPara
//	para i=0 Hasta cant -1 Hacer
//		Mostrar "El promedio " prom;
//	FinPara
		
FinProceso

Funcion ret=promediar (alumNotas Por Referencia, k Por Valor)
	definir ret Como Real;
	ret=0;
	para i =0 Hasta 4 Hacer
		mostrar alumNotas[0,i];
		ret =ret + alumNotas[0,i];
	FinPara
//	Mostrar "ret " ret;
	ret = ret / 5;
	Mostrar "ret " ret;
FinFuncion








//		3. Los profesores de la UDC reciben evaluaciones de satisfacción (1 a 10) por parte de los
//		alumnos. Cargar en un arreglo las puntuaciones de 10 profesores. Determinar cuál es el
//		profesor mejor valorado y mostrar su nombre.

//		4. Simular un sistema donde se registra la asistencia de 7 alumnos de la UDC durante 5 días.
//		Representar con un arreglo bidimensional (1 = presente, 0 = ausente). Mostrar cuántos días
//		asistió cada alumno y cuántos alumnos asistieron cada día.

//		Los alumnos de la UDC están desarrollando un pequeño sistema de facturación para un
//			comercio local. Se les pide trabajar con una lista de precios correspondiente a distintos
//			productos.
//		Deberán implementar dos funciones:
//		? CalcularDescuento(precio, medioPago):
//			Esta función debe recibir el precio del producto por valor y el medio de pago (cadena
//		de texto: "efectivo", "transferencia", "debito", u otro).
//		La función debe retornar el precio final con descuento, según esta lógica:
//			Si el medio de pago es "efectivo" o "transferencia", aplicar 10% de descuento.
//			Si es "debito", aplicar 5% de descuento.
//			Para cualquier otro medio de pago, no aplicar descuento.
//			? AplicarIVA(precio):
//				Esta función debe recibir el precio del producto por referencia y sumarle el IVA (21%).
//				El nuevo precio con IVA debe reemplazar al precio original dentro de la lista.
//			Requisitos del ejercicio:
//				1. Cargar una lista con 5 precios ingresados por el usuario.
//				2. Solicitar al usuario el medio de pago (solo una vez).
//				3. Para cada precio de la lista:
//				? Aplicar la función CalcularDescuento y mostrar el resultado.
//				? Luego aplicar la función AplicarIVA al precio original por referencia.
//			4. Mostrar por pantalla los precios:
//				? Originales
//				? Con descuento
//				? Con IVA aplicado (al precio original, después del descuento)
