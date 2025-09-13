package tp3_Hulk_Barco;

public class Barco {
    private static final int MAX_CARGA = 100;

    // Atributos
    private String nombre;
    private double calado;
    private double manga;
    private double eslora;
    private int cargaEnBodega;
    private int cargaMax;
    private int velocidadCrucero;
    private Puerto puertoActual;
    private Puerto puertoDestino;
    private EstadoNavegacion estado;

    public enum EstadoNavegacion {
        EN_PUERTO, NAVEGANDO
    }

    // Constructor
    public Barco(String nombre, double calado, double manga, double eslora,
                 int cargaEnBodega, int cargaMax, int velocidadCrucero,
                 Puerto puertoActual, Puerto puertoDestino) {
        this.nombre = nombre;
        this.calado = calado;
        this.manga = manga;
        this.eslora = eslora;
        this.cargaEnBodega = cargaEnBodega;
        this.cargaMax = Math.min(cargaMax, MAX_CARGA);
        this.velocidadCrucero = velocidadCrucero;
        this.puertoActual = puertoActual;
        this.puertoDestino = puertoDestino;
        this.estado = EstadoNavegacion.EN_PUERTO;
    }

    // Getters y setters
    public String getNombre() { return nombre; }
    public double getCalado() { return calado; }
    public EstadoNavegacion getEstado() { return estado; }
    public void setEstado(EstadoNavegacion estado) { this.estado = estado; }
    public void setPuertoActual(Puerto puerto) { this.puertoActual = puerto; }
    public Puerto getPuertoActual() { return puertoActual; }

    // Métodos de carga
    public void cargar(int cargaActual) {
        if (estado != EstadoNavegacion.EN_PUERTO) {
            System.out.println("Como que no puedo cargar mientras estoy navegando");
        } else if (cargaActual + cargaEnBodega > cargaMax) {
            System.out.println("La carga supera el límite disponible: " + (cargaMax - cargaEnBodega));
        } else {
            cargaEnBodega += cargaActual;
            System.out.println("Carga exitosa! Espacio disponible: " + (cargaMax - cargaEnBodega));
        }
    }

    public void descargar(int descargaActual) {
        if (estado != EstadoNavegacion.EN_PUERTO) {
            System.out.println("Como que no puedo descargar mientras estoy navegando");
        } else if (descargaActual > cargaEnBodega) {
            System.out.println("La descarga supera la cantidad cargada: " + cargaEnBodega);
        } else {
            cargaEnBodega -= descargaActual;
            System.out.println("Descarga exitosa! Espacio disponible: " + (cargaMax - cargaEnBodega));
        }
    }

    // Métodos de movimiento
    public void partir() {
        if (estado == EstadoNavegacion.NAVEGANDO) {
            System.out.println("Ya estoy navegando");
        } else {
            estado = EstadoNavegacion.NAVEGANDO;
            System.out.println("Todos a bordo! El " + nombre + " está por partir del puerto " + 
                               (puertoActual != null ? puertoActual.getNombre() : "desconocido"));
        }
    }

    public void varar(Puerto puerto) {
        if (estado == EstadoNavegacion.EN_PUERTO) {
            System.out.println("Ya estoy en puerto");
        } else {
            estado = EstadoNavegacion.EN_PUERTO;
            puertoActual = puerto;
            System.out.println("Listo! " + nombre + " arribó al puerto " + puerto.getNombre());
        }
    }

    // Mostrar atributos
    public void attrib() {
        System.out.println("Atributos:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Calado: " + calado);
        System.out.println("Manga: " + manga);
        System.out.println("Eslora: " + eslora);
        System.out.println("Carga en bodega: " + cargaEnBodega + "/" + cargaMax);
        System.out.println("Velocidad crucero: " + velocidadCrucero);
        System.out.println("Estado: " + estado);
        System.out.println("Puerto actual: " + (puertoActual != null ? puertoActual.getNombre() : "Ninguno"));
        System.out.println("-----------------------------");
    }
}


