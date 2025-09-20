package ej3ObjetosSumergibles;

public class MainEj3 {

	public static void main(String[] args) {
		//Submarino(int profMax, int profAct) {
		Submarino jin094 = new Submarino (15000, 6500);
		
		System.out.println(jin094.getProfActual());
		System.out.println(jin094.getProfMax());

		System.out.println("----------PRUEBA 1-----------");

		
		Submarino ussHarder02 = new Submarino (15000, 20000);
		System.out.println("----------PRUEBA 2-----------");

		System.out.println(ussHarder02.getProfMax());
		System.out.println(ussHarder02.getProfActual());
		
		ussHarder02.setProfMax(500);
		ussHarder02.setProfActual(30000);

		System.out.println(ussHarder02.getProfMax());
		System.out.println(ussHarder02.getProfActual());

		System.out.println("----------PRUEBA 3-----------");

		ussHarder02.setProfMax(50000);
		ussHarder02.setProfActual(3000);

		System.out.println(ussHarder02.getProfMax());
		System.out.println(ussHarder02.getProfActual());

		
				/*imprimir(String.valueOf(          ));
		imprimir(String.valueOf(          ));
		imprimir(String.valueOf(          ));
*/	}

	
	
//	public static void imprimir(String cadena) {
//		System.out.println(cadena);
//	}
}
