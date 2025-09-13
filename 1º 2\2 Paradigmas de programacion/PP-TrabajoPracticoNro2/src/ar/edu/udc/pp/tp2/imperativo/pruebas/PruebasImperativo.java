package ar.edu.udc.pp.tp2.imperativo.pruebas;

import static org.junit.Assert.*;

import java.util.LinkedList;
import java.util.Random;

import org.junit.Test;

import ar.edu.udc.pp.tp2.imperativo.ImperativoEnJava;

public class PruebasImperativo {
	
	private static Random rnd = new Random();
	
	private LinkedList<Integer> asList(int... arreglo) {
		LinkedList<Integer> retval = new LinkedList<>();
		for (int valor: arreglo) {
			retval.add(valor);
		}
		return retval;
	}

	private static int [] asArray(int... arreglo) {
		int[] retval = new int  [arreglo.length];
		for (int i =0 ; i< arreglo.length ; i++) {
			retval[i] = arreglo[i];
		}
		return retval;
	}
	
	private static String [] asArray(String... arreglo) {
		String [] retval = new String [arreglo.length];
		for (int i =0 ; i< arreglo.length ; i++) {
			retval[i] = arreglo[i];
		}
		return retval;
	}
	
	@Test
	public void testSuma() {
		assertEquals(0, ImperativoEnJava.suma(-1, 1));
		assertEquals(0, ImperativoEnJava.suma(0, 0));
		assertEquals(2, ImperativoEnJava.suma(1, 1));
		assertEquals(8, ImperativoEnJava.suma(5, 3));
	}

	@Test
	public void testCantidadDias() {
		assertEquals(31, ImperativoEnJava.cantidadDias(1));
		assertEquals(28, ImperativoEnJava.cantidadDias(2));
		assertEquals(31, ImperativoEnJava.cantidadDias(3));
		assertEquals(30, ImperativoEnJava.cantidadDias(4));
		assertEquals(31, ImperativoEnJava.cantidadDias(5));
		assertEquals(30, ImperativoEnJava.cantidadDias(6));
		assertEquals(31, ImperativoEnJava.cantidadDias(7));
		assertEquals(31, ImperativoEnJava.cantidadDias(8));
		assertEquals(30, ImperativoEnJava.cantidadDias(9));
		assertEquals(31, ImperativoEnJava.cantidadDias(10));
		assertEquals(30, ImperativoEnJava.cantidadDias(11));
		assertEquals(31, ImperativoEnJava.cantidadDias(12));
	}
	
	@Test
	public void testMaximo() {
		assertEquals(0, ImperativoEnJava.maximo(0, 0), 0.0);
		assertEquals(0, ImperativoEnJava.maximo(0, 0, 0, 0, 0));
		
		assertEquals(8.0, ImperativoEnJava.maximo(8.0, 8.0), 0.0);
		assertEquals(8.0, ImperativoEnJava.maximo(8.0, 8.0, 8.0), 0.0);
		assertEquals(8.2, ImperativoEnJava.maximo(8.1, 8.2, 8.0), 0.0);
		assertEquals(8.3, ImperativoEnJava.maximo(8.23, 8.2, 8.3), 0.0);
		assertEquals(8.23, ImperativoEnJava.maximo(8.23, 8.2, 8.21), 0.0);
		assertEquals(7, ImperativoEnJava.maximo(7, -7, 0), 0.0);
		assertEquals(-1, ImperativoEnJava.maximo(-1, -1, -7.0), 0.0);
		assertEquals(Double.MAX_VALUE, ImperativoEnJava.maximo(Double.MAX_VALUE, Double.MIN_VALUE), 0.0);
		
		assertEquals(12, ImperativoEnJava.maximo(7, -7, 0, 12));
		assertEquals(12, ImperativoEnJava.maximo(7, -7, 12, 1));
		assertEquals(12, ImperativoEnJava.maximo(7, 12, 0, 1));
		assertEquals(12, ImperativoEnJava.maximo(12, -12, 0, 1));
		assertEquals(12, ImperativoEnJava.maximo(-12, 12, 0, 1));
		assertEquals(12, ImperativoEnJava.maximo(12, 12, 12, 12));
		assertEquals(-1, ImperativoEnJava.maximo(-7, -2, -6, -1));
		assertEquals(Integer.MIN_VALUE + 3, ImperativoEnJava.maximo(Integer.MIN_VALUE, Integer.MIN_VALUE +2 , Integer.MIN_VALUE +3 , Integer.MIN_VALUE));
		
	}
	
	@Test
	public void testValorAbsoluto() {
		assertEquals(2f, ImperativoEnJava.valorAbsoluto(-2f), 0.0f);
		assertEquals(2f, ImperativoEnJava.valorAbsoluto(2f), 0.0f);
		assertEquals(0f, ImperativoEnJava.valorAbsoluto(0f), 0.0f);
		
		float x = rnd.nextFloat();
		assertEquals(Math.abs(x), ImperativoEnJava.valorAbsoluto(x), 0.0f);
				
	}
	
	@Test
	public void testEsPar() {
		assertFalse(ImperativoEnJava.esPar(1));
		assertFalse(ImperativoEnJava.esPar(9));
		assertTrue(ImperativoEnJava.esPar(0));
		assertTrue(ImperativoEnJava.esPar(8));
		assertTrue(ImperativoEnJava.esPar(-500));
		
	}

	
	
	
	@Test
	public void testEsBisiseto() {
		
		assertTrue(ImperativoEnJava.esBisiesto(1904));
		assertTrue(ImperativoEnJava.esBisiesto(2000));
		assertFalse(ImperativoEnJava.esBisiesto(1900));
		assertFalse(ImperativoEnJava.esBisiesto(1993));
		assertTrue(ImperativoEnJava.esBisiesto(1992));
		
	}
	
	@Test
	public void testFahrenheitToCelsius() {
		assertEquals( 232.77, ImperativoEnJava.fahrenheitToCelsius( 451.00f), 0.1);
		assertEquals(-273.15, ImperativoEnJava.fahrenheitToCelsius(-459.67f), 0.1);
		assertEquals( -34.44, ImperativoEnJava.fahrenheitToCelsius( -30.00f), 0.1);
		assertEquals( -23.33, ImperativoEnJava.fahrenheitToCelsius( -10.00f), 0.1);
		assertEquals( -17.78, ImperativoEnJava.fahrenheitToCelsius(   0.00f), 0.1);
		assertEquals(  87.78, ImperativoEnJava.fahrenheitToCelsius( 190.00f), 0.1);
		assertEquals( 537.78, ImperativoEnJava.fahrenheitToCelsius(1000.00f), 0.1);
	}
	
	@Test
	public void testCelsiusToFahrenheit() {
		assertEquals( -58.0, ImperativoEnJava.celsiusToFahrenheit(-50), 0.1);
		assertEquals(  15.8, ImperativoEnJava.celsiusToFahrenheit( -9), 0.1);
		assertEquals(1832.0, ImperativoEnJava.celsiusToFahrenheit(1000), 0.1);
		
	}
	
	@Test
	public void testDiaSemana() {
		
		assertEquals("lunes", ImperativoEnJava.diaSemana(1));
		assertEquals("martes", ImperativoEnJava.diaSemana(2));
		assertEquals("miercoles", ImperativoEnJava.diaSemana(3));
		assertEquals("jueves", ImperativoEnJava.diaSemana(4));
		assertEquals("viernes", ImperativoEnJava.diaSemana(5));
		assertEquals("sabado", ImperativoEnJava.diaSemana(6));
		assertEquals("domingo", ImperativoEnJava.diaSemana(7));
	}
	
	@Test
	public void testSumaAcumulada() {
		assertEquals(     0, ImperativoEnJava.sumaAcumulada(-8));
		assertEquals(     3, ImperativoEnJava.sumaAcumulada(2));
		assertEquals(   378, ImperativoEnJava.sumaAcumulada(27));
		assertEquals(335790, ImperativoEnJava.sumaAcumulada(819));
	}
	
	@Test
	public void testFactorial() {
		assertEquals(      1, ImperativoEnJava.factorial( 0));
		assertEquals(      1, ImperativoEnJava.factorial( 0));
		assertEquals(      2, ImperativoEnJava.factorial( 2));
		assertEquals(3628800, ImperativoEnJava.factorial(10));
	}

	@Test
	public void testEsPrimo() {
		assertFalse(ImperativoEnJava.esPrimo(1));
		assertTrue(ImperativoEnJava.esPrimo(2));
		assertTrue(ImperativoEnJava.esPrimo(3));
		assertFalse(ImperativoEnJava.esPrimo(4));
		assertTrue(ImperativoEnJava.esPrimo(5));
		assertFalse(ImperativoEnJava.esPrimo(6));
		assertTrue(ImperativoEnJava.esPrimo(7));
		assertFalse(ImperativoEnJava.esPrimo(8));
		assertTrue(ImperativoEnJava.esPrimo(61));
		assertFalse(ImperativoEnJava.esPrimo(63));
		assertTrue(ImperativoEnJava.esPrimo(79));
		assertFalse(ImperativoEnJava.esPrimo(1000000));
	}
	
	
	@Test
	public void testPromedio(){
		assertEquals(0.2f, ImperativoEnJava.promedio(1,5,6,12, -23), 0.01);
		assertEquals(1f, ImperativoEnJava.promedio(1), 0.01);
		assertEquals(0f, ImperativoEnJava.promedio(0), 0.01);
		assertEquals(6.66f, ImperativoEnJava.promedio(4,7,9), 0.01);
		
		int[] a = {1,5,6,12,-23};
		int[] b = {1};
		int[] c = {0}; 
		int[] d = {4,7,9};
		
		assertEquals(0.2f, ImperativoEnJava.promedio(a), 0.01);
		assertEquals(1f, ImperativoEnJava.promedio(b), 0.01);
		assertEquals(0f, ImperativoEnJava.promedio(c), 0.01);
		assertEquals(6.66f, ImperativoEnJava.promedio(d), 0.01);
		
	}
	
	@Test
	public void testOrdenar() {
		assertArrayEquals(asArray(1,2,3), ImperativoEnJava.ordenar(asArray(1,2,3)) );
		assertArrayEquals(asArray(1,2,3), ImperativoEnJava.ordenar(asArray(3, 2, 1)) );
		assertArrayEquals(asArray(1), ImperativoEnJava.ordenar(asArray(1)) );
		assertArrayEquals(asArray(1,2,2,2,3), ImperativoEnJava.ordenar(asArray(2,1,2,3, 2)));
	}
		

	
	@Test
	public void testConcatenar() {
		String [] vacio = new String[0];
		assertArrayEquals(vacio, ImperativoEnJava.concatenar(vacio, vacio));
		assertArrayEquals(asArray("A"), ImperativoEnJava.concatenar(vacio, asArray("A")));
		assertArrayEquals(asArray("A"), ImperativoEnJava.concatenar(asArray("A"), vacio));
		assertArrayEquals(asArray("A", "B"), ImperativoEnJava.concatenar(asArray("A"), asArray("B")));
		assertArrayEquals(asArray("A", "B", "C", "D", "E"), ImperativoEnJava.concatenar(asArray("A", "B"), asArray("C", "D", "E")));
	}
	
	@Test
	public void testInvertir() {
		assertArrayEquals(asArray(1,2,3,4,5), ImperativoEnJava.invertir(asArray(5,4,3,2,1)) );
		assertArrayEquals(asArray(1,2,3,4), ImperativoEnJava.invertir(asArray(4,3,2,1)) );
		assertArrayEquals(asArray(1), ImperativoEnJava.invertir(asArray(1)) );
		assertArrayEquals(asArray(4,5,6,7,8,9), ImperativoEnJava.invertir(asArray(9,8,7,6,5,4)));
	}
	
	@Test
	public void testSucesionFibonacci() {
		assertArrayEquals(asArray(1), ImperativoEnJava.sucesionFibonacci(1));
		assertArrayEquals(asArray(1,1), ImperativoEnJava.sucesionFibonacci(2));
		assertArrayEquals(asArray(1,1,2), ImperativoEnJava.sucesionFibonacci(3));
		assertArrayEquals(asArray(1,1,2,3,5,8,13,21,34,55), ImperativoEnJava.sucesionFibonacci(10));
		
	}
	@Test
	public void testCifradoCesar() {
		assertEquals( "bcde", ImperativoEnJava.cifradoCesar("abcd"));
		assertEquals( "bcdefghijklmnopqrstuvwxyza", ImperativoEnJava.cifradoCesar("abcdefghijklmnopqrstuvwxyz"));
		assertEquals( "bcdefghij klmnopqrstuvwxyza", ImperativoEnJava.cifradoCesar("abcdefghi jklmnopqrstuvwxyz"));
		assertEquals( "ep exeuyi", ImperativoEnJava.cifradoCesar("al ataque", 4));
		assertEquals( "kwzbm kitijihi", ImperativoEnJava.cifradoCesar("corte calabaza", 8));
	}
	
	@Test
	public void testTrianguloPascal() {
		int[][] caso1 =
			{
					{1},
					{1,1},
					{1,2,1},
					{1,3,3,1},
					{1,4,6,4,1},
					{1,5,10,10,5,1},
					{1,6,15,20,15,6,1},
					{1,7,21,35,35,21,7,1}
			};
		assertArrayEquals(caso1, ImperativoEnJava.trinaguloPascal(8));
	}
	
}
