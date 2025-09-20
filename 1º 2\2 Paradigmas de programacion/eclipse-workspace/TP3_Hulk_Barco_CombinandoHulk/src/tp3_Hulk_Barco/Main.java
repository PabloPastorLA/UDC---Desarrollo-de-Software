package tp3_Hulk_Barco;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//pto4Hulk();
		
		
		tp4Ejercicio2Naipes();
		tp4Ejercicio2BarcosyPuertos();
	}
	
	
	public static void tp4Ejercicio2Naipes() {
		// [valor][palo]
		// 1 - basto
		// 2 - copa
		// 3 - espada
		// 4 - oro

		NaipeEspañol carta1 = new NaipeEspañol(10, 2);
		System.out.println(carta1.toString());
		
		/*Crear un objeto MazoEspañol que al momento de crearse tenga todos los naipes de la
		 baraja española incluyendo los ochos y los nueves. */

		NaipeEspañol[][] mazoEspañol = new NaipeEspañol[12][4];
		
		for (int j=0;j<=3;j++) {
			for (int i=0;i<=11;i++) {
				mazoEspañol[i][j] = new NaipeEspañol(i+1, j+1);
			}	
		}
		
		
		for (int j=0;j<=3;j++) {
			for (int i=0;i<=11;i++) {
				System.out.println(mazoEspañol[i][j].toString());
			}	
		}
		
		
	}
	
	
	
	public static void printLinea() {
		System.out.println("-----------------------------");
	}

	public static void tp4Ejercicio2BarcosyPuertos() {
//		public Barco (String nombre, double calado, double manga, double eslora, int cargaEnBodega, int cargaMax, int velocidadCrucero, boolean varado){
		Barco ferri = new Barco("tictacnic", 10.50, 5.2, 20, 50, 100, 200, true);
		Barco portacontenedores = new Barco("chuan", 10.50, 5.2, 20, 50, 100, 200, true);
		Barco aegis = new Barco("musashi", 10.50, 5.2, 20, 50, 100, 200, true);
		Barco ferriotro = new Barco("tictacnic2", 10.50, 5.2, 20, 50, 100, 200, true);
		Barco portacontenedoresotro = new Barco("chuan chino", 10.50, 5.2, 20, 50, 100, 200, true);
		Barco aegischino = new Barco("tolosABOldo", 10.50, 5.2, 20, 50, 100, 200, true);

		
//		public Puerto(String nombre, double calado, int capacidadMaxima) {		
		Puerto puerto1 = new Puerto("Madryn", 50, 5);
		Puerto puerto2 = new Puerto("Bahia Blanca", 80, 5);
		Puerto puerto3 = new Puerto("La Plata", 50, 5);
		
		
		
		puerto1.mostrarBarcos();
		puerto1.atracar(aegis);
		puerto1.mostrarBarcos();
		puerto1.zarpar(aegis);
		
		
		puerto2.mostrarBarcos();
		puerto2.atracar(portacontenedores);
		puerto2.atracar(aegis);
		puerto2.atracar(ferri);
		puerto2.atracar(portacontenedoresotro);
		puerto2.darsenasDisponibles();
		puerto2.atracar(aegischino);
		puerto2.atracar(ferriotro);
		
		puerto2.mostrarBarcos();
		puerto2.darsenasDisponibles();
		puerto2.zarpar(portacontenedores);
		puerto2.mostrarBarcos();
		puerto2.zarpar(portacontenedores);
		

		puerto3.mostrarBarcos();
		puerto3.atracar(portacontenedores);
		puerto3.atracar(aegis);
		puerto3.atracar(ferri);
		puerto3.atracar(portacontenedoresotro);
		puerto3.darsenasDisponibles();
		puerto3.atracar(aegischino);
		puerto3.atracar(ferriotro);
		
		puerto3.mostrarBarcos();
		puerto3.darsenasDisponibles();
		puerto3.zarpar(portacontenedores);
		puerto3.mostrarBarcos();
		puerto3.zarpar(portacontenedores);
		
		
		
		
		
		
		/*
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
		*/
	}

	public static void pto4Hulk() {

		Hulk h1 = new Hulk("Bruce", 80, "normal");
		Hulk h2 = new Hulk("Pepe", 60, "violeta");
		Hulk h3 = new Hulk("Sandro", 100, "amarillo");

		System.out.println("\nPrimera prueba: ");
		h1.saludar();
		h1.provocar();
		h1.calmar();

		System.out.println("\nSegunda prueba:");
		h1.calmar();
		h2.saludar();
		h2.provocar();

		System.out.println("\nTercera prueba:");
		h3.saludar();
		h3.provocar();
		h3.calmar();

		System.out.println("\nResultados finales:");
		System.out.println(h1.getNombre() + " - Peso: " + h1.getPeso() + ", Color: " + h1.getColorPiel());
		System.out.println(h2.getNombre() + " - Peso: " + h2.getPeso() + ", Color: " + h2.getColorPiel());
		System.out.println(h3.getNombre() + " - Peso: " + h3.getPeso() + ", Color: " + h3.getColorPiel());
	}
}

