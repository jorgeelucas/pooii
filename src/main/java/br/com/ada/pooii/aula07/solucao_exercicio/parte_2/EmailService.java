package br.com.ada.pooii.aula07.solucao_exercicio.parte_2;

public class EmailService {

    public EmailService(String client, String senha) {
        System.out.println("Criando envio de email com client: " + client + " com senha: " + senha);

    }

    public void enviarEmailConfirmacao(String mensagem) {
        System.out.println("Enviando email: " + mensagem);
    }
}
