Proceso TODO_CADENA
	definir asciiatexto Como Entero;
	definir cad, cad2 como cadena;
	cad = "tarepi";
	cad2= " poPIto";
	asciiatexto = 92;
	
//	Longitud(cadena);
//	SubCadena(cadena,pos1,pos2);
//	Concatenar(cadena1, cadena2);
//	ConvertirANumero("cadena");
//	ConvertirATexto(numero);
//	Mayusculas("cadena");
//	Escribir Minusculas("cadena");
	
	
	//Longitud y subcadena
	para i= 0 hasta Longitud(cad)-1 Hacer
		escribir subcadena(cad, i, i);
	FinPara
	Mostrar Concatenar(cad, cad2);
	
	Mostrar ConvertirANumero("1");
	
	mostrar ConvertirATexto(asciiatexto);
	
	Mostrar Mayusculas(cad);
	Mostrar Minusculas(cad2);
	
FinProceso
