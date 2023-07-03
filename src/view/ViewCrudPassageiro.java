package view;

import java.awt.event.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;

/**
 * Classe responsável pela interface gráfica da tela de CRUD de Passageiros.
 * 
 * Autor: Artur Pereira e Patrick Anderson
 * Desde: versão 1
 */

public class ViewCrudPassageiro {
    private JFrame frame;
    private JButton btnEditar;
    private JButton btnCriar;
    private JLabel background;
    private JLabel lblOOAirlines;
    private JButton btnRemover;
    private JButton btnSair;
    
    
    /**
     * Construtor da classe ViewCrudPassageiro, onde é criada a interface gráfica.
     */
    public ViewCrudPassageiro() {
        frame = new JFrame();
        frame.setBounds(150, 150, 408, 407);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        frame.setLocationRelativeTo(null);

        /**
         * Botão Criar
         */
        btnCriar = new JButton("Criar");
        btnCriar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ViewPassageiros passageirosWindow = new ViewPassageiros();
                passageirosWindow.getOriginFrame().setVisible(true);
                frame.dispose(); // Fecha a tela atual
            }
        });
        btnCriar.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
        btnCriar.setBounds(91, 129, 210, 45);
        frame.getContentPane().add(btnCriar);


        /**
         * Botão Editar
         */
        btnEditar = new JButton("Editar");
        btnEditar.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
        btnEditar.setBounds(91, 185, 210, 45);
        frame.getContentPane().add(btnEditar);
        
        /**
         * Label OOAirlines
         */
        lblOOAirlines = new JLabel("Passageiro");
        lblOOAirlines.setFont(new Font("Segoe UI Semibold", Font.BOLD, 32));
        lblOOAirlines.setBounds(108, 32, 193, 61);
        frame.getContentPane().add(lblOOAirlines);
        
        /**
         * Botão Remover
         */
        btnRemover = new JButton("Remover");
        btnRemover.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Adicione aqui o código para remover um passageiro
            }
        });
        btnRemover.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
        btnRemover.setBounds(91, 241, 210, 45);
        frame.getContentPane().add(btnRemover);
        
        /**
         * Botão Sair
         */
        btnSair = new JButton("Sair");
        btnSair.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose(); // Fecha a janela atual
            }
        });
        btnSair.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
        btnSair.setBounds(91, 297, 210, 45);
        frame.getContentPane().add(btnSair);
        
        background = new JLabel("");
        background.setBounds(-51, -74, 875, 843);
        frame.getContentPane().add(background);                
    }

    /**
     * Retorna o JFrame da janela principal.
     */
    public JFrame getOriginFrame() {
        return frame;
    }
}
