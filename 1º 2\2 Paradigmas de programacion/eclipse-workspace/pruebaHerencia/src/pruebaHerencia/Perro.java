package pruebaHerencia;
public class Perro extends Animal {

    public Perro(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " ladra: ¡Guau, guau!");
    }

    public void moverCola() {
        System.out.println(nombre + " mueve la cola felizmente.");
    }
}
