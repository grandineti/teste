package javaapplication3;
import java.util.Scanner;
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
    int[] numeros = {1, 3, 4, 7, 9, 10, 13, 18, 20, 21, 22};
    int x=20;
    int inicio = 0;         
    int meio = 0;         
    int fim = numeros.length - 1;  
    
      while(inicio <= fim) {
      meio = (fim + inicio) / 2; 
      
      System.out.println("Inicio: " + numeros[inicio] + " - Meio: " + numeros[meio] + " - Fim: " + numeros[fim]);
      System.out.println("Inicio: " + inicio + " - Meio: " + meio + " - Fim: " + fim);
      
           if(numeros[meio] == x) {
        System.out.println("Encontrou o número " + x);
        break;
      }
      
       if(numeros[meio] < x) {
        inicio = meio + 1;
      } else {
          fim = meio - 1;
      }
    }
    
      if(inicio > fim) {
      System.out.println("Não encontrou o número " + x);
    }


}






}