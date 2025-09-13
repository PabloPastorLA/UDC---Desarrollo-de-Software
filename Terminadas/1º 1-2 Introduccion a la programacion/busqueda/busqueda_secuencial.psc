Proceso busqueda_secuencial
	Definir ret, arr, nro Como Entero;
	
	escribir "Ingrese tamaño de arreglo, seguido del nro entero a buscar";
	Leer tam, nro;
	
	Dimensionar arr[tam];
	
	para i=0 hasta tam -1 Hacer
		arr[i]=azar(3);
	FinPara
	
	ret = buscarsecuencial(arr, tam, nro);
	
	si ret == -1 Entonces Mostrar "No encontre el nro en el arreglo";FinSi
	si ret <> -1  Entonces Mostrar "Lo encontre en la posicion: " ret;FinSi	
FinProceso


funcion retorno = buscarsecuencial(a, tamano, buscado)
	Definir  i, retorno Como Entero;
	i = 0;
	retorno = -1;
	
	Mientras i < tamano y retorno == -1 Hacer
		si a[i] = buscado Entonces
			retorno = i;
		FinSi
		i = i +1;
	FinMientras
FinFuncion
	