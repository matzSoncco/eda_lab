import java.util.function.BinaryOperator;
import java.util.Scanner;

public class Calcualdora {
    public <T extends Number> T operar(T x, T y, BinaryOperator<T> operacion) {
        return operacion.apply(x, y);
    }
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        Calcualdora calculadora = new Calcualdora();
        BinaryOperator<Number> sumar = (x, y) -> x.floatValue() + y.floatValue();
        BinaryOperator<Number> restar = (x, y) -> x.floatValue() - y.floatValue();
        BinaryOperator<Number> dividir = (x, y) -> x.floatValue() / y.floatValue();
        BinaryOperator<Number> multiplicar = (x, y) -> x.floatValue() * y.floatValue();

        System.out.print("Ingresar el primer número: ");
        float num1 = sc.nextFloat();
        System.out.print("Ingresar el segundo número: ");
        float num2 = sc.nextFloat();

        System.out.print("Ingresar la operacion a realizar:\n1 = sumar\n2 = restar\n3 = dividir\n4 = multiplicar");
        int operacion = sc.nextInt();

        switch (operacion) {
            case 1:
                System.out.println("Suma de enteros: " + calculadora.operar(num1, num2, sumar));
                break;
            case 2:
                System.out.println("Resultado de la resta: " + calculadora.operar(num1, num2, restar));
                break;
            case 3:
                System.out.println("Resultado de la división: " + calculadora.operar(num1, num2, dividir));
                break;
            case 4:
                System.out.println("Resutlado de la multiplicación: " + calculadora.operar(num1, num2, multiplicar));
                break;
            default:
                break;
        }
    }
}