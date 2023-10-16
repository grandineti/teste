/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication5;

/**
 *
 * @author Administrator
 */
import java.util.Scanner;

public static void main(string[ ] args){
int opcao;
do { 
opcao = MostraMenu();
} while (opcao != 2);
}


public static int MostraMenu() {
scanner entrada  = new scanner (System.in);
system.out.println ("== Menu ==");
system.out.println ("1-mostrar de novo");
system.out.println("2- sair");
return Integer.parseint(entrada.nextLine());
}

