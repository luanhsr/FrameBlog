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