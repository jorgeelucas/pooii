package br.com.ada.pooii.aula01;

public interface Autentica {

    Integer TAMANHO_MAX_SENHA = 8;

    boolean autentica(String senha);

    // default
    default boolean autenticaDefault(String senha) {
        return autenticaPrivate(senha);
    }

    // static
    static boolean autenticaStatico(String senha) {
        return senha.equals("123");
    }

    // private
    private boolean autenticaPrivate(String senha) {
        return senha.equals("123");
    }

}
