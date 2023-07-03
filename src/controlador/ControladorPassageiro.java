package controlador;

import dados.Banco;
import model.PessoaFisica;
import model.Voo;
import java.util.ArrayList;

/**
 * Classe controladora responsável por gerenciar os passageiros.
 */
public class ControladorPassageiro {

    private Banco banco;

    /**
     * Construtor da classe ControladorPassageiro.
     * Inicializa o banco de dados.
     */
    public ControladorPassageiro() {
        this.banco = Banco.getInstance();
    }

    /**
     * Cadastra um novo passageiro físico no banco de dados.
     *
     * @param nome      Nome do passageiro físico
     * @param CPF       CPF do passageiro físico
     * @param endereco  Endereço do passageiro físico
     * @param sexo      Sexo do passageiro físico (0 = Masculino, 1 = Feminino)
     * @param nascimento Data de nascimento do passageiro físico
     * @param tel1      Telefone de contato do passageiro físico
     */
    public void cadastrarPassageiroFisico(String nome, String CPF, String endereco, byte sexo, String nascimento, String tel1) {
        PessoaFisica passageiro = new PessoaFisica(nome, CPF, endereco, sexo, nascimento, tel1);
        banco.addPessoaFisica(passageiro);
    }

    /**
     * Adiciona uma passagem de voo para um passageiro físico.
     *
     * @param passageiro Passageiro físico
     * @param passagem   Passagem de voo
     */
    public void addPassagemPessoaFisica(PessoaFisica passageiro, Voo passagem) {
        passageiro.addReserva(passagem);
    }

    /**
     * Obtém as passagens de voo de um passageiro físico.
     *
     * @param passageiro Passageiro físico
     * @return Uma lista de passagens de voo do passageiro físico
     */
    public ArrayList<Voo> getPassagensPessoaFisica(PessoaFisica passageiro) {
        return passageiro.getReservas();
    }
}
