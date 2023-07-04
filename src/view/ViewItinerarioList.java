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
 * Classe respons�vel pela interface gr�fica da tela de listagem de itiner�rios.
 * 
 * Autor: Patrick Anderson
 * Desde: vers�o 1
 */

public class ViewItinerarioList {
    private JFrame frame;
    private JTable table;
    private JTextField campoOrigem;
    private JTextField campoData;
    private JTextField campoDestino;
    private JLabel lblBuscar;
    private JButton btnConfirmar;
    private JLabel lblItinerario;
    private JLabel lblOrigem;
    private JLabel lblData;
    private JLabel lblDestino;
    private JButton btnVoltar;
    private JButton btnEdita;

    /**
     * Construtor da classe ViewItinerarioList, onde � criada a interface gr�fica.
     */
    public ViewItinerarioList() {
        ControladorItinerario controladorItinerario = new ControladorItinerario();

        frame = new JFrame();
        frame.setBounds(150, 150, 829, 550);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        frame.setLocationRelativeTo(null);

        /**
         * Bot�o de Voltar
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
         * Bot�o de Confirmar
         */
        btnConfirmar = new JButton("Confirmar");
        btnConfirmar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Obt�m os valores dos campos de pesquisa
                String origem = campoOrigem.getText();
                String destino = campoDestino.getText();
                String data = campoData.getText();

                // Chama o m�todo de pesquisa do controlador de itiner�rio
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
         * Label Itiner�rio
         */
        lblItinerario = new JLabel("Itinerario");
        lblItinerario.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
        lblItinerario.setBounds(211, 11, 148, 48);
        frame.getContentPane().add(lblItinerario);

        table = new JTable();
        DefaultTableModel model = new DefaultTableModel(
            new Object[][] {},
            new String[] {
                "Aeroporto de Partida", "Aeroporto de Chegada", "Hor�rio de Partida",
                "Hor�rio de Chegada", "Data"
            }
        );

        // Obt�m os voos e os adiciona ao modelo da tabela
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

        // Adicione o JScrollPane ao seu componente, como necess�rio
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
        
        JButton btnApagar = new JButton("Apagar");
        btnApagar.setFont(new Font("Segoe UI Semibold", Font.BOLD, 13));
        btnApagar.setBounds(40, 423, 123, 23);
        
        btnApagar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
 
                int selectedRow = table.getSelectedRow();

                // Se nenhuma linha foi selecionada, retorna
                if (selectedRow == -1) {
                    return;
                }

                DefaultTableModel model = (DefaultTableModel) table.getModel();

  
                controladorItinerario.excluirVoo(selectedRow);

                model.removeRow(selectedRow);
            }
        });

        frame.getContentPane().add(btnApagar);
        
        btnEdita = new JButton("Editar");
        btnEdita.setFont(new Font("Segoe UI Semibold", Font.BOLD, 13));
        btnEdita.setBounds(168, 423, 123, 23);

        btnEdita.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int selectedRow = table.getSelectedRow();

                // Se nenhuma linha foi selecionada, retorna
                if (selectedRow == -1) {
                    return;
                }

                DefaultTableModel model = (DefaultTableModel) table.getModel();

                
                String horarioPartida = (String) model.getValueAt(selectedRow, 2).toString();
                String horarioChegada = (String) model.getValueAt(selectedRow, 3).toString();
                String data = (String) model.getValueAt(selectedRow, 4).toString();

                controladorItinerario.editarVoo(horarioPartida, horarioChegada, data, selectedRow);

            

                
                
            }
        });

        frame.getContentPane().add(btnEdita);

        

    }

    // Obt�m a tela
    public JFrame getOriginFrame() {
        return frame;
    }
}
