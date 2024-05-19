import java.util.*;
public class Ejercicio01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el nombre del alumno: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese la edad del alumno: ");
        int edad = sc.nextInt();

        System.out.print("Ingrese las notas del alumno: ");
        double notas = sc.nextDouble();

        Alumno obj1 = new Alumno(nombre, edad, notas);
        obj1.obtenerDatos();
    }
}

class Persona{
    protected String nombre;
    protected int edad;

    public Persona(String nombre, int edad){ //Constructor con metodos setters para obtener los datos
        setNombre(nombre);
        setEdad(edad);
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }
}

class Alumno extends Persona{
    double notas;

    public Alumno(String nombre, int edad, double notas) {
        super(nombre, edad);
        setNotas(notas);
    }

    public void setNotas(double notas) {
        this.notas = notas;
    }

    public double getNotas() {
        return notas;
    }

    public void obtenerDatos(){
        System.out.println("Los datos del alumno son:\nNombre: " + getNombre() + "\nEdad: " + getEdad() + "\nNotas: " + getNotas());
    }
}