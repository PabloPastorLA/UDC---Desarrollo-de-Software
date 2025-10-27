package astros;

public class Cometa extends Astro{
	private int perihelio;
	private int afelio;
	
	public Cometa(String nombre, double masa, int radio, int perihelio, int afelio) {
		super(nombre, masa, radio);
		this.perihelio= perihelio;
		this.afelio=afelio;
	}


}
