import java.util.*;
public class Ejercicio02{
    private ArrayList <Integer> rotacion = new ArrayList<>();
    public static void main (String[] args){

    }

    public void ingresarElementos (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Inidicar cantidad de elementos del arreglo");
        int cantidadElementos = sc.nextInt();

        System.out.println("Ingresar los elementos del arreglo");
        for (int i = 0; i<cantidadElementos; i++){
            int elemento = sc.nextInt();
            invertir.add(elemento);
        }
    }

    public void rotar (){
        
    }
    public void verificar (){

    }
}