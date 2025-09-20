package pruebaHerencia;
public class Gato extends Animal {

    public Gato(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " maulla: ¡Miau, miau!");
    }

    public void moverCola() {
        System.out.println(nombre + " mueve la cola lentamente.");
    }
}
