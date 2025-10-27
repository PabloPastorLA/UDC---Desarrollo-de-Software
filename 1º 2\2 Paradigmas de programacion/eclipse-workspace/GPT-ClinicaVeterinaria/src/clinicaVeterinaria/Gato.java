package clinicaVeterinaria;

public class Gato extends Animal implements Vacunable{
	
	public Gato(String nombre, int edad, float peso) {
		super(nombre, edad, peso);		
	}
	
	@Override
	public double calcularCostoConsulta() {
		return costoBaseConsulta * peso / 4;		//	Ejemplo: el perro cuesta más si pesa mucho, el ave según su edad, etc.
	}

	public static void maullar() {
		System.out.println("miau miau"); //	Agregar un método propio (por ejemplo, ladrar(), maullar(), volar()).
	}
	
	public void vacunar() {
		System.out.println("Gato vacunado");
	}
}
