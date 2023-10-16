/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import factory.ConnectionFactory;
import modelo.Usuario;
import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;
        

public class UsuarioDAO { 
    private Connection connection;
    String login;
    String senha;
    public UsuarioDAO(){ 
        this.connection = new ConnectionFactory().getConnection();
       
    } 
    public void adiciona(Usuario usuario){ 
        String sql = "INSERT INTO usuario(login,senha) VALUES(?,?)";
        try { 
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, usuario.getlogin());
            stmt.setString(2, usuario.getsenha());
            stmt.execute();
            stmt.close();
        } 
        catch (SQLException u) { 
            throw new RuntimeException(u);
        } 
        
    } 
    public void atualiza (Usuario usuario){ 
        String sql = "UPDATE usuario SET senha = ?" + " WHERE login=?";
               
        try { 
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, usuario.getsenha());
            stmt.setString(2, usuario.getlogin());
            stmt.execute();
            stmt.close();
        } 
        catch (SQLException u) { 
            throw new RuntimeException(u);
        } 
        
    } 
    public void exclui (Usuario usuario){ 
        String sql = "DELETE FROM usuario WHERE login = ?";
               
        try { 
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, usuario.getlogin());
            stmt.execute();
            stmt.close();
        } 
        catch (SQLException u) { 
            throw new RuntimeException(u);
        } 
        
    }
    public void consulta (Usuario usuario){ 
              
      
        
  
    }


    }  



