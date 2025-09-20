package tp3_Hulk_Barco;

public class Hulk {
	//atributos
	private String nombre;
	private double peso;
	private String color;
	private String colorOriginal;
	private boolean enojado;
	
	//constructor
	public Hulk(String nombre, double peso, String color, boolean enojado){
		this.nombre = nombre;
		this.peso = peso;
		this.color= color;
		this.colorOriginal=color;
		this.enojado = enojado;
	}
	
	//metodos, getters setters
	public void attrib() {
		System.out.println("Atributos:");
		System.out.println(nombre);
		System.out.println(peso);
		System.out.println(color);
		System.out.println(colorOriginal);
		System.out.println(enojado);
		System.out.println("-----------------------------");
	}
	public void saludar(){
		if (!enojado) {System.out.println("hola, soy " + nombre);}
		else {System.out.println("aghhhhh");}
	}
		
	public void provocar() {
		if (!enojado) {
			color="verde";
			peso= peso * 5;
			enojado=true;
		} else {System.out.println("Ya está enojado!");}
	}
	
	public void calmar() {
		if (enojado) {
			color=colorOriginal;
			peso= peso /5;
			enojado=false;
		} else {System.out.println("Ya está calmado");}
	}
}
