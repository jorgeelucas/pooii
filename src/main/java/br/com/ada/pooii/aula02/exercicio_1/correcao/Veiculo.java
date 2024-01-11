package br.com.ada.pooii.aula02.exercicio_1.correcao;

public interface Veiculo {

    // Codigo invalido pois a velocidade seria atribuida a todos os veiculos
    // Integer VELOCIDADE_MAXIMA_PERMITIDA = 230;

    void acelerar(int velocidade);
    void frear();
}