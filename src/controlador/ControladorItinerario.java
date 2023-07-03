package controlador;

import dados.Banco;
import model.Voo;
import java.util.ArrayList;

/**
 * Classe controladora responsável por gerenciar os itinerários dos voos.
 */
public class ControladorItinerario {

    private Banco banco;

    /**
     * Construtor da classe ControladorItinerario.
     * Inicializa o banco de dados.
     */
    public ControladorItinerario() {
        this.banco = Banco.getInstance();
    }

    /**
     * Cria um novo voo com os dados fornecidos e o adiciona ao banco de dados.
     *
     * @param data             Data do voo
     * @param numPoltronas     Número de poltronas disponíveis no voo
     * @param horarioPartida   Horário de partida do voo
     * @param horarioChegada   Horário de chegada do voo
     * @param aeroportoOrigem  Aeroporto de origem do voo
     * @param aeroportoChegada Aeroporto de chegada do voo
     * @param descricaoAviao   Descrição do avião utilizado no voo
     */
    public void criaVoo(String data, int numPoltronas, String horarioPartida, String horarioChegada, String aeroportoOrigem, String aeroportoChegada, String descricaoAviao) {

        Voo voo = new Voo(data, numPoltronas, horarioPartida, horarioChegada, aeroportoOrigem, aeroportoChegada, descricaoAviao);

        banco.addVoo(voo);
    }

    /**
     * Pesquisa os voos com base nos parâmetros fornecidos.
     * Os parâmetros podem ser vazios para buscar todos os voos disponíveis.
     *
     * @param origem   Aeroporto de origem do voo
     * @param destino  Aeroporto de chegada do voo
     * @param data     Data do voo
     * @return Uma lista de voos encontrados com base nos parâmetros de pesquisa
     */
    public ArrayList<Voo> pesquisarVoos(String origem, String destino, String data) {
        ArrayList<Voo> voos = banco.getVoos();
        ArrayList<Voo> voosEncontrados = new ArrayList<>();

        for (Voo voo : voos) {
            if ((origem.isEmpty() || voo.getAeroportoOrigem().equals(origem))
                    && (destino.isEmpty() || voo.getAeroportoChegada().equals(destino))
                    && (data.isEmpty() || voo.getData().equals(data))) {

                voosEncontrados.add(voo);
            }
        }

        return voosEncontrados;
    }

    /**
     * Lista todos os voos disponíveis no banco de dados.
     *
     * @return Uma lista de todos os voos disponíveis
     */
    public ArrayList<Voo> listarVoos() {
        return banco.getVoos();
    }
}
