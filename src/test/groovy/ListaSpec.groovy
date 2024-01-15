import br.com.ada.pooii.tests.list_example.Lista
import br.com.ada.pooii.tests.list_example.ListaComArray
import br.com.ada.pooii.tests.list_example.Pessoa
import spock.lang.Specification

class ListaSpec extends Specification{

    def 'default initial size'() {
        expect: 'default constructor'
            def lista = new ListaComArray<Pessoa>();
            lista.capacity() == 10
    }

    def 'initial size #initial'() {
        expect: 'initializing with defaul inicial'
            def lista = new ListaComArray<>(initial)
            lista.capacity() == initial

        where:
            initial << [5, 10, 100, 200, 1000]
    }

    def 'add (one element)'() {
        given: 'mocked objects'
            def pessoa = new Pessoa(null, null)
            def lista = new ListaComArray<Pessoa>()

        when: 'calling the add method'
            lista.add(pessoa)

        then: 'list must have one element'
            lista.size() == 1
    }

    def 'add (more then one)'() {
        given: 'mocked elements'
            def pessoas = [
                    new Pessoa(null, null),
                    new Pessoa(null, null),
                    new Pessoa(null, null)
            ]
            def lista = new ListaComArray<Pessoa>();

        when: 'calling add of the list'
            pessoas.each {it -> lista.add(it)}

        then: 'list must have the same size of pessoas'
            lista.size() == pessoas.size()
    }

    def 'get'() {
        given: 'initializing the list'
            def lista = new ListaComArray<Pessoa>()

        when: 'adding a person'
            lista.add(new Pessoa('id_1', 'jorge'))

        then: 'verifying if it is there'
            with(lista.get(0)) {
                id: 'id_1'
                nome: 'jorge'
            }

    }

    def 'contains'() {
        given: 'mocks'
            def pessoas = [
                    new Pessoa("id_1", "jorge"),
                    new Pessoa("id_2", "maria"),
                    new Pessoa("id_3", "silva")
            ]
            def lista = new ListaComArray<Pessoa>()

        when: 'adding all values'
            pessoas.each {lista::add}

        and: 'inserted a specific one'
            def specificPerson = new Pessoa("id_4", "julia")
            lista.add(specificPerson)

        then: 'calling the contains'
            lista.contains(specificPerson)
    }

}
