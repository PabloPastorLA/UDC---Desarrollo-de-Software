package astros;

import java.util.List;
import java.util.ArrayList;

public class Planeta extends Astro implements AstroCentral{
	
	private int distanciaOrbital;
	
	
	public Planeta(String nombre, double masa, int radio, int distanciaOrbital) {
		super(nombre, masa, radio);
		this.distanciaOrbital=distanciaOrbital;
	}
	
	
	
	
	
	
	
	public void addAstroSecundario(Astro astro) {
		if (astro instanceof Satelite) {
			
		}
	}

	public List<Astro> getAstrosSecundarios(){
		
	}

}
































