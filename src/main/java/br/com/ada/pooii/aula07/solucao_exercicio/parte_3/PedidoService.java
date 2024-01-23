package br.com.ada.pooii.aula07.solucao_exercicio.parte_3;

import br.com.ada.pooii.aula06.Item;
import br.com.ada.pooii.aula06.Pedido;

import java.util.List;

public class PedidoService {

    private final ContratoRepository contratoRepository;
    private final Confirmador confirmador;

    public PedidoService(ContratoRepository contratoRepository, Confirmador confirmador) {
        this.contratoRepository = contratoRepository;
        this.confirmador = confirmador;
    }

    public void confirmarPedido(long id) {
        // valida id
        // busca pedido no banco de dados
        Pedido pedidoEncontrado = contratoRepository.buscarPorId(id);
        Pedido pedidoAtualizado = pedidoEncontrado.atualizarStatusParaConfirmado();


        // atualiza pedido no banco de dados
        contratoRepository.atualizar(id, pedidoAtualizado);


        // envia email de confirmacao
        confirmador.enviarConfirmacao("Pedido (s) confirmado(s): " + pedidoAtualizado);
    }

    public double calcularTotalPedido() {
        return 0.0;
    }
    public List<Item> getItens() {
        return null;
    }
    public long getQtdItens() {
        return 0;
    }
    public void addItem(Item item) {

    }
    public void deletarItem(Item item) {

    }
}
