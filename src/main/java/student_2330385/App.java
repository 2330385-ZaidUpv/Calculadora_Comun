package student_2330385;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SumaResta calc = new SumaResta();

        System.out.print("Ingresa el primer número: ");
        double a = sc.nextDouble();
        System.out.print("Ingresa el segundo número: ");
        double b = sc.nextDouble();

        System.out.println("Suma: " + calc.sumar(a, b));
        System.out.println("Resta: " + calc.restar(a, b));
    }
}