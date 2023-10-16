/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package medianotas;

/**
 *
 * @author Administrator
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GradeCalculatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> grades = new ArrayList<>();

        System.out.println("Calculadora de Média e Desvio Padrão de Notas");
        System.out.print("Quantos alunos deseja inserir notas? ");

        int numAlunos = scanner.nextInt();

        for (int i = 1; i <= numAlunos; i++) {
            System.out.print("Digite a nota do aluno #" + i + ": ");
            double nota = scanner.nextDouble();
            grades.add(nota);
        }

        if (grades.isEmpty()) {
            System.out.println("A lista de notas está vazia. Nenhum cálculo pode ser realizado.");
        } else {
            double media = calculateAverage(grades);
            double desvioPadrao = calculateStandardDeviation(grades);

            System.out.println("Média das notas: " + media);
            System.out.println("Desvio Padrão das notas: " + desvioPadrao);
        }
    }

    public static double calculateAverage(List<Double> grades) {
        if (grades.isEmpty()) {
            throw new IllegalArgumentException("A lista de notas não pode estar vazia.");
        }
        double soma = 0;
        for (Double nota : grades) {
            soma += nota;
        }
        return soma / grades.size();
    }

    public static double calculateStandardDeviation(List<Double> grades) {
        if (grades.isEmpty()) {
            throw new IllegalArgumentException("A lista de notas não pode estar vazia.");
        }
        double media = calculateAverage(grades);
        double somaDosQuadradosDasDiferencas = 0;
        for (Double nota : grades) {
            double diferenca = nota - media;
            somaDosQuadradosDasDiferencas += diferenca * diferenca;
        }
        double variancia = somaDosQuadradosDasDiferencas / grades.size();
        return Math.sqrt(variancia);
    }
}