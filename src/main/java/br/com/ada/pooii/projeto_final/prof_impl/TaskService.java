package br.com.ada.pooii.projeto_final.prof_impl;

public class TaskService {

    // following SRP, OCP, DIP
    private final Repository repository;

    public TaskService(Repository repository) {
        this.repository = repository;
    }

    public void salvarNovaTask(Task task) {
        System.out.println("salvando a tarefa com o repository: " + this.repository.getClass().getName());
        repository.salvar(task);

    }
}
