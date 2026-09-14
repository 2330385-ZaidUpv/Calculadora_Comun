package edu.upvictoria.student2530386;

import java.util.Scanner;

public class Equa2dogrado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Dame el valor de a: ");
        double a = sc.nextDouble();

        System.out.print("Dame el valor de b: ");
        double b = sc.nextDouble();

        System.out.print("Dame el valor de c: ");
        double c = sc.nextDouble();

        double d = b * b - 4 * a * c;

        double x1 = (-b + Math.sqrt(d)) / (2 * a);
        double x2 = (-b - Math.sqrt(d)) / (2 * a);

        System.out.println("El resultado de x1 es: " + x1);
        System.out.println("El resultado de x2 es: " + x2);
    }
}