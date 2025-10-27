package astros;

import java.util.List;
import java.util.ArrayList;


public abstract class Astro {
	public String nombre;
	public double masa;
	public int radio;
	
	
	public Astro(String nombre, double masa, int radio) {
		this.nombre=nombre;
		this.masa=masa;
		this.radio=radio;
	}
	
	public static double calcularMasaDelSistema(Astro astro) {

		
	}

	
}
