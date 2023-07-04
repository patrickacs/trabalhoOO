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
 * Classe respons�vel por armazenar os dados do sistema.
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
     * Obt�m a inst�ncia �nica da classe Banco.
     *
     * @return a inst�ncia da classe Banco.
     */
    public static Banco getInstance() {
        if (instancia == null) {
            instancia = new Banco();
        }
        return instancia;
    }

    /**
     * Obt�m a tabela de pessoas f�sicas.
     *
     * @return a tabela de pessoas f�sicas.
     */
    public Hashtable<String, PessoaFisica> getPessoasFisicas() {
        return this.pessoaFisicaHTable;
    }

    /**
     * Obt�m a tabela de pessoas jur�dicas.
     *
     * @return a tabela de pessoas jur�dicas.
     */
    public Hashtable<String, PessoaJuridica> getPessoasJuridicas() {
        return this.pessoaJuridicaHTable;
    }

    /**
     * Obt�m a lista de voos reservados.
     *
     * @return a lista de voos reservados.
     */
    public ArrayList<Voo> getReservavoo() {
        return this.arrayVoos;
    }

    /**
     * Adiciona um voo � lista de voos.
     *
     * @param voo o voo a ser adicionado.
     */
    public void addVoo(Voo voo) {
        this.arrayVoos.add(voo);
    }

    /**
     * Obt�m a lista de voos.
     *
     * @return a lista de voos.
     */
    public ArrayList<Voo> getVoos() {
        return this.arrayVoos;
    }

    /**
     * Adiciona uma pessoa f�sica � tabela de pessoas f�sicas.
     *
     * @param pessoaFisica a pessoa f�sica a ser adicionada.
     */
    public void addPessoaFisica(PessoaFisica pessoaFisica) {
        this.pessoaFisicaHTable.put(pessoaFisica.getCPF(), pessoaFisica);
    }

    /**
     * Adiciona uma pessoa jur�dica � tabela de pessoas jur�dicas.
     *
     * @param pessoaJuridica a pessoa jur�dica a ser adicionada.
     */
    public void addPessoaJuridica(PessoaJuridica pessoaJuridica) {
        this.pessoaJuridicaHTable.put(pessoaJuridica.getCNPJ(), pessoaJuridica);
    }


    public void removeVoo(int index) {
        
        this.arrayVoos.remove(index);

    }

    public void editaVoo(String horarioPartida, String horarioChegada, String data, int index) {

        Voo voo = this.arrayVoos.get(index);

        voo.setHorarioPartida(horarioPartida);
        voo.setHorarioChegada(horarioChegada);
        voo.setData(data);

        System.out.println(voo.getHorarioPartida());
        System.out.println(voo.getHorarioChegada());
        System.out.println(voo.getData());

        this.arrayVoos.set(index, voo);

    }
}
