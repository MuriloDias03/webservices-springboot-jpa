# 🖥️ Web Service
[![Java](https://img.shields.io/badge/Java-%23ED8B00.svg?logo=openjdk&logoColor=white)](#)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-6DB33F?logo=springboot&logoColor=fff)](#)
[![Hibernate](https://img.shields.io/badge/Hibernate-59666C?logo=hibernate&logoColor=fff)](#)
[![Postgres](https://img.shields.io/badge/Postgres-%23316192.svg?logo=postgresql&logoColor=white)](#)
[![Heroku](https://img.shields.io/badge/Heroku-430098?logo=heroku&logoColor=fffe)](#)

># ❓ Sobre o projeto

Este projeto é um sistema de web services desenvolvido em Java utilizando o framework Spring Boot, com integração ao JPA/Hibernate para o mapeamento objeto-relacional. Ele foi feito com uma arquitetura robusta e bem organizada, separando claramente as responsabilidades em camadas lógicas como recursos, serviços e repositórios.

Entre as principais funcionalidades estão a criação de um modelo de domínio detalhado com associações e validações, a implementação de operações CRUD, permitindo gerenciar registros no banco de dados, e um sistema personalizado de tratamento de exceções que oferece respostas claras em casos de erro. O projeto utiliza o banco de dados H2 para testes, com configurações específicas para inicialização e povoamento, além de estar preparado para integração com PostgreSQL em ambientes de produção.

Além disso, o projeto está configurado para ser implantado na nuvem através do Heroku, para executar o projeto. Desenvolvido com ferramentas modernas como Maven, Java 17 e Spring Initializr, este sistema é uma demonstração de boas práticas de desenvolvimento, sendo para o aprendizado e também em aplicações em projetos reais.

>## 📄 Modelo conceitual

![domainmodel](https://github.com/user-attachments/assets/c870eb28-a9e3-4734-887c-ccb3b3a081ca)

>## 📋 Tecnologias utilizadas

- Java
- Spring Boot
- JPA / Hibernate
- Maven
- H2 Database
- Postgresql
- Heroku
- Postman
- Apache Tomcat

>## 👨🏻‍💻 Como executar o projeto
Pré-requisitos: Postman ou outro cliente HTTP

Este projeto está hospedado no Heroku e pode ser testado facilmente com ferramentas como o [Postman](https://www.postman.com/). Siga os passos abaixo para realizar os testes:

### URL do Projeto
Acesse o projeto utilizando a seguinte URL base: https://webservice-javasb-27becddda6e9.herokuapp.com  
Não se assuste com o erro, é normal! O projeto está funcionando perfeitamente na nuvem.

### 1. **Listar Todos os Usuários**
- **Método:** `GET`
- **Endpoint:** `/users`
- **Descrição:** Retorna todos os usuários cadastrados.
- **Exemplo de Uso no Postman:**  
Faça uma requisição `GET` para: https://webservice-javasb-27becddda6e9.herokuapp.com/users

### 2. **Obter um Usuário por ID**
- **Método:** `GET`
- **Endpoint:** `/users/{id}`
- **Descrição:** Retorna os detalhes de um usuário específico.
- **Exemplo de Uso no Postman:**  
  Substitua `{id}` pelo ID do usuário como: https://webservice-javasb-27becddda6e9.herokuapp.com/users/1

### 3. **Criar um Novo Usuário**
- **Método:** `POST`
- **Endpoint:** `/users`
- **Descrição:** Adiciona um novo usuário ao sistema.
- **Cabeçalho Content-Type:** `application/json`
- **Exemplo de Corpo da Requisição:**
  ```json
  {
    "name": "Maria Rosa",
    "email": "mariarosa@gmail.com",
    "phone": "977557755",
    "password": "123456"
  }
  ```

### 4. **Atualizar um Usuário Existente**
- **Método:** `PUT`
- **Endpoint:** `/users/{id}`
- **Descrição:** Atualiza as informações de um usuário específico.
- **Cabeçalho Content-Type:** `application/json`
- **Exemplo de Corpo da Requisição:**
  ```json
  {
    "name": "Bob Green",
    "email": "bob.green@gmail.com",
    "phone": "977557756"
  }
  ```

### 5. **Deletar um Usuário**
- **Método:** `DELETE`
- **Endpoint:** `/users/{id}`
- **Descrição:** Remove um usuário do sistema.
- **Exemplo de Uso no Postman:**  
  Substitua `{id}` pelo ID do usuário como: https://webservice-javasb-27becddda6e9.herokuapp.com/users/1

># 🧙🏼‍♂️ Autor

Murilo Cristovão Dias

https://www.linkedin.com/in/murilo-cristovao-dias/
