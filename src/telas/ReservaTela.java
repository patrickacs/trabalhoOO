 package telas;

import java.awt.event.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 * Classe responsável pela interface gráfica da tela inicial
 * @author Artur Pereira e Patrick Anderson
 * @since release 1
 */

public class ReservaTela {
    private JFrame frame;
    private JLabel background;
    private JTextField textField;
    private JTextField textField_1;
    private JTable table;
    private JTable table_1;
    private JButton btnCancelar;
    private JButton btnConfirmar;
    private JButton btnOK;
    private JComboBox comboBox;
    private JScrollPane scrollPane;
    private JLabel lblReserva;
    private JLabel lblNome;
    private JLabel lblVoos;
    private JLabel lblItinerario;
    private JScrollPane scrollPane_1;


    /**
     * Construtor da classe ViewFirstScreen, onde é criada a interface gráfica.
     */
    public ReservaTela() {
        frame = new JFrame();
        frame.setBounds(150, 150, 600, 550);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        frame.setLocationRelativeTo(null);
        
        /**
         * Botão Cancelar
         */
        btnCancelar = new JButton("Cancelar");
        btnCancelar.setFont(new Font("Segoe UI Semibold", Font.BOLD, 13));
        btnCancelar.setBounds(444, 484, 106, 23);
        frame.getContentPane().add(btnCancelar);
        
        /**
         * Botão Confirmar
         */
        btnConfirmar = new JButton("Confirmar");
        btnConfirmar.setFont(new Font("Segoe UI Semibold", Font.BOLD, 13));
        btnConfirmar.setBounds(43, 484, 106, 23);
        frame.getContentPane().add(btnConfirmar);
        
        /**
         * Botão Confirmar
         */
        btnOK = new JButton("OK");
        btnOK.setFont(new Font("Segoe UI Semibold", Font.BOLD, 13));
        btnOK.setBounds(461, 40, 89, 23);
        frame.getContentPane().add(btnOK);
        
        /**
         * Caixas de Preenchimento
         */
        textField_1 = new JTextField();
        textField_1.setBounds(77, 74, 359, 20);
        frame.getContentPane().add(textField_1);
        textField_1.setColumns(10);
        
        textField = new JTextField();
        textField.setBounds(77, 41, 359, 20);
        frame.getContentPane().add(textField);
        textField.setColumns(10);
        
        /**
         * Caixas duplas de Preenchimeto CPF/CNPJ
         */
        comboBox = new JComboBox();
        comboBox.setModel(new DefaultComboBoxModel(new String[] {" CPF", "CNPJ"}));
        comboBox.setFont(new Font("Segoe UI Semibold", Font.BOLD, 13));
        comboBox.setBounds(10, 39, 57, 22);
        frame.getContentPane().add(comboBox);
        
        /**
         * Fundo da tabela
         */
        scrollPane = new JScrollPane();
        scrollPane.setToolTipText("");
        scrollPane.setBounds(33, 317, 517, 156);
        frame.getContentPane().add(scrollPane);
        
        /**
         * Tabela
         */
        table_1 = new JTable();
        table_1.setModel(new DefaultTableModel(
        	new Object[][] {
        		{null},
        		{null},
        		{null},
        		{null},
        		{null},
        		{null},
        		{null},
        		{null},
        	},
        	new String[] {
        		"Itinerarios"
        	}
        ));
        table_1.setFont(new Font("Segoe UI Semibold", Font.BOLD, 13));
        scrollPane.setViewportView(table_1);
                
        /**
         * Label Reserva
         */
        lblReserva = new JLabel("Reserva");
        lblReserva.setFont(new Font("Segoe UI Semibold", Font.BOLD, 16));
        lblReserva.setBounds(251, 11, 73, 14);
        frame.getContentPane().add(lblReserva);
                                
        /**
        * Label Nome
        */
        lblNome = new JLabel("Nome:");
        lblNome.setFont(new Font("Segoe UI Semibold", Font.BOLD, 13));
        lblNome.setBounds(10, 72, 57, 22);
        frame.getContentPane().add(lblNome);
                                                
        /**
        * Label Voos
        */
        lblVoos = new JLabel("Voos");
        lblVoos.setFont(new Font("Segoe UI Semibold", Font.BOLD, 13));
        lblVoos.setBounds(269, 105, 30, 14);
        frame.getContentPane().add(lblVoos);
                                                        
        /**
        * Label Itinerário
        */
        lblItinerario = new JLabel("Itinerario");
        lblItinerario.setFont(new Font("Segoe UI Semibold", Font.BOLD, 13));
        lblItinerario.setBounds(256, 297, 57, 14);
        frame.getContentPane().add(lblItinerario);
                                                                        
                                                        
       scrollPane_1 = new JScrollPane();
       scrollPane_1.setBounds(33, 133, 517, 141);
       frame.getContentPane().add(scrollPane_1);
                                                                        
       table = new JTable();
       table.setModel(new DefaultTableModel(
       new Object[][] {
            {null},
            {null},
            {null},
            {null},
            {null},
            {null},
            {null},
                      },
        new String[] {"Voos"}));

        table.setFont(new Font("Segoe UI Semibold", Font.BOLD, 13));
        scrollPane_1.setViewportView(table);
        background = new JLabel("");
        background.setLabelFor(frame);
        background.setBounds(-93, -22, 875, 843);
        frame.getContentPane().add(background);
       

                               
    }

    // leva a tela
    public JFrame getOriginFrame() {
        return frame;
    }
}