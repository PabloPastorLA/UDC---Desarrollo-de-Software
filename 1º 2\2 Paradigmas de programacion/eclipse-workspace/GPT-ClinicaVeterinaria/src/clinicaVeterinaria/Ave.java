package clinicaVeterinaria;

public class Ave extends Animal{
	
	public Ave(String nombre, int edad, float peso) {
		super(nombre, edad, peso);		
	}
	
	@Override
	public double calcularCostoConsulta() {
		return costoBaseConsulta * 15/edad;		//	Ejemplo: el perro cuesta más si pesa mucho, el ave según su edad, etc.
	}

	public static void volar() {
		System.out.println("y volo volo"); //	Agregar un método propio (por ejemplo, ladrar(), maullar(), volar()).
	}
	
/*	public void vacunar() {
		System.out.println("Perro vacunado");
	}*/
}
