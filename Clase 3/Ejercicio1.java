public class Ejercicio1 {
    public static void main(String[] args) {

    // atrubutos clase
    private int Modelo;
    private String Marca;
    private Boolean Matricula;

    // creacion de los objetos
    Vehiculo  objVeh = new Vehiculo(JDO845, "Mazda", 2023, true);
    Vehiculo1 objVeh1 = new Vehiculo(JKL452, "Toyota", 2021, true);
    Vehiculo2 objVeh2 = new Vehiculo(ZXM319, "ford", 2018, true);
    Vehiculo3 objVeh3 = new Vehiculo(LNB672, "Kia", 2019, true);
    Vehiculo4 objVeh4 = new Vehiculo(QRT176, "KN", 2025, true);


    System.out.println(objVeh);
    System.out.println(objVeh1);
    System.out.println(objVeh2);
    System.out.println(objVeh3);
    System.out.println(objVeh4);

    System.out.println(