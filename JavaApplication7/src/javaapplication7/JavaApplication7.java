/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication7;

/**
 *
 * @author Administrator
 */
import java.sql.*;
import QuickSort.*;
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   int arr[] = {10, 7, 8, 9, 1, 5};
        int n = arr.length;
 
        QuickSort ob = new QuickSort();
        ob.sort(arr, 0, n-1);
 
        System.out.println("sorted array");
        printArray(arr);
    }
    
}
