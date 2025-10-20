import java.time.Instant;
import java.util.Objects;

public class Tarea {

    private static int counter = 1;

    private String id;
    private String descripcion;
    private int prioridad;
    private Instant tiempoLlegada;

    // Constructor para crear nuevas tareas
    public Tarea(String descripcion, int prioridad) {
        this.id = "T-" + counter++;
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.tiempoLlegada = Instant.now();
    }

    // Constructor de busqueda
    public Tarea(String idBusqueda) {
        this.id = idBusqueda;
        this.descripcion = "Temporal para búsqueda";
        this.prioridad = 0;
        this.tiempoLlegada = null;
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public Instant getTiempoLlegada() {
        return tiempoLlegada;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Tarea tarea = (Tarea) o;
        return id.equals(tarea.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Tarea{id='" + id + "', desc='" + descripcion + "', prio=" + prioridad + '}';
    }
}