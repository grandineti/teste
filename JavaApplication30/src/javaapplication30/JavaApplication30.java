/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication30;

/**
 *
 * @author Administrator
 */


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;
import java.util.Random;
public class JavaApplication30 {

   

public class QuickSortSearch extends JFrame {
    private JTextArea resultTextArea;

    public static void  QuickSortSearch() {
        super("QuickSort Search");

        // Configuração da interface
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLayout(new BorderLayout());

        resultTextArea = new JTextArea();
        resultTextArea.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(resultTextArea);
        add(scrollPane, BorderLayout.CENTER);

        JButton searchButton = new JButton("Pesquisar 500");
        searchButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                int[] numbers = gerarVetorAleatorio(1000);

                quickSort(numbers, 0, numbers.length - 1);

                int index = buscaBinaria(numbers, 500);

                if (index != -1) {
                    resultTextArea.setText("O número 500 foi encontrado no índice: " + index);
                } else {
                    resultTextArea.setText("O número 500 não foi encontrado no vetor.");
                }
            }
        });

        add(searchButton, BorderLayout.SOUTH);
    }

    private int[] gerarVetorAleatorio(int tamanho) {
        int[] vetor = new int[tamanho];
        Random random = new Random();

        for (int i = 0; i < tamanho; i++) {
            vetor[i] = random.nextInt(1000) + 1;
        }

        return vetor;
    }

    private void quickSort(int[] vetor, int esquerda, int direita) {
        if (esquerda < direita) {
            int pivo = particionar(vetor, esquerda, direita);
            quickSort(vetor, esquerda, pivo - 1);
            quickSort(vetor, pivo + 1, direita);
        }
    }

    private int particionar(int[] vetor, int esquerda, int direita) {
        int pivo = vetor[direita];
        int i = esquerda - 1;

        for (int j = esquerda; j < direita; j++) {
            if (vetor[j] <= pivo) {
                i++;
                trocar(vetor, i, j);
            }
        }

        trocar(vetor, i + 1, direita);
        return i + 1;
    }

    private void trocar(int[] vetor, int i, int j) {
        int temp = vetor[i];
        vetor[i] = vetor[j];
        vetor[j] = temp;
    }

    private int buscaBinaria(int[] vetor, int chave) {
        int esquerda = 0;
        int direita = vetor.length - 1;

        while (esquerda <= direita) {
            int meio = (esquerda + direita) / 2;

            if (vetor[meio] == chave) {
                return meio;
            } else if (vetor[meio] < chave) {
                esquerda = meio + 1;
            } else {
                direita = meio - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new QuickSortSearch().setVisible(true);
            }
        });
    }
}
    
}
