package br.com.ada.pooii.aula03;

import java.util.List;

public interface RepositorioSomenteLeitura<T, U> {

    List<T> buscarTodos();

    T buscarPorId(U id);

}
