# Diário de Bordo do Projeto - App de Postagens

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