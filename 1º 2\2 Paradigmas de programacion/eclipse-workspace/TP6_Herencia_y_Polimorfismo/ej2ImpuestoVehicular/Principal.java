package ej2ImpuestoVehicular;

public class Principal {

	public static void main(String[] args) {
//		public Auto(String marca, String modelo, String patente, int año, int valor, String nombre, String domicilio) {
		
	 	Camion cam01 =	new Camion	("Fiat", 	"15000", 	"FRE 123", 		1990, 150000, 	"Expreso Morresi", "Echeverria 432");
	 	Camion cam02 =	new Camion	("Volvo", 	"324", 		"GUL 812", 		2007, 234000, 	"Transportes Ruben", "Yapeyu 678");
	 	Avion avi01 =	new Avion	("Boeing", 	"727", 		"DFXCVBERT", 	1993, 12000000, "Aerolineas Pluma", "Belgrano 12");
	 	Auto aut01 =	new Auto	("VW", 		"Passat", 	"JMH 234", 		2010, 120000, 	"Aerolineas Pluma","Belgrano 12");
	 	Auto aut02 =	new Auto	("VW", 		"Gol", 		"FFD 321", 		2005, 28000, 	"Juan Perez", "Rondeau 432");
	 	Lancha lan01 =	new Lancha	("Cuto", 	"345", 		"FHUTYR", 		2000, 15000, 	"Juan Perez", "Rondeau 432");
	 	
	 	System.out.println(cam01.calcularImpuesto());
	 	System.out.println(cam02.calcularImpuesto());
	 	System.out.println(avi01.calcularImpuesto());
	 	System.out.println(aut01.calcularImpuesto());
	 	System.out.println(aut02.calcularImpuesto());
	 	System.out.println(lan01.calcularImpuesto());

	 	System.out.println(aut01.getModelo());
	 	

	 	
	}

}