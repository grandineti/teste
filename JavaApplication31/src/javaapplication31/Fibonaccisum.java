/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication31;

/**
 *
 * @author Administrator
 */
import java.util.Scanner;

public class Fibonaccisum {
    public static int calculateFibonacciSum(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("O número de elementos da série deve ser maior que 0.");
        }

        int sum = 0;
        int a = 0, b = 1;

        for (int i = 1; i <= n; i++) {
            sum += a;
            int temp = a;
            a = b;
            b = temp + b;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o número de elementos da série de Fibonacci: ");
        int n = scanner.nextInt();

        try {
            int result = calculateFibonacciSum(n);
            System.out.println("A soma dos primeiros " + n + " elementos da série de Fibonacci é: " + result);
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
}
