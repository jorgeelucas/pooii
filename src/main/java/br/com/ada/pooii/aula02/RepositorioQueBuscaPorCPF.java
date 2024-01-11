package br.com.ada.pooii.aula02;

public interface RepositorioQueBuscaPorCPF<T> extends Repositorio<T> {

    T buscarPorCPF(String cpf);
}
