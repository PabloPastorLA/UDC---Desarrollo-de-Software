Proceso ejercicios_cadena
	definir cad como cadena;
	definir cant como entero;
	definir i como entero;
	cant = 0;
	mostrar "Ingrese la cadena de texto";
	leer cad;
	para i=0 hasta Longitud(cad)-1 Hacer
		si Subcadena(cad, i, i) = "i" Entonces
			cant = cant + 1;
		FinSi
	FinPara
	Escribir cant;
	
	
	
//	definir cad, cad2 como cadena;
//	definir cant como entero;
//	cant = 0;
//	cad2 = "";
//	mostrar "Ingrese la cadena de texto";
//	leer cad;
//	para i=0 hasta Longitud(cad)-1 Hacer
//		cad2 = Subcadena(cad, i, i) + cad2;
//	FinPara
//	Escribir cad2;
	
	
//	A E i O S
//	4 3 1 0 5
	
	
//	definir cad, cad2 como cadena;
//	definir cant como entero;
//	cant = 0;
//	cad2 = "";
//	mostrar "Ingrese la cadena de texto";
//	leer cad;
//	para i=0 hasta Longitud(cad)-1 Hacer
//		si Subcadena(cad, i, i) = "A" Entonces
//			cad2 = cad2 + "4";
//		sino si Subcadena(cad, i, i) = "E" Entonces
//			cad2 = cad2 + "3";		
//		sino si Subcadena(cad, i, i) = "i" Entonces
//			cad2 = cad2 + "1";
//		sino si Subcadena(cad, i, i) = "O" Entonces
//			cad2 = cad2 + "0";
//		sino si Subcadena(cad, i, i) = "S" Entonces
//			cad2 = cad2 + "5";
//		sino cad2 = cad2 + Subcadena(cad, i, i);
//		FinSi 
//		FinSi
//		FinSi
//		FinSi
//		FinSi
//	FinPara
//	Escribir cad2;

	
	
	
FinProceso
