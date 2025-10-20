import java.util.Stack;
import java.util.Queue;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.HashMap;

public class GestorTareas {

    private final Queue<Tarea> filaEspera;
    private final Stack<Tarea> pilaPrioritaria;
    private final Map<String, Tarea> registroTrazabilidad;

    public GestorTareas() {
        this.filaEspera = new ArrayDeque<>();
        this.pilaPrioritaria = new Stack<>();
        this.registroTrazabilidad = new HashMap<>();
    }

    public void agregarTarea(Tarea tarea) {
        if (tarea.getPrioridad() == 3) {
            pilaPrioritaria.push(tarea);
            System.out.println("-> Tarea " + tarea.getId() + " (Alta) agregada a la Pila Prioritaria.");
        } else if (tarea.getPrioridad() == 1 || tarea.getPrioridad() == 2) {

            filaEspera.offer(tarea);
            System.out.println("-> Tarea " + tarea.getId() + " (Basica) agregada a la Cola de Espera.");
        }
    }

    public Tarea procesarSiguienteTarea() {
        Tarea tareaProcesada = null;

        if (!pilaPrioritaria.isEmpty()) {
            tareaProcesada = pilaPrioritaria.pop();
            System.out.println("<< Procesando Tarea de ALTA PRIORIDAD (Pila): " + tareaProcesada.getId());
        } else if (!filaEspera.isEmpty()) {
            tareaProcesada = filaEspera.poll();
            System.out.println("<< Procesando Tarea basica (Cola): " + tareaProcesada.getId());
        }
        if (tareaProcesada != null) {
            registroTrazabilidad.put(tareaProcesada.getId(), tareaProcesada);
            System.out.println("   [Trazabilidad] Tarea " + tareaProcesada.getId() + " registrada como Completada.");
        } else {
            System.out.println("!! No hay tareas pendientes para procesar.");
        }

        return tareaProcesada;
    }

    public String consultarEstadoTarea(String idTarea) {
        if (registroTrazabilidad.containsKey(idTarea)) {
            return "Completada";
        }

        Tarea tareaBusquedaTemporal = new Tarea("Busqueda temporal", 0) {
            @Override
            public String getId() {
                return idTarea;
            }
        };

        if (filaEspera.contains(tareaBusquedaTemporal) || pilaPrioritaria.contains(tareaBusquedaTemporal)) {
            return "Pendiente";
        }

        return "ID no encontrado";
    }
}