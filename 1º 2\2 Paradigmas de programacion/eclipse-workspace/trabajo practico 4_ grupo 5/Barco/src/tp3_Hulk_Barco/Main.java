package tp3_Hulk_Barco;

public class Main {

    public static void main(String[] args) {

       
        Puerto puerto1 = new Puerto("Puerto San Julian", 10, 3);
        Puerto puerto2 = new Puerto("Puerto Almirante Zar", 8, 2);
        Puerto puerto3 = new Puerto("Puerto Montt", 15, 4);

        
        Barco ferri = new Barco("Tictacnic", 10.5, 5.2, 20, 50, 100, 200, puerto1, puerto2);
        Barco portacontenedores = new Barco("Chuan", 9.5, 6.0, 25, 30, 100, 180, puerto1, puerto3);
        Barco aegis = new Barco("Musashi", 8.0, 5.5, 22, 70, 100, 190, puerto2, puerto1);

        System.out.println("Cargas y descargas:");
        ferri.cargar(20);
        ferri.descargar(10);
        System.out.println("\nPartir y varar: ");
        ferri.partir();
        ferri.varar(puerto2);
        System.out.println("\nIntentos de atracar en " + puerto1.getNombre() + ".");
        puerto1.atracar(ferri);
        puerto1.atracar(portacontenedores);
        puerto1.atracar(aegis);
        System.out.println("\nAqui el estado del puerto 1: ");
        puerto1.mostrarBarcos();
        System.out.println("Lugares disponibles en " + puerto1.getNombre() + ": " + puerto1.lugaresDisponibles());
        System.out.println("\nAqui el estado del  Puerto 2");
        puerto2.mostrarBarcos();
        System.out.println("Lugares disponibles: " + puerto2.lugaresDisponibles());

        System.out.println("\nAqui el estado del puerto 3");
        puerto3.mostrarBarcos();
        System.out.println("Lugares disponibles: " + puerto3.lugaresDisponibles());
    }
    
}
