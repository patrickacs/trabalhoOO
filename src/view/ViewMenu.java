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

public class ViewMenu {
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
    public ViewMenu() {
        frame = new JFrame();
        frame.setBounds(150, 150, 600, 550);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        frame.setLocationRelativeTo(null);

        /**
         * Botão Passageiros
         */
        btnPassageiros = new JButton("Passageiros");
        btnPassageiros.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        btnPassageiros.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
        btnPassageiros.setBounds(170, 125, 210, 45);
        frame.getContentPane().add(btnPassageiros);

        /**
         * Botão Reservas
         */
        btnReservas = new JButton("Reservas");
        btnReservas.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
        btnReservas.setBounds(170, 181, 210, 45);
        frame.getContentPane().add(btnReservas);
        
        /**
         * Label OOAirlines
         */
        lblOOAirlines = new JLabel("OOAirlines");
        lblOOAirlines.setFont(new Font("Segoe UI Semibold", Font.BOLD, 32));
        lblOOAirlines.setBounds(200, 21, 155, 61);
        frame.getContentPane().add(lblOOAirlines);
        
        /**
         * Botão Itinerario
         */
        btnItinerario = new JButton("Itinerario");
        btnItinerario.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
        btnItinerario.setBounds(170, 237, 210, 45);
        frame.getContentPane().add(btnItinerario);
        
        btnSair = new JButton("Sair");
        btnSair.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		frame.dispose();
        	}
        });
        btnSair.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
        btnSair.setBounds(170, 293, 210, 45);
        frame.getContentPane().add(btnSair);
        
                background = new JLabel("");
                background.setBounds(-51, -74, 875, 843);
                frame.getContentPane().add(background);
       

                               
    }

    // leva a tela
    public JFrame getOriginFrame() {
        return frame;
    }
}