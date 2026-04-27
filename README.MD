#  Projeto DevOps - API Java com CI/CD, Docker e Testes

Este projeto foi desenvolvido como parte de uma disciplina prática de DevOps, com o objetivo de aplicar conceitos reais de integração contínua, entrega contínua, containerização e testes automatizados.

---

##  Tecnologias utilizadas

-  Java 17+
-  Spring Boot
-  Spring Data JPA
-  JUnit 5 + Mockito
-  Docker
-  GitHub Actions (CI/CD)
-  Webhooks (Discord)

---

##  Estrutura do projeto

```
src/
 ├── main/
 │    ├── java/com/lorenzoandreoli/api/
 │    │    ├── controller/
 │    │    ├── service/
 │    │    ├── repository/
 │    │    └── model/
 └── test/
      └── service/
```

---

##  Funcionalidades

- CRUD de Pacientes
- API REST com endpoints:
  - `GET /pacientes`
  - `POST /pacientes`
  - `GET /pacientes/{id}`
  - `DELETE /pacientes/{id}`

---

##  Testes unitários

O projeto possui testes unitários utilizando **JUnit 5 + Mockito**, cobrindo as principais operações do service.

###  Cobertura implementada:
- Listagem de pacientes
- Criação de paciente
- Busca por ID
- Tratamento de erro (não encontrado)
- Exclusão de paciente

---

##  CI/CD com GitHub Actions

O pipeline automatiza:

###  Continuous Integration (CI)
- Build do projeto com Maven
- Execução dos testes unitários

###  Continuous Delivery (CD)
- Simulação de deploy após build

###  Notificações
- Envio de alertas para o Discord a cada execução do pipeline

---

##  Docker

A aplicação pode ser executada em container Docker.

###  Build da imagem

```
docker build -t minha-api .
```

###  Rodar container

```
docker run -p 8080:8080 minha-api
```

---

##  Executando localmente

```
mvn spring-boot:run
```

Acesse:

```
http://localhost:8080/pacientes
```

---

##  Evidências (atividade acadêmica)

O projeto inclui:

-  Repositório com commits e branches
-  Pull Requests com pipeline executado
-  CI/CD funcionando com sucesso
-  Dockerfile configurado
-  Container rodando
-  Alertas configurados (Discord)
-  Testes automatizados executados em PR

---

##  Objetivo do projeto

Aplicar na prática conceitos de:

- Integração Contínua (CI)
- Entrega Contínua (CD)
- Testes automatizados
- Containerização com Docker
- Monitoramento via alertas

---

##  Autor

**Lorenzo Andreoli**

---

#  Resultado final

Este projeto representa um pipeline completo de desenvolvimento moderno, seguindo boas práticas de mercado e integração de ferramentas DevOps.
