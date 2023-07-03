package model;

import java.util.ArrayList;

/**
 * Classe abstrata que representa uma pessoa.
 * 
 * @author Patrick Anderson e Artur
 * @since 2023-07-02
 */
public abstract class Pessoa {    
    protected String endereco;
    protected String tel1;
    protected ArrayList<Voo> reservas = new ArrayList<>();

    /**
     * Obtém o endereço da pessoa.
     * 
     * @return o endereço da pessoa
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * Define o endereço da pessoa.
     * 
     * @param endereco o endereço a ser definido
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * Obtém o telefone da pessoa.
     * 
     * @return o telefone da pessoa
     */
    public String getTel1() {
        return tel1;
    }

    /**
     * Define o telefone da pessoa.
     * 
     * @param tel1 o telefone a ser definido
     */
    public void setTel1(String tel1) {
        this.tel1 = tel1;
    }

    /**
     * Obtém as reservas da pessoa.
     * 
     * @return as reservas da pessoa
     */
    public ArrayList<Voo> getReservas() {
        return reservas;
    }

    /**
     * Adiciona uma reserva à pessoa.
     * 
     * @param voo a reserva a ser adicionada
     */
    public void addReserva(Voo voo) {
        this.reservas.add(voo);
    }
}
