package frontend;

import javax.swing.*;
import java.awt.*;

public class BancaDeLivrosGUI extends JFrame {
    public BancaDeLivrosGUI() {
        setTitle("Banca de Livros");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Painel Principal
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        // Tabela
        JTable tabela = new JTable();
        JScrollPane scrollPane = new JScrollPane(tabela);
        panel.add(scrollPane, BorderLayout.CENTER);

        // Botões
        JPanel botoes = new JPanel();
        botoes.setLayout(new FlowLayout());
        botoes.add(new JButton("Inserir"));
        botoes.add(new JButton("Alterar"));
        botoes.add(new JButton("Excluir"));
        botoes.add(new JButton("Consultar"));
        botoes.add(new JButton("Listar"));
        panel.add(botoes, BorderLayout.SOUTH);

        // Adicionar Painel ao Frame
        add(panel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            BancaDeLivrosGUI frame = new BancaDeLivrosGUI();
            frame.setVisible(true);
        });
    }
}
