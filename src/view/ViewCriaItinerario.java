package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ViewCriaItinerario {
    private JFrame frame;
    private JLabel background;
    private JTextField cidadedeorigem;
    private JTextField aeroportodeorigem;
    private JTextField datadepartida;
    private JTextField aviao;
    private JTextField horariodepartida;
    private JTextField cidadededestino;
    private JTextField aeroportodedestino;
    private JTextField vagasdisponiveis;
    private JTextField horariodechegada;
    private JButton btnCancelar;
    private JButton btnConfirmar;
    private JComboBox<String> comboBoxCliente;
    private JLabel lbItinerario;
    private JLabel lblCidadeOrigem;
    private JLabel lblAeroportoOrigem;
    private JLabel lblDataPartida;
    private JLabel lblAviao;
    private JLabel lblHorarioPartida;
    private JLabel lblAeroportoDestino;
    private JLabel lblVagasDisponiveis;
    private JLabel lblHorarioChegada;
    private JLabel lblCidadeOrigem2;

    public ViewCriaItinerario() {
        frame = new JFrame();
        frame.setBounds(150, 150, 600, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        frame.setLocationRelativeTo(null);

        btnCancelar = new JButton("Cancelar");
        btnCancelar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ViewCrudItinerario crudItinerarioWindow = new ViewCrudItinerario();
                crudItinerarioWindow.getOriginFrame().setVisible(true);
                frame.dispose(); // Fecha a tela atual
            }
        });
        btnCancelar.setFont(new Font("Segoe UI Semibold", Font.BOLD, 13));
        btnCancelar.setBounds(441, 275, 106, 23);
        frame.getContentPane().add(btnCancelar);
        
        btnConfirmar = new JButton("Confirmar");
        btnConfirmar.setFont(new Font("Segoe UI Semibold", Font.BOLD, 13));
        btnConfirmar.setBounds(26, 275, 106, 23);
        frame.getContentPane().add(btnConfirmar);

        comboBoxCliente = new JComboBox<>();
        comboBoxCliente.setModel(new DefaultComboBoxModel<>(new String[] {"Cliente"}));
        comboBoxCliente.setFont(new Font("Segoe UI Semibold", Font.BOLD, 13));
        comboBoxCliente.setBounds(10, 41, 537, 22);
        frame.getContentPane().add(comboBoxCliente);

        lbItinerario = new JLabel("Itinerario");
        lbItinerario.setFont(new Font("Segoe UI Semibold", Font.BOLD, 16));
        lbItinerario.setBounds(251, 11, 73, 14);
        frame.getContentPane().add(lbItinerario);

        lblCidadeOrigem = new JLabel("Cidade de Origem:");
        lblCidadeOrigem.setFont(new Font("Segoe UI Semibold", Font.BOLD, 13));
        lblCidadeOrigem.setBounds(10, 82, 122, 22);
        frame.getContentPane().add(lblCidadeOrigem);

        lblAeroportoOrigem = new JLabel("Aeroporto Origem");
        lblAeroportoOrigem.setFont(new Font("Segoe UI Semibold", Font.BOLD, 13));
        lblAeroportoOrigem.setBounds(10, 115, 114, 14);
        frame.getContentPane().add(lblAeroportoOrigem);

        cidadedeorigem = new JTextField();
        cidadedeorigem.setBounds(134, 84, 138, 20);
        frame.getContentPane().add(cidadedeorigem);
        cidadedeorigem.setColumns(10);

        aeroportodeorigem = new JTextField();
        aeroportodeorigem.setBounds(134, 115, 138, 20);
        frame.getContentPane().add(aeroportodeorigem);
        aeroportodeorigem.setColumns(10);

        datadepartida = new JTextField();
        datadepartida.setText("  /  /    ");
        datadepartida.setBounds(134, 146, 138, 20);
        frame.getContentPane().add(datadepartida);
        datadepartida.setColumns(10);

        aviao = new JTextField();
        aviao.setBounds(134, 177, 138, 20);
        frame.getContentPane().add(aviao);
        aviao.setColumns(10);

        horariodepartida = new JTextField();
        horariodepartida.setText("  :  ");
        horariodepartida.setBounds(134, 208, 138, 20);
        frame.getContentPane().add(horariodepartida);
        horariodepartida.setColumns(10);

        cidadededestino = new JTextField();
        cidadededestino.setColumns(10);
        cidadededestino.setBounds(409, 82, 138, 20);
        frame.getContentPane().add(cidadededestino);

        aeroportodedestino = new JTextField();
        aeroportodedestino.setColumns(10);
        aeroportodedestino.setBounds(409, 113, 138, 20);
        frame.getContentPane().add(aeroportodedestino);

        vagasdisponiveis = new JTextField();
        vagasdisponiveis.setColumns(10);
        vagasdisponiveis.setBounds(409, 175, 138, 20);
        frame.getContentPane().add(vagasdisponiveis);

        horariodechegada = new JTextField();
        horariodechegada.setText("  :  ");
        horariodechegada.setColumns(10);
        horariodechegada.setBounds(409, 206, 138, 20);
        frame.getContentPane().add(horariodechegada);

        lblDataPartida = new JLabel("Data de Partida");
        lblDataPartida.setFont(new Font("Segoe UI Semibold", Font.BOLD, 13));
        lblDataPartida.setBounds(10, 149, 114, 14);
        frame.getContentPane().add(lblDataPartida);

        lblAviao = new JLabel("Aviao:");
        lblAviao.setFont(new Font("Segoe UI Semibold", Font.BOLD, 13));
        lblAviao.setBounds(10, 180, 114, 14);
        frame.getContentPane().add(lblAviao);

        lblHorarioPartida = new JLabel("Horario Partida:");
        lblHorarioPartida.setFont(new Font("Segoe UI Semibold", Font.BOLD, 13));
        lblHorarioPartida.setBounds(10, 211, 114, 14);
        frame.getContentPane().add(lblHorarioPartida);

        lblAeroportoDestino = new JLabel("Aeroporto Destino");
        lblAeroportoDestino.setFont(new Font("Segoe UI Semibold", Font.BOLD, 13));
        lblAeroportoDestino.setBounds(282, 116, 114, 14);
        frame.getContentPane().add(lblAeroportoDestino);

        lblVagasDisponiveis = new JLabel("Vagas Disponiveis");
        lblVagasDisponiveis.setFont(new Font("Segoe UI Semibold", Font.BOLD, 13));
        lblVagasDisponiveis.setBounds(282, 180, 114, 14);
        frame.getContentPane().add(lblVagasDisponiveis);

        lblHorarioChegada = new JLabel("Horario Chegada:");
        lblHorarioChegada.setFont(new Font("Segoe UI Semibold", Font.BOLD, 13));
        lblHorarioChegada.setBounds(282, 211, 114, 14);
        frame.getContentPane().add(lblHorarioChegada);

        background = new JLabel("");
        background.setBounds(-93, -51, 875, 872);
        frame.getContentPane().add(background);
        
                lblCidadeOrigem2 = new JLabel("Cidade de Origem:");
                lblCidadeOrigem2.setFont(new Font("Segoe UI Semibold", Font.BOLD, 13));
                lblCidadeOrigem2.setBounds(282, 82, 122, 22);
                frame.getContentPane().add(lblCidadeOrigem2);
    }

    public JFrame getOriginFrame() {
        return frame;
    }
}
