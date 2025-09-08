package Casillero;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        // Creación del arreglo (CASILLEROS) de 20 posiciones
        String[] m = { "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_",
                "_", "_" };

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
                    for (int i = 0; i < m.length; i++) {
                        System.out.print(m[i]);
                    }

                    System.out.println();

                    System.out.println("Digite el casillero en el que desea colocar su paquete");
                    int pos = leer.nextInt();

                    // Validar que el usuario no digite números menores a cero ni mayores que 20
                    if (pos < 1 || pos > 20) {
                        System.out.println("El casillero que digitó está fuera de los rangos válidos.");
                        break;
                    }

                    // Validar y Asignar los casilleros a la posición digitada por el usuario
                    if (m[pos - 1].equals("_")) {
                        m[pos - 1] = "C";
                        System.out.println("Su paquete ha sido asignado en el casillero # " + pos);
                    } else {
                        System.out.println("Espacio no disponible.");
                    }

                    // Mostrar los casilleros actualizado
                    for (int i = 0; i < m.length; i++) {
                        System.out.print(m[i]);
                    }
                    System.out.println();

                    break;
                case 2:
                    System.out.println("Ingrese la fecha de ingreso: ");
                    String fechaIngreso = leer.nextLine();  
                    System.out.println("Ingrese el destinatario: ");
                    String destinatario = leer.nextLine();
                
                    System.out.println();

                    break;
                case 4:
                    continuar = false; // Cambiar la condición para salir
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (continuar); // El bucle seguirá hasta que 'continuar' sea false

        leer.close();
    }
}
