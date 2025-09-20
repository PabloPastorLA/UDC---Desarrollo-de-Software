package tp3_Hulk_Barco;

public class Barco {
	private String nombre;
	private double calado;
	private double manga;
	private double eslora;
	private int cargaEnBodega;
	private int cargaMax;
	private int velocidadCrucero;
	private boolean varado;
	private Puerto puertoActual;

	//constructor
	public Barco (String nombre, double calado, double manga, double eslora, int cargaEnBodega, int cargaMax, int velocidadCrucero, boolean varado){
		this.nombre=nombre;
		this.calado=calado;
		this.manga=manga;
		this.eslora=eslora;
		this.cargaEnBodega=cargaEnBodega;
		this.cargaMax=cargaMax;
		this.velocidadCrucero=velocidadCrucero;
		this.varado=varado;
		this.puertoActual=null;

	}
	
	//getters setters
	public void attrib() {
		System.out.println("Atributos:");
		System.out.println(nombre);
		System.out.println(calado);
		System.out.println(manga);
		System.out.println(eslora);
		System.out.println(cargaEnBodega);
		System.out.println(cargaMax);
		System.out.println(velocidadCrucero);
		System.out.println(varado);
		System.out.println("-----------------------------");
	}

	public void cargar(int cargaActual) {
		if (!varado) {System.out.println("Como que no puedo cargar mientras estoy en medio del mar");}
		else if (cargaActual + cargaEnBodega > cargaMax) {System.out.println("La carga supera el limite disponible de: "+ (cargaMax - cargaEnBodega));}
		else {cargaEnBodega += cargaActual; System.out.println("Carga exitosa! Espacio disponible: " + (cargaMax - cargaEnBodega));}
	}

	public void descargar(int descargaActual) {
		if (!varado) {System.out.println("Como que no puedo descargar mientras estoy en medio del mar");}
		else if (descargaActual > cargaEnBodega) {System.out.println("La descarga supera la cantidad cargada, la cual es: " + cargaEnBodega);}
		else {cargaEnBodega -= descargaActual; System.out.println("Descarga exitosa! Espacio disponible: " + (cargaMax - cargaEnBodega));}
	}
	
	public void partir() {
		if (!varado) {System.out.println("Ya partí");}
		else {System.out.println("Todos a bordo! el "+nombre+" está por partir!");varado = false;}
	}

	public void varar() {
		if (varado) {System.out.println("Ya estoy varado");}
		else {System.out.println("Listo! "+nombre+" arrivó a destino!");varado = true;}
	}
	
    public double getCalado() {
        return calado;
    }

	public String getNombre() {
        return nombre;
    }

	
    public void setPuertoActual(Puerto puerto) {
        this.puertoActual = puerto;
    }
}

	