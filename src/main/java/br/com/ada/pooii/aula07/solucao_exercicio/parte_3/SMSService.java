package br.com.ada.pooii.aula07.solucao_exercicio.parte_3;

public class SMSService implements Confirmador {

    public SMSService(String operadora) {
        System.out.println("Criando envio de SMS com client: " + operadora);
    }

    @Override
    public void enviarConfirmacao(String mensagem) {
        //System.out.println("Enviando SMS: " + mensagem + " para o numero: " + numero);
        System.out.println("Enviando SMS: " + mensagem);
    }
}
