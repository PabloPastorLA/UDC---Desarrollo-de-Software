package clinicaVeterinaria;

public class Perro extends Animal implements Vacunable{
	
	public Perro(String nombre, int edad, float peso) {
		super(nombre, edad, peso);		
	}
	
	@Override
	public double calcularCostoConsulta() {
		return costoBaseConsulta * peso / 10;		//	Ejemplo: el perro cuesta más si pesa mucho, el ave según su edad, etc.
	}

	public static void ladrar() {
		System.out.println("guau guau"); //	Agregar un método propio (por ejemplo, ladrar(), maullar(), volar()).
	}
	
	public void vacunar() {
		System.out.println("Perro vacunado");
	}
}
