package model;

/**
 * Classe que representa uma pessoa física.
 * Herda os atributos e métodos da classe Pessoa.
 * 
 * @author Patrick Anderson
 * @since 2023-07-02
 */
public class PessoaFisica extends Pessoa {
    private static final byte M = 0;
    private static final byte F = 1;
    
    private String nome;
    private String CPF;
    private byte sexo;
    private String nascimento;
    
    /**
     * Construtor da classe PessoaFisica.
     * 
     * @param nome o nome da pessoa física
     * @param CPF o CPF da pessoa física
     * @param endereco o endereço da pessoa física
     * @param sexo o sexo da pessoa física
     * @param nascimento a data de nascimento da pessoa física
     * @param tel1 o telefone da pessoa física
     */
    public PessoaFisica(String nome, String CPF, String endereco, byte sexo, String nascimento, String tel1) {
        this.nome = nome;
        this.CPF = CPF;
        this.endereco = endereco;
        this.sexo = sexo;
        this.nascimento = nascimento;
        this.tel1 = tel1;
    }
    
    /**
     * Construtor da classe PessoaFisica.
     * 
     * @param nome o nome da pessoa física
     * @param CPF o CPF da pessoa física
     * @param endereco o endereço da pessoa física
     * @param sexo o sexo da pessoa física
     * @param nascimento a data de nascimento da pessoa física
     */
    public PessoaFisica(String nome, String CPF, String endereco, byte sexo, String nascimento) {
        this.nome = nome;
        this.CPF = CPF;
        this.endereco = endereco;
        this.sexo = sexo;
        this.nascimento = nascimento;
    }
    
    /**
     * Construtor da classe PessoaFisica.
     * 
     * @param nome o nome da pessoa física
     * @param CPF o CPF da pessoa física
     * @param endereco o endereço da pessoa física
     * @param sexo o sexo da pessoa física
     */
    public PessoaFisica(String nome, String CPF, String endereco, byte sexo) {
        this.nome = nome;
        this.CPF = CPF;
        this.endereco = endereco;
        this.sexo = sexo;
    }
    
    /**
     * Construtor da classe PessoaFisica.
     * 
     * @param nome o nome da pessoa física
     * @param CPF o CPF da pessoa física
     * @param endereco o endereço da pessoa física
     */
    public PessoaFisica(String nome, String CPF, String endereco) {
        this.nome = nome;
        this.CPF = CPF;
        this.endereco = endereco;
    }
    
    /**
     * Construtor da classe PessoaFisica.
     */
    public PessoaFisica() {
    }
    
    /**
     * Obtém o nome da pessoa física.
     * 
     * @return o nome da pessoa física
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome da pessoa física.
     * 
     * @param nome o nome a ser definido
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Obtém o CPF da pessoa física.
     * 
     * @return o CPF da pessoa física
     */
    public String getCPF() {
        return CPF;
    }

    /**
     * Define o CPF da pessoa física.
     * 
     * @param CPF o CPF a ser definido
     */
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    /**
     * Obtém o sexo da pessoa física.
     * 
     * @return o sexo da pessoa física
     */
    public byte getSexo() {
        return sexo;
    }

    /**
     * Define o sexo da pessoa física.
     * 
     * @param sexo o sexo a ser definido
     */
    public void setSexo(byte sexo) {
        this.sexo = sexo;
    }

    /**
     * Obtém a data de nascimento da pessoa física.
     * 
     * @return a data de nascimento da pessoa física
     */
    public String getNascimento() {
        return nascimento;
    }

    /**
     * Define a data de nascimento da pessoa física.
     * 
     * @param nascimento a data de nascimento a ser definida
     */
    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }  
}
