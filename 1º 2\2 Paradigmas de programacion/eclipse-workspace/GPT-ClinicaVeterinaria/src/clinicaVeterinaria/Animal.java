package clinicaVeterinaria;

public abstract class Animal {
	
	private static final double COSTOBASECONSULTAA = 1000;	

	protected String nombre;
	protected int edad;
	protected float peso;
	
	protected static double costoBaseConsulta = COSTOBASECONSULTAA;

	
	public Animal (String nombre, int edad, float peso) {
		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
	}
	
	public abstract double calcularCostoConsulta();
	
	public void mostrarDatos() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Edad: " + edad);
		System.out.println("Peso: " + peso);
	}


}

