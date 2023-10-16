
 import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.FileOutputStream;
import java.sql.*;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;

public class RelatorioUsuarios extends JFrame {
    private JTextArea relatorioTextArea;

    public RelatorioUsuarios() {
        super("Relatório de Usuários");

        // Configuração da interface
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLayout(new BorderLayout());

        relatorioTextArea = new JTextArea();
        relatorioTextArea.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(relatorioTextArea);
        add(scrollPane, BorderLayout.CENTER);

        JButton gerarRelatorioButton = new JButton("Gerar Relatório em PDF");
        gerarRelatorioButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                gerarRelatorioPDF();
            }
        });

        add(gerarRelatorioButton, BorderLayout.SOUTH);

        carregarRelatorioUsuarios();
    }

    private void carregarRelatorioUsuarios() {
        // Conectar ao banco de dados MySQL
        String url = "jdbc:mysql://localhost:3306/seu_banco_de_dados";
        String usuario = "seu_usuario";
        String senha = "sua_senha";

        try {
            Connection conexao = DriverManager.getConnection(url, usuario, senha);
            Statement statement = conexao.createStatement();

            String query = "SELECT * FROM usuarios";
            ResultSet resultSet = statement.executeQuery(query);

            StringBuilder relatorio = new StringBuilder();

            while (resultSet.next()) {
                String usuario = resultSet.getString("usuario");
                String senha = resultSet.getString("senha");

                relatorio.append("Usuário: ").append(usuario).append(", Senha: ").append(senha).append("\n");
            }

            relatorioTextArea.setText(relatorio.toString());

            resultSet.close();
            statement.close();
            conexao.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void gerarRelatorioPDF() {
        Document document = new Document();
        try {
            PdfWriter.getInstance(document, new FileOutputStream("relatorio_usuarios.pdf"));
            document.open();

            Paragraph titulo = new Paragraph("Relatório de Usuários\n\n");
            titulo.setAlignment(Element.ALIGN_CENTER);
            document.add(titulo);

            document.add(new Paragraph(relatorioTextArea.getText()));

            document.close();
            JOptionPane.showMessageDialog(this, "Relatório gerado com sucesso!");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Erro ao gerar relatório!");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new RelatorioUsuarios().setVisible(true);
            }
        });
    }
}

