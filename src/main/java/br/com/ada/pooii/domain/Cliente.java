package br.com.ada.pooii.domain;

import br.com.ada.pooii.aula01.Autentica;

public class Cliente implements Autentica {

    private String senha;
    @Override
    public boolean autentica(String senha) {

        int range = Autentica.TAMANHO_MAX_SENHA;

        if (senha != null && senha.length() > range) {
            return false;
        }

        return autenticaDefault(senha);
    }
}
