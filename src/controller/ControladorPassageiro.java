/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dados.Banco;
import model.PessoaFisica;
import model.PessoaJuridica;
import Telas.Clientes;
import javax.swing.JOptionPane;
import java.util.Hashtable;

/**
 *
 * @author Artur Pereira e Patrick Anderson
 */
public class ControladorPassageiro extends TelaClientes {
     private Banco banco;

    public ControladorPassageiro(byte opt) {
        super(opt);
        verificaOperacao();
    }

    /**
     * Verifica a operação que foi passada para a nova tela
     * de aviões e faz as devidas alterações.
     */
    private void verificaOperacao() {
        switch (opt) {
            case NOVO:
                caseNovo();
                break;
            case EDITAR:
                caseEditar();
                break;
            case REMOVER:
                caseRemover();
                break;
        }
    }
    
    /**
     * Se a operação é NOVO, altera o texto, habilita o botão
     * btnConsulta e chama habilitaItems().
     */
    private void caseNovo() {
        getLabelTitulo().setText("Novo cliente");
        getBtnConsulta().setEnabled(false);
        habilitaItems();
    }

    /**
     * Se a operação é EDITAR, altera o texto e chama desabilitaItems().
     */
    private void caseEditar() {
        getLabelTitulo().setText("Editar cliente");
        desabilitaItems();

    }

    /**
     * Se a operação é REMOVER, altera o texto e chama desabilitaItems().
     */
    private void caseRemover() {
        getLabelTitulo().setText("Remover cliente");
        desabilitaItems();
    }

    /**
     * Habilita os campos:
     * 
     * - campoNome
     * - campoEndereco1
     * - campoTel1
     * - campoTel2
     * 
     * Se o documento selecionado no ComboBox cbDocumento
     * é CNPJ, altera labelNome e desabilita:
     * 
     * - cbSexo
     * -campoNascimento
     * 
     * Se não for CNPJ, altera labelNome e habilita:
     * 
     * - cbSexo
     * - campoNascimento
     */
    private void habilitaItems() {
        getCampoNome().setEnabled(true);
        getCampoEndereco1().setEnabled(true);
        getCampoTel1().setEnabled(true);
        getCampoTel2().setEnabled(true);
        if (getCbDocumento().getSelectedIndex() == CNPJ) {
            getCbSexo().setEnabled(false);
            getCampoNascimento().setEnabled(false);
            getLabelNome().setText("Razão social:");
            docOpt = CNPJ;
        } else {
            getCbSexo().setEnabled(true);
            getCampoNascimento().setEnabled(true);
            getLabelNome().setText("Nome:");
            docOpt = CPF;

        }
    }
    /**
     * Desabilita os campos:
     * 
     * - campoNome
     * - campoEndereco1
     * - campoTel1
     * - campoTel2
     * 
     * Se o documento selecionado no ComboBox cbDocumento
     * é CNPJ, altera labelNome e desabilita:
     * 
     * - cbSexo
     * - campoNascimento
     * 
     * Se não for CNPJ, altera labelNome e habilita:
     * 
     * - cbSexo
     * - campoNascimento
     * 
     */
    private void desabilitaItems() {
        getCampoNome().setEnabled(false);
        getCampoEndereco1().setEnabled(false);
        getCampoTel1().setEnabled(false);
        getCampoTel2().setEnabled(false);
        if (getCbDocumento().getSelectedIndex() == CNPJ) {
            getCbSexo().setEnabled(false);
            getCampoNascimento().setEnabled(false);
            getLabelNome().setText("Razão social:");
        } else {
            getCbSexo().setEnabled(false);
            getCampoNascimento().setEnabled(false);
            getLabelNome().setText("Nome:");

        }
    }

    
    /**
     * Faz a consulta de pessoa física e preenche os campos da tela.
     */
    public void consultaPessoaFisica() {
        
        this.banco = Banco.getInstance();
        Hashtable<String,PessoaFisica> pessoasfisica = this.banco.getPessoasFisicas();
        PessoaFisica cliente = (PessoaFisica) pessoasfisica.get(getCampoDocumento().getText());
        if (cliente == null) {
            clienteNaoEncontrado();
            return;
        }
        getCampoDocumento().setText(cliente.getCPF());
        getCampoEndereco1().setText(cliente.getEndereco());
        getCampoNascimento().setText(cliente.getNascimento());
        getCampoNome().setText(cliente.getNome());
        getCampoTel1().setText(cliente.getTel1());
        getCampoTel2().setText(cliente.getTel2());
    }

    
    /**
     * Faz a consulta de pessoa jurídica e preenche os campos da tela.
     */
    public void consultaPessoaJuridica() {
        
        this.banco = Banco.getInstance();
        Hashtable<String,PessoaJuridica> pessoasjuridica = this.banco.getPessoasJuridicas();
        PessoaJuridica cliente = (PessoaJuridica) pessoasjuridica.get(getCampoDocumento().getText());
        if (cliente == null) {
            clienteNaoEncontrado();
            return;
        }
        getCampoDocumento().setText(cliente.getCNPJ());
        getCampoEndereco1().setText(cliente.getEndereco());
        getCampoNome().setText(cliente.getRazaoSocial());
        getCampoTel1().setText(cliente.getTel1());
        getCampoTel2().setText(cliente.getTel2());
    }

    /**
     * Verifica a intenção do usuário (NOVO, EDITAR, REMOVER)
     * e o tipo de documento selecionado para então realizar 
     * as devidas alterações.
     * @param docOpt
     * @param opt 
     */
    public void verificaAoConfirmar(byte docOpt, byte opt) {
         this.banco = Banco.getInstance();
         Hashtable<String,PessoaFisica> pessoasfisica = this.banco.getPessoasFisicas();
         Hashtable<String,PessoaJuridica> pessoasjuridica = this.banco.getPessoasJuridicas();
         
        switch (docOpt) {
            case CPF:
                switch (opt) {
                    case NOVO:
                        inserePessoaFisica();
                        break;
                    case EDITAR:
                        editaPessoaFisica();
                        break;
                    case REMOVER:
                        pessoasfisica.remove(getCampoDocumento().getText());
                        break;
                }
                break;
            case CNPJ:
                switch (opt) {
                    case NOVO:
                        inserePessoaJuridica();
                        break;
                    case EDITAR:
                        editaPessoaJuridica();
                        break;
                    case REMOVER:
                        pessoasjuridica.remove(getCampoDocumento().getText());
                        break;
                }
                break;
        }
    }
    
    
    /**
     * Insere nova pessoa física na HashTable da entidade Aerobus.
     */
    public void inserePessoaFisica() {
        
        this.banco = Banco.getInstance();
        Hashtable<String,PessoaFisica> pessoasfisica = this.banco.getPessoasFisicas();
        
        // Verifica se já existe cliente cadastrado com o CPF dado
        if (pessoasfisica.get(getCampoDocumento().getText()) != null) {
            return;
        }

        // Cria uma nova pessoa fisica
        PessoaFisica cliente = new PessoaFisica(getCampoNome().getText(),
                getCampoDocumento().getText(), getCampoEndereco1().getText());

        // Define os campos da pessoa fisica
        cliente.setNascimento(getCampoNascimento().getText());
        cliente.setSexo((byte) getCbSexo().getSelectedIndex());
        cliente.setTel1(getCampoTel1().getText());
        cliente.setTel2(getCampoTel2().getText());

        // Insere na hash table
        pessoasfisica.put(getCampoDocumento().getText(), cliente);
    }
    
    /**
     * Altera as informações de uma pessoa física já existente.
     */
    public void editaPessoaFisica() {
        
        this.banco = Banco.getInstance();
        Hashtable<String,PessoaFisica> pessoasfisica = this.banco.getPessoasFisicas();
        // Consulta na hash table
        PessoaFisica cliente = (PessoaFisica) pessoasfisica.get(getCampoDocumento().getText());

        // Define as alterações no cliente
        cliente.setNome(getCampoNome().getText());
        cliente.setEndereco(getCampoEndereco1().getText());
        cliente.setNascimento(getCampoNascimento().getText());
        cliente.setSexo((byte) getCbSexo().getSelectedIndex());
        cliente.setTel1(getCampoTel1().getText());
        cliente.setTel2(getCampoTel2().getText());

        pessoasfisica.replace(getCampoDocumento().getText(), cliente);
    }
    /**
     * Exibe uma tela de aviso que o cliente não foi encontrado.
     */
    private void clienteNaoEncontrado() {
        JOptionPane.showMessageDialog(null, "Cliente não encontrado.\n");
        dispose();
    }
    
    /**
     * Insere nova pessoa jurídica na HashTable da entidade Aerobus.
     */
    private void inserePessoaJuridica() {
        
         this.banco = Banco.getInstance();
         Hashtable<String,PessoaJuridica> pessoasjuridica = this.banco.getPessoasJuridicas();
         
        // Verifica se já existe pessoa jurídica a partir do CNPJ dado.
        if (pessoasjuridica.get(getCampoDocumento().getText()) != null) {
            return;
        }

        // Cria uma nova pessoa jurídica
        PessoaJuridica cliente = new PessoaJuridica(getCampoNome().getText(),
                getCampoDocumento().getText(), getCampoEndereco1().getText());

        // Define os campos da pessoa jurídica
        cliente.setTel1(getCampoTel1().getText());
        cliente.setTel2(getCampoTel2().getText());

        // Insere novo cliente na hash table
        pessoasjuridica.put(cliente.getCNPJ(), cliente);

    }

    /**
     * Altera as informações de uma pessoa jurídica já existente.
     */
    private void editaPessoaJuridica() {
        
         this.banco = Banco.getInstance();
         Hashtable<String,PessoaJuridica> pessoasjuridica = this.banco.getPessoasJuridicas();
         
        // Consulta na hash table
        PessoaJuridica cliente = pessoasjuridica.get(getCampoDocumento().getText());

        // Define as alterações no cliente
        cliente.setEndereco(getCampoEndereco1().getText());
        cliente.setTel1(getCampoTel1().getText());
        cliente.setTel2(getCampoTel2().getText());

        pessoasjuridica.replace(cliente.getCNPJ(), cliente);
    }
    
    /**
     * Verifica a validade da busca por CPF ou CNPJ e chama o devido método
     * de consulta.
     */
    @Override
    public void btnConsultaAcao() {
        if ("".equals(getCampoDocumento().getText())) return;
        if (getCampoDocumento().getText().length() != 11 && docOpt == CPF) {
            JOptionPane.showMessageDialog(null, "Favor inserir CPF válido.");
            return;
        }
        if ("".equals(getCampoDocumento().getText())) return;
        if (getCampoDocumento().getText().length() != 14 && docOpt == CNPJ) {
            JOptionPane.showMessageDialog(null, "Favor inserir CNPJ válido.");
        }
  
        
        if (docOpt == CPF) consultaPessoaFisica();
        if (docOpt == CNPJ) consultaPessoaJuridica();
        
        if (opt != REMOVER) {
            habilitaItems();
        }
        getCbDocumento().setEnabled(false);
        getCampoDocumento().setEnabled(false);
        getBtnConsulta().setEnabled(false);
    }
    
    /**
     * Verifica a validade das informações inseridas nos campos e chama
     * verificaAoConfirmar(docOpt, opt).
     */
    @Override
    public void btnConfirmarAcao() {
        if ("".equals(getCampoDocumento().getText()) || "".equals(getCampoNome().getText()) || "".equals(getCampoEndereco1().getText())) {
            JOptionPane.showMessageDialog(null, "Campos obrigatórios: documento, nome/razão social e endereço.\n");
            dispose();
        }
        
        if (getCampoDocumento().getText().length() != 11 && docOpt == CPF) {
            JOptionPane.showMessageDialog(null, "Favor inserir CPF válido.");
            return;
        }

        if (getCampoDocumento().getText().length() != 14 && docOpt == CNPJ) {
            JOptionPane.showMessageDialog(null, "Favor inserir CNPJ válido.");
        }
        verificaAoConfirmar(docOpt, opt);
        dispose();
    }
    
    /**
     * Altera a labelNome de acordo com o tipo de documento.
     */
    @Override
    protected void cbDocumentoAcao() {
        if (getCbDocumento().getSelectedIndex() == CPF) {
           getLabelNome().setText("Nome:");
           docOpt = CPF;
       }
       else {
           getLabelNome().setText("Razão social:");
           docOpt = CNPJ;
       }
       if (opt == NOVO) {
           habilitaItems();
       }
    }
    
}
