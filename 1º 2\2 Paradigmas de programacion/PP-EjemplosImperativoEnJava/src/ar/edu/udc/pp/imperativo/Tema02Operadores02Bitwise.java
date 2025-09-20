package ar.edu.udc.pp.imperativo;

public class Tema02Operadores02Bitwise {
	
	public static void main(String[] args) {
		
		//  5 = 00000101
		// 12 = 00001100
		
		final int cinco = 5;
		final int doce = 12;
		
		int cincoAndDoce = cinco & doce;
		//  5  00000101
		// AND
		// 12  00001100
		//     00000100
		System.out.println(cincoAndDoce + " " + Integer.toBinaryString(cincoAndDoce));
		
		
		int cincoOrDoce = cinco | doce;
		//  5  00000101
		// OR
		// 12  00001100
		//     00001101		
		System.out.println(cincoOrDoce + " " + Integer.toBinaryString(cincoOrDoce));
		
		int cincoXorDoce = cinco ^ doce;
		//  5  00000101
		// XOR
		// 12  00001100
		//     00001001		
		System.out.println(cincoXorDoce + " " + Integer.toBinaryString(cincoXorDoce));

		// NOT
		// 12  00001100
		//     11110011		
		int notDoce = ~doce;
		System.out.println(notDoce + " " + Integer.toBinaryString(notDoce));
		
		int cuartoBitPorLaDerecha = (doce & 8) / 8;
		System.out.println(cuartoBitPorLaDerecha);
		
		cuartoBitPorLaDerecha = (doce & (1 << 3)) >> 3;
		System.out.println(cuartoBitPorLaDerecha);
		
	}

}
