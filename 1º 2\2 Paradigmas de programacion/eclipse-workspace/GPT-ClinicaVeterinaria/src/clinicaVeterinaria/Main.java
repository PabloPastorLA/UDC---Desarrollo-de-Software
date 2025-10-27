/* Consigna: Sistema de gestión de pacientes en una clínica veterinaria
	La clínica "Patitas Felices" atiende diferentes tipos de animales.
	Cada animal puede tener comportamientos distintos y requerir diferentes tratamientos.
	Querés modelar el sistema para registrar animales, calcular el costo de atención y realizar controles específicos según el tipo de animal.

Requisitos (lo que tenés que implementar)

Superclase abstracta:
	Animal

Atributos de instancia:
	nombre
	edad
	peso

Atributo de clase (static): 
	costoBaseConsulta (valor fijo para todos).

Constructor que reciba los 3 atributos.

Método abstracto 
	calcularCostoConsulta().

Método con cuerpo 
	mostrarDatos() que imprima la información básica.

Subclases concretas:
	Perro
	Gato
	Ave
Cada una debe:

Implementar calcularCostoConsulta() según su tipo.
	Ejemplo: el perro cuesta más si pesa mucho, el ave según su edad, etc.

Agregar un método propio (por ejemplo, ladrar(), maullar(), volar()).

Interfaz:
	Vacunable con un método vacunar().
	Que Perro y Gato implementen esta interfaz (el ave no necesariamente).

Polimorfismo:

Crear un arreglo o lista Animal[] animales con distintos tipos (Perro, Gato, Ave).
Recorrerlo y llamar a mostrarDatos() y calcularCostoConsulta() —sin saber qué tipo es cada uno.

Upcasting y downcasting:
Guardar un Perro en una variable de tipo Animal (upcasting).
Luego verificar con instanceof y castear a Perro para llamar a su método exclusivo (ladrar()).
*/

package clinicaVeterinaria;

public class Main {

	public static void main(String[] args) {

		Animal[] animalitos = new Animal[10];
		
//		public Animal (String nombre, int edad, float peso) {
		
		String[] nombres = {"mordedor", "saltador", "infernal", "roco", "cata", "tina", "metal", "ragnarok", "thor", "mañosa"};
		
		
		for (int i=0; i<10; i++) {
			int animal = (int) (Math.random() * 4);
			int edad = (int) (Math.random() * 15);
			int peso = (int) (Math.random() * 10);
			
			if (animal == 1) {
				animalitos[i] = new Perro(nombres[i], edad, peso);
			} else if (animal == 2) {
				animalitos[i] = new Gato(nombres[i], edad, peso);
			} else {
				animalitos[i] = new Ave(nombres[i], edad, peso);
			} 
		}
		
		
		for (int i=0; i<10; i++) {
			animalitos[i].mostrarDatos();
			System.out.println("Costo: " + animalitos[i].calcularCostoConsulta());
			
		}
		
		

		
		
		/*
		Upcasting y downcasting:
			Guardar un Perro en una variable de tipo Animal (upcasting).
			Luego verificar con instanceof y castear a Perro para llamar a su método exclusivo (ladrar()).
			*/

			Animal a1 = new Perro("blanka", 1, 5);
			
			
			if (a1 instanceof Perro) {
				((Perro) a1).ladrar();
			}
		
		
		
	}

}
