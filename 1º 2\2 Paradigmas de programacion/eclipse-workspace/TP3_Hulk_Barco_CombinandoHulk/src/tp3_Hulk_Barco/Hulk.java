package tp3_Hulk_Barco;

public class Hulk {
	//atributos
    private boolean calmado =true;
    private String nombre;
    private String colorPiel;
    private double pesoOriginal;
    private double peso;
    private String colorOriginal;
    
    //constructor
    public Hulk (String nombre, double peso, String colorPiel) {
        this.nombre= nombre;
        this.colorPiel = colorPiel;
        this.pesoOriginal= peso;
        this.peso = peso; 
        this.colorOriginal = colorPiel; 
    }
    
	//metodos, getters setters
    public String getNombre() {
    	return nombre;
    }
    public  double getPeso() {
    	return peso;
    }
    public String getColorPiel () {
    	return colorPiel;
    }
    public boolean isCalmado() {
        return calmado;
    }
    //
    public void provocar() {
        if (calmado) { 
            calmado = false;
            if (this.nombre.equals("Bruce")) {
                peso = pesoOriginal * 5;
                System.out.println(nombre + " esta enojado, ahora pesa " + peso + " kg.");
            } else {
                System.out.println(nombre + " esta enojado, ahora pesa " + peso + " kg.");
            }

            colorPiel = "verde";
            System.out.println("aghhhhhhhh");
        } else {
            System.out.println(nombre + " ya está enojado.");
        }
    }

    public void calmar() {
        if (!calmado) {
            calmado = true;
            peso = pesoOriginal;
            colorPiel = colorOriginal;
            System.out.println (nombre + " Se calmo.");
		} else {System.out.println("Ya está calmado");}
    }

    public void saludar() {
        if (calmado) {
            System.out.println("Hola, soy " + nombre);
        } else {
            System.out.println("aghhhhhhhh");
        }
    }


}
