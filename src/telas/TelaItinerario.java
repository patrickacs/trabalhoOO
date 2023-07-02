package telas;

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

/**
 * Classe responsável pela interface gráfica da tela inicial
 * 
 * @author Artur Pereira e Patrick Anderson
 * @since release 1
 */

public class TelaItinerario {
    private JFrame frame;
    private JLabel background;
    private JTable table;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JLabel lblBuscar;
    private JButton btnConfirmar;
    private JLabel lblItinerario;
    private JScrollPane scrollPane;
    private JLabel lblNome;
    private JLabel lblData;
    private JLabel lblLocal;
    private JButton btnVoltar;


    /**
     * Construtor da classe ViewFirstScreen, onde é criada a interface gráfica.
     */
    public TelaItinerario() {
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
        frame.getContentPane().add(btnVoltar);

        /**
         * Botão de Confirmar
         */
        btnConfirmar = new JButton("Confirmar");
        btnConfirmar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        btnConfirmar.setFont(new Font("Segoe UI Semibold", Font.BOLD, 13));
        btnConfirmar.setBounds(613, 110, 148, 23);
        frame.getContentPane().add(btnConfirmar);

        /**
         * Label Itinerário
         */
        lblItinerario = new JLabel("     Itinerario");
        lblItinerario.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
        lblItinerario.setBounds(211, 11, 148, 48);
        frame.getContentPane().add(lblItinerario);

        /**
         * Fundo para a tabela
         */
        scrollPane = new JScrollPane();
        scrollPane.setBounds(39, 176, 722, 187);
        frame.getContentPane().add(scrollPane);

        /**
         * Tabela de Itinerário
         */
        table = new JTable();
        table.setForeground(new Color(0, 0, 0));
        table.setFont(new Font("Segoe UI Semibold", Font.BOLD, 13));
        table.setModel(new DefaultTableModel(
                new Object[][] {
                        { "", null, null, null, null, null },
                        { null, null, null, null, null, null },
                        { null, null, null, null, null, null },
                        { null, null, null, null, null, null },
                        { null, null, null, null, null, null },
                        { null, null, null, null, null, null },
                        { null, null, null, null, null, null },
                        { null, null, null, null, null, null },
                        { null, null, null, null, null, null },
                        { null, null, null, null, null, null },
                },
                new String[] {
                        "Aeroporto de Partida", "Aeroporto de Chegada", "Hor\u00E1rio de Partida",
                        "Hor\u00E1rio de Chegada", "Cidade de Partida", "Cidade de Chegada"
                }) {
            Class[] columnTypes = new Class[] {
                    Object.class, Object.class, String.class, Object.class, Object.class, Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return columnTypes[columnIndex];
            }
        });
        table.getColumnModel().getColumn(0).setPreferredWidth(114);
        table.getColumnModel().getColumn(1).setPreferredWidth(124);
        table.getColumnModel().getColumn(2).setPreferredWidth(120);
        table.getColumnModel().getColumn(3).setPreferredWidth(126);
        table.getColumnModel().getColumn(4).setPreferredWidth(101);
        table.getColumnModel().getColumn(5).setPreferredWidth(122);
        scrollPane.setViewportView(table);

        /**
         * Label de Buscar
         */
        lblBuscar = new JLabel("Buscar:");
        lblBuscar.setFont(new Font("Segoe UI Semibold", Font.BOLD, 16));
        lblBuscar.setBounds(39, 63, 58, 48);
        frame.getContentPane().add(lblBuscar);

        /**
         * Label Nome
         */
        lblNome = new JLabel("Nome");
        lblNome.setFont(new Font("Segoe UI Semibold", Font.BOLD, 14));
        lblNome.setBounds(97, 77, 58, 23);
        frame.getContentPane().add(lblNome);

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
        textField = new JTextField();
        textField.setBounds(148, 80, 159, 20);
        frame.getContentPane().add(textField);
        textField.setColumns(10);

        textField_1 = new JTextField();
        textField_1.setBounds(148, 111, 159, 20);
        frame.getContentPane().add(textField_1);
        textField_1.setColumns(10);

        /**
         * Label Local
         */
        lblLocal = new JLabel("Local:");
        lblLocal.setFont(new Font("Segoe UI Semibold", Font.BOLD, 14));
        lblLocal.setBounds(569, 77, 44, 23);
        frame.getContentPane().add(lblLocal);

        /**
         * Caixa de Preenchimento
         */
        textField_2 = new JTextField();
        textField_2.setBounds(613, 80, 148, 20);
        frame.getContentPane().add(textField_2);
        textField_2.setColumns(10);

        background = new JLabel("");
        background.setLabelFor(frame);
        background.setBounds(-114, -37, 875, 843);
        frame.getContentPane().add(background);

    }

    // leva a tela
    public JFrame getOriginFrame() {
        return frame;
    }
}