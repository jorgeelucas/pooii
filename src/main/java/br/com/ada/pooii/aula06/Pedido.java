package br.com.ada.pooii.aula06;

import java.util.List;

public record Pedido(long id, List<Item> itens, String status) {

    public Pedido atualizarStatusParaConfirmado() {
        return new Pedido(id, itens, "confirmado");
    }

}
