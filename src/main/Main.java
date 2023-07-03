package main;

import controlador.ControladorItinerario;
import view.ViewMenu;
/*
 * Simulação das listas nos códigos
 */
public class Main {
    public static void main(String[] args) {
        ControladorItinerario controladorItinerario = new ControladorItinerario();
        controladorItinerario.criaVoo("Congonhas", 12, "10/12/2002", "CORONEL", "Corumbá", "Rio de Janeiro", "ASIDJSAD");
        controladorItinerario.criaVoo("Congonhas", 12, "10/12/2002", "CORONEL", "Corumbá", "Rio de Janeiro", "ASIDJSAD");
        controladorItinerario.criaVoo("Costa Rica", 12, "10/12/2002", "Lurdes", "Corumbá", "Rio de Janeiro", "ASIDJSAD");
        controladorItinerario.criaVoo("Congonhas", 12, "10/12/2002", "CORONEL", "Corumbá", "Rio de Janeiro", "ASIDJSAD");
        controladorItinerario.criaVoo("Congonhas", 12, "10/12/2002", "LS", "Corumbá", "Rio de Janeiro", "ASIDJSAD");
        controladorItinerario.criaVoo("Mangue", 12, "10/12/2002", "CORONEL", "Corumbá", "Rio de Janeiro", "ASIDJSAD");
        controladorItinerario.criaVoo("Congonhas", 12, "10/12/2002", "CORONEL", "Corumbá", "Rio de Janeiro", "ASIDJSAD");
        ViewMenu window = new ViewMenu();
        window.getOriginFrame().setVisible(true);
    }
}
