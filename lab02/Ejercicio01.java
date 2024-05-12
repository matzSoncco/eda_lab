//INVERTIR UN ARREGLO DE ENTEROS
import java.util.*;
public class Ejercicio01 {
    private ArrayList<Integer> invertir = new ArrayList<>();
    public static void main (String[] args){
        Ejercicio01 ejercicio = new Ejercicio01();
        ejercicio.ingresar(); // Se llama al método 'ingresar'
        ejercicio.invertir(); // Se llama al método 'invertir'
    }

    public void ingresar (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Inidicar cantidad de elementos del arreglo");
        int cantidadElementos = sc.nextInt();

        System.out.println("Ingresar los elementos del arreglo");
        for (int i = 0; i<cantidadElementos; i++){
            int elemento = sc.nextInt();
            invertir.add(elemento);
        }
    }

    public void invertir (){
        //Imprimir lista invertida
        System.out.println("Se imprime la lista invertida");
        for (int i = invertir.size()-1; i >= 0; i--) {
            System.out.print("[" + invertir.get(i) + "]");
        }
    }
}