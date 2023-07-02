package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 * Classe responsável pela interface gráfica da tela de reserva
 * 
 * @author Artur Pereira
 * @since release 1
 */
public class ViewReservaTela {
    private JFrame frame;
    private JTextField textField;
    private JTextField textField_1;
    private JTable table;
    private JTable table_1;
    private JButton btnCancelar;
    private JButton btnConfirmar;
    private JButton btnOK;
    private JComboBox<String> comboBox;
    private JScrollPane scrollPane;
    private JLabel lblReserva;
    private JLabel lblNome;
    private JLabel lblVoos;
    private JLabel lblItinerario;
    private JScrollPane scrollPane_1;

    /**
     * Construtor da classe ViewReservaTela, onde é criada a interface gráfica.
     */
    public ViewReservaTela() {
        frame = new JFrame();
        frame.setBounds(150, 150, 600, 550);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        frame.setLocationRelativeTo(null);

        /**
         * Botão Cancelar
         */
        btnCancelar = new JButton("Cancelar");
        btnCancelar.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        btnCancelar.setFont(new Font("Segoe UI Semibold", Font.BOLD, 13));
        btnCancelar.setBounds(444, 484, 106, 23);
        frame.getContentPane().add(btnCancelar);
        btnCancelar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Adicione aqui o código para voltar à tela anterior
                frame.dispose(); // Fecha a tela atual
            }
        });

        

        /**
         * Botão Confirmar
         */
        btnConfirmar = new JButton("Confirmar");
        btnConfirmar.setFont(new Font("Segoe UI Semibold", Font.BOLD, 13));
        btnConfirmar.setBounds(43, 484, 106, 23);
        frame.getContentPane().add(btnConfirmar);

        /**
         * Botão OK
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
        comboBox = new JComboBox<String>();
        comboBox.setModel(new DefaultComboBoxModel<String>(new String[] { "CPF", "CNPJ" }));
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
        table_1.setModel(new DefaultTableModel(new Object[][] { { null }, { null }, { null }, { null }, { null },
                { null }, { null }, { null }, }, new String[] { "Itinerarios" }));
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
        lblVoos = new JLabel("Itinerario");
        lblVoos.setFont(new Font("Segoe UI Semibold", Font.BOLD, 13));
        lblVoos.setBounds(251, 108, 73, 14);
        frame.getContentPane().add(lblVoos);

        /**
         * Label Itinerário
         */
        lblItinerario = new JLabel("Reservas");
        lblItinerario.setFont(new Font("Segoe UI Semibold", Font.BOLD, 13));
        lblItinerario.setBounds(256, 297, 57, 14);
        frame.getContentPane().add(lblItinerario);

        scrollPane_1 = new JScrollPane();
        scrollPane_1.setBounds(33, 133, 517, 141);
        frame.getContentPane().add(scrollPane_1);

        table = new JTable();
        table.setModel(new DefaultTableModel(new Object[][] { { null }, { null }, { null }, { null }, { null },
                { null }, { null }, }, new String[] { "Voos" }));
        table.setFont(new Font("Segoe UI Semibold", Font.BOLD, 13));
        scrollPane_1.setViewportView(table);
    }

    /**
     * Método para obter a referência do JFrame principal.
     * 
     * @return JFrame principal.
     */
    public JFrame getOriginFrame() {
        return frame;
    }

    /**
     * Método para adicionar um ActionListener ao botão "Cancelar".
     * 
     * @param listener O ActionListener a ser adicionado.
     */
    public void addCancelarListener(ActionListener listener) {
        btnCancelar.addActionListener(listener);
    }

    /**
     * Método para adicionar um ActionListener ao botão "Confirmar".
     * 
     * @param listener O ActionListener a ser adicionado.
     */
    public void addConfirmarListener(ActionListener listener) {
        btnConfirmar.addActionListener(listener);
    }

    /**
     * Método para adicionar um ActionListener ao botão "OK".
     * 
     * @param listener O ActionListener a ser adicionado.
     */
    public void addOKListener(ActionListener listener) {
        btnOK.addActionListener(listener);
    }

    /**
     * Método para obter o texto digitado no campo de nome.
     * 
     * @return O texto digitado no campo de nome.
     */
    public String getNome() {
        return textField_1.getText();
    }

    /**
     * Método para obter o tipo selecionado no JComboBox.
     * 
     * @return O tipo selecionado (CPF ou CNPJ).
     */
    public String getTipo() {
        return comboBox.getSelectedItem().toString();
    }

    /**
     * Método para atualizar a tabela de voos com os dados fornecidos.
     * 
     * @param data Os dados a serem exibidos na tabela de voos.
     */
    public void updateVoosTable(Object[][] data) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setDataVector(data, new String[] { "Voos" });
    }

    /**
     * Método para atualizar a tabela de itinerários com os dados fornecidos.
     * 
     * @param data Os dados a serem exibidos na tabela de itinerários.
     */
    public void updateItinerariosTable(Object[][] data) {
        DefaultTableModel model = (DefaultTableModel) table_1.getModel();
        model.setDataVector(data, new String[] { "Itinerarios" });
    }
}
