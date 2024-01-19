# SOLID

_Ao seguir esses princípios o programador escreve códigos mais limpos, separando responsabilidades, diminuindo acoplamentos, facilitando na refatoração e estimulando o reaproveitamento do código._



# 1. Single Responsibility Principle (SRP)
> Princípio da responsábilidade única

**_Uma classe deve ter um, e somente um, motivo para mudar._**

Para quem está começando a aprender, talvez, essa definição seja um pouco vaga, vamos entender!

**_Repare na nossa classe _User_ de exemplo:_**
```java
public class User {
    private String name;
    private String email;
    private String cpf;

    // Métodos de acesso (getters/setters)

    public void saveUser() {
        // Salva o usuário no banco de dados
        // Esta é uma violação do SRP, pois a classe User também está lidando com a persistência dos dados
    }

    public void sendEmail(String message) {
        // Envia um e-mail para o usuário
        // Esta é outra violação do SRP, pois User também está lidando com comunicação por e-mail
    }

   public void sendSMS(String message) {
      // Envia um SMS para o usuário
      // Esta é outra violação do SRP, pois User também está lidando com comunicação por SMS
   }

   public boolean isValidCPF() {
      // Faz o calculo para verificar se o CPF é valido
      // Esta é mais uma violação do SRP, pois User também tem que saber o calculo do CPF.
   }
}
```

Percebe-se que essa classe deverá ser alterada se:
* Os usuários receberem um novo atributo;
* O cliente de banco de dados mudar;
* O cliente de email for alterado;
* O calculo do CPF sejá diferente

Nesse exemplo, mexer na nossa classe porque tem um novo atributo está correta (1º motivo para mudar), porém se o banco de dados mudar também temos que alterar nossa classe (2º motivo para mudar)
também se a forma como enviamos SMS mudar é outro motivo para mudar nossa classe (3º motivo) - percebe que temos mais de um motivo para mudar? Sobre isso que trata o `SRP`, a classe só pode ser alterada por um único motivo.

Vamos ao exemplo prático!

**_Classe _User_ refatorada para aplicar SRP:_**

```java
public class User {
    private String name;
    private String email;

    // Métodos de acesso (getters/setters)
}

public class UserRepository {
    public void saveUser(User user) {
        // Salva o usuário no banco de dados
    }
}

public class EmailService {
    public void sendEmail(User user, String message) {
        // Envia um e-mail para o usuário
    }
}

public class SMSService {
    public void sendSMS(User user, String message) {
        // Envia um sms para o usuário
    }
}

public class CPFService {
    public boolean isValidCPF(String cpf) {
        // Faz o calculo para verificar se o cpf está correto
    }
}
```
Agora, separamos as obrigações em cada classe e cada uma vai ter um único motivo para mudar aplicando o `SRP`.


# 2. Open-Closed Principle (OCP)
> Princípio do aberto e fechado

**_Objetos ou entidades devem estar abertos para extensão, mas fechados para modificação_**

Um exemplo bem prático disso seria o navegador google chrome onde ele é aberto para receber novas _extensões_ mas fechado para modificação, ou seja, não precisamos alterar o código fonte do navegador sempre que adicionamos uma extensão.

Vamos fazer uma ilustração, bem simples, disso.

**_Classe representando um Browser_**
```java
class Browser {
    void navigate(String url) {
        // Navegação básica
    }
}
```

**_Se quisermos adicionar a extensão de adBlock precisamos mexer no codigo_**
```java
class Browser {
    void navigate(String url) {
        // Navegação básica
    }

    void adBlock() {
        // Bloqueia anúncios
        // Implementação direta viola o OCP
    }
}
```

**_Para adicionar mais uma extensão, alteramos o codigo novamente_**

```java
class Browser {
    void navigate(String url) {
        // Navegação básica
    }

    void adBlock() {
        // Bloqueia anúncios
        // Implementação direta viola o OCP
    }

    void darkMode() {
        // Modo escuro
        // Implementação direta viola o OCP
    }
}
```

Percebe-se que para cada nova funcionalidade, essa classe precisa ser modificada? Portanto ela viola o OCP.

Como poderiamos solucionar isso? Vamos praticar!

Para respeitar o OCP, modificamos a classe `Browser` para que ela possa aceitar extensões sem a necessidade de modificar seu código fonte. 

**_As extensões são implementadas como classes separadas._**
```java
interface Extension {
    void apply(Browser browser);
}

class Browser {
    private List<Extension> extensions;

    Browser() {
        extensions = new ArrayList<>();
    }

    void addExtension(Extension extension) {
        extensions.add(extension);
    }

    void navigate(String url) {
        for (Extension extension : extensions) {
            extension.apply(this);
        }
        // Navegação básica
    }
}

class AdBlockExtension implements Extension {
    @Override
    public void apply(Browser browser) {
        // Implementação do bloqueador de anúncios
    }
}

class DarkModeExtension implements Extension {
    @Override
    public void apply(Browser browser) {
        // Implementação do modo escuro
    }
}
```

Agora adere ao OCP. Ele está aberto para extensão, pois novas funcionalidades podem ser adicionadas como extensões, mas fechado para modificação, pois não é necessário modificar o `Browser` para adicionar essas novas funcionalidades. Cada extensão implementa a interface `Extension`, permitindo que o `Browser` aplique qualquer extensão sem conhecer os detalhes de sua implementação.

# 3. Liskov Substitution Principle (LSP)
> Princípio de substituição de Liskov

**_Uma classe derivada deve ser substituível por sua classe base_**

# 4. Interface Segregation Principle (ISP)
> Princípio da segregação de interfaces

**_Uma classe não deve ser forçada a implementar interfaces e métodos que não irão utilizar_**

# 5. Dependency Inversion Principle (DIP)
> Princípio da inversão de dependencia

**_Dependa de abstrações e não de implementações_**
