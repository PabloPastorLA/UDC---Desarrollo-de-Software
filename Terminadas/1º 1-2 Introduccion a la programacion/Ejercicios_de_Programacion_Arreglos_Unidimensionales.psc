Proceso Ejercicios_de_Programacion_Arreglos_Unidimensionales
//Ejercicio 1: Llenar un arreglo con números pares en un rango
//	Pedir al usuario un número entero 'n'.
//	Crear un arreglo de tamaño 'n' y llenarlo con los primeros 'n' números pares, empezando desde 2.
//	Mostrar el contenido del arreglo.
//Ejercicio 2: Llenar un arreglo con múltiplos de un número dado
//	Pedir al usuario un número base 'b' y la cantidad de elementos 'n'.
//	Crear un arreglo de tamaño 'n' y llenarlo con los primeros 'n' múltiplos de 'b'.
//	Mostrar todos los valores almacenados en el arreglo.
//Ejercicio 3: Llenar un arreglo con números ingresados manualmente y mostrar solo los mayores a
//	Pedir al usuario que ingrese 'n' números para llenar un arreglo.
//	Luego, mostrar en pantalla solo aquellos números del arreglo que sean mayores a 100.
//Ejercicio 4: Llenar un arreglo con la secuencia de los primeros 'n' cuadrados
//	Pedir al usuario un número 'n'.
//	Crear un arreglo que contenga los cuadrados de los primeros 'n' números naturales (empezando en 1).
//	Mostrar todos los resultados.
	
	//1:
//	definir arr1, n como entero;
//	escribir "ingrese el tamaño del arreglo (n)";
//	leer n;
//	Dimensionar arr1[n];
//	
//	arr1[0] = 2;
//	para j=1 Hasta n-1 Hacer
//		arr1[j] = arr1[j-1] + 2;
//	FinPara
//	
//	para i = 0 Hasta n -1 Hacer
//		mostrar Sin Saltar arr1[i] " | " ;
//	FinPara

	//2:
//	Definir base, n Como Entero;
//	Definir arr2 Como Entero;
//	
//	escribir "ingrese nro base";
//	leer base;
//	escribir "ingrese cant n";
//	leer n;
//	
//	Dimensionar arr2[n];
//	
//	para i = 0 Hasta n -1 Hacer
//		arr2[i] = base * (i + 1);
//	FinPara
//	
//	para i = 0 Hasta n -1 Hacer
//		mostrar Sin Saltar arr2[i] " | " ;
//	FinPara
	
	//3:
//	definir arr3, cant como entero;
//	
//	Escribir "Ingrese cant:";
//	leer cant;
//	Dimensionar arr3[cant];
//	
//	Escribir "Ingrese nros:";
//	para i=0 hasta cant-1 Hacer
//		leer arr3[i];
//	FinPara
//	para i=0 hasta cant-1 Hacer
//		si arr3[i] > 100 Entonces
//			Escribir arr3[i] " | ";
//		FinSi
//	FinPara
	
	//4:
	//Ejercicio 4: Llenar un arreglo con la secuencia de los primeros 'n' cuadrados
//	Pedir al usuario un número 'n'.
//	Crear un arreglo que contenga los cuadrados de los primeros 'n' números naturales (empezando en 1).
//	Mostrar todos los resultados.
	
	Definir arr4, n Como Entero;
	Escribir "ingrese n a -cuadrar-";
	Leer  n;
	Dimensionar arr4[n];
	
	para i=0 Hasta n-1 Hacer
		arr4[i] = (i+1) * (i+1);
	FinPara
	
	para i=0 Hasta n-1 Hacer
		Escribir arr4[i] " | ";
	FinPara
	
FinProceso
