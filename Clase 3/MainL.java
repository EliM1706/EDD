public class MainL {
    public static void main(String[] args) {
        Libro[] LIB = new Libro[5];

        LIB [0] = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", 80000);
        LIB [1] = new Libro("Orgullo y prejuicio", "Jane Austen", 52000);
        LIB [2] = new Libro("Cronica de una muerte anunciada", "Gabriel Garcia Marquez", 45000);
        LIB [3] = new Libro("Divergente", "Veronica Roth", 55000);
        LIB [4] = new Libro("A traves de mi ventana", "Ariana Godoy", 55000);
        System.out.println(LIB[0].iterarLibro(LIB));

        int precioTotal = Libro.calcularPrecioTotal(LIB);
        System.out.println("El precio total de todos los libros es: " + precioTotal);

        Libro.ordenarPorPrecio(LIB);
        System.out.println("Libros ordenados por precio (menor a mayor):");
        for (Libro libro : LIB) { // recorre
            System.out.println(libro);// muestra el libro
        }


    }
}


  

