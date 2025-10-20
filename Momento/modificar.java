public class modificar<tarea> {

    private Tarea tarea;
    private String id;
    private String descripcion;
    private int prioridad;

    public modificar(Tarea tarea, String id, String descripcion, int prioridad) {
        this.tarea = tarea;
        this.id = id;
        this.descripcion = descripcion;
        this.prioridad = prioridad;
    }

    public void ModificarTarea(Tarea tarea, String nuevoDescripcion, int nuevaPrioridad) {
        tarea.getDescripcion(nuevoDescripcion);
        tarea.getPrioridad(nuevaPrioridad);
    }

    // set
    set String setTarea() {
        return tarea;
    }

    set String setId() {
        return id;
    }

    set String Descripcion() {
        return descripcion;
    }

    set int setPrioridad() {
        return prioridad;
    }

    @Override
    public String toString() {
        System.out.println("-> Tarea " + tarea.getId() + " modificada: Descripcion='" + nuevoDescripcion + "', Prioridad=" + nuevaPrioridad);
    }
