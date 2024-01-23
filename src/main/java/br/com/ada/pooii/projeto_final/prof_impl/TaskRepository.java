package br.com.ada.pooii.projeto_final.prof_impl;

public class TaskRepository implements Repository<Task> {

    @Override
    public void salvar(Task task) {
        System.out.println("salvando");
    }
}
