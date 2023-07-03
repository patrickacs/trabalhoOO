package model;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Classe que representa um voo.
 * Armazena informações sobre a data, número de poltronas, horário de partida, horário de chegada,
 * aeroporto de origem, aeroporto de chegada e descrição do avião.
 * Cada voo possui um ID único gerado automaticamente.
 * 
 * @author Patrick Anderson e Artur
 * @since 2023-07-02
 */
public class Voo {
    private String data;
    private int numPoltronas;
    private static final AtomicInteger count = new AtomicInteger(0);
    private final int id;
    private String horarioPartida;
    private String horarioChegada;
    private String aeroportoOrigem;
    private String aeroportoChegada;
    private String descricaoAviao;

    /**
     * Construtor da classe Voo.
     * 
     * @param data a data do voo
     * @param numPoltronas o número de poltronas do voo
     * @param horarioPartida o horário de partida do voo
     * @param horarioChegada o horário de chegada do voo
     * @param aeroportoOrigem o aeroporto de origem do voo
     * @param aeroportoChegada o aeroporto de chegada do voo
     * @param descricaoAviao a descrição do avião do voo
     */
    public Voo(String data, int numPoltronas, String horarioPartida, String horarioChegada, String aeroportoOrigem, String aeroportoChegada, String descricaoAviao) {
        id = count.incrementAndGet();
        this.data = data;
        this.numPoltronas = numPoltronas;
        this.horarioPartida = horarioPartida;
        this.horarioChegada = horarioChegada;
        this.aeroportoOrigem = aeroportoOrigem;
        this.aeroportoChegada = aeroportoChegada;
        this.descricaoAviao = descricaoAviao;
    }

    /**
     * Obtém a data do voo.
     * 
     * @return a data do voo
     */
    public String getData() {
        return data;
    }

    /**
     * Define a data do voo.
     * 
     * @param data a data a ser definida
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * Obtém o número de poltronas do voo.
     * 
     * @return o número de poltronas do voo
     */
    public int getNumPoltronas() {
        return numPoltronas;
    }

    /**
     * Define o número de poltronas do voo.
     * 
     * @param numPoltronas o número de poltronas a ser definido
     */
    public void setNumPoltronas(int numPoltronas) {
        this.numPoltronas = numPoltronas;
    }

    /**
     * Obtém o ID do voo.
     * 
     * @return o ID do voo
     */
    public int getId() {
        return id;
    }

    /**
     * Obtém o horário de partida do voo.
     * 
     * @return o horário de partida do voo
     */
    public String getHorarioPartida() {
        return horarioPartida;
    }

    /**
     * Define o horário de partida do voo.
     * 
     * @param horarioPartida o horário de partida a ser definido
     */
    public void setHorarioPartida(String horarioPartida) {
        this.horarioPartida = horarioPartida;
    }

    /**
     * Obtém o horário de chegada do voo.
     * 
     * @return o horário de chegada do voo
     */
    public String getHorarioChegada() {
        return horarioChegada;
    }

    /**
     * Define o horário de chegada do voo.
     * 
     * @param horarioChegada o horário de chegada a ser definido
     */
    public void setHorarioChegada(String horarioChegada) {
        this.horarioChegada = horarioChegada;
    }

    /**
     * Obtém o aeroporto de origem do voo.
     * 
     * @return o aeroporto de origem do voo
     */
    public String getAeroportoOrigem() {
        return aeroportoOrigem;
    }

    /**
     * Define o aeroporto de origem do voo.
     * 
     * @param aeroportoOrigem o aeroporto de origem a ser definido
     */
    public void setAeroportoOrigem(String aeroportoOrigem) {
        this.aeroportoOrigem = aeroportoOrigem;
    }

    /**
     * Obtém o aeroporto de chegada do voo.
     * 
     * @return o aeroporto de chegada do voo
     */
    public String getAeroportoChegada() {
        return aeroportoChegada;
    }

    /**
     * Define o aeroporto de chegada do voo.
     * 
     * @param aeroportoChegada o aeroporto de chegada a ser definido
     */
    public void setAeroportoChegada(String aeroportoChegada) {
        this.aeroportoChegada = aeroportoChegada;
    }

    /**
     * Obtém a descrição do avião do voo.
     * 
     * @return a descrição do avião do voo
     */
    public String getDescricaoAviao() {
        return descricaoAviao;
    }

    /**
     * Define a descrição do avião do voo.
     * 
     * @param descricaoAviao a descrição do avião a ser definida
     */
    public void setDescricaoAviao(String descricaoAviao) {
        this.descricaoAviao = descricaoAviao;
    }
    
    
    /**
     * Retorna uma representação em forma de String do voo.
     * 
     * @return a representação em forma de String do voo
     */
    @Override
    public String toString() {
        String retorno = this.aeroportoOrigem +
                " -> " + this.aeroportoChegada +
                " (" + data + ")";
        return retorno;
    }

}
