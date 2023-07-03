/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dados;

import java.util.ArrayList;
import java.util.Hashtable;
import model.PessoaFisica;
import model.PessoaJuridica;
import model.Voo;

/**
 * Classe responsável por armazenar os dados do sistema.
 */
public class Banco {

    private Hashtable<String, PessoaFisica> pessoaFisicaHTable;
    private Hashtable<String, PessoaJuridica> pessoaJuridicaHTable;
    private ArrayList<Voo> arrayVoos;

    private Banco() {
        this.pessoaFisicaHTable = new Hashtable<>();
        this.pessoaJuridicaHTable = new Hashtable<>();
        this.arrayVoos = new ArrayList<>();
    }

    private static Banco instancia;

    /**
     * Obtém a instância única da classe Banco.
     *
     * @return a instância da classe Banco.
     */
    public static Banco getInstance() {
        if (instancia == null) {
            instancia = new Banco();
        }
        return instancia;
    }

    /**
     * Obtém a tabela de pessoas físicas.
     *
     * @return a tabela de pessoas físicas.
     */
    public Hashtable<String, PessoaFisica> getPessoasFisicas() {
        return this.pessoaFisicaHTable;
    }

    /**
     * Obtém a tabela de pessoas jurídicas.
     *
     * @return a tabela de pessoas jurídicas.
     */
    public Hashtable<String, PessoaJuridica> getPessoasJuridicas() {
        return this.pessoaJuridicaHTable;
    }

    /**
     * Obtém a lista de voos reservados.
     *
     * @return a lista de voos reservados.
     */
    public ArrayList<Voo> getReservavoo() {
        return this.arrayVoos;
    }

    /**
     * Adiciona um voo à lista de voos.
     *
     * @param voo o voo a ser adicionado.
     */
    public void addVoo(Voo voo) {
        this.arrayVoos.add(voo);
    }

    /**
     * Obtém a lista de voos.
     *
     * @return a lista de voos.
     */
    public ArrayList<Voo> getVoos() {
        return this.arrayVoos;
    }

    /**
     * Adiciona uma pessoa física à tabela de pessoas físicas.
     *
     * @param pessoaFisica a pessoa física a ser adicionada.
     */
    public void addPessoaFisica(PessoaFisica pessoaFisica) {
        this.pessoaFisicaHTable.put(pessoaFisica.getCPF(), pessoaFisica);
    }

    /**
     * Adiciona uma pessoa jurídica à tabela de pessoas jurídicas.
     *
     * @param pessoaJuridica a pessoa jurídica a ser adicionada.
     */
    public void addPessoaJuridica(PessoaJuridica pessoaJuridica) {
        this.pessoaJuridicaHTable.put(pessoaJuridica.getCNPJ(), pessoaJuridica);
    }
}
