package ar.edu.udc.pp.imperativo;

public class Tema02Operadores {

	public static void main(String[] args) {

		for (;;) {

			boolean fin = false;

			// El operador m�s puede ser de suma ...
			int dos = 1 + 1;

			// ... o de concatenaci�n ...
			String cadena = 1 + "1";

			System.out.println("dos : " + dos);
			System.out.println("cadena : " + cadena);

			// .. �de qu� depende que sea uno u otro?

			fin = true; // Vamos cambiando el valor de fin para poder imprimir el pr�ximo ejemplo
			if (fin)
				break;

			// Operadores aritm�ticos
			final int tresEntero = 3;
			final float tresFlotante = 3f;

			System.out.println(" 2 - 5  = " + (2 - 5));
			System.out.println(" 3 * 5  = " + (3 * 5));
			System.out.println(" 9 / 2  = " + (9 / 2));
			// System.out.println(" 10 / 3 = " + (10 / tresEntero) );
			// System.out.println(" 10 / 3 = " + (10 / tresFlotante) );
			// �Ac� que pasar�?
			// System.out.println(" 9 / 2 = " + (9f / 2) );

			fin = true; // Vamos cambiando el valor de fin para poder imprimir el pr�ximo ejemplo
			if (fin)
				break;

			// Operadores unarios
			int a = 8;

			System.out.println("      -> " + a++ + " " + ++a + " " + a);

			a = 9;
			System.out.println(" .    -> " + --a);
			System.out.println(" ..   -> " + a--);
			System.out.println(" ...  -> " + a);
			System.out.println(" .... -> " + -a);
			// �Que resultado da esto?
			// a = 9;
			// System.out.println(" " + (--(--a)));

			fin = true; // Vamos cambiando el valor de fin para poder imprimir el pr�ximo ejemplo
			if (fin)
				break;

			// Operadores de comparaci�n

			int value1 = 1;
			int value2 = 2;
			if (value1 == value2)
				System.out.println("value1 == value2");
			if (value1 != value2)
				System.out.println("value1 != value2");
			if (value1 > value2)
				System.out.println("value1 > value2");
			if (value1 < value2)
				System.out.println("value1 < value2");
			if (value1 <= value2)
				System.out.println("value1 <= value2");

			
			
	        if((value1 == 1) && (value2 == 2))
	            System.out.println("value1 is 1 AND value2 is 2");
	        if((value1 == 1) || (value2 == 1))
	            System.out.println("value1 is 1 OR value2 is 1");
	        
	        
	        int result;
	        boolean someCondition = true;
	        result = someCondition ? value1 : value2;

	        System.out.println(result);
	        
			break;

		}

	}
}
