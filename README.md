# Sistema de Gerenciamento de Ninjas e Missões

Este sistema foi desenvolvido para gerenciar ninjas e suas missões.  
Cada ninja pode ser atribuído a uma única missão, enquanto uma missão pode ser associada a vários ninjas.  

## Funcionalidades

- Cadastro de ninjas com **nome, idade, email e rank**.  
- Atribuição de uma **missão** para um ninja.  
- Gerenciamento de **missões** e dos ninjas associados a elas.  

## Tecnologias Utilizadas

- **Spring Boot** → Criação da aplicação web e gerenciamento de dependências.  
- **Banco de Dados H2** → Banco em memória para desenvolvimento e testes.  
- **Flyway** → Gerenciamento de migrações do banco de dados.  
- **JPA (Java Persistence API)** → Mapeamento objeto-relacional (ORM).  
- **Spring Data JPA** → Interação com o banco de dados.  
- **Maven** → Build e gerenciamento de dependências do projeto.  
- **Docker** → Build externo do banco de dados.  
- **SQL** → Manipulação do banco de dados.  
- **Git & GitHub** → Controle de versão e hospedagem do repositório.

![Java](https://img.icons8.com/dusk/70/java-coffee-cup-logo.png)
![Visual](https://img.icons8.com/color/70/intellij-idea.png)

## Design do Banco de Dados

O esquema do banco segue as seguintes relações:

- **Ninja** → id, nome, idade, email e rank.  
- **Missão** → id, título e descrição.  

Um **Ninja** pode ter apenas **uma Missão**, mas uma **Missão** pode ser atribuída a **vários Ninjas**.  

---
Projeto criado para estudos em **Java com Spring Boot**.
