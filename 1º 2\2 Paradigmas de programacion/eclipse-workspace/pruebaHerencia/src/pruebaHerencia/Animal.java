package pruebaHerencia;
public class Animal {
    String nombre;
    int edad;
    
    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad=edad;
    }

    public void hacerSonido() {
        System.out.println("El animal hace un sonido");
    }

    public void dormir() {
        System.out.println(nombre + " está durmiendo...");
    }
}
