# Diário de Bordo do Projeto - App de Postagens

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
    - Esta é uma etapa fundamental para a construção de uma aplicação robusta e escalável, alinhada com princípios de design como SOLID (especialmente o Princípio da Inversão de Dependência).