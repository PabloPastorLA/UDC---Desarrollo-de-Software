package tp3_Hulk_Barco;

public class NaipeEspañol {
	//atributos
	private int palo;
	private int valor;

	//constructor
	public NaipeEspañol(int valor, int palo){
		// 1 - basto
		// 2 - copa
		// 3 - espada
		// 4 - oro
		//Validamos el ingreso de datos en el constructor
		if (valor < 1 || valor > 12) {
		    System.out.println("El valor de la carta debe estar entre 1 y 12");
		    throw new IllegalArgumentException("El valor de la carta debe estar entre 1 y 12");
		}
		if (palo < 1 || palo > 4) {
		    System.out.println("El valor del palo debe estar entre 1 y 4");
		    throw new IllegalArgumentException("El valor del palo debe estar entre 1 y 4");
		}
		this.palo=palo;
		this.valor=valor;
		//FALTA VALIDAR
	}
	
	//getters
	
	public String toString(){
		String cadena1="";
		String cadena2="";
		switch (valor) {
			case 1: cadena2="Ancho"; break;
			case 2: cadena2="Dos"; break;
			case 3: cadena2="Tres"; break;
			case 4: cadena2="Cuatro"; break;
			case 5: cadena2="Cinco"; break;
			case 6: cadena2="Seis"; break;
			case 7: cadena2="Siete"; break;
			case 8: cadena2="Ocho"; break;
			case 9: cadena2="Nueve"; break;
			case 10: cadena2="Zota"; break;
			case 11: cadena2="Caballo"; break;
			case 12: cadena2="Rey"; break;
		}
		switch (palo) {
			case 1: cadena1="Basto"; break;
			case 2: cadena1="Copa"; break;
			case 3: cadena1="Espada"; break;
			case 4: cadena1="Oro"; break;
		}
		return cadena2 + " de " + cadena1;
	}
}


