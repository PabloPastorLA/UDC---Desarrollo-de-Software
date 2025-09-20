package pruebaHerencia;


public class Main {
    public static void main(String[] args) {
        Perro p = new Perro("Firulais");
        p.hacerSonido();
        p.dormir();
        p.moverCola();
        Gato g = new Gato("gatulais");
        g.hacerSonido();
        g.dormir();
        g.moverCola();
    }
}
