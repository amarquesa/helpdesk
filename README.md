# 🚀 Helpdesk API - Spring Boot REST

Sistema Helpdesk desenvolvido com Java Spring Boot, APIs REST e banco de dados relacional.

---

## 📌 Tecnologias utilizadas

- Java 17
- Spring Boot
- Spring Web
- Spring Data JPA
- H2 Database
- Maven
- Validation (Jakarta)
- Lombok

---

## ⚙️ Funcionalidades

- Cadastro de usuários
- Listagem de usuários
- Validação de dados de entrada
- Tratamento global de exceções
- Respostas padronizadas de erro

---

## Endpoints

- GET /users
- POST /users
- PUT /users/{id}
- DELETE /users/{id}

## 🔥 Exemplo de erro tratado

```json
{
  "status": 400,
  "message": "Erro de validação",
  "errors": [
    "Nome é obrigatório",
    "Email inválido"
  ]
}

---
## 🔥 Como rodar o projeto

# Clonar repositório
git clone https://github.com/amarquesa/helpdesk.git

# Entrar na pasta
cd helpdesk

# Rodar aplicação
./mvnw spring-boot:run

## 🌐 Base URL

http://localhost:8080

---

## ✅ Exemplo de resposta (GET /users)

```json
[
  {
    "id": 1,
    "name": "Amanda",
    "email": "amanda@email.com"
  }
]
---md

## 📈 Próximas melhorias

- Autenticação com JWT
- Integração com banco PostgreSQL
- Documentação com Swagger
- Deploy em cloud (Render ou Railway)
