Proceso Funciones_y_Procedimientos
	
	//ej1;
	ej2;
FinProceso

Funcion  ej2
	definir arr2 Como Entero;
	Dimensionar arr2[5];
	arr2[0] = 9;
	arr2[1] = 7;
	arr2[2] = 3;
	arr2[3] = 5;
	arr2[4] = 1;
	
	notas(arr2);
	
FinFuncion

Funcion notas(arr2 Por referencia)
	Mostrar arr2[3];
//	Definir pro Como entero;
//	pro = 0;
//	para i =0 hasta Longitud(arr2)-1 Hacer
//		//pro = pro + arr2[i];
//	FinPara
//	Mostrar pro / (Longitud(arr2)-1);
FinFuncion
Funcion ej1
	definir edad como entero;
	
	edad = 5;
	procedi(edad);
	
	edad = 88;
	procedi(edad);
	
	procedi(ConvertirANumero("120"));
FinFuncion



Funcion procedi (edadddddd)
//	Definir edadddddd como entero;
	si edadddddd >= 18 Entonces
		mostrar edadddddd " es mayor";
	FinSi
	si edadddddd < 18 Entonces
		mostrar edadddddd " es menor";
	FinSi
	
FinFuncion
	