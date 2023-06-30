/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import Dados.Banco;
import Entidades.Aeroporto;
import javax.swing.JOptionPane;
import java.util.ArrayList;

/**
 *
 * @author marcos
 */
public class NegocioAeroporto extends Telas.TelaAeroportos {
    
    private Banco banco;
    
    public NegocioAeroporto(byte opt) {
        super(opt);
        verificaOperacao();
        addAeroportoCb();
    }
    
    /**
     * Verifica a operação que foi passada para a nova tela
     * de aeroportos e faz as devidas alterações.
     */
    private void verificaOperacao() {
         switch(opt) {
            case NOVO: caseNovo(); break;
            case EDITAR: caseEditar(); break;
            case REMOVER: caseRemover(); break;
        }
    }
    
    /**
     * Se a operação é NOVO, altera o texto e desabilita o ComboBox.
     */
    protected void caseNovo() {
        getLabelTitulo().setText("Novo aeroporto");
        getCbAeroporto().setEnabled(false);
    }
    
    /**
     * Se a operação é EDITAR, altera o texto e chama
     * desabilitaItems().
     * 
     */
    protected void caseEditar() {
        getLabelTitulo().setText("Editar aeroporto");
        desabilitaItems();
    }
    
    /**
     * Se a operação é REMOVER, altera o texto e chama
     * desabilitaItems().
     */
    protected void caseRemover() {
        getLabelTitulo().setText("Remover aeroporto");
        desabilitaItems();
    }
    
    /**
     * Habilita os campos:
     * - campoCidade
     * - campoCodigo
     * - campoNome.
     */
    protected void habilitaItems() {
        getCampoCidade().setEnabled(true);
        getCampoCodigo().setEnabled(true);
        getCampoNome().setEnabled(true);
           
    }
    
    /**
     * Desabilita os campos:
     * - campoCidade
     * - campoCodigo
     * - campoNome.
     */
    protected void desabilitaItems() {
        getCampoCidade().setEnabled(false);
        getCampoCodigo().setEnabled(false);
        getCampoNome().setEnabled(false);
    }
    
    
    /**
     * Adiciona todos os aeroportos cadastrados ao
     * ComboBox cbAeroporto.
     */
    public void addAeroportoCb() {
            this.banco = Banco.getInstance();
            ArrayList<Aeroporto> aeroportos = this.banco.getAeroportos();
            for(int i = 0; i < aeroportos.size(); i++) {
            Aeroporto tmp = aeroportos.get(i);
            getCbAeroporto().addItem(tmp.toString());
            
        }
    }
    
    /**
     * Identifica a opção selecionada no ComboBox
     * cbAeroporto e carrega as informações do
     * devido aeroporto nos campos.
     */
    @Override
    public void cbAeroportoAcao() {
         this.banco = Banco.getInstance();
            ArrayList<Aeroporto> aeroportos = this.banco.getAeroportos();
        int option = getCbAeroporto().getSelectedIndex();
        if (option != -1) {
           aeroporto = aeroportos.get(option-1);
           getCampoCidade().setText(aeroporto.getCidade());
           getCampoCodigo().setText(aeroporto.getCodigo());
           getCampoNome().setText(aeroporto.getNome());
           habilitaItems();
        }
        if (option == -1 || opt == REMOVER) desabilitaItems();
    }
    
    /**
     * Verifica qual é a intenção do usuário (NOVO, EDITAR, REMOVER)
     * e faz as devidas alterações.
     */
    @Override
    public void btnConfirmarAcao() {
        this.banco = Banco.getInstance();
        ArrayList<Aeroporto> aeroportos = this.banco.getAeroportos();
        String nome = getCampoNome().getText();
        String cidade = getCampoCidade().getText();
        String codigo = getCampoCodigo().getText();
        
        if ((opt == NOVO || opt == EDITAR) && 
           (nome.equals("") || cidade.equals("") || codigo.equals(""))) {
            JOptionPane.showMessageDialog(null, "Todos os campos são obrigatórios.\n");
            dispose();
        }
        switch(opt) {
            case NOVO:
                aeroporto = new Aeroporto(codigo, nome, cidade);
                aeroportos.add(aeroporto);
                break;
            case EDITAR:
                aeroporto = aeroportos.get(getCbAeroporto().getSelectedIndex()-1);
                aeroporto.setCidade(cidade);
                aeroporto.setNome(nome);
                aeroporto.setCodigo(codigo);
                break;
            case REMOVER:
                aeroportos.remove(getCbAeroporto().getSelectedIndex()-1);
        }
        dispose();
    }
    
}
