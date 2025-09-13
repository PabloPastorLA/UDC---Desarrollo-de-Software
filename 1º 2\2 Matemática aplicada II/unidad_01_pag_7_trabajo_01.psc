Proceso trabajo_01_unidad_01_pag_7
//Veamos un ejemplo
//Se desea escribir el algoritmo para la solución del siguiente problema: dados
//dos números z1 y z2 escribir el mayor de ellos.
//
//Veamos el seudocódigo y el diagrama de flujo correspondiente:
//Algoritmo Mayor (algoritmo que muestra el mayor de dos números)
//Las variables de entrada son: z1, z2
//Paso 1: Introducir z1, z2
//Paso 2: si z1 > z2 entonces escribir z1
//Paso 3: si no escribir z2
//PARAR
	definir z16, z17,z18 como entero;
	
	mostrar("escriba 2 nro uno seguido de otro, retornaré el mayor");
	leer z16, z17;
	
	si z16 > z17 entonces 
		z18 = z16;
	sino 
		z18 = z17;
	FinSi
	
	mostrar "el nro mayor es: " z18;
	
FinProceso
