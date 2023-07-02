/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Artur Pereira e Patrick Anderson
 */
public class Pessoa {    
    protected String endereco;
    protected String tel1;
    protected ArrayList<ReservaViagem> reservas = new ArrayList<>();


    /**
     * 
     * @return 
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * 
     * @param endereco 
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * 
     * @return 
     */
    public String getTel1() {
        return tel1;
    }

    /**
     * 
     * @param tel1 
     */
    public void setTel1(String tel1) {
        this.tel1 = tel1;
    }

    /**
     * 
     * @return 
     */
    public String getTel2() {
        return tel2;
    }

    /**
     * 
     * @param tel2 
     */
    public void setTel2(String tel2) {
        this.tel2 = tel2;
    }

    /**
     * 
     * @return 
     */
    public ArrayList<ReservaViagem> getReservas() {
        return reservas;
    }
    
}
