
Proceso Sistema_de_Registro_de_Temperaturas_por_Ciudad
//Ejercicio: Sistema de Registro de Temperaturas por Ciudad
//	Desarrollar un algoritmo que permita gestionar un sistema de registro de temperaturas por ciudad.
//	El sistema debe implementar un menú interactivo con las siguientes opciones:
//		1. Ingresar ciudades y temperaturas
//		2. Listar ciudades y su temperatura
//		3. Mostrar la ciudad con la temperatura más alta (ciudad y temperatura)
//		4. Mostrar la ciudad con la temperatura más baja (ciudad y temperatura)
//		5. Mostrar el promedio de temperaturas
//		0. Salir del sistema
//	Requisitos funcionales:
//		- Antes de mostrar el menú, el algoritmo debe preguntar cuántas ciudades se desean registrar.
//		- Se deben definir dos arreglos paralelos de longitud variable:
//		- Un arreglo para almacenar los nombres de las ciudades.
//		- Un arreglo para almacenar las temperaturas correspondientes a esas ciudades.
//		- La opción 1 debe permitir ingresar los datos de ciudad y su temperatura asociada en un solo paso.
//		- Por cada ingreso, el sistema debe mostrar cuántas ciudades/temperaturas se han registrado
//		hasta el momento.
//		- Una vez ingresadas todas las ciudades y temperaturas, no debe permitir nuevos ingresos.
//		- La opción 2 debe mostrar una lista en el formato: Ciudad - Temperatura.
//		- La opción 3 debe mostrar el nombre de la ciudad con la temperatura más alta, junto con el valor
//		correspondiente.
//		- La opción 4 debe mostrar el nombre de la ciudad con la temperatura más baja, junto con el valor
//		correspondiente.Ejercicio: Sistema de Registro de Temperaturas por Ciudad
//		- La opción 5 debe calcular y mostrar el promedio de todas las temperaturas ingresadas.
//		- La opción 0 debe finalizar el programa.
//		- Si el usuario ingresa una opción inválida (por ejemplo, 6, -1, etc.), se debe mostrar el mensaje
//			"Opción no válida" y volver a mostrar el menú.
//		Condiciones adicionales:
//		- Luego de ejecutar cualquiera de las opciones del menú (excepto la opción 0), el sistema debe
//		volver a mostrar el menú.
//		- Las opciones 2 a 5 no deben ejecutarse hasta que se haya completado correctamente la opción 1
//		(es decir, todos los datos hayan sido ingresados).
	
	
	Definir salir, continuar Como Logico;
	Definir opc, cantdeciudades, indmin, indmax, tiempoespera Como Entero;
	Definir temperaturas, max, min, prom Como Real;
	Definir ciudades Como Caracter;
	salir = Falso;
	continuar = Falso;
	
	tiempoespera = 3; //en segundos
	
	
	Escribir "Ingrese la cantidad de ciudades";
	leer cantdeciudades;
	Dimensionar temperaturas[cantdeciudades], ciudades[cantdeciudades];
	
	Repetir
		Limpiar Pantalla;
		//Pantalla PRINCIPAL:
		Escribir "******************************************************************************";
		Escribir "Elija una opcion";
		Escribir "******************************************************************************";
		Escribir "1. Ingresar ciudades y temperaturas";
		Escribir "2. Listar ciudades y su temperatura";
		Escribir "3. Mostrar la ciudad con la temperatura más alta (ciudad y temperatura)";
		Escribir "4. Mostrar la ciudad con la temperatura más baja (ciudad y temperatura)";
		Escribir "5. Mostrar el promedio de temperaturas";
		Escribir "0. Salir del sistema";
		Escribir "******************************************************************************";
		Leer opc;
		Limpiar Pantalla;
		//************************************************
		
		
		//Menu;
		segun opc Hacer
			caso 1:
				para i =0 hasta cantdeciudades-1 Hacer
					si cantdeciudades - i > 1 entonces Escribir "Falta cargar " cantdeciudades - i " ciudades";
					FinSi
					si cantdeciudades - i = 1 entonces Escribir "Falta cargar " cantdeciudades - i " ciudad";
					FinSi
					escribir "ingrese el nombre de la ciudad Nº" i+1;
					leer ciudades[i];
					escribir "ingrese el valor de temperatura de " ciudades[i];
					leer temperaturas[i];
			//		Limpiar Pantalla;
				FinPara
				continuar = Verdadero;
			//	opt = 99;
				
			caso 2:
				si continuar Entonces
					
					Escribir "******************************************************************************";
					Escribir " Temp - Ciudad";
					para i =0 hasta cantdeciudades-1 Hacer
						mostrar "" temperaturas[i] " - " ciudades[i] "";
					FinPara
					Escribir "******************************************************************************";
					Escribir "";
					Escribir "(Presione cualquier tecla para continuar.)";
					Esperar Tecla;
				//	Limpiar Pantalla;
				//	opt = 99;
				FinSi
				si no continuar Entonces
					mostrar "Primero cargue las ciudades y temperaturas.";
					Esperar tiempoespera segundos;
				FinSi
				
//			caso 3:
//			caso 4:
			caso 3, 4, 5:
				si continuar Entonces
					prom=temperaturas[0];
					max=temperaturas[0];
					min=temperaturas[0];
					indmin=0;
					indmax=0;
					para i =1 hasta cantdeciudades-1 Hacer
						prom= prom + temperaturas[i];
						si max>temperaturas[i]; Entonces
							max=temperaturas[i];
							indmax=i;
						FinSi
						si min<temperaturas[i]; Entonces
							min=temperaturas[i];
							indmin=i;
						FinSi
					FinPara
					
					si opc=3 Entonces
						Mostrar ciudades[indmax] " es la ciudad mas CALUROSA con: " temperaturas[indmax] " grados.";
						Escribir "";
						Escribir "(Presione cualquier tecla para continuar.)";
					FinSi
					si opc=4 Entonces
						Mostrar ciudades[indmin] " es la ciudad mas FRESCA con: " temperaturas[indmin] " grados.";
						Escribir "";
						Escribir "(Presione cualquier tecla para continuar.)";
					FinSi
					si opc=5 Entonces
						Mostrar "El promedio de temperaturas es: " prom / cantdeciudades " grados.";
						Escribir "";
						Escribir "(Presione cualquier tecla para continuar.)";
					FinSi
					
					Esperar Tecla;
					//Limpiar Pantalla;
					//opt = 99;
				FinSi
				si no continuar Entonces
					mostrar "Primero cargue las ciudades y temperaturas.";
					Esperar tiempoespera segundos;
				FinSi			
			Caso 0:
				salir = Verdadero;
				
			otro:
				Escribir "Opción no válida";
				Esperar tiempoespera Segundos;

		FinSegun
	Hasta Que salir		
FinProceso
