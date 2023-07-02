package view;

import java.awt.event.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;

/**
 * Classe responsável pela interface gráfica da tela inicial
 * @author Artur Pereira e Patrick Anderson
 * @since release 1
 */

public class ViewCrudItinerario {
    private JFrame frame;
    private JButton btnReservas;
    private JButton btnPassageiros;
    private JLabel background;
    private JLabel lblOOAirlines;
    private JButton btnItinerario;
    private JButton btnSair;
    
    /**
     * Construtor da classe ViewFirstScreen, onde é criada a interface gráfica.
     */
    public ViewCrudItinerario() {
        frame = new JFrame();
        frame.setBounds(150, 150, 408, 487);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        frame.setLocationRelativeTo(null);

        /**
         * Botão Passageiros
         */
        btnPassageiros = new JButton("Criar");
        btnPassageiros.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ViewCriaItinerario itinerarioWindow = new ViewCriaItinerario();
                itinerarioWindow.getOriginFrame().setVisible(true);
                frame.dispose(); // Fecha a tela atual
            }
        });
        btnPassageiros.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
        btnPassageiros.setBounds(91, 129, 210, 45);
        frame.getContentPane().add(btnPassageiros);

        /**
         * Botão Reservas
         */
        btnReservas = new JButton("Editar");
        btnReservas.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
        btnReservas.setBounds(91, 185, 210, 45);
        frame.getContentPane().add(btnReservas);
        
        /**
         * Label OOAirlines
         */
        lblOOAirlines = new JLabel("Itinerario");
        lblOOAirlines.setFont(new Font("Segoe UI Semibold", Font.BOLD, 32));
        lblOOAirlines.setBounds(123, 31, 155, 61);
        frame.getContentPane().add(lblOOAirlines);
        
        /**
         * Botão Itinerario
         */
        btnItinerario = new JButton("Lista");
        btnItinerario.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        btnItinerario.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
        btnItinerario.setBounds(91, 297, 210, 45);
        frame.getContentPane().add(btnItinerario);
        
        
        btnSair = new JButton("Sair");
        btnSair.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        btnSair.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
        btnSair.setBounds(91, 297, 210, 45);
        frame.getContentPane().add(btnSair);
        btnSair.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Adicione aqui o c�digo para voltar � tela anterior
                frame.dispose(); // Fecha a tela atual
            }});
        
        
        btnSair.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
        btnSair.setBounds(91, 354, 210, 45);
        frame.getContentPane().add(btnSair);
        btnSair = new JButton("Sair");
        btnSair.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose(); // Fecha a janela atual
            }
        });
        btnSair.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
        btnSair.setBounds(91, 354, 210, 45);
        frame.getContentPane().add(btnSair);     
                
        JButton btnRemover = new JButton("Remover");
        btnRemover.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
                btnRemover.setBounds(91, 241, 210, 45);
                frame.getContentPane().add(btnRemover);
       

                               
    }

    // leva a tela
    public JFrame getOriginFrame() {
        return frame;
    }
}