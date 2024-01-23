package br.com.ada.pooii.projeto_final.prof_impl;

public class PersonalTaskRepository implements Repository<PersonalTask> {
    @Override
    public void salvar(PersonalTask personalTask) {
        System.out.println("salvando tarefa pessoal");
    }
}
