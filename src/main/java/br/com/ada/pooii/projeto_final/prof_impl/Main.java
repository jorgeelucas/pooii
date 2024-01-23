package br.com.ada.pooii.projeto_final.prof_impl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("task type: 1. standard, 2. personal");
        int taskType = scanner.nextInt();

        TaskService service;

        if (taskType == 1) {
            TaskRepository repository = new TaskRepository();
            service = new TaskService(repository);
        } else if (taskType == 2) {
            PersonalTaskRepository personalTaskRepository = new PersonalTaskRepository();
            service = new TaskService(personalTaskRepository);
        } else {
            service =  new TaskService(null);
        }

        service.salvarNovaTask(new Task());

    }
}
