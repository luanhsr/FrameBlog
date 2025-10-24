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