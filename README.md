# 🚀 Helpdesk API - Spring Boot REST

API REST desenvolvida em Java com Spring Boot para gerenciamento de usuários, com foco em boas práticas, validação de dados e tratamento global de exceções.

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
