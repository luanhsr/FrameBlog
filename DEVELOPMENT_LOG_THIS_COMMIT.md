# Diário de Bordo do Projeto - App de Postagens

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
    - Apenas os atributos e suas anotações JPA iniciais foram escritos manualmente. Getters, setters e construtores foram gerados pela IDE.
    - Referência ao diagrama de entidade para mapeamento dos atributos.
    - Por boa pratica ao gerar constructor, foi alterado para final