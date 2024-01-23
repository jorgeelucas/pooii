package br.com.ada.pooii.projeto_final.prof_impl;

public class BeanConfig {

    static Repository<Task> repository() {
        return new TaskRepository();
    }

    static Repository<PersonalTask> personalTaskRepository() {
        return new PersonalTaskRepository();
    }

}
