public class Main {
    public static void main(String[] args) {
        GestorTareas gestor = new GestorTareas();

        System.out.println("--- 1. Llegada de las tareas ---");

        // FIFO: T1 y T2 COLA
        Tarea t1 = new Tarea("Revisar Reporte Semanal", 2);
        gestor.agregarTarea(t1);
        Tarea t2 = new Tarea("Limpiar Cache del Servidor", 1);
        gestor.agregarTarea(t2);

        // LIFO: T3 y T4 PILA
        Tarea t3 = new Tarea("Apagon", 3);
        gestor.agregarTarea(t3);
        Tarea t4 = new Tarea("Parche de Seguridad", 3);
        gestor.agregarTarea(t4);

        System.out.println("\n--- 2. Consulta pre-procesamiento ---");
        System.out.println("Estado Tarea " + t1.getId() + ": " + gestor.consultarEstadoTarea(t1.getId()));
        System.out.println("Estado Tarea " + t4.getId() + ": " + gestor.consultarEstadoTarea(t4.getId()));
        System.out.println("Estado Falso: " + gestor.consultarEstadoTarea("Este ID no existe en nuestra base de datos"));
        System.out.println("\n--- 3. Procesamiento (Pila LIFO tiene prioridad sobre Cola FIFO) ---");

        gestor.procesarSiguienteTarea();

        gestor.procesarSiguienteTarea();

        gestor.procesarSiguienteTarea();

        gestor.procesarSiguienteTarea();

        System.out.println("\n--- 4. Consulta  post-Procesamiento ---");
        System.out.println("Estado Tarea " + t1.getId() + ": " + gestor.consultarEstadoTarea(t1.getId())); // Debe ser
                                                                                                           // Completada
        System.out.println("Estado Tarea " + t4.getId() + ": " + gestor.consultarEstadoTarea(t4.getId())); // Debe ser
                                                                                                           // Completada

        System.out.println("\n--- 5. Limite ---");

        gestor.procesarSiguienteTarea();
    }
}