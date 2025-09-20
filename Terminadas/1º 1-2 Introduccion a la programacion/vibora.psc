Proceso vibora
	Limpiar Pantalla;
	definir mapa, viborita, dir Como Caracter;
	definir tam, vx, vy Como Entero;
	definir existeComida Como Logico;
	existeComida=falso;
	tam = 10;
	
	dimensionar vx[tam * tam];
	dimensionar vy[tam * tam];
	dimensionar mapa[tam,tam];
//	dimensionar viborita[tam * tam];
	dimensionar viborita[tam, tam];
	
	definir repet Como Logico;
	repet=verdadero;
	
	para i =0 Hasta tam - 1 Hacer
		para j =0 Hasta tam - 1 Hacer
			mapa[i,j] = "   ";
			viborita[i,j] = "   ";
		FinPara
	FinPara
	
//	viborita[2, 2] = " o ";
//	viborita[2, 2 + 1] = " o ";
//	viborita[2, 2 + 2] = " o ";
		
	para i=0 Hasta tam * tam - 1 Hacer
		vx[i] = 0;
		vy[i] = 0;
	FinPara
	vx[0] = 4;
	vy[0] = 4;
	vx[1] = 4;
	vy[1] = 4 + 1;
	vx[2] = 4;
	vy[2] = 4 + 2;
	dir = "w";
	
	
	
	
	repetir
		xx = azar(tam);
		yy = azar(tam);
		si no existeComida Entonces existeComida=random(mapa, xx, yy, verdadero);
		FinSi
		
		
		mover(viborita, tam, dir, vx, vy);
		pantallazo(mapa, tam, viborita);
		
		
		
		//random(mapa, xx, yy, falso);

		//Esperar Tecla;
		leer dir;
		Limpiar Pantalla;
	Mientras que repet;
		
FinProceso






funcion mover(viborita por referencia, tam, dir, vx, vy)
	definir vborr como entero;
	//indice borrarcola
	i=tam * tam-1;
	Repetir
		si vx[i] <> 0 o vy[i] <> 0 Entonces
			vxborr = i;
			i= 0;
		FinSi
		i = i -1;
	Hasta Que i = -1
	//desplazar
	para i = tam * tam -2 hasta 0 Con Paso -1
		vx[i+1] = vx[i];
		vy[i+1] = vy[i];
	FinPara
	//borrarcola
//	viborita[vx[vxborr], vy[vxborr]+1] = "XXX";
	
	
	si dir = "w" o dir = "W" Entonces
		//si vy[0]
		vx[0]=vx[0]-1; 
		vy[0]=vy[0]; 
	FinSi
	si dir = "a" o dir = "A" Entonces
		//si vy[0]
		vx[0]=vx[0]; 
		vy[0]=vy[0]-1; 
	FinSi
	si dir = "s" o dir = "S" Entonces
		//si vy[0]
		vx[0]=vx[0]+1; 
		vy[0]=vy[0]; 
	FinSi
	si dir = "d" o dir = "D" Entonces
		//si vy[0]
		vx[0]=vx[0]; 
		vy[0]=vy[0]+1; 
	FinSi
	
	
	para i = 0 hasta tam * tam -1
		si vx[i] <> 0 o vy[i] <> 0 Entonces
			viborita[vx[i], vy[i]] = " o ";
		FinSi
	FinPara
	
	
FinFuncion







funcion ret = random(mapa por referencia, xx, yy, accion)
	definir ret como logico;
	si accion entonces
		mapa[xx,yy] = " * ";
		ret = verdadero;
	sino
		mapa[xx,yy] = "   ";
		ret = falso;
	FinSi
FinFuncion

funcion pantallazo(mapa por referencia, tam, viborita Por Referencia)
	lineahorizontal(tam,verdadero);
	para i = 0 Hasta tam -1 Hacer
		lineavertical(falso);
		para j = 0 Hasta tam -1 Hacer
			si viborita[i,j] = "   " entonces mostrar Sin Saltar mapa[i,j];
				sino mostrar Sin Saltar viborita[i,j];
			FinSi
		FinPara
		lineavertical(Verdadero);
	FinPara
	lineahorizontal(tam,verdadero);
FinFuncion

Funcion lineavertical(salto)
	Mostrar sin saltar "|";
	si salto entonces mostrar "";
	FinSi
FinFuncion

Funcion lineahorizontal(tam,salto)
	para n = 0 Hasta tam -1 Hacer		
		mostrar sin saltar "---";
	FinPara
	mostrar sin saltar "--";
	si salto entonces mostrar "";
	FinSi	
FinFuncion
	