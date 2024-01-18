package br.com.ada.pooii.aula05.exercicio_pilha;

public class Main {
    public static void main(String[] args) {

        Stack<String> minhaStack = new StackImpl<>();

        // PUSH
        System.out.println("PUSH");
        minhaStack.push("lucia");
        minhaStack.push("maria");
        minhaStack.push("erica");
        minhaStack.push("paula");

        // POP
        System.out.println("POP");
        String nome = minhaStack.pop();
        System.out.println(nome);

        nome = minhaStack.pop();
        System.out.println(nome);

        // PEEK
        System.out.println("PEEK");
        nome = minhaStack.peek();
        System.out.println(nome);

        nome = minhaStack.peek();
        System.out.println(nome);

        // IS EMPTY
        System.out.println("IS EMPTY");
        boolean empty = minhaStack.isEmpty();
        System.out.println(empty);
    }
}
