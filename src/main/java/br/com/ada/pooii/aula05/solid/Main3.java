package br.com.ada.pooii.aula05.solid;

public class Main3 {
    public static void main(String[] args) {

        // definindo o repositorio
        RepositoryMYSQL mySql = new RepositoryMYSQL("jorge", "http");
        RepositoryOracle oracleDB = new RepositoryOracle(5432, "oracle_queries");

        // novo pagamento recebido
        Pagamento novoPagamento = new Pagamento();


        // pedindo pro service efetuar o pagamento
        PagamentoService service = new PagamentoService(mySql);
        service.efetuarPagamento(novoPagamento);

    }
}

class PagamentoService {

    public final Repositorio repository;

    public PagamentoService(Repositorio repository) {
        this.repository = repository;
    }

    public void efetuarPagamento(Pagamento pagamento) {
        repository.salvar(pagamento);
    }

}

interface Repositorio {
    public void salvar(Pagamento pagamento);
}

class RepositoryOracle implements Repositorio {

    public RepositoryOracle(int porta, String conexao) {
        System.out.println("Conectando no oracle: " porta + " " + conexao);
    }
    @Override
    public void salvar(Pagamento pagamento) {
        System.out.println("Salvou o pagamento no oracle");
    }
}

class RepositoryMYSQL implements Repositorio {

    public RepositoryMYSQL(String login, String url) {
        System.out.println("criando repositorio de mysql: " + login + " " + url);
    }

    @Override
    public void salvar(Pagamento pagamento) {
        System.out.println("Salvou o pagamento no MYSQL");
    }
}

class Pagamento {

}
