package astronomia;

import astros.Astro;
import astros.Cometa;
import astros.Estrella;
import astros.Planeta;
import astros.Satelite;

public class Principal {

	public static void main(String[] args) {
   	 
   	 Estrella sol = new  Estrella ("Sol", 19891000.0, 1_391_016, 26);
   	 
   	 Planeta tierra = new Planeta("Tierra", 597.36, 6378, 149497);
   	 Satelite luna = new Satelite("Luna", 7.34, 1737, 384);
   	 tierra.addAstroSecundario(luna);
   	 
   	 Planeta marte = new Planeta("Marte", 64.1, 3389, 227936);
   	 
   	 Planeta jupiter = new Planeta("Jupiter", 189.9, 71492, 778412);
   	 Satelite europa = new Satelite("Europa", 4.8,  1560, 670); 
   	 Satelite io = new Satelite("Io", 8.94, 1821, 421);
   	 jupiter.addAstroSecundario(europa);
   	 jupiter.addAstroSecundario(io);
   	 
   	 Cometa halley = new Cometa("Halley", 0.000002, 11, 75000, 5094970);
   	 
   	 sol.addAstroSecundario(tierra);
   	 sol.addAstroSecundario(marte);
   	 sol.addAstroSecundario(jupiter);
   	 sol.addAstroSecundario(halley);
   	 
   	 System.out.printf("La masa total del sistema solar es %.8f\n", 
   			 Astro.calcularMasaDelSistema(sol));
   	 System.out.printf("La masa total de Júpiter y sus satélites es %.8f\n", 
   			 Astro.calcularMasaDelSistema(jupiter));
  	 
   	 

    }
}
