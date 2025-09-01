public class Libro {
    private String titulo;
    private String autor;
    private int precio;

    public Libro(String titulo, String autor, int precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
    }  
        public String toString() {
        return "Libro { titulo: " + titulo +
                " autor: " + autor +
                " precio: " + precio +"}";
    }
     
    public String iterarLibro(Libro[] libro) {
        String cad = "";
        for (int i = 0; i < libro.length; i++) {
            cad += libro[i] + "\n";
        }
        return cad;
    }
}
