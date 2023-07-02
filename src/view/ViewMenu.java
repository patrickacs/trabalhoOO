package view;



import controller.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;


/**
 * Classe respons√°vel pela interface gr√°fica da tela inicial
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
     * Construtor da classe ViewFirstScreen, onde √© criada a interface gr√°fica.
     */
    public ViewMenu() {
        frame = new JFrame();
        frame.setBounds(150, 150, 600, 550);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        frame.setLocationRelativeTo(null);
 
        /**
         * Bot„o Passageiros
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
                            btnPassageiros.setEnabled(true); // Reativa o bot„o quando a janela de passageiros for fechada
                            buttonClicked = false; // Reseta o estado do bot„o
                        }
                    });

                    // Adicione o cÛdigo adicional aqui, se necess·rio
                }
            }
        });

        /**
         * Bot„o Reservas
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
                            btnReservas.setEnabled(true); // Reativa o bot„o quando a janela de reservas for fechada
                            buttonClicked = false; // Reseta o estado do bot„o
                        }
                    });
                    
                    // Adicione cÛdigo adicional aqui, se necess·rio
                    
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
         * Bot√£o Itinerario
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
                            btnItinerario.setEnabled(true); // Reativa o bot„o quando a janela de itiner·rio for fechada
                            buttonClicked = false; // Reseta o estado do bot„o
                        }
                    });

                    // Adicione cÛdigo adicional aqui, se necess·rio

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

    // leva a tela
    public JFrame getOriginFrame() {
        return frame;
    }
}