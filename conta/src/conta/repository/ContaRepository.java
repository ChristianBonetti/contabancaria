package conta.repository;

public interface ContaRepository {

    void salvar(conta conta);

    void atualizar(conta conta);

    void excluir(conta conta);

    conta buscarPorTitular(String titular);

    conta buscarPorNumero(int numero);

}