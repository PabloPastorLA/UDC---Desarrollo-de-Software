package Naipe;

import java.util.ArrayList;//para usar ArrayList
import java.util.Collections;//nos permite usar metodos estaticos
import java.util.List;//se usa para declarar la lista de cartas

public final class NaipeEspañol {
	//tipos enumerados para el palo y valores de las cartas
    public enum Palo {
         Espadas, Bastos, Oros, Copas,
    }

    public enum valorDeCarta {
        AS, DOS, TRES, CUATRO, CINCO,SEIS, SIETE, 
        OCHO, NUEVE,SOTA, CABALLO, REY;

        private static final String[] nombres = {
            "As","Dos","Tres","Cuatro","Cinco",
            "Seis","Siete","Ocho","Nueve",
            "Sota","Caballo","Rey"
        };
        
        public String toString() {
            return nombres[this.ordinal()]; 
        }
    }

    private final Palo palo;
    private final valorDeCarta valorDeCarta;

    public NaipeEspañol(Palo palo, valorDeCarta valorDeCarta) {
        this.palo = palo;
        this.valorDeCarta = valorDeCarta;
    }

    
    public String toString() {
        return valorDeCarta + " de " + capitalizar(palo.name());
    }

    private String capitalizar(String texto) {
        return texto.substring(0,1).toUpperCase() + texto.substring(1).toLowerCase();
    }
}

//clase privada, la lista solo se puede usar dentro de la clase Mazo
class MazoEspañol  {
    private final List<NaipeEspañol> cartas;

    public MazoEspañol () {
        cartas = new ArrayList<>();
        for (NaipeEspañol.Palo palo : NaipeEspañol.Palo.values()) {
            for (NaipeEspañol.valorDeCarta valorDeCarta : NaipeEspañol.valorDeCarta.values()) {
                cartas.add(new NaipeEspañol(palo, valorDeCarta));
            }
        }
    }
    //para barajear de manera aleatoria
    public void barajar() {
        Collections.shuffle(cartas);
    }

    //convierte todo el mazo en un String
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (NaipeEspañol carta : cartas) {
            sb.append(carta).append("\n");
        }
        return sb.toString();
    }
}
