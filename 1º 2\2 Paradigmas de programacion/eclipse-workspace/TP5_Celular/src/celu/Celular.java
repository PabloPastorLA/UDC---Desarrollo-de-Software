/*2) Sobrecarga de métodos.
OK * Cree un objeto Celular cuyo número esté compuesto por el código de área y número de línea. 
OK * Para cada celular se sabe el crédito con que cuenta.
OK * El mensaje llamar que recibe un número de teléfono y decrementa el crédito en $20 si se llama a un teléfono con el mismo código de área
OK * y en $45 si se llama a un teléfono de otra localidad. 
OK * El mensaje llamar sin argumentos llama al último número marcado en el celular.
OK * Cuando se compra el celu normalmente viene sin carga, pero hay otros que vienen de fábrica con un monto de crédito. 
OK * Para la carga de crédito existe el mensaje recargar que carga el monto que se indica como parámetro o, 
OK * el monto de la recarga SOS ($200) en caso de no recibir parámetros.

|-------------------------------------------|
|	Celular									|
|-------------------------------------------|
|		-codigo_Area						|
|		-numero								|
|		-saldo								|
|-------------------------------------------|
|	Celular (codigo_area, numero) 			|
|	Celular (codigo_area, numero, saldo) 	|
|											|
|	llamar (codigo_area, numero)			|
|	llamar ()								|
|											|
|	recargar(importe)						|
|	recargar()								|
|-------------------------------------------|




3) Atributos y métodos estáticos.
OK	Cree un método de clase en la clase Celular que permita obtener una lista de todos los celulares existentes.
*/



package celu;

public class Celular {
	//-------------------------------------------
	//atributos de instancia
	private int codigo_Area;
	private int numero;
	private double saldo;
	private int codigo_Area_Ultimo_Marcado;
	private int numero_Ultimo_Marcado;
//-------------------------------------------
	//atributo estatico (constante para definir promocion de saldo inicial y tamaño de arreglo(todo por no hacerlo dinámico))
	private static double saldoInicial=10000;
	private static int tamanioArregloReservado=9;
//-------------------------------------------
	//atributo de clase
	private static long[] listaDeCelus = new long[tamanioArregloReservado];
	private static int index=-1;
//-------------------------------------------
	
	//constructor sin definir saldo
	public Celular(int numero, int codigo_Area){
		this.numero = numero;
		this.codigo_Area = codigo_Area;
		this.saldo = saldoInicial;
		index++;
        listaDeCelus[index] = Long.parseLong("" + codigo_Area + numero);
        }
//-------------------------------------------
	//constructor definiendo saldo
	public Celular(int numero, int codigo_Area, double saldo){
		this.numero = numero;
		this.codigo_Area = codigo_Area;
		this.saldo = saldo;
		index++;
        listaDeCelus[index] = Long.parseLong("" + codigo_Area + numero);
	}
//-------------------------------------------
	//metodo llamar  un nro definido
	public void llamar(int codigo_Destino, int numero_Destino) {
/*El mensaje llamar que recibe un número de teléfono y decrementa el crédito en $20 si se llama a un teléfono con el mismo código de área
  y en $45 si se llama a un teléfono de otra localidad.*/
		if (codigo_Destino == codigo_Area && saldo>= 20) {
			saldo -= 20;
			codigo_Area_Ultimo_Marcado=codigo_Destino;
			numero_Ultimo_Marcado=numero_Destino;		
			System.out.println("Llamando a "+15+numero_Destino+". Saldo restante: "+saldo);
		}
		else if (codigo_Destino != codigo_Area && saldo>= 45) {
			saldo -= 45;
			codigo_Area_Ultimo_Marcado=codigo_Destino;
			numero_Ultimo_Marcado=numero_Destino;		
			System.out.println("Llamando a "+codigo_Destino+numero_Destino+". Saldo restante: "+saldo);			
		}
		else if (codigo_Destino == codigo_Area && saldo< 20) {
			System.out.println("No possee saldo suficiente para esta llamada local de $20. Ud posee: $"+saldo+" de saldo.");
		}
		else {
			System.out.println("No possee saldo suficiente para esta llamada de larga distancia de $45. Ud posee: $"+saldo+" de saldo.");
		}
	}

	
	
//-------------------------------------------
	//metodo llamar al ultimo discado
	
	public void llamar() {
/*El mensaje llamar sin argumentos llama al último número marcado en el celular.
El mensaje llamar que recibe un número de teléfono y decrementa el crédito en $20 si se llama a un teléfono con el mismo código de área
y en $45 si se llama a un teléfono de otra localidad.*/
		if (codigo_Area_Ultimo_Marcado == 0) {System.out.println("No existe ultimo nro guardado. Imposible llamar");return;}

		int codigo_Destino=codigo_Area_Ultimo_Marcado;
		int numero_Destino=numero_Ultimo_Marcado;		
		
		if (codigo_Destino == codigo_Area && saldo>= 20) {
			saldo -= 20;
			System.out.println("Llamando a "+15+numero_Destino+". Saldo restante: "+saldo);
		}
		else if (codigo_Destino != codigo_Area && saldo>= 45) {
			saldo -= 45;
			System.out.println("Llamando a "+codigo_Destino+numero_Destino+". Saldo restante: "+saldo);			
		}
		else if (codigo_Destino == codigo_Area && saldo< 20) {
			System.out.println("No possee saldo suficiente para esta llamada local de $20. Ud posee: $"+saldo+" de saldo.");
			
		}
		else {
			System.out.println("No possee saldo suficiente para esta llamada de larga distancia de $45. Ud posee: $"+saldo+" de saldo.");
		}
	}

//-------------------------------------------
	//metodos para recargar saldo (definido y sin definir)
	
/*	 Para la carga de crédito existe el mensaje recargar que carga el monto que se indica como parámetro o, 
	 el monto de la recarga SOS ($200) en caso de no recibir parámetros.*/
	
	public void recargar(double monto) {
		System.out.print("Su saldo anterior es: $"+saldo+". ");
		saldo+=monto;
		System.out.println("Y ahora es: $"+saldo);
	}
	public void recargar() {
		System.out.print("Su saldo anterior es: $"+saldo+". ");
		saldo+=200;
		System.out.println("Y ahora es: $"+saldo);
	}

	
	
//--------------------------------------------------------------------------
/* Cree un método de clase en la clase Celular que permita obtener una lista de todos los celulares existentes.*/
	public static void mostrarListaNrosExistentes() {
		if (listaDeCelus[0]==0) {System.out.println("No existe ningun nro creado...");return;}
    	
		System.out.println("---------------------------------");
		System.out.println("El listado de nros existentes es:");
		System.out.println("---------------------------------");
        
		for (int i=0; i<listaDeCelus.length-1; i++) {
        	if (listaDeCelus[i]==0) {break;}
        	System.out.println(listaDeCelus[i]);
        }
		
		System.out.println("---------------------------------");
	}
}
