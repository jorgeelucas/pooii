package br.com.ada.pooii.aula01;

public class Cliente implements Autentica {

    private String senha;
    @Override
    public boolean autentica(String senha) {
        return autenticaDefault(senha);
    }
}
