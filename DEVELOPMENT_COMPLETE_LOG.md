# Diário de Bordo do Projeto - App de Postagens

## Commit 1: Estrutura inicial do Modelo de Dados e Configurações Básicas
- **Data:** 21-10-25
- **Local:** `com.descomplica.Frameblog.models`
- **Descrição:**
    - Criado o package `models`.
    - Adicionadas as classes vazias `Comment.java`, `Post.java`, `Tag.java`, `User.java` para definir a estrutura básica do modelo de dados.
    - **Objetivo:** Ter *placeholders* para as entidades que serão desenvolvidas.
- **Configuração Básica de `application.properties`:**
    - **Local:** `src/main/resources/application.properties`
    - Adicionadas as seguintes configurações:
    ```properties
    spring.application.name=FrameBlog
    server.port=8080
    ```
---

## Commit 2: Criação de Packages Essenciais (Enums e Controllers)
- **Data:** 22-10-25
- **Local:** `com.descomplica.FrameBlog`
- **Descrição:**
    - **Package `enums`:**
        - Criado `RoleEnum.java`.
        - **Finalidade:** Definir papéis de usuário (ex: ADMIN, USER) para segurança e organização de privilégios.
    - **Package `controllers`:**
        - Criado package `controllers` (classes vazias ou *placeholders* para futuros controladores).
        - **Finalidade:** Gerenciar as requisições que chegam à aplicação, atuando como interface para as funcionalidades.
---

## Commit 3: Estrutura Inicial dos Services (Interfaces)
- **Data:** 23-10-25
- **Local:** `com.descomplica.FrameBlog.services`
- **Descrição:**
    - Criado o package `services`.
    - Adicionadas as interfaces `UserService`, `PostService`, `TagService` e `CommentService`.
    - **Objetivo:**
        - Definir os contratos de serviço para as operações CRUD (Create, Read, Update, Delete) e outras lógicas de negócio relacionadas a cada entidade.
        - Garantir um padrão e consistência nas operações da API, separando a definição do comportamento da sua implementação.
        - Preparar a arquitetura para futuras implementações concretas dos serviços.
---

## Commit 4: Implementação Inicial da Entidade User
- **Data:** 24-10-25
- **Local:** `com.descomplica.Frameblog.models`
- **Arquivo:** `User.java`
- **Descrição:**
    - Criação da classe `User` como uma entidade JPA.
    - Definição dos atributos básicos do usuário (`id`, `nome`, `email`, `password`, `role`).
    - Configuração do `id` como chave primária com geração automática de valor.
    - **Objetivo:** Estabelecer a representação em código da entidade `User` conforme o diagrama de relacionamento, contendo seus atributos e preparando para o mapeamento no banco de dados.
- **Observações:**
    - Apenas os atributos e suas anotações JPA iniciais foram escritos manualmente. Getters, setters e construtores foram gerados pela IDE
    - por boa pratica ao usar o constructor dos atributos das entidades, foi adicionado final
    - Referência ao diagrama de entidade para mapeamento dos atributos.
    - - **Boa Prática:** Utilização da palavra-chave `final` nos parâmetros dos construtores das entidades para promover a imutabilidade dos atributos e evitar reatribuições acidentais.
---
## Commit 5: Implementação Inicial da Entidade Post e Relacionamento com User
- **Data:** 24-10-25
- **Local:** `com.descomplica.Frameblog.models`
- **Arquivo:** `Post.java`
- **Descrição:**
    - Criação da classe `Post` como uma entidade JPA, seguindo o padrão da entidade `User`.
    - Definição dos atributos básicos do post (`postId`, `title`, `content`, `date`).
    - Configuração do `postId` como chave primária com geração automática de valor.
    - Implementação do relacionamento `@ManyToOne` com a entidade `User`, indicando que um usuário pode ter múltiplos posts.
    - **Objetivo:** Estabelecer a representação em código da entidade `Post`, incluindo seus atributos e o relacionamento com `User`, preparando para o mapeamento no banco de dados.
- **Observações:**
    - Apenas os atributos, anotações JPA iniciais e a configuração do relacionamento foram escritos manualmente. Getters, setters e construtores foram gerados pela IDE.
    - **Boa Prática:** Utilização da palavra-chave `final` nos parâmetros dos construtores das entidades para promover a imutabilidade dos atributos e evitar reatribuições acidentais.
---
## Commit 6: Definição do Enum de Papéis de Usuário (RoleEnum)
- **Data:** 25-10-25
- **Local:** `com.descomplica.FrameBlog.enums`
- **Arquivo:** `RoleEnum.java`
- **Descrição:**
    - Edicao da classe `enum` `RoleEnum`.
    - Definição de dois papéis de usuário principais: `ADMIN` e `USER`.
    - Atribuição de um valor `String` ("admin", "user") para cada papel.
    - **Objetivo:** Estabelecer um sistema de categorização para os usuários da aplicação, permitindo a implementação de controle de acesso e permissões baseadas em perfis.

---

## Commit 7: Refinamento da Entidade Post e Criação do Package de Repositórios
- **Data:** 26-10-25 (Assumindo a próxima data sequencial)
- **Local:** `com.descomplica.FrameBlog.models` e `com.descomplica.FrameBlog.repositories`
- **Descrição:**
    - **Refinamento da Entidade `Post.java`:**
        - Adicionada a anotação `@Table(name = "Post")` para explicitamente definir o nome da tabela no banco de dados.
        - Verificação e ajuste final do construtor, getters e setters para garantir a conformidade com as boas práticas (uso de `final` nos parâmetros do construtor).
        - Confirmação do relacionamento `@ManyToOne` com a entidade `User`.
    - **Criação do Package `repositories`:**
        - Criado o package `com.descomplica.FrameBlog.repositories`.
        - Adicionadas as interfaces `CommentRepository`, `PostRepository`, `TagRepository` e `UserRepository`.
        - **Objetivo:**
            - Definir os contratos para a camada de acesso a dados (DAO - Data Access Object) utilizando as funcionalidades do Spring Data JPA.
            - Preparar a arquitetura para a interação direta com o banco de dados para operações CRUD em cada entidade, separando a lógica de persistência da lógica de negócio.
            - Garantir que as interfaces de serviço (criadas no Commit 3) possam interagir com a camada de persistência de forma padronizada.
- **Observações:**
    - As interfaces de repositório foram criadas vazias (ou estendendo `JpaRepository` ou similar, implicitamente) como *placeholders* para futuras implementações, seguindo o mesmo padrão inicial das interfaces de serviço.
    - A adição explícita de `@Table(name = "Post")` à entidade `Post` melhora a clareza e controle sobre o nome da tabela gerada pelo JPA.

---
## Commit 8: Criação das Implementações de Serviço
- **Data:** 26-10-25
- **Local:** `com.descomplica.FrameBlog.services.impl`
- **Descrição:**
    - Criado o package `impl` (de "implementation") dentro do package `services`.
    - Adicionadas as classes `CommentServiceImpl.java`, `PostServiceImpl.java`, `TagServiceImpl.java` e `UserServiceImpl.java` dentro do novo package `services.impl`.
    - Cada uma dessas classes foi criada para **implementar** sua respectiva interface de serviço (`CommentService`, `PostService`, `TagService`, `UserService`) definida no Commit 3.
- **Objetivo Detalhado:**
    - **Definir o "Como" da Lógica de Negócio:** Enquanto as interfaces de serviço (no package `services`) definem **o quê** uma funcionalidade de negócio deve fazer (o contrato), as classes `*ServiceImpl` são onde a lógica **de como** essa funcionalidade será executada é escrita. É aqui que os métodos como `salvarUser()`, `buscarPostPorId()`, etc., terão sua implementação concreta.
    - **Separar Interface de Implementação:** Esta separação é uma prática de design crucial que promove o **baixo acoplamento**. Outras partes da aplicação (como os controladores) dependerão apenas das interfaces de serviço, e não das classes de implementação concretas. Isso significa que podemos mudar a lógica interna de um `*ServiceImpl` sem afetar os componentes que o utilizam, desde que o contrato da interface seja mantido.
    - **Facilitar Testes e Manutenção:** Ao isolar as implementações, torna-se mais fácil testar cada serviço de forma independente. Em cenários de teste, podemos até mesmo criar "mock" ou "test" de implementações para as interfaces, simulando o comportamento do serviço sem a necessidade da lógica real.
    - **Preparo para Injeção de Dependência (Spring):** O Spring (o framework que estamos usando) faz uso extensivo dessa arquitetura baseada em interfaces para injetar as dependências corretamente. Ele saberá qual `*ServiceImpl` deve ser fornecido quando um `*Service` for solicitado em um controlador, por exemplo.
- **Observações:**
    - Inicialmente, essas classes de implementação estão vazias ou contêm apenas os esqueletos dos métodos da interface (se já gerados pela IDE), aguardando a lógica de negócio real e a injeção dos repositórios (criados no Commit 7) para interagir com o banco de dados.

---
# Diário de Bordo do Projeto - App de Postagens

## Commit 9: Implementação do Serviço de Usuário e Definição do Repositório de Usuário
- **Data:** 28-10-25 (Assumindo a próxima data sequencial)
- **Local:** `com.descomplica.FrameBlog.services.impl` e `com.descomplica.FrameBlog.repositories`
- **Descrição:**
    - **Implementação Inicial de `UserServiceImpl.java`:**
        - A classe `UserServiceImpl` foi preenchida com a lógica inicial para o método `save(User user)`.
        - Adicionada a anotação `@Service` para indicar que esta classe é um componente de serviço do Spring.
        - Injetado o `UserRepository` utilizando a anotação `@Autowired`.
        - A lógica do método `save` agora verifica a existência de um usuário com o mesmo nome antes de salvar, lançando uma `RuntimeException` caso já exista.
        - Uma nova instância de `User` é criada antes de ser persistida via `userRepository.save()`.
    - **Definição da Interface `UserRepository.java`:**
        - A interface `UserRepository` foi definida para estender `JpaRepository<User, Long>`, fornecendo automaticamente operações CRUD básicas para a entidade `User` (que tem `Long` como tipo de sua chave primária).
        - Adicionada uma query method personalizada: `User findByUsername(String login)`. Esta declaração permite que o Spring Data JPA gere automaticamente uma consulta para buscar um usuário pelo seu atributo `nome` (assumindo que `username` no método se refere ao campo `nome` na entidade `User`).
        - Adicionada a anotação `@Repository` para indicar que esta interface é um componente de repositório do Spring.
- **Objetivo Detalhado:**
    - **Conectar Camada de Serviço e Repositório:** Este commit estabelece a primeira conexão funcional entre a camada de serviço (lógica de negócio) e a camada de persistência de dados. O `UserServiceImpl` agora utiliza o `UserRepository` para interagir com o banco de dados.
    - **Implementar Lógica de Negócio Inicial:** O método `save` no serviço inclui uma regra de negócio importante: prevenir o cadastro de usuários duplicados (pelo nome).
    - **Utilizar o Poder do Spring Data JPA:** A extensão de `JpaRepository` simplifica drasticamente a implementação da camada DAO, eliminando a necessidade de escrever muitas queries boilerplate e focando apenas nas queries personalizadas (como `findByUsername`).
    - **Preparar para Persistência de Usuários:** Com o serviço e o repositório definidos, a aplicação está pronta para receber e salvar informações de usuários no banco de dados, bem como verificar a existência de usuários pelo nome.
- **Observações:**
    - A lógica de `findByUsername` no `UserRepository` é sensível ao nome do atributo na entidade `User`. Se o atributo for `name` em vez de `nome`, o método deveria ser `findByName`.
    - A verificação de "Usuario Existente" e a criação de uma nova instância `newUser` dentro do método `save` são passos importantes para garantir a integridade dos dados e o uso adequado do ORM.