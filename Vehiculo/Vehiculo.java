package Vehiculo;

public class Vehiculo {

    private String chasis;
    private String marca;
    private int modelo;
    private Boolean matriculado;

    public Vehiculo(String Chasis, String Marca, int Modelo, Boolean Matriculado) {
        this.chasis = Chasis;
        this.marca = Marca;
        this.modelo = Modelo;
        this.matriculado = Matriculado;
    }

    public String toString() {
        return "Vehiculo { Chasis: " + chasis +
                " Marca: " + marca +
                " Modelo: " + modelo +
                " Matriculado: " + matriculado + "}";
    }
     
    public String iterarVehiculos(Vehiculo[] vehiculos) {
        String cad = "";
        for (int i = 0; i < vehiculos.length; i++) {
            cad += vehiculos[i] + "\n";
        }
        return cad;
    }
}