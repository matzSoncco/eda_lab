import java.util.Scanner;
public class Calcular <T> {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        String input1 = sc.nextLine();
        System.out.print("Ingrese el segundo número: ");
        String input2 = sc.nextLine();

        Number num1 = parseNumber(input1);
        Number num2 = parseNumber(input2);

        if (num1 instanceof Integer && num2 instanceof Integer) {
            Calculadora<Integer> calculadora = new Calculadora<>(num1.intValue(), num2.intValue());
            imprimirResultados(calculadora);
        } else {
            Calculadora<Float> calculadora = new Calculadora<>(num1.floatValue(), num2.floatValue());
            imprimirResultados(calculadora);
        }
    }

    private static Number parseNumber(String input) {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            return Float.parseFloat(input);
        }
    }

    private static <T extends Number> void imprimirResultados(Calculadora<T> calculadora) {
        System.out.println("Suma: " + calculadora.sumar());
        System.out.println("Resta: " + calculadora.restar());
        System.out.println("Multiplicación: " + calculadora.multiplicar());
        System.out.println("División: " + calculadora.dividir());
    }
}

@SuppressWarnings("unchecked")
class Calculadora <T extends Number>{
    private T number1, number2;

    public Calculadora(T num1, T num2){
        this.number1 = num1;
        this.number2 = num2;
    }

    public T sumar() {
        return (T) Float.valueOf(number1.floatValue() + number2.floatValue());
    }

    public T restar() {
        return (T) Float.valueOf(number1.floatValue() - number2.floatValue());
    }

    public T multiplicar() {
        return (T) Float.valueOf(number1.floatValue() * number2.floatValue());
    }

    public T dividir() {
        if (number2.floatValue() == 0){
            System.out.println("No se puede dividir entre 0");
        }
        return (T) Float.valueOf(number1.floatValue() / number2.floatValue());
    }
}