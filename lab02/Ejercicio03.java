import java.util.Scanner;
public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingresar la base del triángulo");
        int base = sc.nextInt();
        
        imprimirTriangulo(base, 0, 0);
    }

    public static void imprimirTriangulo(int base, int filaActual, int cantidad) {
        if (filaActual < base) {
            if (cantidad <= filaActual) {
                System.out.print("*");
                //Se llama recursivamente para imprimir el * e incrementa a cantidad en 1
                imprimirTriangulo(base, filaActual, cantidad + 1);
            } else {
                System.out.println();
                //Se llama recursivamente para imprimir la siguiente fila
                //Se establece a cantidad en 0 para volver a empezar
                imprimirTriangulo(base, filaActual + 1, 0);
            }
        }
    }
}