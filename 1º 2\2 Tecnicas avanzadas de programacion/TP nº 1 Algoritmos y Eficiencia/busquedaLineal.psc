Algoritmo busquedaLineal
	//Este script permite generar un arreglo de enteros, rellenarlo con nros al azar 
	//y buscar un valor dentro edel mismo. Devuelve la posicion dentro del arreglo o
	//un msg de resultado negativo.
	
	definir buscar, tamanio, arr, ret Como Entero;
	
	mostrar "Ingrese tamanio";
	leer tamanio;
	dimensionar arr[tamanio];
	
	mostrar "ingrese nro a buscar";
	leer buscar;
	
	rellenarAzar(arr, tamanio);
	ret=busquedaLin(arr, tamanio, buscar);
	
	si ret < 0 entonces 
		mostrar "El elemoento no se encuentra...";
	sino 
		mostrar "El elemento se encuentra en la posicion: " ret;
	FinSi
		
FinAlgoritmo


Funcion rellenarAzar(arr Por Referencia, tamanio)
	//Func que recibe un arreglo, por referencia y lo llena de nros al azar
	//El rango de generacion de enteros al azar va desde cero hasta el tamanio del arreglo
	//para tratar de que haya correlatividad entre el tamaño y los posibles nros
	
	para i=0 hasta tamanio -1 Hacer
		arr[i] = azar(tamanio);
	FinPara
FinFuncion


Funcion retorno = busquedaLin(arr Por Referencia, tamanio, buscar)
	//Func que recibe un arreglo, su tamanio y un elemento a buscar dentro de dicho arreglo
	//Puede retornar un entero correspondiente a la posicion dentro del arreglo, o -1 en caso de no encontrar tal elemento
	
	Definir i, retorno como Entero;
	Definir encontrado como Logico;
	
	i=0;
	encontrado = Falso;
	retorno = -1;
	
	repetir
		si buscar = arr[i] Entonces
			encontrado = Verdadero;
			retorno = i;
		sino 
			i = i+1;
		FinSi
	Hasta Que encontrado o i = tamanio
FinFuncion
