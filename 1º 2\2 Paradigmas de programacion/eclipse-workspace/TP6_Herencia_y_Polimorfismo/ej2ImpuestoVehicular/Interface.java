package ej2ImpuestoVehicular;

public abstract interface Interface {

	//constantes accesibles desde las subs por herencia, croto pero funcional
	//mejor es "clase de utilidades" se define como:
	//"public final class Constantes { ... }"
	//y se acceden como 
	//"Constantes.INDICE_AUTO"
	static final int AÑO_ACTUAL = 2025;
	static final double INDICE_AUTO= 1.2;
	static final double INDICE_CAMION= 1.2;
	static final double INDICE_LANCHA= 1.2;
	static final double INDICE_AVION= 0.15;
	
	//metodos abstractos	
	public double calcularImpuesto();
	public void setIndice(double indiceNuevo);	

	
}
