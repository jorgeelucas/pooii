
# Exercício _generics_

Implemente uma estrutura de dados de pilha (Stack) genérica em Java.

A pilha deve ser capaz de armazenar elementos de qualquer tipo e fornecer as operações básicas de uma pilha:
*  Empilhar (push)
* Desempilhar (pop)
* Verificar o elemento do topo (peek)
* Verificar se a pilha está vazia (isEmpty).

## Requisitos
* **Interface Genérica `Stack`**:
* **Classe `StackImpl` Implementando `Stack`**:
	-   Esta classe deve implementar os métodos definidos na interface `Stack`.
	-   Deve usar generics para permitir a armazenagem de elementos de qualquer tipo.
	-   Pode utilizar uma lista interna para armazenar os elementos da pilha.


## Stack
_Uma estrutura de dados do tipo pilha (ou "Stack", em inglês) é uma coleção ordenada de elementos com um princípio muito específico para a adição e remoção de elementos: LIFO (Last In, First Out), que significa "o último a entrar é o primeiro a sair". Essa estrutura é amplamente usada em várias aplicações de programação devido à sua simplicidade e eficácia em certos tipos de problemas._

**_Exemplo da interface_**

```java
// Interface genérica para a estrutura Stack
public  interface  Stack<T> {
	void  push(T elemento);
	T pop();
	T peek();
	boolean  isEmpty();
}
```
