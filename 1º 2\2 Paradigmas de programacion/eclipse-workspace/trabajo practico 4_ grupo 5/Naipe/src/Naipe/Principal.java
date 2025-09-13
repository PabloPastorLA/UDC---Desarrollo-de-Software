package Naipe;

public class Principal {
	public static void main (String[] args) {
		MazoEspañol MazoEspañol= new MazoEspañol();
		MazoEspañol.barajar();
		System.out.println(".............................."); 
		System.out.println("........CARTAS DEL MAZO......."); 
		System.out.println(".............................."); 
		System.out.println(MazoEspañol);
	}
}
