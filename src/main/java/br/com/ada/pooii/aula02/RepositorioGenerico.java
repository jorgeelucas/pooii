package br.com.ada.pooii.aula02;

import br.com.ada.pooii.domain.Vendedor;

public class RepositorioGenerico<T> implements Repositorio<T> {

    @Override
    public void salvar(T entidade) {
    }

    @Override
    public T buscarPorNome(String nome) {
        return null;
    }

    @Override
    public Boolean deletar(T entidade) {
        return null;
    }

    @Override
    public T atualizar(T entidade) {
        return null;
    }
}
