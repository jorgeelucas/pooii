package br.com.ada.pooii.aula07.solucao_exercicio.parte_3;

public class WhatsappService implements Confirmador {

    @Override
    public void enviarConfirmacao(String mensagem) {
        System.out.println("Enviando confirmacao pelo whatsapp: " + mensagem);
    }
}
