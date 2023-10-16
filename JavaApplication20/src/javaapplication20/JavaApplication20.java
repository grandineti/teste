/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication20;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
/**
 *
 * @author Administrator
 */
public class JavaApplication20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
    Scanner ler = new Scanner(System.in);
    int i, n;

    System.out.printf("Informe o número inicial:\n");
    n = ler.nextInt();

    FileWriter arq = new FileWriter("d:\\arquivo.txt");
    PrintWriter gravarArq = new PrintWriter(arq);

    gravarArq.printf("+--I e N--+%n");
    for (i=1; i<=10; i++) {
      gravarArq.printf("| %2d X %d = %2d |%n", i, n, (n));
    }
    gravarArq.printf("+-------------+%n");

    arq.close();

    System.out.printf("\nGerado com sucesso em \"d:\\arquivo.txt\".\n", n);
  }
    
}
