package view;

import java.awt.event.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import javax.swing.JList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.DefaultListModel;
import java.util.ArrayList;
import model.Voo;
import controlador.ControladorItinerario;

/**
 * Classe responsável pela interface gráfica da tela de listagem de itinerários.
 * 
 * Autor: Patrick Anderson
 * Desde: versão 1
 */

public class ViewItinerarioList {
    private JFrame frame;
    private JLabel background;
    private JTable table;
    private JTextField campoOrigem;
    private JTextField campoData;
    private JTextField campoDestino;
    private JLabel lblBuscar;
    private JButton btnConfirmar;
    private JLabel lblItinerario;
    private JScrollPane scrollPane;
    private JLabel lblOrigem;
    private JLabel lblData;
    private JLabel lblDestino;
    private JButton btnVoltar;

    /**
     * Construtor da classe ViewItinerarioList, onde é criada a interface gráfica.
     */
    public ViewItinerarioList() {
        ControladorItinerario controladorItinerario = new ControladorItinerario();

        frame = new JFrame();
        frame.setBounds(150, 150, 829, 550);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        frame.setLocationRelativeTo(null);

        /**
         * Botão de Voltar
         */
        btnVoltar = new JButton("Voltar");
        btnVoltar.setFont(new Font("Segoe UI Semibold", Font.BOLD, 13));
        btnVoltar.setBounds(638, 422, 123, 23);
        btnVoltar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });
        frame.getContentPane().add(btnVoltar);

        /**
         * Botão de Confirmar
         */
        btnConfirmar = new JButton("Confirmar");
        btnConfirmar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Obtém os valores dos campos de pesquisa
                String origem = campoOrigem.getText();
                String destino = campoDestino.getText();
                String data = campoData.getText();

                // Chama o método de pesquisa do controlador de itinerário
                ArrayList<Voo> voosEncontrados = controladorItinerario.pesquisarVoos(origem, destino, data);

                // Atualiza o modelo da tabela com os resultados da pesquisa
                DefaultTableModel model = (DefaultTableModel) table.getModel();
                model.setRowCount(0); // Limpa os dados existentes na tabela

                for (Voo voo : voosEncontrados) {
                    String[] rowData = {
                        voo.getAeroportoOrigem(),
                        voo.getAeroportoChegada(),
                        voo.getHorarioPartida(),
                        voo.getHorarioChegada(),
                        voo.getData()
                    };
                    model.addRow(rowData);
                }
            }
        });
        btnConfirmar.setFont(new Font("Segoe UI Semibold", Font.BOLD, 13));
        btnConfirmar.setBounds(613, 110, 148, 23);
        frame.getContentPane().add(btnConfirmar);

        /**
         * Label Itinerário
         */
        lblItinerario = new JLabel("Itinerário");
        lblItinerario.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
        lblItinerario.setBounds(211, 11, 148, 48);
        frame.getContentPane().add(lblItinerario);

        table = new JTable();
        DefaultTableModel model = new DefaultTableModel(
            new Object[][] {},
            new String[] {
                "Aeroporto de Partida", "Aeroporto de Chegada", "Horário de Partida",
                "Horário de Chegada", "Data"
            }
        );

        // Obtém os voos e os adiciona ao modelo da tabela
        ArrayList<Voo> voosEncontrados = controladorItinerario.listarVoos();
        for (Voo voo : voosEncontrados) {
            String[] rowData = {
                voo.getAeroportoOrigem(),
                voo.getAeroportoChegada(),
                voo.getHorarioPartida(),
                voo.getHorarioChegada(),
                voo.getData()
            };
            model.addRow(rowData);
        }

        // Define o modelo da tabela
        table.setModel(model);

        // Define o tamanho preferencial das colunas
        table.getColumnModel().getColumn(0).setPreferredWidth(120);
        table.getColumnModel().getColumn(1).setPreferredWidth(120);
        table.getColumnModel().getColumn(2).setPreferredWidth(120);
        table.getColumnModel().getColumn(3).setPreferredWidth(120);
        table.getColumnModel().getColumn(4).setPreferredWidth(120);

        // Cria um JScrollPane para a tabela
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(40, 170, 700, 250);

        // Adicione o JScrollPane ao seu componente, como necessário
        frame.getContentPane().add(scrollPane);

        /**
         * Label de Buscar
         */
        lblBuscar = new JLabel("Buscar:");
        lblBuscar.setFont(new Font("Segoe UI Semibold", Font.BOLD, 16));
        lblBuscar.setBounds(39, 63, 58, 48);
        frame.getContentPane().add(lblBuscar);

        /**
         * Label Origem
         */
        lblOrigem = new JLabel("Origem");
        lblOrigem.setFont(new Font("Segoe UI Semibold", Font.BOLD, 14));
        lblOrigem.setBounds(97, 77, 58, 23);
        frame.getContentPane().add(lblOrigem);

        /**
         * Label Data
         */
        lblData = new JLabel("Data:");
        lblData.setFont(new Font("Segoe UI Semibold", Font.BOLD, 14));
        lblData.setBounds(97, 103, 44, 34);
        frame.getContentPane().add(lblData);

        /**
         * Campos de Preenchimento
         */
        campoOrigem = new JTextField();
        campoOrigem.setBounds(148, 80, 159, 20);
        frame.getContentPane().add(campoOrigem);
        campoOrigem.setColumns(10);

        campoData = new JTextField();
        campoData.setBounds(148, 111, 159, 20);
        frame.getContentPane().add(campoData);
        campoData.setColumns(10);

        /**
         * Label Destino
         */
        lblDestino = new JLabel("Destino:");
        lblDestino.setFont(new Font("Segoe UI Semibold", Font.BOLD, 14));
        lblDestino.setBounds(555, 77, 58, 23);
        frame.getContentPane().add(lblDestino);

        /**
         * Campo de Preenchimento
         */
        campoDestino = new JTextField();
        campoDestino.setBounds(613, 80, 148, 20);
        frame.getContentPane().add(campoDestino);
        campoDestino.setColumns(10);

        background = new JLabel("");
        background.setLabelFor(frame);
        background.setBounds(-114, -37, 875, 843);
        frame.getContentPane().add(background);
    }

    // Obtém a tela
    public JFrame getOriginFrame() {
        return frame;
    }
}
