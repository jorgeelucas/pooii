package br.com.ada.pooii.aula07.solucao_exercicio.parte_1;

import br.com.ada.pooii.aula06.Item;
import br.com.ada.pooii.aula06.Pedido;

import java.util.List;

public class PedidoService {

    public void confirmarPedido(long id) {
        // valida id
        // busca pedido no banco de dados
        PedidoRepository repository = new PedidoRepository();
        Pedido pedidoEncontrado = repository.buscarPedido(id);
        Pedido pedidoAtualizado = pedidoEncontrado.atualizarStatusParaConfirmado();


        // atualiza pedido no banco de dados
        repository.atualizar(id, pedidoAtualizado);


        // envia email de confirmacao
        EmailService emailService = new EmailService();
        emailService.enviarEmailConfirmacao("Pedido confirmado: " + pedidoAtualizado);
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
