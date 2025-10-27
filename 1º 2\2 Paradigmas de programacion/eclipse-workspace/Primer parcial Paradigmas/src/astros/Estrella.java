package astros;

import java.util.List;

public class Estrella extends Astro implements AstroCentral{
	
	private  double brillo;

	public Estrella(String nombre, double masa, int radio, double brillo) {
		super(nombre, masa, radio);
		this.brillo = brillo;
	}
	
	public void addAstroSecundario(Astro astro) {
		if (astro instanceof Planeta || astro instanceof Cometa) {
			
		}
	}
	public List<Astro> getAstrosSecundarios(){
		
	}

}
