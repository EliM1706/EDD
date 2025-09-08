package Casillero;
import java.util.Scanner;

public class Paquete {

    private String fechaIngreso;
    private String destinatario;

    // Constructor
    public Paquete(String fechaIngreso, String destinatario) {
        this.fechaIngreso = fechaIngreso;
        this.destinatario = destinatario;
    }

    // Métodos getter y setter para fechaIngreso y destinatario
    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    @Override
    public String toString() {
        return "Paquete [fechaIngreso=" + fechaIngreso + ", destinatario=" + destinatario + "]";
    }
}