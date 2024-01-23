package br.com.ada.pooii.aula07.solucao_exercicio.parte_3;

import br.com.ada.pooii.aula06.Pedido;

public interface ContratoRepository {

    Pedido buscarPorId(long id);

    void atualizar(long id, Pedido pedido);
}
