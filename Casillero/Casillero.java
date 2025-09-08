package Casillero;

import java.util.Scanner;

public class Casillero {
     public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        // Creación del arreglo (parqueadero) de 20 posiciones
        String[] m = { "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_",
                "_", "_" };

        boolean continuar = true;
        int op = 0;
        do {

            // Pedir al usuario que opción del menú desea.

            System.out.println("Digite la opción que desea...\n" +
                    "1. Registro de paquete.\n" +
                    "2. Consulta de casilleros disponibles.\n" +
                    "3. Informacion.\n" +
                    "4. Salir");

            op = leer.nextInt();

            switch (op) {
                case 1:

                    // Mostrar el parqueadero
                    for (int i = 0; i < m.length; i++) {
                        System.out.print(m[i]);
                    }

                    System.out.println();

                    System.out.println("Digite el casillero que desea ");
                    int pos = leer.nextInt();

                    // validar que el usuario no digite números menores a cero ni mayores que 20
                    if (pos < 0 || pos > 20) {
                        System.out.println("La posición que digitó esta por fuera de los rangos");
                        break;
                    }

                    // Validar y Asignar la moto a la posición digitada por el usuario
                    if (m[pos - 1].equals("_")) {
                        m[pos - 1] = "M";
                        System.out.println("Su paquete ha sido asignado en el casillero # " + pos);
                    } else {
                        System.out.println("Casillero no disponible");
                    }

                    // Mostrar el parqueadero
                    for (int i = 0; i < m.length; i++) {
                        System.out.print(m[i]);
                    }

                    break;
                case 2:
                    System.out.println("Fecha de ingreso y destinatario: ");
                    int tiempo = leer.nextInt();

                    if (tiempo <= 30) {
                        System.out.println("El valor a pagar es %0. ");
                    } else if (tiempo >= 31 && tiempo <= 60) {
                        System.out.println("El valor a pagar es de $800. ");
                    } else {
                        System.out.println("El valor a pagar es de $2000. ");
                    }
                    break;
                default:
                    continuar = false;
                    break;
            }

        } while (continuar);

        leer.close();

    }

}