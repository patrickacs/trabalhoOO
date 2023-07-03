package view;

import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;

/**
 * Classe responsvel pela interface grfica da tela inicial
 * 
 * @author Artur Pereira
 * @since 2023-07-02
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
     * Construtor da classe ViewMenu, onde  criada a interface grfica.
     */
    public ViewMenu() {
        frame = new JFrame();
        frame.setBounds(150, 150, 600, 550);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        frame.setLocationRelativeTo(null);

        /**
         * Boto Passageiros
         */
        btnPassageiros = new JButton("Passageiros");
        btnPassageiros.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
        btnPassageiros.setBounds(170, 125, 210, 45);
        frame.getContentPane().add(btnPassageiros);

        btnPassageiros.addActionListener(new ActionListener() {
            private boolean buttonClicked = false;

            public void actionPerformed(ActionEvent e) {
                if (!buttonClicked) {
                    buttonClicked = true;
                    btnPassageiros.setEnabled(false);

                    ViewCrudPassageiro window = new ViewCrudPassageiro();
                    window.getOriginFrame().setVisible(true);
                    window.getOriginFrame().addWindowListener(new WindowAdapter() {
                        @Override
                        public void windowClosed(WindowEvent e) {
                            btnPassageiros.setEnabled(true);
                            buttonClicked = false;
                        }
                    });
                }
            }
        });

        /**
         * Boto Reservas
         */
        btnReservas = new JButton("Reservas");
        btnReservas.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
        btnReservas.setBounds(170, 181, 210, 45);
        frame.getContentPane().add(btnReservas);

        btnReservas.addActionListener(new ActionListener() {
            private boolean buttonClicked = false;

            public void actionPerformed(ActionEvent e) {
                if (!buttonClicked) {
                    buttonClicked = true;
                    btnReservas.setEnabled(false);

                    ViewReservaTela window = new ViewReservaTela();
                    window.getOriginFrame().setVisible(true);
                    window.getOriginFrame().addWindowListener(new WindowAdapter() {
                        @Override
                        public void windowClosed(WindowEvent e) {
                            btnReservas.setEnabled(true);
                            buttonClicked = false;
                        }
                    });
                }
            }
        });

        /**
         * Label OOAirlines
         */
        lblOOAirlines = new JLabel("OOAirlines");
        lblOOAirlines.setFont(new Font("Segoe UI Semibold", Font.BOLD, 32));
        lblOOAirlines.setBounds(200, 21, 155, 61);
        frame.getContentPane().add(lblOOAirlines);

        /**
         * Boto Itinerario
         */
        btnItinerario = new JButton("Itinerario");
        btnItinerario.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
        btnItinerario.setBounds(170, 237, 210, 45);
        frame.getContentPane().add(btnItinerario);

        btnItinerario.addActionListener(new ActionListener() {
            private boolean buttonClicked = false;

            public void actionPerformed(ActionEvent e) {
                if (!buttonClicked) {
                    buttonClicked = true;
                    btnItinerario.setEnabled(false);

                    ViewCrudItinerario window = new ViewCrudItinerario();
                    window.getOriginFrame().setVisible(true);
                    window.getOriginFrame().addWindowListener(new WindowAdapter() {
                        @Override
                        public void windowClosed(WindowEvent e) {
                            btnItinerario.setEnabled(true);
                            buttonClicked = false;
                        }
                    });
                }
            }
        });

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

    /**
     * Retorna o JFrame da tela.
     * 
     * @return o JFrame da tela
     */
    public JFrame getOriginFrame() {
        return frame;
    }
}
