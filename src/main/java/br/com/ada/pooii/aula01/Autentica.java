package br.com.ada.pooii.aula01;

public interface Autentica {

    boolean autentica(String senha);

    // default
    default boolean autenticaDefault(String senha) {
        return autenticaPrivate(senha);
    }

    static boolean autenticaStatico(String senha) {
        return senha.equals("123");
    }

    private boolean autenticaPrivate(String senha) {
        return senha.equals("123");
    }

}
