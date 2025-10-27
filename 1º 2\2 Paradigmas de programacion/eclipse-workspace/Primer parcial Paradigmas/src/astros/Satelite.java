package astros;

import java.util.List;
import java.util.ArrayList;

public class Satelite extends Astro{
	
	private int distanciaOrbital;
	
	public Satelite(String nombre, double masa, int radio, int distanciaOrbital) {
		super(nombre, masa, radio);
		this.distanciaOrbital = distanciaOrbital;
	}

}