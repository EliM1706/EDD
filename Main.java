public class Main {
    
    public static void main(String[] args) {
        Vehiculo[] Veh = new Vehiculo[5]; 

    Veh [0] = new Vehiculo("JDO845", "Mazda", 2023, false);
    Veh [1] = new Vehiculo("JKL452", "BMW", 2021, true);
    Veh [2] = new Vehiculo("ZXM319", "ford", 2018, false);
    Veh [3] = new Vehiculo("LNB672", "Kia", 2019, true);
    Veh [4] = new Vehiculo("QRT176", "KN", 2025, false);

     System.out.println(Veh[0].iterarVehiculos(Veh));

  
 
    }
}