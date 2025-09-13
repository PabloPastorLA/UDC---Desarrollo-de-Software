package tp3_Hulk_Barco;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pto4Hulk();
		//pto5Barco();
	}
//---------------------------------------------------------
//	ACA TERMINA EL MAIN
//	A PARTIR DE ACA EMPIEZAN LAS FUNCIONES
	
	
	
	
	public static void printLinea() {
		System.out.println("-----------------------------");
	}
	
	public static void pto5Barco() {
//		public Barco (String nombre, double calado, double manga, double eslora, int cargaEnBodega, int cargaMax, int velocidadCrucero, boolean varado){
		Barco ferri = new Barco("tictacnic", 10.50, 5.2, 20,50, 100, 200, true);
		Barco portacontenedores = new Barco("chuan", 10.50, 5.2, 20,50, 100, 200, true);
		Barco aegis = new Barco("musashi", 10.50, 5.2, 20,50, 100, 200, true);

		printLinea();
		ferri.cargar(20);
		ferri.cargar(200);
		ferri.partir();
		ferri.partir();
		ferri.varar();
		ferri.varar();
		ferri.descargar(20);
		ferri.descargar(2000);
//		ferri.attrib();
		printLinea();
		portacontenedores.cargar(20);
		portacontenedores.cargar(200);
		portacontenedores.partir();
		portacontenedores.partir();
		portacontenedores.varar();
		portacontenedores.varar();
		portacontenedores.descargar(20);
		portacontenedores.descargar(2000);
		printLinea();
		aegis.cargar(20);
		aegis.cargar(200);
		aegis.partir();
		aegis.partir();
		aegis.varar();
		aegis.varar();
		aegis.descargar(20);
		aegis.descargar(2000);
		printLinea();
	}

	
	
	
	
	public static void pto4Hulk() {
//		public Hulk(String nombre, double peso, String color, boolean enojado){
		Hulk hulk1 = new Hulk("pepe", 85, "piel", false);
		Hulk hulk2 = new Hulk("pipo", 75, "amarillo", false);
		Hulk hulk3 = new Hulk("papo", 500, "piel", true);
		
		printLinea();
		hulk1.saludar();
//		hulk1.attrib();
		hulk1.provocar();
//		hulk1.attrib();
		hulk1.provocar();
		hulk1.saludar();
		hulk1.calmar();
//		hulk1.attrib();
		hulk1.calmar();
		hulk1.saludar();
		printLinea();
		hulk2.saludar();
//		hulk2.attrib();
		hulk2.provocar();
//		hulk2.attrib();
		hulk2.provocar();
		hulk2.saludar();
		hulk2.calmar();
//		hulk2.attrib();
		hulk2.calmar();
		hulk2.saludar();
		printLinea();
		hulk3.saludar();
//		hulk3.attrib();
		hulk3.provocar();
//		hulk3.attrib();
		hulk3.provocar();
		hulk3.saludar();
		hulk3.calmar();
//		hulk3.attrib();
		hulk3.calmar();
		hulk3.saludar();
		printLinea();
	}
}
