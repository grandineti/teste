/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication24;

/**
 *
 * @author Administrator
 */

 import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class JavaApplication24 {

   
public class CadastroUsuario extends JFrame implements ActionListener {
    private JTextField usuarioField;
    private JPasswordField senhaField;
    private JButton cadastrarButton;
    private JTextArea outputArea;

    public CadastroUsuario() {
        super("Cadastro de Usuário");

        // Configuração da interface
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLayout(new FlowLayout());

        JLabel usuarioLabel = new JLabel("Usuário:");
        usuarioField = new JTextField(15);

        JLabel senhaLabel = new JLabel("Senha:");
        senhaField = new JPasswordField(15);

        cadastrarButton = new JButton("Cadastrar");
        cadastrarButton.addActionListener(this);

        outputArea = new JTextArea(8, 25);
        outputArea.setEditable(false);

        add(usuarioLabel);
        add(usuarioField);
        add(senhaLabel);
        add(senhaField);
        add(cadastrarButton);
        add(outputArea);
    }

    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == cadastrarButton) {
            String usuario = usuarioField.getText();
            String senha = new String(senhaField.getPassword());

            if (usuario.isEmpty() || senha.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Por favor, preencha todos os campos!");
            } else {
                boolean usuarioExistente = verificarUsuarioExistente(usuario);
                if (usuarioExistente) {
                    JOptionPane.showMessageDialog(this, "Usuário já existe!");
                } else {
                    cadastrarUsuario(usuario, senha);
                    JOptionPane.showMessageDialog(this, "Usuário cadastrado com sucesso!");
                }
                limparCampos();
            }
        }
    }

    private boolean verificarUsuarioExistente(String usuario) {
        try {
            File arquivo = new File("usuarios.txt");
            if (!arquivo.exists()) {
                return false;
            }

            BufferedReader reader = new BufferedReader(new FileReader(arquivo));
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] dadosUsuario = linha.split(";");
                String usuarioExistente = dadosUsuario[0];
                if (usuarioExistente.equals(usuario)) {
                    reader.close();
                    return true;
                }
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    private cadastrarUsuario(String usuario, String senha) {
        try {
            FileWriter fileWriter = new FileWriter("usuarios.txt", true);
            BufferedWriter writer = new BufferedWriter(fileWriter);

            writer.write(usuario + ";" + senha);
            writer.newLine();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void limparCampos() {
        usuarioField.setText("");
        senhaField.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new CadastroUsuario().setVisible(true);
            }
        });
    }
}


    }
    
