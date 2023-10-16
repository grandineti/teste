/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication11;

/**
 *
 * @author Administrator
 */
import javaapplication11.Funcionario;
public class JavaApplication11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
     Funcionario sakurai = new Funcionario("Sakurai", 222, "telecomunicação");   
   
    }
    

    public class Funcionario {
    private String nome;
    private int matricula;
    private String departamento;
    
    public Funcionario(String nome, int matricula, String departamento) {
        this.nome = nome;
        this.matricula = matricula;
        this.departamento = departamento;
    }

    public int getMatricula() { return matricula; }
    public void setMatricula(int matricula) { this.matricula = matricula; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getDepartamento() { return departamento; }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
  
   

}