# Projeto FINAL  POOII

# AdaTask
Aplicativo de Gerenciamento de Tarefas via Console

## Descrição Geral
AdaTask é um aplicativo de console para gerenciamento de tarefas. Ele permite aos usuários `criar`, `editar`, `deletar` e `visualizar` tarefas pessoais e profissionais. A simulação de um banco de dados será realizada através de listas em memória.

## Estrutura do Projeto
* **_Camada de Domain (Domínio)_**:
    - Contém classes como BaseTask, PersonalTask, WorkTask, StudyTask.
    - Define a estrutura e as regras de negócios das tarefas.
    
* **_Camada de Repository (Repositório)_**:
    - Responsável pela "persistência" dos dados em listas.
    - Oferece métodos para adicionar, remover, atualizar e buscar tarefas.

* **_Camada de Service (Serviço)_**:
    - Contém a lógica de aplicação, como operações de manipulação de tarefas.
    - Interage com a camada de Repository para realizar as operações de dados.

* **_Camada de Controller (Controlador)_**:

    - Gerencia a interação do usuário com o sistema via console.
    - Processa comandos do usuário e utiliza a camada de Service para executar 
    
## Principais funcionalidades

* `Criação de Tarefas`: Adicionar novas tarefas com detalhes como título, descrição, prazo, etc.
* `Edição de Tarefas`: Atualizar detalhes de tarefas existentes.
* `Remoção de Tarefas`: Deletar tarefas existentes.
* `Visualização de Tarefas`: Listar todas as tarefas ou filtrar por critérios específicos.

## Implementação Técnica

* `Console Interface`: Uma interface simples de linha de comando para interação com o usuário.
* `Classes de Entidade`: BaseTask e suas subclasses para representar diferentes tipos de tarefas.
* `Classe Repository`: Utiliza uma lista para simular o armazenamento de dados.
* `Classe Service`: Implementa a lógica de negócios.
* `Classe Controller`: Processa a entrada do usuário e comanda as operações correspondentes.

## Considerações Adicionais
* O projeto deve seguir os princípios SOLID para um design limpo e extensível.
* A aplicação de herança e generics deve ser demonstrada nas estruturas de dados e nas operações de manipulação de tarefas.
