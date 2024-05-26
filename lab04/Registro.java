import java.util.*;

public class Registro <T>{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresar el nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Ingresar el identificador:");
        System.out.print("(Puede ser numérico o alfanumérico): ");
        Object identificador = obtenerIdentificador(sc);
        Persona<?> persona = new Persona<>(nombre, identificador);
        System.out.println("Persona registrada:");
        System.out.println(persona);
    }

    public static Object obtenerIdentificador(Scanner scanner) {
        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        } else if (scanner.hasNextLine()) {
            return scanner.nextLine();
        } else {
            return "Tipo de documento no válido";
        }
    }
}

class Persona <T>{
    private String nombre;
    private T id;
    public Persona(String nombre, T id){
        this.nombre = nombre;
        this.id = id;
    }

    public T getDocumento(){
        return id;
    }

    public String getNombre(){
        return nombre;
    }
    public String toString() {
        return "Nombre: " + nombre + ", Documento: " + id;
    }
}