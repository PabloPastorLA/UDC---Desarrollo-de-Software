/*4)
OK	Cree una clase en java que represente a la raza de los increíbles Hulk, cada Hulk tiene como atributos su peso y el color de su piel. 
OK	Un Hulk es una persona normal pero cuando recibe el estímulo provocar cambian algunos de sus atributos:
OK	su color de piel que cambia del color original al verde y su peso se quintuplica;
OK	además cambia su comportamiento, en su estado normal al recibir el mensaje saludar dice “hola, soy fulano” (donde fulano es su nombre)
OK	pero transformado responde con un grito “aghhhhh”.
OK	Cuando está transformado sólo vuelve a su estado normal al calmarse a través del mensaje calmar.
OK	Asegure que los atributos de Hulk estén debidamente encapsulados y sólo puedan ser modificados a través de los mensajes definidos en este enunciado.
OK	Haga un programa principal que cree tres instancias de hulks que se enojen y calmen alternativamente para poder probar el comportamiento desarrollado.
*/

/*1) Atributos y métodos estáticos. 
	En el ejercicio de Hulk establezca un método de clase que permita obtener cuantas veces en promedio se enoja un Hulk en su vida.
*/

package tp5_Hulk;

public class Hulk {
	//atributos
	private String nombre;
	private double peso;
	private String color;
	private String colorOriginal;
	private boolean enojado;
	//atributo estatico
	private static int promedioEnojosEnVida=500000;
	//constructor
	public Hulk(String nombre, double peso, String color, boolean enojado){
		this.nombre = nombre;
		this.peso = peso;
		this.color= color;
		this.colorOriginal=color;
		this.enojado = enojado;
	}
	
	public void provocar() {
		if (!enojado) {
			color="verde";
			peso= peso * 5;
			enojado=true;
		} else {System.out.println("Ya está enojado!");}
	}
	
	public void saludar(){
		if (!enojado) {System.out.println("hola, soy " + nombre);}
		else {System.out.println("aghhhhh");}
	}
	
	public void calmar() {
		if (enojado) {
			color=colorOriginal;
			peso= peso /5;
			enojado=false;
		} else {System.out.println("Ya está calmado");}
	}
	
	public static void promedioEnojos() {
		System.out.println("El promedio de enojos de un hulk en toda su vida es: "+ promedioEnojosEnVida);
	}
}
