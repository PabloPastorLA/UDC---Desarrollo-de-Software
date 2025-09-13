
package tp3_Hulk_Barco;

import java.util.List;
import java.util.ArrayList;

public class Puerto {

    private String nombre;
    private double calado;
    private int capacidadMaxima;     //CANT MAX de BARCOS
    private List<Barco> barcosAtracados;

    //constructor
    public Puerto(String nombre, double calado, int capacidadMaxima) {
        this.nombre = nombre;
        this.calado = calado;
        this.capacidadMaxima = capacidadMaxima;
        this.barcosAtracados = new ArrayList<>();
    }
    //metodos
    
    public boolean atracar(Barco barco) {
        if (barco.getCalado() > this.calado) {
            System.out.println("El barco " + barco.getNombre() + " no puede atracar. No hay suficiente espacio de calado.");
            return false;
        }
        if (barcosAtracados.size() >= capacidadMaxima) {
            System.out.println("En el puerto " + nombre + " no entra un barco mas!!!!!");
            return false;
        }
        //if (!)
        barcosAtracados.add(barco);
        barco.setPuertoActual(this);
        System.out.println("El barco " + barco.getNombre() + " ya esta atracado en el puerto " + nombre + " 🙂 " );
        return true;
    }

    // Zarpar barco
    public void zarpar(Barco barco) {
        if (barcosAtracados.remove(barco)) {
            barco.partir();
            System.out.println("El barco " + barco.getNombre() + " zarpa del puerto " + nombre + ".");
        } else {
            System.out.println("El barco " + barco.getNombre() + " no esta en el puerto " + nombre + ".");
        }
    }
    
    public void darsenasDisponibles() {
    	System.out.println("Darsenas disponibles en " + nombre + ": " + (capacidadMaxima - barcosAtracados.size()));
    }
    // Mostrar nombres de barcos en puerto
    public void mostrarBarcos() {
        System.out.println("Barcos en el puerto " + nombre + ":");
        for (Barco b : barcosAtracados) {
            System.out.println("- " + b.getNombre());
        }
    }
}