public class Libro {
    private String titulo;
    private String autor;
    private int precio;

    public Libro(String titulo, String autor, int precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
    }

    public String getTitulo() { 
        return titulo;
    }

    public int getPrecio() { 
        return precio;
    }

    public void setPrecio(int precio) { 
        this.precio = precio;
    }

    public String toString() {
        return "Libro { titulo: " + titulo +
                " autor: " + autor +
                " precio: " + precio + "}";
    }

    public static int calcularPrecioTotal(Libro[] libros) {
        int total = 0;
        for (int i = 0; i < libros.length; i++) {
            total += libros[i].precio;
        }
        return total;
    }

    public static void ordenarPorPrecio(Libro[] libros) {
        int n = libros.length; 
        for (int i = 0; i < n - 1; i++) { 
                                         
            for (int j = 0; j < n - i - 1; j++) { 
                if (libros[j].getPrecio() > libros[j + 1].getPrecio()) { 
                                                                         
                    
                    Libro temp = libros[j]; 
                    libros[j] = libros[j + 1];
                    libros[j + 1] = temp; 
                }
            }
        }
    }

    public String iterarLibro(Libro[] libros) {
        String cad = "";
        for (int i = 0; i < libros.length; i++) {
            cad += libros[i] + "\n";
        }
        return cad;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }


    public void buscarLibro(Libro[] libros, String tituloBuscado) {
        int encontrado = 0;

        for (int i = 0; i < libros.length; i++) {
            String titulo = libros[i].titulo;
            if (titulo == tituloBuscado) {
                System.out.println("Libro encontrado:");
                System.out.println(libros[i]);
                encontrado = 1;
            }
        }

        if (encontrado == 0) {
            System.out.println("No disponible.");
        }
    }

    public static void cambiarPrecio(Libro[] libros, String tituloBuscado, int nuevoPrecio) {
        int actualizado = 0;

        for (int i = 0; i < libros.length; i++) {
            String titulo = libros[i].titulo;
            if (titulo == tituloBuscado) {
                libros[i].precio = nuevoPrecio;
                System.out.println("precio actualizado.");
                actualizado = 1;
            }
        }

        if (actualizado == 0) {
            System.out.println("No disponible.");
        }

        if (actualizado == 0) {
            System.out.println("No disponible.");
        }
    }
}