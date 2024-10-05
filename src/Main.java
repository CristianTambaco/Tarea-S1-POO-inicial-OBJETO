// Clase Libro
class Libro {
    // Atributos
    public String titulo;
    public String autor;
    public int paginaCount;

    // Constructor
    public Libro(String titulo, String autor, int paginaCount) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginaCount = paginaCount;
    }

    // Metodo para obtener información del libro
    public String infoLibro() {

        return "Título: " + titulo + ", Autor: " + autor + ", Páginas: " + paginaCount;
    }
}

// Clase principal
public class Main {
    public static void main(String[] args) {
        // Crear objetos de la clase Libro

        System.out.println("Programa que imprime el detalle de 2 libros: Título, Autor, Numero de paginas.");
        Libro libro2 = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", 1023);
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", 417);


        // Mostrar información de los libros
        System.out.println(libro1.infoLibro());
        System.out.println(libro2.infoLibro());
    }
}
