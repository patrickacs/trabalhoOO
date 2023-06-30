/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dados;

/**
 *
 * @author pande
 */

import java.util.ArrayList;
import java.util.Hashtable;
import Entidades.PessoaFisica;
import Entidades.PessoaJuridica;
import Entidades.DescricaoVoo;
import Entidades.Voo;
import Entidades.DescricaoAviao;
import Entidades.Aeroporto;


public class Banco {
    
    
    
   private Hashtable<String,PessoaFisica> pessoaFisicaHTable;
   private Hashtable<String,PessoaJuridica> pessoaJuridicaHTable;
   private ArrayList<DescricaoVoo> arrayDescricaoVoos;
   private ArrayList<Voo> arrayVoos;
   private ArrayList<DescricaoAviao> arrayDescricaoAviao;
   private ArrayList<Aeroporto> arrayAeroporto;
    
    
    private Banco (){
    
       this.pessoaFisicaHTable = new Hashtable <>();
       this.pessoaJuridicaHTable = new Hashtable <>();
       this.arrayDescricaoVoos = new ArrayList<>();
       this.arrayVoos = new ArrayList<>();
       this.arrayDescricaoAviao = new ArrayList<>();
       this.arrayAeroporto = new ArrayList<>();
        
        
    }
    private static Banco instancia;

/**
 * Obtém a instância única da classe Database.
 *
 * @return a instância da classe Database.
 */
public static Banco getInstance() {
    if (instancia == null) {
        instancia = new Banco();
    }
    return instancia;
}
public ArrayList<Aeroporto> getAeroportos(){
 
    return this.arrayAeroporto;
}
 public Hashtable<String,PessoaFisica> getPessoasFisicas(){
     
     return this.pessoaFisicaHTable;
 }
public Hashtable<String,PessoaJuridica> getPessoasJuridicas(){
     
     return this.pessoaJuridicaHTable;
 }
public ArrayList<Voo> getReservavoo(){
    
    return this.arrayVoos;
}
public ArrayList<DescricaoAviao> getDescricaoAviao(){
    
    return this.arrayDescricaoAviao;
}
}

