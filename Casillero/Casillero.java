package Casillero;

public class Casillero {
    private int casillero;
    private Paquete paquete;
    private boolean disponible;

    public Casillero(int casillero) {
        this.casillero = casillero; 
        this.disponible = true;
        this.paquete = null; 
    }

    public boolean isDisponible() {
        return disponible;
    }

    // Asigna un paquete al casillero si está libre
    public void asignarPaquete(Paquete paquete) {
        if (disponible) { 
            this.paquete = paquete; 
            this.disponible = false; 
        } else {
            System.out.println("Casillero " + casillero + " ocupado.");
        }
    }

    // Libera el casillero
    public void liberarCasillero() {
        this.paquete = null; 
        this.disponible = true; 
    }

    public Paquete getPaquete() { 
        return paquete;
    }

    public int getCasillero() { 
        return casillero;
    }

    @Override
    public String toString() { 
        if (disponible) {
            return "[Casillero " + casillero + ": Libre]";
        } else {
            return "[Casillero " + casillero + ": Ocupado -> " + paquete + "]";
        }
    }
}
