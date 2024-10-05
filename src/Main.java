// Clase Persona
class Persona {

    // Atributos
    public String nombre;
    public int edad;
    public String genero;

    // Constructor
    public Persona(String nombre, int edad, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }

    // Metodo
    public void presentarse() {
        System.out.println("Hola, soy " + nombre + " y tengo " + edad + " años.");
    }
}

// Clase principal
public class Main {
    public static void main(String[] args) {

        System.out.println("Programa que imprime la presentación de dos personas: su nombre y edad.");

        // Crear objetos de la clase Persona
        Persona persona1 = new Persona("Juan", 34, "Masculino");
        Persona persona2 = new Persona("Carmen", 28, "Femenino");

        // Llamar al metodo presentarse
        persona1.presentarse();
        persona2.presentarse();
    }
}
