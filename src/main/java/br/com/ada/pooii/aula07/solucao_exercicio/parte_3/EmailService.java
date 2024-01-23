package br.com.ada.pooii.aula07.solucao_exercicio.parte_3;

public class EmailService implements Confirmador {

    public EmailService(String client, String senha) {
        System.out.println("Criando envio de email com client: " + client + " com senha: " + senha);
    }

    @Override
    public void enviarConfirmacao(String mensagem) {
        System.out.println("Enviando email: " + mensagem);
    }
}
