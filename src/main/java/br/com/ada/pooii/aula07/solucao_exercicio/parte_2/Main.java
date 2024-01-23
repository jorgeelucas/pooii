package br.com.ada.pooii.aula07.solucao_exercicio.parte_2;

public class Main {
    public static void main(String[] args) {
        PedidoRepository repository = new PedidoRepository("https://", "123@abc_xpto_987");
        EmailService emailService = new EmailService("ada-mail", "abc@123");

        PedidoService pedidoService = new PedidoService(repository, emailService);
        pedidoService.confirmarPedido(1);
    }
}
