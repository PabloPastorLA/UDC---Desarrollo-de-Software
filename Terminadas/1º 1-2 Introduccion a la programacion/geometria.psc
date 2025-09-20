Proceso geometria
//	EJERCICIOS SOBRE PROGRAMACI�N MODULAR
//	1. Dise�ar un algoritmo llamado "geometr�a" que permita al usuario elegir entre las siguientes 4
//	opciones de un men�:
//		a. calcular la superficie de un tri�ngulo
//		b. calcular la superficie de un cuadrado
//		c. calcular la superficie de un c�rculo
//		d. salir del sistema
//	Requisitos del programa:
//		a. debe validar que la opci�n ingresada por el usuario sea valida..
//		b. Cada opci�n (a,b,c) debe:
//			i. Solicitar los datos necesarios para realizar el calculo correspondiente.
//			ii. Llamar a una funci�n especifica:
//				1. calcularTriangulo()
//				2. calcularCuadrado()
//				3. calcularCirculo()
//			iii. Cada funci�n debe realizar el calculo correspondiente y retornar el resultado en
//una variable llamada area.
//			iv. El valor retornado debe ser almacenado en una variable llamada resultado y
//mostrado en pantalla mediante un mensaje adecuado.
//		c. Una vez finalizada la ejecuci�n de cada opci�n, el men� debe mostrarse nuevamente
//para permitir una nueva selecci�n, hasta que el usuario elija la opci�n de salida.
	
	Definir salir, erropc Como Logico;
	salir = Falso;
	erropc = Falso;
	Definir opc Como Caracter;
	
	
	
	Repetir
		
		Limpiar Pantalla;
		Mostrar "********************";
		Mostrar "Seleccione una opcion";
		Mostrar "********************";
		Mostrar "a --> calcular la superficie de un tri�ngulo (RECTANGULO)";
		Mostrar "b --> calcular la superficie de un cuadrado";
		Mostrar "c --> calcular la superficie de un c�rculo";
		Mostrar "d --> salir del sistema";
		Mostrar "********************";
		si erropc Entonces mostrar "Opcion erronea. Elija " "a " "b " "c " " o d."; erropc = Falso ;FinSi
		leer opc;
		Limpiar Pantalla;
		
		
		
		Segun opc
			caso "a": //triangulo
				definir b, h como real;
				Escribir "******************************";
				Escribir "Superficie de triangulo:";
				Escribir "******************************";
				Escribir "Ingrese base seguida de altura";
				Leer b, h;
				resultado = calcularTriangulo(b, h);
				mostrar "La superficie es igual a: " resultado;
				Escribir "******************************";
				Esperar Tecla;
				
			caso "b": //cuadrado
				definir l como real;
				Escribir "******************************";
				Escribir "Superficie de cuadrado:";
				Escribir "******************************";
				Escribir "Ingrese lado";
				Leer l;
				resultado = calcularCuadrado(l);
				mostrar "La superficie es igual a: " resultado;
				Escribir "******************************";
				Esperar Tecla;
				
			caso "c": //circulo
				definir diam como real;
				Escribir "******************************";
				Escribir "Superficie de circulo:";
				Escribir "******************************";
				Escribir "Ingrese diametro";
				Leer diam;
				resultado = calcularCirculo(diam);
				mostrar "La superficie es igual a: " resultado;
				Escribir "******************************";
				Esperar Tecla;
				
			caso "d":
				salir = Verdadero;
				
			otro:
				erropc=Verdadero;
				
		FinSegun
	Hasta Que salir
FinProceso

Funcion area = calcularTriangulo(b, h)
	area = b * h / 2;
FinFuncion
Funcion area = calcularCuadrado(l)
	area = l * l;
FinFuncion
Funcion area = calcularCirculo(diam)
	area = 3.1415926535 * (diam/2) ^ 2 ;
FinFuncion

