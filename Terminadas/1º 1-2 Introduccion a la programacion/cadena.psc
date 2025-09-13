//Longitud(cadena);
//SubCadena(cadena,pos1,pos2);
//Concatenar(cadena1, cadena2);
//ConvertirANumero("cadena");
//ConvertirATexto(numero);
//Mayusculas("cadena");
//Escribir Minusculas("cadena");

Proceso sin_titulo
	
//	func0;
//	func1;
//	func2;
//	func3;
	func4;
	
	
	
FinProceso

//Funcion func0
//	definir mi_str como cadena;
//	mi_str = "Hola a todos";
//	//Leer str1;
//	Escribir mi_str;
//	Escribir mi_str[3];
//	
//FinFuncion


funcion func1
	//1) Diseña un algoritmo que solicite por teclado: una frase y una subcadena. Y valide si la
	//			frase comienza con la subcadena introducida.
	definir numerocad, numerosub como entero;
	definir cad, sub, caractercad, caractersub como cadena;
	definir existe Como Logico;
	existe=verdadero;

	mostrar "Ingrese frase seguido de subcadena";
	leer cad, sub;
	
	para i=0 hasta Longitud(sub)-1 hacer
		si existe entonces 
			caractercad = subcadena (cad, i, i);
			caractersub = subcadena (sub, i, i);
			si caractercad <> caractersub Entonces existe = falso;
			FinSi
		FinSi
		
	FinPara
	si existe entonces mostrar "La subcadena existe";
	FinSi
	si no existe entonces mostrar "La subcadena no existe";
	FinSi
	
	
	
FinFuncion


funcion func2
	//	2) Diseña un algoritmo que solicite una frase por teclado (separadas por espacios) y cuente
	//	cuántos espacios vacíos tiene.
	definir frase como cadena;
	definir cant como entero;
	cant=0;
	
	mostrar "ingrese fraase con espacios";
	Leer frase;
	
	para i=0 hasta Longitud(frase)-1 Hacer
		si subcadena(frase,i,i) = " " Entonces
			cant = cant +1;
		FinSi
	FinPara
	mostrar "la cantidad de espacios es: " cant;
	
FinFuncion
funcion func3
	//3) Introducir una cadena de caracteres e indicar si es un palíndromo. Una palabra
	//palíndroma es aquella que se lee igual adelante que atrás.
	definir frase como cadena;
	definir pali como logico;
	
	pali= verdadero;
	Mostrar "Ingrese frase";
	Leer frase;
	
	//par
	//i =0;//            6    -1 -0        
	//i = 5;//Longitud(frase) -1 -i;
	
	//i=1;//              6   -1 -1      
	//i= 4; //Longitud(frase) -1 -i
	
	//i=2;//          6       -1  -2    
	//i=3;//  Longitud(frase) -1 -i
	
	//impar
	//i =0;//            7    -1 -0        
	//i = 6;//Longitud(frase) -1 -i;
	
	//i=1;//              7   -1 -1      
	//i= 5; //Longitud(frase) -1 -i
	
	//i=2;//          7       -1  -2    
	//i=4;//  Longitud(frase) -1 -i
	
	para i=0 hasta trunc(Longitud(frase)/2) Hacer
		si Subcadena(frase,i,i) <> Subcadena(frase,Longitud(frase) -1 -i,Longitud(frase) -1 -i) Entonces
			pali = falso;
		FinSi
	FinPara
	mostrar "Es palinoseque la palabra?: " pali;
	
FinFuncion
funcion func4
	//4) Diseña un algoritmo que solicite por teclado: una frase y una subcadena. Y valide si la
	//frase contiene la subcadena introducida.
	
	definir frase, subc como cadena;
	definir existe como logico;
	definir conteo, offset como entero;
	conteo =0;
	offset=0;
	
	existe = Falso;
	
	
	mostrar "ingrese una frase, seguida de una cadena para buscar dentro de la primera";
	leer frase, subc;
	
	
	Para i=0 hasta Longitud(frase)-Longitud(subc)-1 Hacer
		si Subcadena(frase,i,i) <> Subcadena(subc,0,0) Entonces // si matchea un caracter de la frase con el primer caracter de la subcadena
			conteo = 0;
			offset = i;
		FinSi
		si Subcadena(frase,i,i) = Subcadena(subc,offset,offset) Entonces // si matchea un caracter de la frase con el primer caracter de la subcadena
			conteo = conteo +1;
			offset = offset +1;
		FinSi
		Mostrar "conteo: " conteo;
		si conteo = Longitud(subc) Entonces
			existe = verdadero;
		FinSi		
	FinPara
	
	mostrar "Existe la subcadena dentro de la frase?:" existe;
	
	
	
	
	
FinFuncion
