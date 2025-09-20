package tp3_Hulk_Barco;

import java.util.List;
import java.util.ArrayList;

public class Puerto {

    private String nombre;
    private double calado;
    private int capacidadMaxima;
    private List<Barco> barcosAtracados;

    // Constructor
    public Puerto(String nombre, double calado, int capacidadMaxima) {
        this.nombre = nombre;
        this.calado = calado;
        this.capacidadMaxima = capacidadMaxima;
        this.barcosAtracados = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

  
    public boolean atracar(Barco barco) {
        if (barco.getCalado() > this.calado) {
            System.out.println("El barco " + barco.getNombre() + " no puede atracar. Calado insuficiente.");
            return false;
        }
        if (barcosAtracados.size() >= capacidadMaxima) {
            System.out.println("El puerto " + nombre + " está lleno. No entra más barcos.");
            return false;
        }
        barcosAtracados.add(barco);
        barco.setPuertoActual(this);
        barco.setEstado(Barco.EstadoNavegacion.EN_PUERTO);
        System.out.println("El barco " + barco.getNombre() + " atracó en el puerto " + nombre);
        return true;
    }

    
    public void zarpar(Barco barco) {
        if (barcosAtracados.remove(barco)) {
            barco.setEstado(Barco.EstadoNavegacion.NAVEGANDO);
            barco.setPuertoActual(null);
            System.out.println("El barco " + barco.getNombre() + " zarpa del puerto " + nombre);
        } else {
            System.out.println("El barco " + barco.getNombre() + " no está en el puerto " + nombre);
        }
    }

    
    public void mostrarBarcos() {
        System.out.println("Barcos en el puerto " + nombre + ":");
        if (barcosAtracados.isEmpty()) {
            System.out.println("- Ninguno");
        } else {
            for (Barco b : barcosAtracados) {
                System.out.println("- " + b.getNombre());
            }
        }
    }
   
    public int lugaresDisponibles() {
        return capacidadMaxima - barcosAtracados.size();
    }
}

    