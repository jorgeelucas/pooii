package br.com.ada.pooii.aula02;

public interface Repositorio<T> {

    void salvar(T entidade);

    T buscarPorNome(String nome);

    Boolean deletar(T entidade);

    T atualizar(T entidade);

}
