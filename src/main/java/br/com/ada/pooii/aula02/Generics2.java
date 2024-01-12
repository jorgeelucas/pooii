package br.com.ada.pooii.aula02;

import br.com.ada.pooii.domain.Cliente;
import br.com.ada.pooii.domain.Vendedor;

import java.util.List;

public class Generics2 {

    public static void main(String[] args) {


//        VendedorRepositorio repositorio = new VendedorRepositorio();

        Vendedor vendedor = new Vendedor("Jorge", 1200);
//        repositorio.salvarVendendor(vendedor);

//        ClienteRepositorio repositorioCliente = new ClienteRepositorio();

        Cliente cliente = new Cliente();
//        repositorioCliente.salvarCliente(cliente);

        // repositorio do vendedor
        Repositorio<Vendedor> repositorioGenericoVendedor = new RepositorioGenerico<>();
        repositorioGenericoVendedor.salvar(vendedor);
        repositorioGenericoVendedor.buscarPorNome("jorge");

        // repositorio do cliente
        Repositorio<Cliente> repositorioGenericoCliente = new RepositorioGenerico<>();
        repositorioGenericoCliente.salvar(cliente);
        repositorioGenericoCliente.buscarPorNome("maria");



        VendedorRepositorio vRepo = new VendedorRepositorio();
        vRepo.salvar(vendedor);

        ClienteRepositorio cRepo = new ClienteRepositorio();
        cRepo.buscarPorCPF("123");

        salvarObj(cRepo, cliente);

    }

    public static void salvarObj(Repositorio repo, Cliente cliente) {
        repo.salvar(cliente);
    }

}
