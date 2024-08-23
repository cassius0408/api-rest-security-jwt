
## API REST com Security e JWT 
Api Rest SpringBoot que contém a parte se segurança Security. Os endpoints contemplam salvar Usuario e geração de Token JWT.

## Endpoints e URLs de acesso

- H2 (acessar via browser)
http://localhost:8080/h2-console

- Acessar o Swagger
http://localhost:8080/swagger-ui.html

- cadastrar usuario (POST)
http://localhost:8080/users

Exemplo json body:

{
    "name": "Parzival",
    "username": "pcsb",
    "password": "jwt123",
    "roles": ["USERS", "MANAGERS"]
}

- realiza o login
http://localhost:8080/login

Exemplo json body:

{
    "username": "pcsb",
    "password": "jwt123"
}

- site jwt para descriptografar o token
https://jwt.io/#debugger-io


- Para acessar os outros endpoints colocar o token gerado no Authentication e executar a API. 

## 💻 Tecnologias

- Java 1.8
- Spring Boot 2.5.5
- Spring Boot Web
- H2 data base
- Data JPA
- springfox-swagger2 2.9.2
- springfox-swagger-ui 2.9.2
- Security
- JWT

## 🚀 Começando
Após clonar o projeto, descompactar o projeto.
No IDE (pode ser intellij ou Sprin Boot Suit 4), File > Open File. 


## Pré-requisitos
- Java 1.8

## Clonagem 
git clone https://github.com/cassius0408/curso-dio-springboot-jpa.git


## Contato
[![LinkedIn](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/cassius-barbosa-80a97922/)

[![GitHub](https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white)](https://github.com/cassius0408)

[![E-mail](https://img.shields.io/badge/-Email-000?style=for-the-badge&logo=microsoft-outlook&logoColor=007BFF)](cassius.barbosa@gmail.com)

