/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication23;
import javax.swing.*;
/**
 *
 * @author Administrator
 */
public class JavaApplication23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        JFrame frame = new JFrame("Solicitar Nome de Usuário");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Digite seu USUARIO:");
        JLabel label2 = new JLabel("Digite sua senha:");
        JLabel label3 = new JLabel("Digite o seu email:");
 
        JTextField textField = new JTextField(20);
        JTextField textField2 = new JTextField(10);
        JTextField textField3 = new JTextField(20);
        JButton confirmar = new JButton();
        
        panel.add(label);
        panel.add(textField);
        panel.add(label2);
        panel.add(textField2);
        panel.add(label3);
        panel.add(textField3);
        panel.add(confirmar);
        
        frame.add(panel);
        frame.setVisible(true); }
     
   
        
    }
    

