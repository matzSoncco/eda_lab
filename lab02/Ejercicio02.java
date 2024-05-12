import java.util.*;
public class Ejercicio02{
    Scanner sc = new Scanner(System.in);
    private ArrayList <Integer> rotacion = new ArrayList<>();
    private ArrayList <Integer> nuevo = new ArrayList<>();
    public static void main (String[] args){
        Ejercicio02 ejercicio = new Ejercicio02();
        ejercicio.ingresarElementos();
        ejercicio.rotar();
        ejercicio.imprimir();
    }

    public void ingresarElementos (){
        System.out.println("Inidicar cantidad de elementos del arreglo");
        int cantidadElementos = sc.nextInt();

        System.out.println("Ingresar los elementos del arreglo");
        for (int i = 0; i < cantidadElementos; i++){
            int elemento = sc.nextInt();
            rotacion.add(elemento);
        }
    }

    public void rotar (){
        System.out.println("Ingresar el indice ");
        int indice = sc.nextInt();
        
        for (int i = indice; i < rotacion.size(); i++){
            nuevo.add(rotacion.get(i));
        }

        for (int i = 0; i < indice; i++){
            nuevo.add(rotacion.get(i));
        }
    }

    public void imprimir (){
        System.out.print("Se imprime la lista invertida: [");
        for (int i = 0; i < nuevo.size(); i++) {
            System.out.print(nuevo.get(i));
            if (i < nuevo.size() - 1) {
                System.out.print(" ");
            }
        }
        System.out.println("]");
    }
}