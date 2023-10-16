/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication4;

/**
 *
 * @author Administrator
 */


import java.util.Scanner;
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner ler = new Scanner (System.in);
    int n = 6;
    int i, j, m[][] = new int[n][n];

    for (i=0; i<2; i++){
      System.out.printf("Informe os elementos %da. linha:\n",(i+1));
       
     for (j=0; j<4;j++) {
      System.out.printf("m[%d][%d]= ",i,j);
      m[i][j] = ler.nextInt();
       }
        System.out.printf("\n");
       }

        System.out.printf("\n");
   
       for (i=0; i<2;i++) {
           System.out.printf("%da. linha: ", (i+1));
      for (j=0; j<4;j++) {
               System.out.printf("%d ", m[i][j]);
      }
      System.out.printf("\n");
    }
    System.out.println("Somando 2 elementos da matriz usando funcao");
    System.out.println(somar(m[1][1], m[1][2]));
    }

public static double somar(double a, double b){
    return a+b;
}

}