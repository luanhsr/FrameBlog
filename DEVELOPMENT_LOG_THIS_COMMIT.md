# Diário de Bordo do Projeto - App de Postagens

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