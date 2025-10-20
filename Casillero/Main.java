package Casillero;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        // Creación del arreglo (CASILLEROS) de 20 posiciones
        Casillero[] casilleros = new Casillero[20];
        for (int i = 0; i < casilleros.length; i++) {
            casilleros[i] = new Casillero(i + 1);  
        }

        boolean continuar = true;
        int op = 0;

        do {
            // Pedir al usuario que opción del menú desea.
            System.out.println("Digite la opción que desea...\n" +
                    "1. Registro de casillero.\n" +
                    "2. Informacion.\n" +
                    "3. Consulta de casilleros.\n" +
                    "4. Salir");

            op = leer.nextInt();

            switch (op) {
                case 1:
                    // Mostrar los casilleros
                    for (int i = 0; i < casilleros.length; i++) {
                        System.out.print(casilleros[i]);
                    }

                    System.out.println();

                    System.out.println("Digite el casillero en el que desea colocar su paquete");
                    int pos = leer.nextInt();
                    leer.nextLine(); 

                    if (pos < 1 || pos > 20) {
                        System.out.println("El casillero que digitó está fuera de los rangos válidos.");
                        break;
                    }

                     if (!casilleros[pos - 1].isDisponible()) {
                        System.out.println("El casillero #" + pos + " ya está ocupado.");
                        break;
                    }

                 System.out.println("Ingrese la fecha de ingreso: ");
                 String fechaIngreso = leer.nextLine();
                 System.out.println("Ingrese el destinatario: ");
                 String destinatario = leer.nextLine();

                 Paquete paquete = new Paquete(fechaIngreso, destinatario);
                 casilleros[pos - 1].asignarPaquete(paquete);

                    System.out.println("Su paquete ha sido asignado en el casillero # " + pos);
                    
                    for (int i = 0; i < casilleros.length; i++) {
                        System.out.print(casilleros[i]);
                    }
                    System.out.println();
                
                    break;
                
                case 2: 
                 System.out.println("Estado de los casilleros:");
                    for (Casillero casillero : casilleros) {
                        System.out.println("Casillero " + casillero.getCasillero() + ": " + casillero.getInformacionPaquete());
                    }
                     break;
                case 3:
                    continuar = false; 
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (continuar); 

        leer.close();
    }
}
