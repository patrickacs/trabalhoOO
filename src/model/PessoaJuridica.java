package model;

/**
 * Classe que representa uma pessoa jurídica.
 * Herda os atributos e métodos da classe Pessoa.
 * 
 * @author Patrick Anderson e Artur
 * @since 2023-07-02
 */
public class PessoaJuridica extends Pessoa {
    private String CNPJ;
    private String razaoSocial;    
    
    /**
     * Construtor da classe PessoaJuridica.
     * 
     * @param razaoSocial a razão social da pessoa jurídica
     * @param CNPJ o CNPJ da pessoa jurídica
     * @param endereco o endereço da pessoa jurídica
     * @param tel1 o primeiro telefone da pessoa jurídica
     * @param tel2 o segundo telefone da pessoa jurídica
     */
    public PessoaJuridica(String razaoSocial, String CNPJ, String endereco, String tel1, String tel2){
        this.razaoSocial = razaoSocial;
        this.CNPJ = CNPJ;
        this.endereco = endereco;
        this.tel1 = tel1;
    }
    
    /**
     * Construtor da classe PessoaJuridica.
     * 
     * @param razaoSocial a razão social da pessoa jurídica
     * @param CNPJ o CNPJ da pessoa jurídica
     * @param endereco o endereço da pessoa jurídica
     * @param tel1 o telefone da pessoa jurídica
     */
    public PessoaJuridica(String razaoSocial, String CNPJ, String endereco, String tel1){
        this.razaoSocial = razaoSocial;
        this.CNPJ = CNPJ;
        this.endereco = endereco;
        this.tel1 = tel1;
    }
    
    /**
     * Construtor da classe PessoaJuridica.
     * 
     * @param razaoSocial a razão social da pessoa jurídica
     * @param CNPJ o CNPJ da pessoa jurídica
     * @param endereco o endereço da pessoa jurídica
     */
    public PessoaJuridica(String razaoSocial, String CNPJ, String endereco){
        this.razaoSocial = razaoSocial;
        this.CNPJ = CNPJ;
        this.endereco = endereco;
    }
    
    /**
     * Construtor da classe PessoaJuridica.
     */
    public PessoaJuridica() {}

    /**
     * Obtém o CNPJ da pessoa jurídica.
     * 
     * @return o CNPJ da pessoa jurídica
     */
    public String getCNPJ() {
        return CNPJ;
    }

    /**
     * Define o CNPJ da pessoa jurídica.
     * 
     * @param CNPJ o CNPJ a ser definido
     */
    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    /**
     * Obtém a razão social da pessoa jurídica.
     * 
     * @return a razão social da pessoa jurídica
     */
    public String getRazaoSocial() {
        return razaoSocial;
    }

    /**
     * Define a razão social da pessoa jurídica.
     * 
     * @param razaoSocial a razão social a ser definida
     */
    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

}
