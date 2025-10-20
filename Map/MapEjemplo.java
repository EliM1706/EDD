import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapEjemplo {

    public static void main(String[] args) {
        // 1. Declaración e Instanciación
        // Se declara la interfaz Map y se usa la implementación HashMap
        // <String, Integer> define que la Clave es un String (ej: nombre) y el Valor es un Integer (ej: edad)
        Map<String, Integer> edades = new HashMap<>();

        // 2. Agregar elementos (put)
        System.out.println("--- 1. Agregar Elementos ---");
        edades.put("Alice", 25);
        edades.put("Bob", 30);
        edades.put("Charlie", 35);
        System.out.println("Mapa después de la inserción: " + edades);

        // Intentar agregar una clave duplicada (reemplaza el valor de "Alice")
        edades.put("Alice", 26);
        System.out.println("Mapa después de actualizar a Alice: " + edades);

        // 3. Obtener elementos (get)
        System.out.println("\n--- 2. Obtener Elementos ---");
        int edadBob = edades.get("Bob");
        System.out.println("Edad de Bob: " + edadBob);

        // Clave que no existe
        Integer edadDavid = edades.get("David");
        System.out.println("Edad de David (no existe): " + edadDavid); // Muestra 'null'

        // 4. Verificar existencia (containsKey)
        System.out.println("\n--- 3. Verificar Existencia ---");
        System.out.println("¿Contiene la clave 'Charlie'? " + edades.containsKey("Charlie"));
        System.out.println("¿Contiene la clave 'David'? " + edades.containsKey("David"));

        // 5. Iterar sobre el Map
        System.out.println("\n--- 4. Recorrer el Map ---");

        // Opción A: Recorrer por Claves
        System.out.println("Recorrido por claves (keySet):");
        Set<String> nombres = edades.keySet();
        for (String nombre : nombres) {
            System.out.println("Nombre: " + nombre + ", Valor: " + edades.get(nombre));
        }

        // Opción B: Recorrer por Pares (Map.Entry) - MÁS EFICIENTE
        System.out.println("\nRecorrido por pares (entrySet):");
        for (Map.Entry<String, Integer> par : edades.entrySet()) {
            System.out.println("Clave: " + par.getKey() + ", Valor: " + par.getValue());
        }

        // 6. Eliminar elementos (remove)
        System.out.println("\n--- 5. Eliminar Elementos ---");
        int valorEliminado = edades.remove("Bob");
        System.out.println("Valor eliminado para 'Bob': " + valorEliminado);
        System.out.println("Mapa después de eliminar a Bob: " + edades);
    }
}